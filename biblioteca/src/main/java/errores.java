/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yefer
 */
public class errores extends javax.swing.JFrame {

    //Ventana ventana;
    Leer_txt ventana;
    /**
     * Creates new form errores
     */
    public errores(Leer_txt ventana) {
        initComponents();
        areaErrores.setEditable(false); 
        this.ventana=ventana;
        this.setLocationRelativeTo(null);
    }
    
    public void agregarfila(String linea){
        areaErrores.append(linea); 
        areaErrores.append(System.getProperty("line.separator"));
        areaErrores.append(System.getProperty("line.separator"));
        areaErrores.append(System.getProperty("line.separator"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelErrores = new javax.swing.JPanel();
        scrollError = new javax.swing.JScrollPane();
        areaErrores = new javax.swing.JTextArea();
        BtnRegrasar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaErrores.setColumns(20);
        areaErrores.setRows(5);
        scrollError.setViewportView(areaErrores);

        BtnRegrasar.setText("Back");
        BtnRegrasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegrasarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelErroresLayout = new javax.swing.GroupLayout(panelErrores);
        panelErrores.setLayout(panelErroresLayout);
        panelErroresLayout.setHorizontalGroup(
            panelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelErroresLayout.createSequentialGroup()
                .addComponent(scrollError, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelErroresLayout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(BtnRegrasar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelErroresLayout.setVerticalGroup(
            panelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelErroresLayout.createSequentialGroup()
                .addComponent(scrollError, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnRegrasar)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegrasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegrasarActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
    }//GEN-LAST:event_BtnRegrasarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnRegrasar;
    private javax.swing.JTextArea areaErrores;
    private javax.swing.JPanel panelErrores;
    private javax.swing.JScrollPane scrollError;
    // End of variables declaration//GEN-END:variables
}
