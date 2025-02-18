package org.example;

public class Estudiante extends Persona {
    private double codigo;
    private Programa programa;
    private boolean activo;
    private double promedio;

    // metodos
    public Estudiante(double Id, String nombre, String apellido, String email, double codigo, Programa programa, boolean activo, double promedio) {
        super(Id, nombre, apellido, email);
        this.codigo = codigo;
        this.programa = programa;
        this.activo = activo;
        this.promedio = promedio;
    }
    
    public String toString() {
        return "Código: " + getCodigo() + "\n" +
                "Programa: " + Programa.toString() + "\n" +
                "Activo: " + isActivo() + "\n" +
                "Promedio: " + getPromedio() + "\n"+
                super.toString() + "\n";
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
