package com.example.NutreAPP.models.repositories;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NutreAPP.models.Visualizacion;

@Repository
public interface IVisualizacionRepositorio extends JpaRepository<Visualizacion, UUID> {

    List<Visualizacion> findByFechaVisualizacion(LocalDate fechaVisualizacion);

    List<Visualizacion> findByCompletadoFalse();

    List<Visualizacion> findByCompletadoTrue();
}
