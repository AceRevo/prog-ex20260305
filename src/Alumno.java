/*
* Autor: Angel Leonardo Saenz Sanchez
* version: 1.0.0
*
*
* */

public class Alumno {

    //Declaracion de variables sin inicializar
    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;


    //Contructor para la clase Alumno con sus atributos
    public Alumno alumno(int id, String nombre, String tituloFP, int edad){

        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;

    }

    //seccion getters
    public int getId(){
        return this.id;

    }

    public String getNombre(){
        return  this.nombre;

    }

    public String getTituloFP(){
        return  this.tituloFP;

    }

    public int getEdad(){
        return this.edad;
    }

    @Override

    public String toString("\n-----Datos de Alumno-----"){
        String.format("[ID: %d] %-12s, %s, %d" id, nombre, tituloFP, edad);

    }

}
