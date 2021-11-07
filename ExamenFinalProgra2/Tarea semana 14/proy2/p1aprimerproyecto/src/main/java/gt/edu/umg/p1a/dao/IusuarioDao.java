/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1a.dao;

import gt.edu.umg.p1a.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ramos
 * AQUI ES DONDE SE HACE EL CRUD
 */
//Aqui se genera todo el Crud en el Objeto que este casao es Usuario y lo implementar en el Interface IusuarioDao
public interface IusuarioDao extends CrudRepository<Usuario, Long>{
    //CRUDREPOSITORY
    
}
