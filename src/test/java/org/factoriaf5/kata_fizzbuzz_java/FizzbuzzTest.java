package org.factoriaf5.kata_fizzbuzz_java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class FizzbuzzTest {
    
    private Fizzbuzz fizzbuzz;

    @BeforeEach
    public void init() {
        this.fizzbuzz = new Fizzbuzz();
    }

    @Test
    public void testIsDivisibleByThree() {

        int num = 30;
        
        boolean result = fizzbuzz.isDivisibleByThree(num);

        assertTrue(result);
    }

    @Test
    public void testIsNotDivisibleByThree() {

        int num = 31;
        
        boolean result = fizzbuzz.isDivisibleByThree(num);

        assertFalse(result);
    }

    @Test
    public void testIsDivisibleByFive() {

        int num = 30;
        
        boolean result = fizzbuzz.isDivisibleByFive(num);

        assertTrue(result);
    }

    @Test
    public void testIsNotDivisibleByFive() {

        int num = 51;
        
        boolean result = fizzbuzz.isDivisibleByFive(num);

        assertFalse(result);
    }

    @Test
    public void testReturnFizz() {

        int num = 33;

        String result = fizzbuzz.fizzBuzz(num);

        assertEquals("Fizz", result);
    }

    @Test
    public void testReturnBuzz() {

        int num = 25;

        String result = fizzbuzz.fizzBuzz(num);

        assertEquals("Buzz", result);
    }

    @Test
    public void testReturnFizzBuzz() {

        int num = 60;

        String result = fizzbuzz.fizzBuzz(num);

        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testReturnNum() {

        int num = 71;

        String result = fizzbuzz.fizzBuzz(num);

        assertEquals("71", result);
    }

    @Test
    public void testContainsThree(){
        int num = 354;
        boolean result = fizzbuzz.containsThree(num);
        assertTrue(result);
    }

    @Test
    public void testNotContainsThree(){
        int num = 50;
        boolean result = fizzbuzz.containsThree(num);
        assertFalse(result);
    }

    @Test
    public void testContainsFive(){
        int num = 50;
        boolean result = fizzbuzz.containsFive(num);
        assertTrue(result);
    }

    @Test
    public void testNotContainsFive(){
        int num = 122;
        boolean result = fizzbuzz.containsFive(num);
        assertFalse(result);
    }
    
    @Test
    public void testMain() {
        // Capturar la salida de System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Ejecutar el método main
        Fizzbuzz.main(new String[]{});
            
        // Restaurar la salida de System.out
        System.setOut(originalOut);

        // Verificar la salida
        assertEquals("FizzBuzz", outContent.toString());
    }
}
