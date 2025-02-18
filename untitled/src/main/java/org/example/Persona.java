package org.example;

public class Persona {
    private double ID;
    private String nombres;
    private String apellidos;
    private String email;

    public Persona(double ID, String nombres, String email, String apellidos) {
        this.ID = ID;
        this.nombres = nombres;
        this.email = email;
        this.apellidos = apellidos;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "ID :"+getID()+"\n"+
                "Nombres :"+getNombres()+"\n"+
                "Apellidos :"+getApellidos()+"\n"+
                "Email :"+getEmail()+"\n";
    }
}
