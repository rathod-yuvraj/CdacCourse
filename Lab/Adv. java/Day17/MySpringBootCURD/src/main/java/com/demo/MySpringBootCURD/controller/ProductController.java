package com.demo.MySpringBootCURD.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.MySpringBootCURD.dto.ProductDto;
import com.demo.MySpringBootCURD.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService pservice;
    

    public ResponseEntity<List<P>>
//    @GetMapping("/getproduct")
//    public ResponseEntity<List<ProductDto>> getAllProducts() {
//        List<ProductDto> plist = pservice.getAllProducts();
//        return ResponseEntity.ok(plist);
//    }

    @GetMapping("/{pid}")
    public ResponseEntity<ProductDto> getById(@PathVariable int pid) {
        ProductDto p = pservice.getById(pid);
        if (p != null) {
            return ResponseEntity.ok(p);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/range/{lprice}/{hprice}")
    public ResponseEntity<List<ProductDto>> getByPriceRange(@PathVariable double lprice, @PathVariable double hprice) {
        List<ProductDto> p = pservice.getByPrice(lprice, hprice);
        if (p != null && !p.isEmpty()) {
            return ResponseEntity.ok(p);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody ProductDto p) {
        boolean status = pservice.addProduct(p);
        if (status) {
            return ResponseEntity.ok("Data added successfully");
        } else {
            return ResponseEntity.badRequest().body("Data not added successfully");
        }
    }

    @PutMapping("/{pid}")
    public ResponseEntity<String> updateProduct(@PathVariable int pid, @RequestBody ProductDto p) {
        boolean status = pservice.updateProduct(pid, p);
        if (status) {
            return ResponseEntity.ok("Updated successfully");
        } else {
            return ResponseEntity.badRequest().body("Not updated");
        }
    }

    @DeleteMapping("/{pid}")
    public ResponseEntity<String> deleteProduct(@PathVariable int pid) {
        boolean status = pservice.deleteProduct(pid);
        if (status) {
            return ResponseEntity.ok("Data deleted successfully");
        } else {
            return ResponseEntity.badRequest().body("Not deleted");
        }
    }
}
