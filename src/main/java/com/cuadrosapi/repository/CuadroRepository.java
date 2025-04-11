package com.cuadrosapi.repository;

import com.cuadrosapi.model.Cuadro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio que extiende JpaRepository para operaciones CRUD.
 */
@Repository
public interface CuadroRepository extends JpaRepository<Cuadro, Long> {}
