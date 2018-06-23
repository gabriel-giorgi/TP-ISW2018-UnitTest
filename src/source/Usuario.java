/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;
import java.util.Vector;
import source.Nivel;
/**
 *
 * @author Gabriel
 */
public class Usuario {
    private  String nombre;
    private  String contraseña;
    private Nivel nivel;
    private TipoUsuario tipoUsuario;
    private Ejercicio ejercicios[];
    public  Vector<Ejercicio> ej = new Vector<Ejercicio>();

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if ("".equals(nombre)) System.out.println("nombre ingresado no puede ser vacio");
        else {
            this.nombre = nombre;
        }
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        if (contraseña.length()>5 ){
        this.contraseña = contraseña ;
        }
        else
        System.out.println("ingrese mas de 6 caracteres");
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Ejercicio[] getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(Ejercicio[] ejercicios) {
        this.ejercicios = ejercicios;
    }

    
    
    
}
