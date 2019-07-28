
public class Ventana extends javax.swing.JFrame {

    //ventanas
    VentanaEstudiantes ventanaEstudiantes = new VentanaEstudiantes(this);
    VentanaPrestamos ventanaPrestamos = new VentanaPrestamos(this);
    VentanaReportes ventanaReportes = new VentanaReportes(this);
    
    //Libros
    Libro libro1 = new Libro("Matematica discreta 1", "Fernando Perez", "101-AAA", 0);
    Libro libro2 = new Libro("Matematica discreta 2", "Fernando Perez", "102-AAA", 0);
    Libro libro3 = new Libro("Magia con Javascript", "Pedro Peña", "408-DAA", 2);
        
    //Estudiantes
    Estudiante estudiante1 = new Estudiante(200812345, "Estudiante nombre 200812345", 1);
    Estudiante estudiante2 = new Estudiante(201312345, "Estudiante nombre 201312345", 1);
    Estudiante estudiante3 = new Estudiante(200845872, "Estudiante nombre 200845872", 5);
    Estudiante estudiante4 = new Estudiante(201345872, "Estudiante nombre 201345872", 5);
    Estudiante estudiante5 = new Estudiante(200898547, "Estudiante nombre 200898547", 5);
        
    public Ventana() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        //Prestamos
        Prestamo prestamo1 = new Prestamo(estudiante1, libro1, "2019-07-24");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnPrestamos = new javax.swing.JButton();
        BtnLibros = new javax.swing.JButton();
        BtnEstudiantes = new javax.swing.JButton();
        BtnReportes = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Biblioteca Centro Universitario de Occidente CUNOC");

        BtnPrestamos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnPrestamos.setText("Prestamos");
        BtnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrestamosActionPerformed(evt);
            }
        });

        BtnLibros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnLibros.setText("Libros");
        BtnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLibrosActionPerformed(evt);
            }
        });

        BtnEstudiantes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnEstudiantes.setText("Estudiantes");
        BtnEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEstudiantesActionPerformed(evt);
            }
        });

        BtnReportes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnReportes.setText("Reportes");
        BtnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLibrosActionPerformed
        // TODO add your handling code here:
        System.out.println("Libros");
    }//GEN-LAST:event_BtnLibrosActionPerformed

    private void BtnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReportesActionPerformed
        // TODO add your handling code here:
        System.out.println("Reportes");
        ventanaReportes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnReportesActionPerformed

    private void BtnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrestamosActionPerformed
        // TODO add our handling code here:
        System.out.println("Prestamos");
        ventanaPrestamos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnPrestamosActionPerformed

    private void BtnEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEstudiantesActionPerformed
        // TODO add your handling code here:
        System.out.println("Estudiantes");
        ventanaEstudiantes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnEstudiantesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEstudiantes;
    private javax.swing.JButton BtnLibros;
    private javax.swing.JButton BtnPrestamos;
    private javax.swing.JButton BtnReportes;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}