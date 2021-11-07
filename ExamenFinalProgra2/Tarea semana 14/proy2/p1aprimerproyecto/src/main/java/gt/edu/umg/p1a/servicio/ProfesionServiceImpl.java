/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1a.servicio;

import gt.edu.umg.p1a.Profesion;
import gt.edu.umg.p1a.dao.IprofesionDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ramos
 */
@Service //definimos como un servicio 
public class ProfesionServiceImpl implements ProfesionService {
    
    @Autowired
    private IprofesionDao IprofesionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Profesion> ListaProfesions() {
        return(List<Profesion>) IprofesionDao.findAll();
    }

    @Override
    @Transactional
    public void guardar1(Profesion profesion) {
        IprofesionDao.save(profesion);
        }

    @Override
    @Transactional
    public void eliminar1(Profesion profesion) {
        IprofesionDao.delete(profesion);
         }

    

    @Override
    @Transactional(readOnly = true)
    public Profesion econtrarProfesiones(Profesion profesion) {
       return IprofesionDao.findById(profesion.getId_profesion()).orElse(null); }
    
}
