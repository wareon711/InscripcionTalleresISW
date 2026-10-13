package com.inscripciontalleresisw.controlador;

import com.inscripciontalleresisw.modelo.Alumno;
import com.inscripciontalleresisw.modelo.ModeloInscripcion;
import com.inscripciontalleresisw.modelo.Taller;
import com.inscripciontalleresisw.modelo.Ticket;
import com.inscripciontalleresisw.vista.VistaInscripcionTaller;

public class ControladorInscripcion {

    private Taller tallerSeleccionado;
    private Alumno alumnoActual;
    private final VistaInscripcionTaller vista;
    private final ModeloInscripcion modelo;

    public ControladorInscripcion(VistaInscripcionTaller vista, ModeloInscripcion modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciar() {
        vista.mostrarTalleres(modelo.obtenerTalleres());
    }

    public void seleccionarTaller(int idTaller) {
        tallerSeleccionado = modelo.obtenerTaller(idTaller);
        alumnoActual = null;
        if (tallerSeleccionado != null) {
            vista.mostrarDetalleTaller(tallerSeleccionado);
        }
    }

    public void inscribirse() {
        if (tallerSeleccionado == null) {
            return;
        }
        alumnoActual = null;
        vista.solicitarIdAlumno();
    }

    public void buscarAlumno(String idAlumno) {
        if (tallerSeleccionado == null) {
            return;
        }
        Alumno alumno = modelo.obtenerAlumno(idAlumno);
        if (alumno == null) {
            alumnoActual = null;
            vista.mostrarMensaje("El ID capturado no existe. Verifique e intente de nuevo.");
            vista.solicitarIdAlumno();
            return;
        }
        alumnoActual = alumno;
        vista.mostrarDatosAlumno(alumno);
    }

    public void confirmarInscripcion() {
        if (tallerSeleccionado == null || alumnoActual == null) {
            return;
        }
        Ticket ticket = modelo.inscribir(alumnoActual, tallerSeleccionado);
        if (ticket == null) {
            vista.mostrarMensaje("El alumno ya está inscrito en este taller. No se generó un nuevo ticket.");
            return;
        }
        vista.mostrarTicket(ticket);
    }
}
