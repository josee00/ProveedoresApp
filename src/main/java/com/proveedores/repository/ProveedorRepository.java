package com.proveedores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proveedores.model.Proveedores;

import java.util.List;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedores, Long> {
    List<Proveedores> findByIdCliente(Long idCliente);
}