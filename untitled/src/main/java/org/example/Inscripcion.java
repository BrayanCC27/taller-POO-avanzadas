package org.example;

public class Inscripcion {
    private Curso curso;
    private int anio;
    private int semestre;
    private Estudiante estudiante;

    // metodos

    public Inscripcion(Curso curso, int anio, int semestre, Estudiante estudiante) {
        this.curso = curso;
        this.anio = anio;
        this.semestre = semestre;
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Curso: " +curso.toString()+ "\n"+
                "Año: " +getAnio()+ "\n"+
                "Semestre: " +getSemestre()+ "\n"+
                "Estudiante: " +estudiante.toString();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
