package org.example;

public class Curso {
    private int ID;
    private String nombre;
    private Programa programa;
    private boolean activo;

    public Curso(int ID, String nombre, Programa programa,boolean activo){
        this.ID = ID;
        this.nombre = nombre;
        this.programa = programa;
        this.activo = activo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString(){
        return "ID :"+getID()+"\n"+
                "Nombre :"+getNombre()+"\n"+
                "Programa :"+programa.toString()+"\n"+
                "Activo :"+isActivo()+"\n";
    }
}
