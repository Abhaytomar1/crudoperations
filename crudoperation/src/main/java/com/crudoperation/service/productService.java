package com.crudoperation.service;

import com.crudoperation.entity.product;
import com.crudoperation.repository.productRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface productService {


    public product saveProduct(product product);

    public List<product> saveProducts(List<product> products);

    public List<product> getProducts();

    public product getProductById(int id);

    public String deleteProduct(int id);

    public product updateProduct(product product);
}
