import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProveedorServiceTest {

    @Mock
    private ProveedorRepository proveedorRepository;

    @InjectMocks
    private ProveedorService proveedorService;

    @Test
    public void testObtenerProveedoresPorIdCliente() {
        // Datos de prueba
        Long idCliente = 5L;
        List<Proveedor> proveedoresMock = new ArrayList<>();
        proveedoresMock.add(new Proveedor(1L, "Coca-cola", new Date(), 5L));
        proveedoresMock.add(new Proveedor(2L, "Pepsi", new Date(), 5L));

        // Simular el comportamiento del repositorio
        when(proveedorRepository.findByIdCliente(idCliente)).thenReturn(proveedoresMock);

        // Ejecutar el método a probar
        List<Proveedor> proveedores = proveedorService.obtenerProveedoresPorIdCliente(idCliente);

        // Verificar el resultado
        assertEquals(proveedoresMock.size(), proveedores.size());
        for (int i = 0; i < proveedoresMock.size(); i++) {
            Proveedor proveedorMock = proveedoresMock.get(i);
            Proveedor proveedorActual = proveedores.get(i);
            assertEquals(proveedorMock.getIdProveedor(), proveedorActual.getIdProveedor());
            assertEquals(proveedorMock.getNombre(), proveedorActual.getNombre());
            assertEquals(proveedorMock.getFechaAlta(), proveedorActual.getFechaAlta());
            assertEquals(proveedorMock.getIdCliente(), proveedorActual.getIdCliente());
        }
    }
}