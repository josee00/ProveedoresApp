import java.util.List;

public interface ProveedorService {
    List<Proveedor> obtenerProveedoresPorIdCliente(Long idCliente);
}