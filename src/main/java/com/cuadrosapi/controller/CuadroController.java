package com.cuadrosapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuadrosapi.model.Cuadro;
import com.cuadrosapi.service.CuadroService;

@RestController
@RequestMapping("/cuadros")
public class CuadroController {

    private final CuadroService cuadroService;

    public CuadroController(CuadroService cuadroService) {
        this.cuadroService = cuadroService;
    }

    @GetMapping
    public List<Cuadro> getAllCuadros() {
        return cuadroService.getAllCuadros();
    }

    @PostMapping
    public Cuadro addCuadro(@RequestBody Cuadro cuadro) {
        return cuadroService.addCuadro(cuadro);
    }
}