/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import source.Nivel;

/**
 *
 * @author SISTEMAS
 */
public class NivelTest {
    
    public NivelTest() {
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
    public void testCalculoNivel() {
        Nivel nivel1= new Nivel();
       nivel1.setExperiencia(15000);
       nivel1.calculoNivel();
       assert "avanzado".equals(nivel1.getNombreNivel());
       nivel1.setExperiencia(10000);
       nivel1.calculoNivel();
       assert "avanzado".equals(nivel1.getNombreNivel());
       nivel1.setExperiencia(99999);
       nivel1.calculoNivel();
       assert "avanzado".equals(nivel1.getNombreNivel());
       nivel1.setExperiencia(5000);
       nivel1.calculoNivel();
       assert "principiante".equals(nivel1.getNombreNivel());
       nivel1.setExperiencia(0);
       nivel1.calculoNivel();
       assert "principiante".equals(nivel1.getNombreNivel());
       nivel1.setExperiencia(9999);
       nivel1.calculoNivel();
       assert "principiante".equals(nivel1.getNombreNivel());
                          }    
    }        
    
         
    
 
        
    

