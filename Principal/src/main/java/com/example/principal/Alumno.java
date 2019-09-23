package com.example.principal;

public class Alumno extends Persona {

    protected  int suspensos;
    public Alumno(String nombre, int edad, int suspensos){
        super(nombre, edad);

        this.suspensos = suspensos;

    }


    public void mostrar(){
        System.out.println("Me llamo "+this.nombre+" y he suspendido "+this.suspensos);
    }

}
