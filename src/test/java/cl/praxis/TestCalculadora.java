package cl.praxis;

import cl.praxis.calculadora.Calculadora;
import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Nombre del Package :cl.praxis
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : viernes 14 de junio de 2024
 * 14-06-2024 17:11
 * Nombre del Proyecto Desafio-Calculadora Parte I
 */

@DisplayName("Tests Clase Calculadora")
public class TestCalculadora {
    private static Logger logger = Logger.getLogger("cl.praxis.TestCalculadora");


//Notaciones

    @BeforeAll
    public static void setup() {
        logger.info("Inicio clase de prueba se inicia antes que todo test ");
    }

    @BeforeEach
    public void init(){
        logger.info("-> se ejecuta antes de cada prueba <-");
    }

    @AfterEach
    public void closeEach(){
        logger.info("*** se ejecutara Despues de cada prueba ***");
    }

    @AfterAll
    public static void close(){
        logger.warning("<<< se ejecuta Despues de todas las prueba >>>");
    }


    //Tests

    @Test
    public void testSumar(){
        logger.info("info test sumar 2 numeros");
        //crear persona pasandole los datos a la clase

        Calculadora calculadora = new Calculadora(35, 25);
        int respuestaSuma = calculadora.sumar();
        assertEquals(60,respuestaSuma);

    }

    @Test
    public void testRestar(){
        logger.info("info test sumar 2 numeros");
        //crear persona pasandole los datos a la clase

        Calculadora calculadora = new Calculadora(5, 5);
        int respuestaResta = calculadora.restar();
        assertEquals(0,respuestaResta);

    }

    @Test
    public void testMultiplicar(){
        logger.info("info test sumar 2 numeros");
        //crear persona pasandole los datos a la clase

        Calculadora calculadora = new Calculadora(5, 8);
        int respuestaSuma = calculadora.multiplicar();
        assertEquals(40,respuestaSuma);

    }


  @Test
    public void testDividir(){
        logger.info("info test sumar 2 numeros");
        //crear persona pasandole los datos a la clase

        Calculadora calculadora = new Calculadora(35, 25);
        double respuestaSuma = calculadora.dividir();
        assertEquals(1.4,respuestaSuma);

    }





}
