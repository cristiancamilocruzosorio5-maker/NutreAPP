package com.example.NutreAPP.models;


import java.time.LocalDate;
import java.util.UUID;
public class Visualizacion {

    private UUID id;
    private LocalDate fecha_visulizacion;
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
