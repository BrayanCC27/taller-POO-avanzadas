package org.example;

import java.util.List;

public class InscripcionesPersonas {
    private List<Persona> listado;

    public InscripcionesPersonas(List<Persona> listado) {
        this.listado = listado;
    }

    public List<Persona> getListado() {
        return listado;
    }

    public void setListado(List<Persona> listado) {
        this.listado = listado;
    }

    public void inscribir(Persona persona){
        listado.add(persona);
    }

    public void eliminar(Persona persona){
        listado.remove(persona);
    }

    public void actualizar(Persona persona){

    }

    public void guardarinformacion(Persona persona){

    }

    public void cargarDatos(){

    }

}


