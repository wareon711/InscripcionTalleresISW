package com.inscripciontalleresisw.modelo;

import java.time.LocalDate;

public class Ticket {

    private int folio;
    private LocalDate fechaEmision;
    private Alumno alumno;
    private Taller taller;

    public Ticket(int folio, Alumno alumno, Taller taller) {
        this.folio = folio;
        this.alumno = alumno;
        this.taller = taller;
        this.fechaEmision = LocalDate.now();
    }

    public int getFolio() {
        return folio;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Taller getTaller() {
        return taller;
    }
}
