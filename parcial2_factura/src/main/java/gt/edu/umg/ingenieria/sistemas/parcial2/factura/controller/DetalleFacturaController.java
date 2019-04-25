package gt.edu.umg.ingenieria.sistemas.parcial2.factura.controller;


import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.DetalleFacturaEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.factura.service.FacturaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetalleFacturaController {
        
    
    @PostMapping("/crearFactura")
    public DetalleFacturaEntity crear(@RequestBody(required = true) DetalleFacturaEntity e1){
        return this.FacturaService.crearDetalleFactura(e1);
    }
        
}
