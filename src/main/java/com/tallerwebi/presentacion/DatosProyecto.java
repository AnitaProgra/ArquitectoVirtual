package com.tallerwebi.presentacion;

public class DatosProyecto {
    private String tipo_proyecto;
    private String altura;
    private String ancho;
    private String largo;

    public DatosProyecto() {
    }

    public DatosProyecto(String tipo_proyecto, String altura, String ancho, String largo) {
        this.tipo_proyecto = tipo_proyecto;
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
    }

    public String getTipo_proyecto() {
        return tipo_proyecto;
    }

    public void setTipo_proyecto(String tipo_proyecto) {
        this.tipo_proyecto = tipo_proyecto;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }
}
