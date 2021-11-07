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
@Table(name = "tb_departamento")
public class Departamento implements Serializable{
    private static final long seriaVersionUID = 1l;
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id_depto;
     
     private String descripcion_depto;
}
