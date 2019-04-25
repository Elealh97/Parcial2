package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.service;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.inventario.dao.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    
    public List<ProductoEntity> buscarTodos() {
        return (List<ProductoEntity>) this.productoRepository.findAll();
    }
    
     public ProductoEntity crearProducto(ProductoEntity e1){
        return this.productoRepository.save(e1);
    }
     
   public ProductoEntity actualizarStock(Long id,String accion ,Integer Stock){
        ProductoEntity e1 = this.productoRepository.findById(id).get();
        
        if("incrementar".equals(accion)){e1.setStock((e1.getStock()+Stock));}
        else if("decrementar".equals(accion)){e1.setStock((e1.getStock()-Stock));}
        return this.productoRepository.save(e1);
    }
     
}
