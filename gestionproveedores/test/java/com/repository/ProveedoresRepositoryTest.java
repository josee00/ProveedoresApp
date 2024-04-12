package com.proveedores.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.proveedores.model.Proveedor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ProveedoresRepositoryTest {

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    @Test
    public void testFindByIdCliente() {
        List<Proveedor> proveedores = proveedoresRepository.findByIdCliente(1L);
        assertThat(proveedores).isNotNull();
        assertThat(proveedores).hasSizeGreaterThan(0);
    }
}