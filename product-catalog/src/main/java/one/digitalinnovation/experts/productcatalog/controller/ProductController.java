package one.digitalinnovation.experts.productcatalog.controller;

import one.digitalinnovation.experts.productcatalog.model.Product;
import one.digitalinnovation.experts.productcatalog.repository.ProductRepository;
import one.digitalinnovation.experts.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(method = RequestMethod.POST)
    void create(@RequestBody Product product){
        productService.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Product findById(@PathVariable String id)
    {
        return productService.findById(id);
    }

    @GetMapping
    List<Product> findAll(){
        return productService.findAll();
    }

}
