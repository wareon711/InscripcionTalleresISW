package com.inscripciontalleresisw;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.inscripciontalleresisw.controlador.ControladorInscripcion;
import com.inscripciontalleresisw.modelo.ModeloInscripcion;
import com.inscripciontalleresisw.vista.VistaInscripcionTaller;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        SwingUtilities.invokeLater(() -> {
            ModeloInscripcion modelo = new ModeloInscripcion();
            VistaInscripcionTaller vista = new VistaInscripcionTaller();
            ControladorInscripcion controlador = new ControladorInscripcion(vista, modelo);
            vista.setControlador(controlador);
            vista.abrirVentana();
        });
    }
}
