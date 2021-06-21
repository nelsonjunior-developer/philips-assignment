package com.philips.assignment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/product")
@Slf4j
public class ProductController {

    @GetMapping
    public ResponseEntity<String> test(@Valid @RequestBody String body) {

        log.info("method=test, id={}, body={}", body);


        return ResponseEntity.ok().build();
    }
}
