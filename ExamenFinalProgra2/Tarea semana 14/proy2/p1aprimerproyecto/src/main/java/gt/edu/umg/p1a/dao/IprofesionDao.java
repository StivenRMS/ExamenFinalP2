/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1a.dao;

import gt.edu.umg.p1a.Profesion;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ramos
 */
public interface IprofesionDao extends CrudRepository<Profesion, Long>{
    
}
