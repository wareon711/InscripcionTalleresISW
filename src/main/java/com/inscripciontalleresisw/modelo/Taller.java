package com.inscripciontalleresisw.modelo;

import java.time.LocalDate;

public class Taller {

    private int idTaller;
    private String nombre;
    private String instructor;
    private LocalDate fecha;
    private String horario;
    private String lugar;
    private int cupo;

    public Taller(int idTaller, String nombre, String instructor, LocalDate fecha,
                  String horario, String lugar, int cupo) {
        this.idTaller = idTaller;
        this.nombre = nombre;
        this.instructor = instructor;
        this.fecha = fecha;
        this.horario = horario;
        this.lugar = lugar;
        this.cupo = cupo;
    }

    public int getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
}
