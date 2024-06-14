package cl.praxis.calculadora;

/**
 * Nombre del Package :cl.praxis.calculadora
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : viernes 14 de junio de 2024
 * 14-06-2024 16:41
 * Nombre del Proyecto Desafio-Calculadora Parte I
 */
public class Calculadora {
    //Atributos
    private int num1;
    private int num2;


    //Constructor Vacio

    public Calculadora() {
    }

    //Constructor Completo

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    //Metodos

    public int sumar(){
        int suma = this.num1 + this.num2;
        return suma;

    }

    public int restar(){
        int resta = this.num1 - this.num2;
        return resta;

    }

    public int multiplicar(){
        int multi= this.num1 * this.num2;
        return multi;
    }

    public double dividir(){
        double division = (double)this.num1 / (double)this.num2;
        return division;
    }


    //Getters y Setters


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
