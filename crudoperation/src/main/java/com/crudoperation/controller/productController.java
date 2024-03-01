package com.crudoperation.controller;

import com.crudoperation.entity.product;
import com.crudoperation.service.productService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class productController {

    private productService service;
    @PostMapping("addProduct")
    public product addProduct(@RequestBody product product){
        return service.saveProduct(product);
    }
    @PostMapping("addProduts")
    public List<product> addProducts(@RequestBody List<product> products){
        return service.saveProducts(products);

    }
    @GetMapping("allProduct")
    public List<product> findAllProduct(@RequestBody List<product> product){
        return service.saveProducts(product);
    }
    @GetMapping("byId/{id}")
    public product findById(@PathVariable int id){
        return service.getProductById(id);
    }

    @DeleteMapping("delete/{id}")
    public String deleteById(@PathVariable int id){
        return service.deleteProduct(id);
    }

    @PutMapping("update")
    public product updateProduct(@RequestBody product product){
        return service.updateProduct(product);
    }
}
