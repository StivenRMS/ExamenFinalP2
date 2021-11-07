/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1a.servicio;

import gt.edu.umg.p1a.Usuario;
import java.util.List;

/**
 *
 * @author ramos
 */
public interface UsuarioService {
    //La interfaz que no devuelve nada, solo es como el lista que debe llevar 
    
    public List<Usuario> ListaUsuarios();
    
    public void guardar(Usuario usuario);
    public void eliminar(Usuario usuario);
    public Usuario econtrarUsuario(Usuario usuario);
    
    
    
}
