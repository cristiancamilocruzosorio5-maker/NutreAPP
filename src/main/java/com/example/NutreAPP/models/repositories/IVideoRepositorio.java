package com.example.NutreAPP.models.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NutreAPP.models.Video;
import com.example.NutreAPP.models.Video.Categoria;

@Repository
public interface IVideoRepositorio extends JpaRepository<Video, UUID> {

    List<Video> findByCategoria(Categoria categoria);

    List<Video> findByTituloContainingIgnoreCase(String titulo);

    List<Video> findByDescripcionContaining(String descripcion);

    List<Video> findByUrlContaining(String url);

    List<Video> findByTituloContainingIgnoreCaseAndCategoria(String titulo, Categoria categoria);
}
