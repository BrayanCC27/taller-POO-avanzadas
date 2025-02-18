package org.example;

import java.util.List;


public class CursosProfesores implements Servicios {
    private List<CursoProfesor> listado;

    public List<CursoProfesor> getListado() {
        return listado;
    }

    public void setListado(List<CursoProfesor> listado) {
        this.listado = listado;
    }

    public CursosProfesores(List<CursoProfesor> listado) {
        this.listado = listado;
    }

    public void inscribir(CursoProfesor cursoProfesor) {

    }

    public void guardarInformacion(CursoProfesor cursoProfesor) {

    }

    public List<String> toString() {

    }

    @Override
    public String imprimirPosicion(int posicion) {
        return "";
    }

    @Override
    public int cantidadActual() {
        return 0;
    }

    @Override
    public List<String> imprimirListado() {

    }
}
