package com.dungpv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api/")
@RestController
public class GateWayControllers {

    @Autowired
    private ResourceLoader resourceLoader;

    @GetMapping(path = "downloadFileTemplate")
    public ResponseEntity<String> downloadFileTemplate() {

        return ResponseEntity.ok("123");
    }
}
