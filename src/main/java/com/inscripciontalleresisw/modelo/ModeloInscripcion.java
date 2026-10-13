package com.inscripciontalleresisw.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ModeloInscripcion {

    private int contadorFolio;
    private final Set<String> inscripciones = new HashSet<>();
    private final List<Taller> talleres = new ArrayList<>();
    private final List<Alumno> alumnos = new ArrayList<>();

    public ModeloInscripcion() {
        contadorFolio = 0;
        cargarDatosDeEjemplo();
    }

    public List<Taller> obtenerTalleres() {
        return new ArrayList<>(talleres);
    }

    public Taller obtenerTaller(int idTaller) {
        for (Taller t : talleres) {
            if (t.getIdTaller() == idTaller) {
                return t;
            }
        }
        return null;
    }

    public Alumno obtenerAlumno(String idAlumno) {
        if (idAlumno == null) {
            return null;
        }
        String id = idAlumno.trim();
        for (Alumno a : alumnos) {
            if (a.getIdAlumno().equals(id)) {
                return a;
            }
        }
        return null;
    }

    public Ticket inscribir(Alumno alumno, Taller taller) {
        String clave = alumno.getIdAlumno() + "-" + taller.getIdTaller();
        if (inscripciones.contains(clave)) {
            return null;
        }
        inscripciones.add(clave);
        contadorFolio++;
        return new Ticket(contadorFolio, alumno, taller);
    }

    private void cargarDatosDeEjemplo() {
        talleres.add(new Taller(1, "Introducción a DevOps", "Mtra. Laura Pérez",
                LocalDate.of(2026, 10, 13), "09:00 a 11:00 h", "Laboratorio de Cómputo 1", 25));
        talleres.add(new Taller(2, "Pruebas de Software con JUnit", "Mtro. Carlos Mendoza",
                LocalDate.of(2026, 10, 14), "10:00 a 12:00 h", "Laboratorio de Cómputo 3", 20));
        talleres.add(new Taller(3, "Diseño de APIs REST", "Dr. Jorge Ramírez",
                LocalDate.of(2026, 10, 15), "12:00 a 14:00 h", "Laboratorio de Cómputo 2", 30));
        talleres.add(new Taller(4, "Git y GitHub para equipos", "Ing. Sofía Navarro",
                LocalDate.of(2026, 10, 16), "08:00 a 10:00 h", "Aula Magna", 40));

        alumnos.add(new Alumno("123456", "Ana Torres López", 5, "Ingeniería en Software"));
        alumnos.add(new Alumno("234567", "Luis Hernández Ruiz", 3, "Ingeniería en Software"));
        alumnos.add(new Alumno("345678", "María Fernanda Soto", 7, "Ingeniería en Software"));
    }
}
