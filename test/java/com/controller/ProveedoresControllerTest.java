package com.proveedores.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.proveedores.service.ProveedoresService;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class ProveedoresControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ProveedoresService proveedoresService;

    @InjectMocks
    private ProveedoresController proveedoresController;

    @Test
    public void testGetProveedores() throws Exception {
        mockMvc.perform(get("/proveedores/{idCliente}", 1))
                .andExpect(status().isOk());
    }
}