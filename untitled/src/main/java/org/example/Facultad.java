package org.example;

public class Facultad {
    private double Id;
    private String nombre;
    private Persona decano;

    // metodos

    public Facultad(double id, String nombre, Persona decano) {
        Id = id;
        this.nombre = nombre;
        this.decano = decano;
    }

    public String toString() {
        return "ID: " +getId()+ "\n"+
                "Nombre: " +getNombre()+ "\n"+
                "Decano: " +Persona.toString();
    }

    public double getId() {
        return Id;
    }

    public void setId(double id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDecano() {
        return decano;
    }

    public void setDecano(Persona decano) {
        this.decano = decano;
    }
}
