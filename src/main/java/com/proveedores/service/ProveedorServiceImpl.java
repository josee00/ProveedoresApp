package com.proveedores.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.proveedores.model.Proveedores;
import com.proveedores.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedores> obtenerProveedoresPorIdCliente(Long idCliente) {
        List<Proveedores> proveedores = proveedorRepository.findByIdCliente(idCliente);
        return proveedores.isEmpty() ? Collections.emptyList() : proveedores;
    }
}