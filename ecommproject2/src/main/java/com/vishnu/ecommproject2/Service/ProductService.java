package com.vishnu.ecommproject2.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.vishnu.ecommproject2.Model.Product;
import com.vishnu.ecommproject2.Repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productrepo;
    public List<Product> getAllProducts() {
      return productrepo.findAll();
    }
    public Product getProductById(int id){
        return productrepo.findById(id).get();
    }
    public Product addProduct(Product product, MultipartFile image) throws IOException {
       product.setImageName(image.getOriginalFilename());
       product.setImageType(image.getContentType());
       product.setImageData(image.getBytes());
       return productrepo.save(product);
    }
    public Product updateProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());
        return productrepo.save(product);
     }
    
}
