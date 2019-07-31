
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author cesar31
 */
public class VentanaReportes extends javax.swing.JFrame {

    Ventana ventana;
    DefaultTableModel modelo1 = new DefaultTableModel();
    TableRowSorter<TableModel> name1 = new TableRowSorter<TableModel>(modelo1);
    int moras;
    int total;
    int normal;
    int diass;
    
    
    public VentanaReportes(Ventana ventana) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ventana = ventana;
        modelo1.addColumn("Prestamos");
        CajasCaarreraDias.setVisible(false);
        textoDias.setVisible(false);
        
    }

    public void agregarFilaTabla(String nombre){
        String [] elementos = new String[1];
        elementos[0]=nombre;
        modelo1.addRow(elementos);
        tablapor.setModel(modelo1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresar = new javax.swing.JButton();
        subVentanaReport = new javax.swing.JTabbedPane();
        panelHOY = new javax.swing.JPanel();
        scrollHOy = new javax.swing.JScrollPane();
        areaHOY = new javax.swing.JTextArea();
        panelMora = new javax.swing.JPanel();
        scrollMOra = new javax.swing.JScrollPane();
        areasMora = new javax.swing.JTextArea();
        panelEstadistica = new javax.swing.JPanel();
        dias = new javax.swing.JLabel();
        cajaDias = new javax.swing.JTextField();
        BtnBuscardias = new javax.swing.JButton();
        scrollEstadistica = new javax.swing.JScrollPane();
        areaEstdistica = new javax.swing.JTextArea();
        moraTexto = new javax.swing.JLabel();
        totalTexto = new javax.swing.JLabel();
        normalTexto = new javax.swing.JLabel();
        dineroMORA = new javax.swing.JTextField();
        normalDInero = new javax.swing.JTextField();
        totalDinero = new javax.swing.JTextField();
        panelEstCar = new javax.swing.JPanel();
        cajaFiltros = new javax.swing.JTextField();
        filtroEstado = new javax.swing.JComboBox<>();
        BtnBuscar = new javax.swing.JButton();
        filtroDatos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapor = new javax.swing.JTable();
        CajasCaarreraDias = new javax.swing.JTextField();
        textoDias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reportes");
        setAlwaysOnTop(true);

        regresar.setText("Back");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        subVentanaReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subVentanaReportMouseClicked(evt);
            }
        });

        areaHOY.setEditable(false);
        areaHOY.setColumns(20);
        areaHOY.setRows(5);
        scrollHOy.setViewportView(areaHOY);

        javax.swing.GroupLayout panelHOYLayout = new javax.swing.GroupLayout(panelHOY);
        panelHOY.setLayout(panelHOYLayout);
        panelHOYLayout.setHorizontalGroup(
            panelHOYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHOYLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollHOy, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelHOYLayout.setVerticalGroup(
            panelHOYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHOYLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollHOy, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );

        subVentanaReport.addTab("Hoy", panelHOY);

        areasMora.setEditable(false);
        areasMora.setColumns(20);
        areasMora.setRows(5);
        scrollMOra.setViewportView(areasMora);

        javax.swing.GroupLayout panelMoraLayout = new javax.swing.GroupLayout(panelMora);
        panelMora.setLayout(panelMoraLayout);
        panelMoraLayout.setHorizontalGroup(
            panelMoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollMOra, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMoraLayout.setVerticalGroup(
            panelMoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollMOra, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );

        subVentanaReport.addTab("Dev. Mora", panelMora);

        dias.setText("Dias: ");

        BtnBuscardias.setText("Buscar");
        BtnBuscardias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscardiasMouseClicked(evt);
            }
        });

        areaEstdistica.setEditable(false);
        areaEstdistica.setColumns(20);
        areaEstdistica.setRows(5);
        scrollEstadistica.setViewportView(areaEstdistica);

        moraTexto.setText("Mora");

        totalTexto.setText("TOTAL");

        normalTexto.setText("Normal");

        dineroMORA.setEditable(false);

        normalDInero.setEditable(false);

        totalDinero.setEditable(false);

        javax.swing.GroupLayout panelEstadisticaLayout = new javax.swing.GroupLayout(panelEstadistica);
        panelEstadistica.setLayout(panelEstadisticaLayout);
        panelEstadisticaLayout.setHorizontalGroup(
            panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstadisticaLayout.createSequentialGroup()
                        .addComponent(scrollEstadistica)
                        .addContainerGap())
                    .addGroup(panelEstadisticaLayout.createSequentialGroup()
                        .addComponent(dias, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaDias, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscardias, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(moraTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(normalTexto)
                                .addGap(63, 63, 63)
                                .addComponent(totalTexto))
                            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dineroMORA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(normalDInero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(totalDinero, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                        .addGap(72, 72, 72))))
        );
        panelEstadisticaLayout.setVerticalGroup(
            panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadisticaLayout.createSequentialGroup()
                .addGroup(panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstadisticaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dias, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscardias, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dineroMORA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(normalDInero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(moraTexto)
                        .addComponent(totalTexto)
                        .addComponent(normalTexto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollEstadistica, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );

        subVentanaReport.addTab("Estadisticas", panelEstadistica);

        filtroEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actual", "Todos" }));
        filtroEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroEstadoActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        filtroDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carnet", "Carrera" }));
        filtroDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroDatosActionPerformed(evt);
            }
        });

        tablapor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablapor);

        textoDias.setText("Dias:");

        javax.swing.GroupLayout panelEstCarLayout = new javax.swing.GroupLayout(panelEstCar);
        panelEstCar.setLayout(panelEstCarLayout);
        panelEstCarLayout.setHorizontalGroup(
            panelEstCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstCarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addGroup(panelEstCarLayout.createSequentialGroup()
                        .addComponent(filtroDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaFiltros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoDias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CajasCaarreraDias, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filtroEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelEstCarLayout.setVerticalGroup(
            panelEstCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstCarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtroEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtroDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajasCaarreraDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );

        subVentanaReport.addTab("Por Estudiante/Carrera", panelEstCar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(subVentanaReport))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subVentanaReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void filtroEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroEstadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_filtroEstadoActionPerformed


    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked
        if(filtroEstado.getSelectedItem().toString().equals("Todos") && filtroDatos.getSelectedItem().toString().equals("Carnet")){
            carnetTodos(Integer.parseInt(cajaFiltros.getText()));
            System.out.println("Si entro");
        }else if(filtroEstado.getSelectedItem().toString().equals("Actual") && filtroDatos.getSelectedItem().toString().equals("Carnet")){
            try {
                carnetActual(Integer.parseInt(cajaFiltros.getText()));
            } catch (ParseException ex) {
                System.out.println("No es un carnet");
            }
        }else if(filtroDatos.getSelectedItem().toString().equals("Carrera")){
            try {
                carreraDias(Integer.parseInt(cajaFiltros.getText()), Integer.parseInt(CajasCaarreraDias.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(VentanaReportes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_BtnBuscarMouseClicked

    private void filtroDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroDatosActionPerformed
        // TODO add your handling code here:
        if(filtroDatos.getSelectedItem().toString().equals("Carrera")){
            CajasCaarreraDias.setVisible(true);
            textoDias.setVisible(true);
            filtroEstado.setVisible(false);
        }else{
            CajasCaarreraDias.setVisible(false);
            textoDias.setVisible(false);
            filtroEstado.setVisible(true);
        }
        
    }//GEN-LAST:event_filtroDatosActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
        if((filtroEstado.getSelectedItem().toString()).equals("Todos") && (filtroDatos.getSelectedItem().toString()).equals("Carnet")){
            carnetTodos(Integer.parseInt(cajaFiltros.getText()));
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void subVentanaReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subVentanaReportMouseClicked

        areaHOY.setText("");
        areasMora.setText("");
        try {
            // TODO add your handling code here:
            mora();
            hoy();
        } catch (ParseException ex) {
            Logger.getLogger(VentanaReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subVentanaReportMouseClicked

    private void BtnBuscardiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscardiasMouseClicked
            
        areaEstdistica.setText("");
        moras=0;
        total=0;
        diass=0;
        try {
            // TODO add your handling code here:
            Estadistica(Integer.parseInt(cajaDias.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(VentanaReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnBuscardiasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnBuscardias;
    private javax.swing.JTextField CajasCaarreraDias;
    private javax.swing.JTextArea areaEstdistica;
    private javax.swing.JTextArea areaHOY;
    private javax.swing.JTextArea areasMora;
    private javax.swing.JTextField cajaDias;
    private javax.swing.JTextField cajaFiltros;
    private javax.swing.JLabel dias;
    private javax.swing.JTextField dineroMORA;
    private javax.swing.JComboBox<String> filtroDatos;
    private javax.swing.JComboBox<String> filtroEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel moraTexto;
    private javax.swing.JTextField normalDInero;
    private javax.swing.JLabel normalTexto;
    private javax.swing.JPanel panelEstCar;
    private javax.swing.JPanel panelEstadistica;
    private javax.swing.JPanel panelHOY;
    private javax.swing.JPanel panelMora;
    private javax.swing.JButton regresar;
    private javax.swing.JScrollPane scrollEstadistica;
    private javax.swing.JScrollPane scrollHOy;
    private javax.swing.JScrollPane scrollMOra;
    private javax.swing.JTabbedPane subVentanaReport;
    private javax.swing.JTable tablapor;
    private javax.swing.JLabel textoDias;
    private javax.swing.JTextField totalDinero;
    private javax.swing.JLabel totalTexto;
    // End of variables declaration//GEN-END:variables

public void carnetTodos(int carnet){
    ventana.tx.datos.register=ventana.arregloPrestamos();
    ventana.tx.datos.libros=ventana.arregloLibros();
    
    for (int i = 0; i < ventana.tx.datos.register.size(); i++) {
        if(ventana.tx.datos.register.get(i).carnetE==carnet){
            if(ventana.tx.datos.register.get(i).estado){
                agregarFilaTabla(getTituloLibros(ventana.tx.datos.register.get(i).codigoL));
                if(ventana.tx.datos.register.get(i).estado2){
                    agregarFilaTabla(getTituloLibros(ventana.tx.datos.register.get(i).codigoL));
                }
                if(ventana.tx.datos.register.get(i).estado3){
                    agregarFilaTabla(getTituloLibros(ventana.tx.datos.register.get(i).codigoL));
                }
            }
        }
        
    }
    
}
public String getTituloLibros(String codigo){

    for (int i = 0; i < ventana.tx.datos.libros.size(); i++) {
            if(ventana.tx.datos.libros.get(i).codigo.equals(codigo)){
                return ventana.tx.datos.libros.get(i).titulo;     
    
            }
    }
    return " ";
    
}

public void carnetActual(int carnet) throws ParseException{
    ventana.tx.datos.register=ventana.arregloPrestamos();
    ventana.tx.datos.libros=ventana.arregloLibros();
    
    for (int i = 0; i < ventana.tx.datos.register.size(); i++) {
        if(ventana.tx.datos.register.get(i).carnetE==carnet){
            if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.tx.datos.register.get(i).estado && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo)==0 ){
                agregarFilaTabla(getTituloLibros(ventana.tx.datos.register.get(i).codigoL));
                if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.tx.datos.register.get(i).estado2 && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo2)==0){
                    agregarFilaTabla(getTituloLibros(ventana.tx.datos.register.get(i).codigoL));
                }
                if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.tx.datos.register.get(i).estado3 && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo3)==0){
                    agregarFilaTabla(getTituloLibros(ventana.tx.datos.register.get(i).codigoL));
                }
            }
        }
        
    }
    
}
public void carreraDias(int carrera, int dias) throws ParseException{
        ventana.tx.datos.register=ventana.arregloPrestamos();
        ventana.tx.datos.libros=ventana.arregloLibros();
        ventana.tx.datos.estudiantes=ventana.arregloEstudiantes();
    for(int j = 0; j < ventana.tx.datos.estudiantes.size(); j++){
        if(ventana.tx.datos.estudiantes.get(j).carrera==carrera){
            
                for (int i = 0; i < ventana.tx.datos.register.size(); i++) {
                if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.tx.datos.register.get(i).carnetE==ventana.tx.datos.estudiantes.get(j).carnet && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo)<dias){
                    if(ventana.tx.datos.register.get(i).estado){
                        agregarFilaTabla(getTituloLibros(ventana.tx.datos.register.get(i).codigoL));
                    if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.tx.datos.register.get(i).estado2 && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo2)<dias){
                        agregarFilaTabla(getTituloLibros(ventana.tx.datos.register.get(i).codigoL));
                    }else{}
                    
                    if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.tx.datos.register.get(i).estado3 && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo3)<dias){
                        agregarFilaTabla(getTituloLibros(ventana.tx.datos.register.get(i).codigoL));
                    }else{} 
                }else{}
            }else{}
        
           }
        }
    }     
}
    public void agregarfila(String linea){
        areasMora.append(linea); 
        areasMora.append(System.getProperty("line.separator"));
        areasMora.append(System.getProperty("line.separator"));
        //areasMora.append(System.getProperty("line.separator"));
    }
    
        public void agregarfilaHOY(String linea){
        areasMora.append(linea); 
        areasMora.append(System.getProperty("line.separator"));
        areasMora.append(System.getProperty("line.separator"));
        //areasMora.append(System.getProperty("line.separator"));
    }
        public void agregarfilaEstadistica(String linea){
        areaEstdistica.append(linea); 
        areaEstdistica.append(System.getProperty("line.separator"));
        areaEstdistica.append(System.getProperty("line.separator"));
        
        }

    public void mora() throws ParseException{
        ventana.tx.datos.register=ventana.arregloPrestamos();
        for (int i = 0; i < ventana.tx.datos.register.size(); i++) {
            
            if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.registros.diferenciaDias11(ventana.tx.datos.register.get(i).fechaPrestamo, true)<0){
                ventana.cargarLibros(ventana.tx.datos.register.get(i).codigoL);
                agregarfila(ventana.tmpL.titulo+"\nCarnet: "+ventana.tx.datos.register.get(i).carnetE+"\nDias: "+ventana.registros.diferenciaDias11(ventana.tx.datos.register.get(i).fechaPrestamo, true));
            }
            if(ventana.tx.datos.register.get(i).fechaPrestamo2!=null && ventana.registros.diferenciaDias11(ventana.tx.datos.register.get(i).fechaPrestamo2, true)<0){
                ventana.cargarLibros(ventana.tx.datos.register.get(i).codigoL);
                agregarfila(ventana.tmpL.titulo+"\nCarnet: "+ventana.tx.datos.register.get(i).carnetE+"\nDias: "+ventana.registros.diferenciaDias11(ventana.tx.datos.register.get(i).fechaPrestamo2, true));   
            }
            if(ventana.tx.datos.register.get(i).fechaPrestamo3!=null && ventana.registros.diferenciaDias11(ventana.tx.datos.register.get(i).fechaPrestamo3, true)<0){
                ventana.cargarLibros(ventana.tx.datos.register.get(i).codigoL);
                agregarfila(ventana.tmpL.titulo+"\nCarnet: "+ventana.tx.datos.register.get(i).carnetE+"\nDias: "+ventana.registros.diferenciaDias11(ventana.tx.datos.register.get(i).fechaPrestamo3, true));

        
            }
        }
}
    
    public void hoy() throws ParseException{
        ventana.tx.datos.register=ventana.arregloPrestamos();

        for (int i = 0; i < ventana.tx.datos.register.size(); i++) {
            
            if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo)==0){
                ventana.cargarLibros(ventana.tx.datos.register.get(i).codigoL);
                agregarfilaHOY(ventana.tmpL.titulo+"\nCarnet: "+ventana.tx.datos.register.get(i).carnetE+"\nDias: "+ventana.registros.diferenciaDias11(ventana.tx.datos.register.get(i).fechaPrestamo, true));
            }
            if(ventana.tx.datos.register.get(i).fechaPrestamo2!=null && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo2)==0){
                ventana.cargarLibros(ventana.tx.datos.register.get(i).codigoL);
                agregarfilaHOY(ventana.tmpL.titulo+"\nCarnet: "+ventana.tx.datos.register.get(i).carnetE+"\nDias: "+ventana.registros.diferenciaDias11(ventana.tx.datos.register.get(i).fechaPrestamo2, true));   
            }
            if(ventana.tx.datos.register.get(i).fechaPrestamo3!=null && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo3)==0){
                ventana.cargarLibros(ventana.tx.datos.register.get(i).codigoL);
                agregarfilaHOY(ventana.tmpL.titulo+"\nCarnet: "+ventana.tx.datos.register.get(i).carnetE+"\nDias: "+ventana.registros.diferenciaDias11(ventana.tx.datos.register.get(i).fechaPrestamo3, true));

            }
        }
    }

