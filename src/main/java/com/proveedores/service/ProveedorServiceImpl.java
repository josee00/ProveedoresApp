import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Collections;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> obtenerProveedoresPorIdCliente(Long idCliente) {
        List<Proveedor> proveedores = proveedorRepository.findByIdCliente(idCliente);
        return proveedores.isEmpty() ? Collections.emptyList() : proveedores;
    }
}