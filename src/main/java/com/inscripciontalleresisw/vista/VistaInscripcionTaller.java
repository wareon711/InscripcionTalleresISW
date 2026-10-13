package com.inscripciontalleresisw.vista;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import com.inscripciontalleresisw.controlador.ControladorInscripcion;
import com.inscripciontalleresisw.modelo.Alumno;
import com.inscripciontalleresisw.modelo.Taller;
import com.inscripciontalleresisw.modelo.Ticket;

public class VistaInscripcionTaller extends javax.swing.JFrame {

    private ControladorInscripcion controlador;
    private List<Taller> talleres;

    public VistaInscripcionTaller() {
        initComponents();
        setLocationRelativeTo(null);
        txtTicket.setBackground(Color.WHITE);
        txtTicket.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        estadoInicial();
    }

    public void setControlador(ControladorInscripcion controlador) {
        this.controlador = controlador;
    }

    public void abrirVentana() {
        setVisible(true);
        controlador.iniciar();
    }

    public void seleccionarTaller(int idTaller) {
        controlador.seleccionarTaller(idTaller);
    }

    public void clicInscribirse() {
        controlador.inscribirse();
    }

    public void ingresarIdAlumno(String idAlumno) {
        controlador.buscarAlumno(idAlumno);
    }

    public void clicConfirmar() {
        controlador.confirmarInscripcion();
    }

