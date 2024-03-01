package com.crudoperation.service.impl;

import com.crudoperation.entity.product;
import com.crudoperation.repository.productRepository;
import com.crudoperation.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceImpl implements productService {
    @Autowired
    private productRepository repository;

    public product saveProduct(product product){
        return repository.save(product);
    }

    public List<product> saveProducts(List<product> products){
        return repository.saveAll(products);
    }

    public List<product> getProducts(){
        return repository.findAll();
    }

    public product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product removed"+id ;
    }

    public product updateProduct(product product){
        product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

}
