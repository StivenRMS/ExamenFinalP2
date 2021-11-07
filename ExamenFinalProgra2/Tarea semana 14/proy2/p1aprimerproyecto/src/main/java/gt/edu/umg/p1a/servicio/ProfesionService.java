/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1a.servicio;

import gt.edu.umg.p1a.Profesion;
import java.util.List;

/**
 *
 * @author ramos
 */
public interface ProfesionService {
    
    public List<Profesion> ListaProfesions();
    
    public void guardar1(Profesion profesion);
    public void eliminar1(Profesion profesion);
    public Profesion econtrarProfesiones(Profesion profesion);
    
    
    
}
