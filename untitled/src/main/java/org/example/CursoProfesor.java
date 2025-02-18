package org.example;

public class CursoProfesor {
    private Profesor profesor;
    private int anio;
    private int semestre;
    private Curso curso;

    public CursoProfesor(Profesor profesor, int anio, int semestre, Curso curso) {
        this.profesor = profesor;
        this.anio = anio;
        this.semestre = semestre;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    @Override
    public String toString(){
        return "Profesor :" +profesor.toString()+ "\n"+
                "Año :" +getAnio()+ "\n"+
                "Semestre :"+getSemestre()+"\n"+
                "Curso :"+curso.toString()+ "\n";
    }
}
