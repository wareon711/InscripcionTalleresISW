package com.inscripciontalleresisw.modelo;

public class Alumno {

    private String idAlumno;
    private String nombre;
    private int semestre;
    private String programa;

    public Alumno(String idAlumno, String nombre, int semestre, String programa) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.semestre = semestre;
        this.programa = programa;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
