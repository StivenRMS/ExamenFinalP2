/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1a.servicio;

import gt.edu.umg.p1a.Departamento;
import gt.edu.umg.p1a.dao.DepartamentoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ramos
 */
@Service
public class DepartamentoServiceImpl implements DepartamentoService {
    
    @Autowired
    private DepartamentoDao DepartartamentoDao;

    @Override
    public List<Departamento> listaDepartamento() {
        return(List<Departamento>) DepartartamentoDao.findAll();
        }
    
}
