package com.vishnu.ecommproject2.Controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vishnu.ecommproject2.Model.Product;
import com.vishnu.ecommproject2.Service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Product product=productService.getProductById(id);
        if(product!=null){
        return new ResponseEntity<>(product,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(product,HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/product/{id}/image")
    public ResponseEntity<byte[]>getImagebyId(@PathVariable int id){
        Product product=productService.getProductById(id);
        byte[] image=product.getImageData();
        if(image!=null){
        return new ResponseEntity<>(image,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(image,HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product ,@RequestPart MultipartFile imageFile){
        Product savedProduct=null;
        try{
            savedProduct=productService.addProduct(product,imageFile);
            return new ResponseEntity<>(savedProduct,HttpStatus.CREATED);
        }catch(IOException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id,@RequestPart Product product ,@RequestPart MultipartFile imageFile){
        Product updatedProduct=null;
        try{
            updatedProduct=productService.updateProduct(product,imageFile);
            return new ResponseEntity<>("Updated",HttpStatus.OK);
        }catch(IOException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    } 
    
}
