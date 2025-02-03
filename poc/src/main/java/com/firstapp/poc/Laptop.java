package com.firstapp.poc;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void compile(){
        System.out.println("Compling in laptop");
    }
}
