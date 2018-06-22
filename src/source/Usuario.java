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
    public  String nombre;
    public  String contraseña;
    public Nivel nivel;
    public TipoUsuario tipoUsuario;
    public Ejercicio ejercicios[];
    public  Vector<Ejercicio> ej = new Vector<Ejercicio>();

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    
    
    
}
