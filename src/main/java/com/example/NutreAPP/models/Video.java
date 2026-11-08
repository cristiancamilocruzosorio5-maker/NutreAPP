package com.example.NutreAPP.models;

public class Video {

    private UUID id;
    private String titulo;
    private String descripcion;
    private String url;
    private Categoria categoria;

    public enum Categoria {
        SST,
        TALENTO,
        CAPACITACION_INTERNA
    }

}
