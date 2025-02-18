package org.example;

public class Curso {
    private int ID;
    private Programa programa;
    private boolean activo;

    public Curso(int ID, Programa programa,boolean activo){
        this.ID = ID;
        this.programa = programa;
        this.activo = activo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String toString(){
        return "ID :"+getID()+"\n"+
                "Programa :"+Programa.toString()+"\n"+
                "Activo :"+isActivo()+"\n";
    }
}
