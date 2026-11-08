package com.example.NutreAPP.models.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NutreAPP.models.Usuario; // Asegúrate de que la ruta de tu entidad Usuario sea esta

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, UUID> {
    
}