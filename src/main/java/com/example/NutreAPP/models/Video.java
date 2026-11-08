package com.example.NutreAPP.models;
@Repository
public interface Video extends JpaRepository<Video, UUID> {

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
