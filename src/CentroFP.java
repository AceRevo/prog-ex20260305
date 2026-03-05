/*
* Autor: Angel Leonardo Saenz Sanchez
* version: 1.0.0
*
*
* */


public class CentroFP {

    //declaracion de variables (todos privados)
    private Alumno[]alumnos;
    private final int MAX_ALUMNOS;


    //Contructor de la clase CentroFP
    public CentroFP(int maxAlumnos) {
        MAX_ALUMNOS = maxAlumnos;
        this.alumnos = new Alumno[MAX_ALUMNOS];
    }


    //Metodos a plaicar
    public  Alumno buscarAlumno(int id){


    }

    private  int buscarPrimerHuecolibre(int id){
        int plazaEncontrada = -1;
        boolean buscandoPlaza = true;

        for (int i = 0; i<MAX_ALUMNOS && buscandoPlaza; i++){
            if (alumnos[i] != null && alumnos[i].getId() == id){
                buscandoPlaza = false;

            }
        }
        return  plazaEncontrada;
    }

    public boolean regirtrarAlumno(Alumno alumno){
        int alumnoMatriculado = -1;
        boolean matriculandoAlumno = true;

        for (int i = 0; i<MAX_ALUMNOS && matriculandoAlumno; i++){
            if (alumno != null){

            }
        }
    }

    public String mostrarAlumnos(){

    }

    public int contarAlumnos(){

    }
}
