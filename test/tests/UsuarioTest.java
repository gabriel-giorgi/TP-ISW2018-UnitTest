/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import static junit.framework.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import source.Ejercicio;
import source.Usuario;
import source.Nivel;
import source.TipoUsuario;


/**
 *
 * @author Shinirra
 */
public class UsuarioTest {
    
    public UsuarioTest() {
           
        
    }
    
    @BeforeClass
    public static void setUpClass() {
      
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testUsuarioNombre() {
           Usuario alumno1 = new Usuario();
        alumno1.nombre="hola";
                
         assert  alumno1.nombre!=null;
         alumno1.nombre="";
         assert (alumno1.nombre) != null;
         alumno1.nombre="24";
         assert (alumno1.nombre) !=null;
         alumno1.nombre="hola24";
         assert (alumno1.nombre) !=null;
         
    }
    @Test
    public void testUsuarioContraseña(){     
        Usuario alumno1 = new Usuario();
        alumno1.contraseña="afsadfa";      
         assert alumno1.contraseña!=null;
        
    }
    @Test
     public void testUsuarioContengaNivel(){     
        Usuario alumno1 = new Usuario();
        Nivel nivel = new Nivel();
        nivel.setNombreNivel("principiante");
        nivel.setExperiencia(0);
        alumno1.nivel= nivel;      
         assert alumno1.nivel!=null;
        
    }
     @Test
     public void testProfesorAsigneDificultadAEjercicio(){
     Usuario profesor = new Usuario();
     Ejercicio problema = new Ejercicio();
     TipoUsuario tipousuario= new TipoUsuario();
     tipousuario.setTipoUsuario("profesor");
     profesor.setTipoUsuario(tipousuario);
     profesor.ej.add(problema);
     profesor.ej.get(0).setDificultad("medio");
     assert profesor.ej.get(0).dificultad!=null;
     }
}
