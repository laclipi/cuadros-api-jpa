package com.cuadrosapi.service;

import com.cuadrosapi.model.Cuadro;
import com.cuadrosapi.repository.CuadroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio que maneja la lógica de negocio para los cuadros.
 */
@Service
public class CuadroService {

    private final CuadroRepository cuadroRepository;

    public CuadroService(CuadroRepository cuadroRepository) {
        this.cuadroRepository = cuadroRepository;
    }

    public List<Cuadro> getAllCuadros() {
        return cuadroRepository.findAll();
    }

    public Cuadro addCuadro(Cuadro cuadro) {
        return cuadroRepository.save(cuadro);
    }
}
