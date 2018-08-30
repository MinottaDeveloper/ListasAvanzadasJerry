package com.example.estudiante.listasavanzadasjerry;

public class Noticia {

    private String titulo;
    private String descripcion;
    private String fecha;

    public Noticia(String titulo, String descripcion, String fecha){
        this.descripcion= descripcion;
        this.fecha= fecha;
        this.titulo= titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
