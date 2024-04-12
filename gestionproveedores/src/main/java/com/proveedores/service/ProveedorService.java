import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> obtenerProveedoresPorIdCliente(Long idCliente) {
        return proveedorRepository.findByIdCliente(idCliente);
    }
}