package com.example.NutreAPP.models;


import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Table(name = "visualizaciones")
@Repository
public interface IVisualizacion extends JpaRepository<Visualizacion, UUID> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "fecha_visualizacion, nullable = false, unique = false")
    private LocalDate fecha_visulizacion;
    @Column(name = "completado, nullable = false, unique = false")
    private Boolean completado;
    public Visualizacion() {
    }
    public Visualizacion(UUID id, LocalDate fecha_visulizacion, Boolean completado) {
        this.id = id;
        this.fecha_visulizacion = fecha_visulizacion;
        this.completado = completado;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public LocalDate getFecha_visulizacion() {
        return fecha_visulizacion;
    }
    public void setFecha_visulizacion(LocalDate fecha_visulizacion) {
        this.fecha_visulizacion = fecha_visulizacion;
    }
    public Boolean getCompletado() {
        return completado;
    }
    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

    
    
}
