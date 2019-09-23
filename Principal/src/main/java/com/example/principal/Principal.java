package com.example.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        //new Principal();
        ArrayList<Persona> p = new ArrayList<>();
        p.add(new Persona("Adrian", 23));
        p.add(new Persona("Otro mas",34));
        p.add(new Profesor("Andres", 45, "IOT" ));
        p.add(new Alumno("Alguien", 19, 3 ));

        for(Persona x:p){
            x.mostrar(); //sdfasds
        }

    }


    /**
     * Constructor de la clase principal
     */
    public Principal(){
        randomNumber();
    }

    /**
     * Muestra por pantalla un array de strings (bucle clasico)
     * @param l_cadenas
     */
    public void mostrarStringsArray(int  l_cadenas){
        String a[] =  new String[l_cadenas];
        for (int i = 0; i <l_cadenas ; i++) {
            a[i]="Numero "+i;
            System.out.println(a[i]);
        }

    }


    /**
     * Muestra por pantalla un array de strings (bucle foreach)
     * @param l_cadenas
     */
    public void mostrarStringsArrayForEach(int  l_cadenas){
        String a[] =  new String[l_cadenas];
        for (int i = 0; i <l_cadenas ; i++) {
            a[i]="Numero "+i;
        }

        for(String x:a){
            System.out.println(x);
        }

    }




    /**
         * Muestra por pantalla un array de cadenas de texto (ArrayList y foreach)
         */
    public void mostrarStrings(int l_cadenas){
        ArrayList<String> textos;
        textos = new ArrayList<>();

        for (int i=0; i<l_cadenas;i++){ //Cargo los valores
            textos.add("Numero "+i);
        }


        for(String x:textos){ //Los imprimo
            System.out.println(x);
        };

    }



     public void clase(){
        String a[] = {"Hola", "Mundo"};
        ArrayList<String> b = new ArrayList<>();
        b.add("Hola");
        b.add("Mundo");


         for (int i = 0; i < b.size() ; i++) {
             String n = "<"+b.get(i)+">";
             b.set(i,n);
         }

        // b.forEach(System.out::println);

     }


    /**
     * Obtiene una lista de 10 numeros reales aleatorios del 1 al 10, y se ordenan de menor a mayor.
     * Se mostraran por pantalla
     */
    public void randomNumber(){
        ArrayList<Double> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            double db = (0 + (10 - 0) *rnd.nextDouble());
            lista.add(db);
        }

        //lista.sort((x,y)-> x.compareTo(y));

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }



}
