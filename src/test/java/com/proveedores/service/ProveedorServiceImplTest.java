package com.proveedores.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.proveedores.model.Proveedores;
import com.proveedores.repository.ProveedorRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProveedorServiceImplTest {

    @Mock
    private ProveedorRepository proveedorRepository;

    @InjectMocks
    private ProveedorService proveedorService = new ProveedorServiceImpl();

    @Test
    public void testObtenerProveedoresPorIdCliente() {
        Long idCliente = 1L;
        List<Proveedores> proveedoresEsperados = Arrays.asList(
            new Proveedores(1L, "Coca-cola", idCliente)
        );

        when(proveedorRepository.findByIdCliente(anyLong())).thenReturn(proveedoresEsperados);

        List<Proveedores> proveedoresObtenidos = proveedorService.obtenerProveedoresPorIdCliente(idCliente);

        assertEquals(proveedoresEsperados, proveedoresObtenidos);
    }

    @Test
    public void testObtenerProveedoresPorIdClienteSinResultados() {
        Long idCliente = 456L;

        when(proveedorRepository.findByIdCliente(anyLong())).thenReturn(Collections.emptyList());

        List<Proveedores> proveedoresObtenidos = proveedorService.obtenerProveedoresPorIdCliente(idCliente);

        assertEquals(Collections.emptyList(), proveedoresObtenidos);
    }
}