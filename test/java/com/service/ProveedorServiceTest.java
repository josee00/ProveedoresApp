import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProveedorServiceImplTest {

    @Mock
    private ProveedorRepository proveedorRepository;

    private ProveedorService proveedorService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        proveedorService = new ProveedorServiceImpl(proveedorRepository);
    }

    @Test
    public void testObtenerProveedoresPorIdCliente() {
        // Arrange
        Long idCliente = 1L; 
        List<Proveedor> proveedoresMock = new ArrayList<>();
        proveedoresMock.add(new Proveedor(1L, "Coca-cola", new Date(2024-01-01), idCliente)); 
        when(proveedorRepository.findByIdCliente(idCliente)).thenReturn(proveedoresMock);

        // Act
        List<Proveedor> proveedores = proveedorService.obtenerProveedoresPorIdCliente(idCliente);

        // Assert
        assertEquals(1, proveedores.size()); 
        assertEquals("Coca-cola", proveedores.get(0).getNombre()); 
        assertEquals(new Date(2024-01-01), proveedores.get(0).getFechaAlta());
    }
}