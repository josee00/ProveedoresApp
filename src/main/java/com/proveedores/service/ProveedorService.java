package com.proveedores.service;

import java.util.List;

import com.proveedores.model.Proveedores;

public interface ProveedorService {
    List<Proveedores> obtenerProveedoresPorIdCliente(Long idCliente);
}