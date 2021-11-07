/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1a;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

/**
 *
 * @author ramos
 */
@Data
@Entity
@Table(name="tb_usuarios")
public class Usuario implements Serializable{ //usuario es Persona
    private static final long serialVersionUID=1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private Long id_depto;
    private Long id_profesion;
    

    private String nombre;
    private String apellido;
    private String correo_electronico;
    private String telefono;
    private String fecha_nacimiento;
    private String longitud;
    private String latitud;
    private String fecha_registro;
    
     
}
