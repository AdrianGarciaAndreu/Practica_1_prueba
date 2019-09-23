package com.example.principal;


public class Profesor extends Persona {

    protected String asignatura;

    public Profesor(String nombre, int edad, String asignatura){
        super(nombre, edad);

        this.asignatura = asignatura;

    }


    public void mostrar(){
        System.out.println("Me llamo "+this.nombre+" y doy la asignatura "+this.asignatura);
    }


}
