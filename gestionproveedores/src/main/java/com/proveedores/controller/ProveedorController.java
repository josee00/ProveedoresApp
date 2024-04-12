import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/proveedores/{idCliente}")
    public List<Proveedor> obtenerProveedoresPorIdCliente(@PathVariable Long idCliente) {
        return proveedorService.obtenerProveedoresPorIdCliente(idCliente);
    }
}