    public void mostrarTalleres(List<Taller> talleres) {
        this.talleres = talleres;
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Taller t : talleres) {
            modelo.addElement(t.getNombre());
        }
        lstTalleres.setModel(modelo);
        lstTalleres.clearSelection();
        estadoInicial();
    }

    public void mostrarDetalleTaller(Taller taller) {
        lblTallerValor.setText(taller.getNombre());
        lblInstructorValor.setText(taller.getInstructor());
        lblFechaValor.setText(taller.getFecha().toString());
        lblHorarioValor.setText(taller.getHorario());
        lblLugarValor.setText(taller.getLugar());

        lblInstruccion.setVisible(false);
        pnlInfo.setVisible(true);
        btnInscribirse.setVisible(true);
        btnInscribirse.setEnabled(true);
        reiniciarZonaInferior();
    }

    public void solicitarIdAlumno() {
        pnlSur.setBorder(BorderFactory.createTitledBorder("Datos del alumno"));
        pnlId.setVisible(true);
        txtIdAlumno.setText("");
        lblVacio.setText("Capture su ID y presione \"Buscar\".");
        mostrarTarjeta("cardVacio");
        txtIdAlumno.requestFocus();
    }

    public void mostrarDatosAlumno(Alumno alumno) {
        lblIdValor.setText(alumno.getIdAlumno());
        lblNombreValor.setText(alumno.getNombre());
        lblSemestreValor.setText(String.valueOf(alumno.getSemestre()));
        lblProgramaValor.setText(alumno.getPrograma());
        mostrarTarjeta("cardAlumno");
    }

    public void mostrarTicket(Ticket ticket) {
        String texto = "Folio:            ISW-2026-000" + ticket.getFolio() + "\n"
                + "Alumno:           " + ticket.getAlumno().getIdAlumno() + " - " + ticket.getAlumno().getNombre() + "\n"
                + "Taller:           " + ticket.getTaller().getNombre() + "\n"
                + "Fecha y horario:  " + ticket.getTaller().getFecha() + ", " + ticket.getTaller().getHorario() + "\n"
                + "Fecha de emisión: " + ticket.getFechaEmision();

        txtTicket.setText(texto);
        txtTicket.setCaretPosition(0);
        pnlSur.setBorder(BorderFactory.createTitledBorder("Ticket de inscripción"));
        pnlId.setVisible(false);
        mostrarTarjeta("cardTicket");
        btnInscribirse.setEnabled(false);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void estadoInicial() {
        lblInstruccion.setVisible(true);
        pnlInfo.setVisible(false);
        btnInscribirse.setVisible(false);
        reiniciarZonaInferior();
    }

    private void reiniciarZonaInferior() {
        pnlSur.setBorder(BorderFactory.createTitledBorder("Datos del alumno"));
        pnlId.setVisible(false);
        txtIdAlumno.setText("");
        lblVacio.setText("(vacío hasta que se presione \"Inscribirse\")");
        mostrarTarjeta("cardVacio");
    }

    private void mostrarTarjeta(String nombre) {
        CardLayout tarjeta = (CardLayout) pnlCentro.getLayout();
        tarjeta.show(pnlCentro, nombre);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTalleres = new javax.swing.JPanel();
        scrollTalleres = new javax.swing.JScrollPane();
        lstTalleres = new javax.swing.JList<>();
        pnlDetalle = new javax.swing.JPanel();
        lblInstruccion = new javax.swing.JLabel();
        pnlInfo = new javax.swing.JPanel();
        lblTallerTitulo = new javax.swing.JLabel();
        lblTallerValor = new javax.swing.JLabel();
        lblInstructorTitulo = new javax.swing.JLabel();
        lblInstructorValor = new javax.swing.JLabel();
        lblFechaTitulo = new javax.swing.JLabel();
        lblFechaValor = new javax.swing.JLabel();
        lblHorarioTitulo = new javax.swing.JLabel();
        lblHorarioValor = new javax.swing.JLabel();
        lblLugarTitulo = new javax.swing.JLabel();
        lblLugarValor = new javax.swing.JLabel();
        pnlBotonInscribirse = new javax.swing.JPanel();
        btnInscribirse = new javax.swing.JButton();
        pnlSur = new javax.swing.JPanel();
        pnlId = new javax.swing.JPanel();
        lblIdAlumno = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        pnlCentro = new javax.swing.JPanel();
        lblVacio = new javax.swing.JLabel();
        pnlAlumno = new javax.swing.JPanel();
        pnlDatosAlumno = new javax.swing.JPanel();
        lblIdTitulo = new javax.swing.JLabel();
        lblIdValor = new javax.swing.JLabel();
        lblNombreTitulo = new javax.swing.JLabel();
        lblNombreValor = new javax.swing.JLabel();
        lblSemestreTitulo = new javax.swing.JLabel();
        lblSemestreValor = new javax.swing.JLabel();
        lblProgramaTitulo = new javax.swing.JLabel();
        lblProgramaValor = new javax.swing.JLabel();
        pnlBotonConfirmar = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        scrollTicket = new javax.swing.JScrollPane();
        txtTicket = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inscripción a talleres - Semana de ISW");

        pnlTalleres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Talleres disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlTalleres.setPreferredSize(new java.awt.Dimension(280, 270));
        pnlTalleres.setLayout(new java.awt.BorderLayout());

        scrollTalleres.setPreferredSize(new java.awt.Dimension(260, 95));

        lstTalleres.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstTalleres.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTalleresValueChanged(evt);
            }
        });
        scrollTalleres.setViewportView(lstTalleres);

        pnlTalleres.add(scrollTalleres, java.awt.BorderLayout.NORTH);

        getContentPane().add(pnlTalleres, java.awt.BorderLayout.WEST);

        pnlDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles del taller", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlDetalle.setLayout(new java.awt.BorderLayout());

        lblInstruccion.setText("Seleccione un taller para ver sus detalles.");
        pnlDetalle.add(lblInstruccion, java.awt.BorderLayout.NORTH);

        pnlInfo.setPreferredSize(new java.awt.Dimension(380, 130));
        pnlInfo.setLayout(new java.awt.GridLayout(5, 2, 8, 4));

        lblTallerTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTallerTitulo.setText("Taller:");
        pnlInfo.add(lblTallerTitulo);
        pnlInfo.add(lblTallerValor);

        lblInstructorTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblInstructorTitulo.setText("Instructor:");
        pnlInfo.add(lblInstructorTitulo);
        pnlInfo.add(lblInstructorValor);

        lblFechaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFechaTitulo.setText("Fecha:");
        pnlInfo.add(lblFechaTitulo);
        pnlInfo.add(lblFechaValor);

        lblHorarioTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHorarioTitulo.setText("Horario:");
        pnlInfo.add(lblHorarioTitulo);
        pnlInfo.add(lblHorarioValor);

        lblLugarTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLugarTitulo.setText("Lugar:");
        pnlInfo.add(lblLugarTitulo);
        pnlInfo.add(lblLugarValor);

        pnlDetalle.add(pnlInfo, java.awt.BorderLayout.WEST);

        pnlBotonInscribirse.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnInscribirse.setText("Inscribirse");
        btnInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirseActionPerformed(evt);
            }
        });
        pnlBotonInscribirse.add(btnInscribirse);

        pnlDetalle.add(pnlBotonInscribirse, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnlDetalle, java.awt.BorderLayout.CENTER);

        pnlSur.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlSur.setPreferredSize(new java.awt.Dimension(880, 210));
        pnlSur.setLayout(new java.awt.BorderLayout());

        pnlId.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblIdAlumno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdAlumno.setText("ID del alumno:");
        pnlId.add(lblIdAlumno);

        txtIdAlumno.setColumns(10);
        txtIdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlumnoActionPerformed(evt);
            }
        });
        pnlId.add(txtIdAlumno);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlId.add(btnBuscar);

        pnlSur.add(pnlId, java.awt.BorderLayout.NORTH);

        pnlCentro.setLayout(new java.awt.CardLayout());

        lblVacio.setText("(vacío hasta que se presione \"Inscribirse\")");
        pnlCentro.add(lblVacio, "cardVacio");

        pnlAlumno.setLayout(new java.awt.BorderLayout());

        pnlDatosAlumno.setPreferredSize(new java.awt.Dimension(380, 105));
        pnlDatosAlumno.setLayout(new java.awt.GridLayout(4, 2, 8, 4));

        lblIdTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdTitulo.setText("ID:");
        pnlDatosAlumno.add(lblIdTitulo);
        pnlDatosAlumno.add(lblIdValor);

        lblNombreTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombreTitulo.setText("Nombre:");
        pnlDatosAlumno.add(lblNombreTitulo);
        pnlDatosAlumno.add(lblNombreValor);

        lblSemestreTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSemestreTitulo.setText("Semestre:");
        pnlDatosAlumno.add(lblSemestreTitulo);
        pnlDatosAlumno.add(lblSemestreValor);

        lblProgramaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProgramaTitulo.setText("Programa:");
        pnlDatosAlumno.add(lblProgramaTitulo);
        pnlDatosAlumno.add(lblProgramaValor);

        pnlAlumno.add(pnlDatosAlumno, java.awt.BorderLayout.WEST);

        pnlBotonConfirmar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnConfirmar.setText("Confirmar inscripción");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        pnlBotonConfirmar.add(btnConfirmar);

        pnlAlumno.add(pnlBotonConfirmar, java.awt.BorderLayout.SOUTH);

        pnlCentro.add(pnlAlumno, "cardAlumno");

        txtTicket.setColumns(40);
        txtTicket.setEditable(false);
        txtTicket.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTicket.setRows(6);
        scrollTicket.setViewportView(txtTicket);

        pnlCentro.add(scrollTicket, "cardTicket");

        pnlSur.add(pnlCentro, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlSur, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstTalleresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTalleresValueChanged
        if (evt.getValueIsAdjusting() || talleres == null) {
            return;
        }
        int indice = lstTalleres.getSelectedIndex();
        if (indice >= 0 && indice < talleres.size()) {
            seleccionarTaller(talleres.get(indice).getIdTaller());
        }
    }//GEN-LAST:event_lstTalleresValueChanged

    private void btnInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirseActionPerformed
        clicInscribirse();
    }//GEN-LAST:event_btnInscribirseActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ingresarIdAlumno(txtIdAlumno.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlumnoActionPerformed
        ingresarIdAlumno(txtIdAlumno.getText());
    }//GEN-LAST:event_txtIdAlumnoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        clicConfirmar();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnInscribirse;
    private javax.swing.JLabel lblFechaTitulo;
    private javax.swing.JLabel lblFechaValor;
    private javax.swing.JLabel lblHorarioTitulo;
    private javax.swing.JLabel lblHorarioValor;
    private javax.swing.JLabel lblIdAlumno;
    private javax.swing.JLabel lblIdTitulo;
    private javax.swing.JLabel lblIdValor;
    private javax.swing.JLabel lblInstruccion;
    private javax.swing.JLabel lblInstructorTitulo;
    private javax.swing.JLabel lblInstructorValor;
    private javax.swing.JLabel lblLugarTitulo;
    private javax.swing.JLabel lblLugarValor;
    private javax.swing.JLabel lblNombreTitulo;
    private javax.swing.JLabel lblNombreValor;
    private javax.swing.JLabel lblProgramaTitulo;
    private javax.swing.JLabel lblProgramaValor;
    private javax.swing.JLabel lblSemestreTitulo;
    private javax.swing.JLabel lblSemestreValor;
    private javax.swing.JLabel lblTallerTitulo;
    private javax.swing.JLabel lblTallerValor;
    private javax.swing.JLabel lblVacio;
    private javax.swing.JList<String> lstTalleres;
    private javax.swing.JPanel pnlAlumno;
    private javax.swing.JPanel pnlBotonConfirmar;
    private javax.swing.JPanel pnlBotonInscribirse;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlDatosAlumno;
    private javax.swing.JPanel pnlDetalle;
    private javax.swing.JPanel pnlId;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JPanel pnlTalleres;
    private javax.swing.JScrollPane scrollTalleres;
    private javax.swing.JScrollPane scrollTicket;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextArea txtTicket;
    // End of variables declaration//GEN-END:variables
}
