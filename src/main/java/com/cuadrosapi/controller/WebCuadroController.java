package com.cuadrosapi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cuadrosapi.model.Cuadro;
import com.cuadrosapi.service.CuadroService;

@Controller
public class WebCuadroController {

    private final CuadroService cuadroService;

    public WebCuadroController(CuadroService cuadroService) {
        this.cuadroService = cuadroService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Cuadro> cuadros = cuadroService.getAllCuadros();
        model.addAttribute("cuadros", cuadros);
        model.addAttribute("cuadro", new Cuadro()); // Para mostrar un cuadro vacío en el formulario
        model.addAttribute("total", cuadros.size()); // Mostrar total
        return "index"; // Renderiza el archivo src/main/resources/templates/index.html
    }

    @PostMapping("/cuadro")
    public String addCuadro(@ModelAttribute Cuadro cuadro) {
        cuadroService.addCuadro(cuadro);
        return "redirect:/"; // Redirige a la página principal después de agregar el cuadro
    }
}