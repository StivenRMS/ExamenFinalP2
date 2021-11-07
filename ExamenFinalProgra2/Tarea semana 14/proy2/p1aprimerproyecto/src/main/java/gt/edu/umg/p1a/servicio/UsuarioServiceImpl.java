/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1a.servicio;

import gt.edu.umg.p1a.Usuario;
import gt.edu.umg.p1a.dao.IusuarioDao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ramos
 */
// Aqui se implementa lo dela interfaces UsuarioService

@Service //definimos como un servicio 
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private  IusuarioDao IusuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> ListaUsuarios() {
        return (List<Usuario>) IusuarioDao.findAll();
       }

    @Override
    @Transactional
    public void guardar(Usuario usuario) {
        IusuarioDao.save(usuario);
       }

    @Override
    @Transactional
    public void eliminar(Usuario usuario) {
        IusuarioDao.delete(usuario);
        
         }

    @Override
    @Transactional(readOnly = true)
    public Usuario econtrarUsuario(Usuario usuario) {
       
        return IusuarioDao.findById(usuario.getId_usuario()).orElse(null);
        }
    
}