public void Estadistica(int dias) throws ParseException{
    
        ventana.tx.datos.register=ventana.arregloPrestamos();
        ventana.tx.datos.libros=ventana.arregloLibros();
        ventana.tx.datos.estudiantes=ventana.arregloEstudiantes();
    for(int j = 0; j < ventana.tx.datos.estudiantes.size(); j++){
            
                for (int i = 0; i < ventana.tx.datos.register.size(); i++) {
                if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.tx.datos.register.get(i).carnetE==ventana.tx.datos.estudiantes.get(j).carnet && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo)<dias){
                    if(ventana.tx.datos.register.get(i).estado){
                        diass=ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo);
                           if((diass>3)){
                               normal= (3)*5;
                           }
                           diass=diass-3;
                        normal= (diass)*5;
                        if((diass)>0){
                            moras=(diass)*10;
                        }
                        agregarfilaEstadistica(ventana.tmpL.titulo+"\nCarnet: "+ventana.tx.datos.register.get(i).carnetE);
                    if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.tx.datos.register.get(i).estado2 && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo2)<dias){
                        diass=ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo2);
                           if((diass>3)){
                               normal= (3)*5;
                           }
                           diass=diass-3;
                        normal= (diass)*5;
                        if((diass)>0){
                            moras=(diass)*10;
                        }
                        agregarfilaEstadistica(ventana.tmpL.titulo+"\nCarnet: "+ventana.tx.datos.register.get(i).carnetE);
                    }else{}
                    
                    if(ventana.tx.datos.register.get(i).fechaPrestamo!=null && ventana.tx.datos.register.get(i).estado3 && ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo3)<dias){
                        
                        diass=ventana.registros.diferenciaDias(ventana.tx.datos.register.get(i).fechaPrestamo);
                           if((diass>3)){
                               normal= (3)*5;
                           }
                           diass=diass-3;
                        normal= (diass)*5;
                        if((diass)>0){
                            moras=(diass)*10;
                        }
                        
                        agregarfilaEstadistica(ventana.tmpL.titulo+"\nCarnet: "+ventana.tx.datos.register.get(i).carnetE);
                    }else{} 
                }else{}
            }else{}
        
           }
                total=moras+normal;
    }
    dineroMORA.setText(Integer.toString(moras));
    normalDInero.setText(Integer.toString(normal));
    totalDinero.setText(Integer.toString(total));
}

}
