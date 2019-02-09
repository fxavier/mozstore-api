package com.xavier.mozstoreapi.resource;

import com.xavier.mozstoreapi.model.Brand;
import com.xavier.mozstoreapi.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandResource {

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping
    public List<Brand> all() {
        return brandRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Brand create(@Valid @RequestBody Brand brand) {
       return brandRepository.save(brand);
    }
}
