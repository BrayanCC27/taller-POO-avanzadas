package org.example;

public class Profesor extends Persona {
    private String tipoContrato;

    // metodos


    public Profesor(double Id, String nombre, String apellidos, String email,String tipoContrato) {
        super(Id, nombre, apellidos, email);
        this.tipoContrato = tipoContrato;
    }

    public String toString() {
        return "Tipo de contrato: " + getTipoContrato() +"\n" +
               super.toString();
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
