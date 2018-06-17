
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import source.Aritmetica;

/**
 *
 * @author Gabriel
 */
public class AritmeticaTest {
    
    public AritmeticaTest() {
    }
  
    @Before
    public void setUp(){}
    
    @Test
    public void testSumarEnteros(){
        Assert.assertEquals(5 ,Aritmetica.sumar(2,3));
        Assert.assertEquals(1 ,Aritmetica.sumar(-2,3));
        Assert.assertEquals(2 ,Aritmetica.sumar(4,-2));
        Assert.assertEquals(-4 ,Aritmetica.sumar(-2,-2));
        Assert.assertEquals(2 ,Aritmetica.sumar(0,2));
        Assert.assertEquals(-2, Aritmetica.sumar(-2,0));
    }
    
    @After
    public void tearDown() {}

    @Test
    public void testDividirEnteros(){
        Assert.assertEquals(3 ,Aritmetica.dividir(6,2));
        Assert.assertEquals(0 ,Aritmetica.dividir(4,6));
        Assert.assertEquals(1 ,Aritmetica.dividir(3,2));
        Assert.assertEquals(-3 ,Aritmetica.dividir(-6,2));
        Assert.assertEquals(-1 ,Aritmetica.dividir(3,-2));
    }
   
    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero() {
       Aritmetica.dividir(0,2);
       Aritmetica.dividir(0,0);
       Aritmetica.dividir(2,0);
    }
    
    @Test
    public void testRestarEnteros(){
       Assert.assertEquals(-1 ,Aritmetica.restar(2,3));
       Assert.assertEquals(1 ,Aritmetica.restar(3,2));
       Assert.assertEquals(0 ,Aritmetica.restar(5,5));
       Assert.assertEquals(6 ,Aritmetica.restar(6,0));
       Assert.assertEquals(-6 ,Aritmetica.restar(0,6));

    }
    
    @Test
    public void testMultiplicarEnteros(){
       Assert.assertEquals(12 ,Aritmetica.multiplicar(4,3));
       Assert.assertEquals(12 ,Aritmetica.multiplicar(3,4));
       Assert.assertEquals(0 ,Aritmetica.multiplicar(5,0));
       Assert.assertEquals(0 ,Aritmetica.multiplicar(0,5));
       Assert.assertEquals(-4 ,Aritmetica.multiplicar(-2,2));
       Assert.assertEquals(-4 ,Aritmetica.multiplicar(2,-2));
       Assert.assertEquals(16 ,Aritmetica.multiplicar(-4,-4));
    }

}
