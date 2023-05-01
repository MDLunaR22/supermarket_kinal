package com.supermarket.models.idao;

/**
 *
 * @author Marvin David Luna Ramirez
 * @date 6/09/2022
 * @time 09:47:55
 * Codigo Tecnico: IN5BV
 * Grupo: 2 (lunes)
 *
 */

import java.util.List;
import com.supermarket.models.domain.Factura;

public interface IFacturaDao {
    
    public List<Factura> getAll();
    
    public int add(Factura factura);
    
    public int update(Factura factura);
    
    public int delete(Factura factura);
}
