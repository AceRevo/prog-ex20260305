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
    //buscar luchador mediante la id
    public  Alumno buscarAlumno(int id) {
        boolean llamandoAlumno = true;
        Alumno alumnoPresente = null;
//Recorrido de Array
        for (int i = 0; i < MAX_ALUMNOS && llamandoAlumno; i++) {
            //condicional si se encontro el alumno
            if (alumnos[i] != null && alumnos[i].getId() == id) {
            llamandoAlumno = false;
            alumnoPresente = alumnos[i];
                }
            }
        return alumnoPresente;
    }


    private  int buscarPrimerHuecolibre(int id){
        //Declaracion e inicializacion de variables con una nueva variable.
        int plazaEncontrada = -1;
        boolean buscandoPlaza = true; // por fdefecto


        /* recorre el array buscando el primer hueco libre, por defecto sigue buscando , pero si es distinto de nulo significa
        que el hueco ya fue encontrado y al mismo tiempo ocupado
        */
        for (int i = 0; i<MAX_ALUMNOS && buscandoPlaza; i++){
            if (alumnos[i] != null && alumnos[i].getId() == id){
                buscandoPlaza = false;

            }
        }
        return  plazaEncontrada;
    }

    public boolean regirtrarAlumno(Alumno alumno){
        //agregamos la variables pocision para saber donde se encuentra nuestro alumno;
        int posicion;
        int alumnoMatriculado = null;
        boolean matriculandoAlumno = false; //por default
        if (buscarAlumno(alumno.getId()) == null){
            posicion = buscarPrimerHuecolibre();
        if (posicion >= 0) {
            alumnos[posicion] = alumno;
            matriculandoAlumno = true;

            }
        }
        return alumnoMatriculado;
    }

    public String mostrarAlumnos(){
    StringBuilder sb = new StringBuilder("\n===== Alumnos Matriculados=======");
        String.format()
    }

    public int contarAlumnos(){

    }
}
