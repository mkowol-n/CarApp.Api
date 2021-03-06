package com.nepath.carapp.controllers;

import com.nepath.carapp.dtos.input.*;
import com.nepath.carapp.dtos.output.CarDto;
import com.nepath.carapp.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminToolsController {
    private final AdminService adminService;

    @PostMapping("/createEngine")
    ResponseEntity<Void>createEngine(@Valid @RequestBody EngineCreateDto engineCreateDto) {
        adminService.createEngine(engineCreateDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/createModel")
    ResponseEntity<Void>createModel(@Valid @RequestBody ModelCreateDto modelCreateDto) {
        adminService.createModel(modelCreateDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/createBrand")
    ResponseEntity<Void>createBrand(@Valid @RequestBody BrandCreateDto brandCreateDto) {
        adminService.createBrand(brandCreateDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/changeCarOwner")
    ResponseEntity<CarDto> changeCarOwner(@Valid @RequestBody ChangeCarOwnerDto changeCarOwnerDto) {
        adminService.changeCarOwner(changeCarOwnerDto);
        return ResponseEntity.ok().build();
    }
}
