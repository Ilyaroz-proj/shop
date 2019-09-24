package ru.ilyaroz.shop.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ilyaroz.shop.domain.Products;
import ru.ilyaroz.shop.repo.ProductRepo;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    private final ProductRepo productRepo;

    @Autowired
    public ProductController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping
    public List<Products> list(){
        return productRepo.findAll();
    }

    @GetMapping("{idProduct}")
    public Products getOne(@PathVariable("idProduct") Products product){
        return product;
    }

    @PostMapping
    public Products create(@RequestBody Products product){
        return productRepo.save(product);
    }

    @PutMapping("{idProduct}")
    public Products update(
            @PathVariable("idProduct") Products productFromDb,
            @RequestBody Products product
    ){
        BeanUtils.copyProperties(product, productFromDb, "idProduct");

            return productRepo.save(productFromDb);
    }

    @DeleteMapping("{idProduct}")
    public void delete(@PathVariable("idProduct") Products product){
       productRepo.delete(product);
    }
}
