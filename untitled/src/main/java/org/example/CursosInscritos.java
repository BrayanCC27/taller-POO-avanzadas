package org.example;

import java.util.ArrayList;
import java.util.List;

public class CursosInscritos implements Servicios{
    public List<Inscripcion> getListado() {
        return listado;
    }

    public void setListado(List<Inscripcion> listado) {
        this.listado = listado;
    }

    private List<Inscripcion> listado;

    public CursosInscritos(List<Inscripcion> listado) {
        this.listado = listado;
    }

    public void inscribirCurso(Inscripcion inscripcion) {
        listado.add(inscripcion);
    }

    public void eliminar(Inscripcion inscripcion) {
        listado.remove(inscripcion);
    }

    public void actualizar(Inscripcion inscripcion) {

    }

    public void guardarInformacion(Inscripcion inscripcion) {

    }

    public List<String> toString() {

//        for (int i = 0; i < listado.size(); i++) {
//
//        }
    }

    public void cargarDatos() {

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
