/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1a;

import gt.edu.umg.p1a.dao.DepartamentoDao;
import gt.edu.umg.p1a.dao.IusuarioDao;
import gt.edu.umg.p1a.servicio.DepartamentoService;
import gt.edu.umg.p1a.servicio.ProfesionService;
import gt.edu.umg.p1a.servicio.UsuarioService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ramos
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Autowired // esto sirve para inyectar la dependecia de tipo UsuarioDao
    //private IusuarioDao IusuarioDao;
    private UsuarioService usuarioService;
    

    @GetMapping("/")
    public String inicio(Model modelo) {
        var usuarios = usuarioService.ListaUsuarios();
        ///var profesiones = profesionService.ListaProfesions();
        modelo.addAttribute("usuarios", usuarios);
       /// modelo.addAttribute("profesiones", profesiones);
        
        return "Index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Usuario usuario){
        //var departamentos = departamentoService.listaDepartamento();
        
        //modelo.addAttribute("departamentos", departamentos);
      
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Usuario usuario){
        usuarioService.guardar(usuario);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id_usuario}")
    public String editar(Usuario usuario, Model model){
        usuario = usuarioService.econtrarUsuario(usuario);
        model.addAttribute("usuario",usuario);
        return "modificar";
    }
    
   @GetMapping("/eliminar/{id_usuario}")
    public String eliminar(Usuario usuario){
    usuarioService.eliminar(usuario);
    return "redirect:/";
} 
    @Autowired
    private ProfesionService profesionService;
    
    @GetMapping("/inicio1")
    public String inicio1(Model modelo) {
        var profesiones = profesionService.ListaProfesions();
       modelo.addAttribute("profesiones", profesiones);
        return "profesion";
    }
    
    
    @GetMapping("/agregar1")
    public String agregar1(Profesion profesion){
    return "modificarProfesion";
    }
    
    @PostMapping("/guardar1")
    public String guardar1(Profesion profesion){
        profesionService.guardar1(profesion);
        return "redirect:/inicio1";
        
    }
    
    @GetMapping("/editar1/{id_profesion}")
    public String editar1(Profesion profesion, Model model){
        profesion= profesionService.econtrarProfesiones(profesion);
        model.addAttribute("profesion", profesion);
        return "modificarProfesion";
    }
    
    @GetMapping("/eliminar1/{id_profesion}")
    public String eliminar1(Profesion profesion){
        profesionService.eliminar1(profesion);
        return "redirect:/inicio1";
    }

    @Autowired
    private DepartamentoService departamentoService;
    
   // @GetMapping("")
   // public String crear(Model modelo) {
       
    //    var departamentos = departamentoService.listaDepartamento();
        
    //    modelo.addAttribute("departamentos", departamentos);
      
    //    return "modificar";
    
}
