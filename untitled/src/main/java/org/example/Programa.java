package org.example;

public class Programa {
    private double ID;
    private String nombre;
    private double duracion;
    private String registro;
    private Facultad facultad;

    public Programa(double ID, String nombre, double duracion, String registro, Facultad facultad) {
        this.ID = ID;
        this.nombre = nombre;
        this.duracion = duracion;
        this.registro = registro;
        this.facultad = facultad;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString(){
        return "ID :"+getID()+"\n"+
                "Nombre :"+getNombre()+"\n"+
                "Duracion :"+getDuracion()+"\n"+
                "Registro :"+getRegistro()+"\n"+
                "Facultad :"+facultad.toString()+"\n";
    }
}
