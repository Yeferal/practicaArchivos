
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author cesar31
 */
public class VentanaLibros extends javax.swing.JFrame {

    Ventana ventana;
    DefaultTableModel modelo1 = new DefaultTableModel();
    TableRowSorter<TableModel> name1 = new TableRowSorter<TableModel>(modelo1);
    
    public VentanaLibros(Ventana ventana) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ventana = ventana;
        modelo1.addColumn("Codigo");
        modelo1.addColumn("Autor");
        modelo1.addColumn("Titulo");
        modelo1.addColumn("Copias");
        modelo1.addColumn("Fecha Publicacion");
        modelo1.addColumn("Editorial");
    }
    
    public void agregarFilaTabla(String codigo, String autor, String titulo, int copias, String fecha, String editorial, JTable tabla){
        String [] elementos = new String[6];
        elementos[0]=codigo;
        elementos[1]=autor;
        elementos[2]=titulo;
        elementos[3]=Integer.toString(copias);
        elementos[4]=fecha;
        elementos[5]=editorial;
        modelo1.addRow(elementos);
        tabla.setModel(modelo1);
    }
    
    public void removerTabla(JTable tabla){
        System.out.println(tabla.getRowCount());
        for(int i=0;i<tabla.getRowCount();i++){
            modelo1.removeRow(i);
            i-=1;
        }
    }
    
    public void ordenarLibros(){
                Libro aux;
        for (int i = 0; i < (ventana.tx.datos.libros.size()-1); i++) {
            for (int j = 0; j < (ventana.tx.datos.libros.size()-1); j++) {
                if(Integer.parseInt((ventana.tx.datos.libros.get(j).codigo).substring(0,2))>Integer.parseInt((ventana.tx.datos.libros.get(j+1).codigo).substring(0,2))){
                    aux=ventana.tx.datos.libros.get(j);
                    ventana.tx.datos.libros.set(j,ventana.tx.datos.libros.get(j+1));
                    ventana.tx.datos.libros.set(j+1,aux);
                }
            }
       }
//        tex.datos.libros.sort(code);
    }
    private void ordenarLibrosAscendente(){
        removerTabla(tablaTodos);
        for (int i = 0; i <= (ventana.tx.datos.libros.size()-1); i++) {

            //Se aniade la informacion en este orden a la tabla
            agregarFilaTabla(ventana.tx.datos.libros.get(i).codigo, ventana.tx.datos.libros.get(i).autor,ventana.tx.datos.libros.get(i).titulo, ventana.tx.datos.libros.get(i).cantidad, ventana.tx.datos.libros.get(i).fechaPublicacion, ventana.tx.datos.libros.get(i).editorial,tablaTodos);
        }
    }
        
    private void ordenarLibrosDescendente(){
        removerTabla(tablaTodos);
        for (int i = (ventana.tx.datos.libros.size()-1); i >= 0; i--) {

            //Se aniade la informacion en este orden a la tabla
             agregarFilaTabla(ventana.tx.datos.libros.get(i).codigo, ventana.tx.datos.libros.get(i).autor,ventana.tx.datos.libros.get(i).titulo, ventana.tx.datos.libros.get(i).cantidad, ventana.tx.datos.libros.get(i).fechaPublicacion, ventana.tx.datos.libros.get(i).editorial,tablaTodos);   
        }
    }

    private void filtrar(String filtro, String dato){
        if(filtro=="Codigo"){
            for (int i = 0; i < ventana.tx.datos.libros.size(); i++) {
                System.out.println("no agrego codigo: "+dato);
                if(dato.equals(ventana.tx.datos.libros.get(i).codigo)){
                    agregarFilaTabla(ventana.tx.datos.libros.get(i).codigo, ventana.tx.datos.libros.get(i).autor,ventana.tx.datos.libros.get(i).titulo, ventana.tx.datos.libros.get(i).cantidad, ventana.tx.datos.libros.get(i).fechaPublicacion, ventana.tx.datos.libros.get(i).editorial,tablaBuscar); 
                }
            }
        }else if(filtro=="Nombre"){
            System.out.println("no agrego nombre");
            for (int i = 0; i < ventana.tx.datos.libros.size(); i++) {
                if(dato.equals(ventana.tx.datos.libros.get(i).titulo)){
                    agregarFilaTabla(ventana.tx.datos.libros.get(i).codigo, ventana.tx.datos.libros.get(i).autor,ventana.tx.datos.libros.get(i).titulo, ventana.tx.datos.libros.get(i).cantidad, ventana.tx.datos.libros.get(i).fechaPublicacion, ventana.tx.datos.libros.get(i).editorial,tablaBuscar); 
                }
            }
        }else if(filtro=="Autor"){
            System.out.println("no agrego autor");
            for (int i = 0; i < ventana.tx.datos.libros.size(); i++) {
                if(dato.equals(ventana.tx.datos.libros.get(i).autor)){
                    agregarFilaTabla(ventana.tx.datos.libros.get(i).codigo, ventana.tx.datos.libros.get(i).autor,ventana.tx.datos.libros.get(i).titulo, ventana.tx.datos.libros.get(i).cantidad, ventana.tx.datos.libros.get(i).fechaPublicacion, ventana.tx.datos.libros.get(i).editorial,tablaBuscar); 
                }
            }
        }else{
            System.out.println("no agrego");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresarInicio = new javax.swing.JButton();
        subVentanaLibros = new javax.swing.JTabbedPane();
        panelNuevos = new javax.swing.JPanel();
        Codigo = new javax.swing.JLabel();
        cajaCodigo = new javax.swing.JTextField();
        Autor = new javax.swing.JLabel();
        cajaAutor = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        cajaTitulo = new javax.swing.JTextField();
        copias = new javax.swing.JLabel();
        cajaCopias = new javax.swing.JTextField();
        Publicacion = new javax.swing.JLabel();
        cajaPublicacion = new javax.swing.JTextField();
        Editorial = new javax.swing.JLabel();
        cajaEditorial = new javax.swing.JTextField();
        BtnConfirmar = new javax.swing.JButton();
        panelTodos = new javax.swing.JPanel();
        scrollTodos = new javax.swing.JScrollPane();
        tablaTodos = new javax.swing.JTable();
        BtnDescendete = new javax.swing.JButton();
        BtnAscendente = new javax.swing.JButton();
        panelBuscar = new javax.swing.JPanel();
        filtro = new javax.swing.JComboBox<>();
        cajaDato = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        scrollBuscar = new javax.swing.JScrollPane();
        tablaBuscar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libros");

        regresarInicio.setText("Back");
        regresarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarInicioActionPerformed(evt);
            }
        });

        subVentanaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subVentanaLibrosMouseClicked(evt);
            }
        });

        Codigo.setText("Codigo:");

        Autor.setText("Autor:");

        Titulo.setText("Titulo:");

        copias.setText("Copias");

        Publicacion.setText("Fecha de Publicacion");

        Editorial.setText("Editorial");

        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevosLayout = new javax.swing.GroupLayout(panelNuevos);
        panelNuevos.setLayout(panelNuevosLayout);
        panelNuevosLayout.setHorizontalGroup(
            panelNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cajaPublicacion)
                    .addComponent(Publicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(cajaTitulo)
                    .addComponent(Codigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCodigo)
                    .addComponent(Titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
                .addGroup(panelNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaAutor)
                    .addComponent(copias, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCopias)
                    .addComponent(Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelNuevosLayout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(BtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNuevosLayout.setVerticalGroup(
            panelNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Publicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNuevosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnConfirmar)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        subVentanaLibros.addTab("Nuevo", panelNuevos);

        tablaTodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollTodos.setViewportView(tablaTodos);

        BtnDescendete.setText("Descendente");
        BtnDescendete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDescendeteActionPerformed(evt);
            }
        });

        BtnAscendente.setText("Ascendente");
        BtnAscendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAscendenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTodosLayout = new javax.swing.GroupLayout(panelTodos);
        panelTodos.setLayout(panelTodosLayout);
        panelTodosLayout.setHorizontalGroup(
            panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTodosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnAscendente)
                        .addGap(17, 17, 17)
                        .addComponent(BtnDescendete)))
                .addContainerGap())
        );
        panelTodosLayout.setVerticalGroup(
            panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAscendente)
                    .addComponent(BtnDescendete))
                .addGap(18, 18, 18)
                .addComponent(scrollTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );

        subVentanaLibros.addTab("Todos", panelTodos);

        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre", "Autor" }));
        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
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

        tablaBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollBuscar.setViewportView(tablaBuscar);

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaDato)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(scrollBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaDato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subVentanaLibros.addTab("Buscar", panelBuscar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subVentanaLibros)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresarInicio)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subVentanaLibros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regresarInicio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarInicioActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_regresarInicioActionPerformed

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroActionPerformed

    private void BtnDescendeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDescendeteActionPerformed
        // TODO add your handling code here:
        removerTabla(tablaTodos);
        ordenarLibros();
        ordenarLibrosDescendente();
    }//GEN-LAST:event_BtnDescendeteActionPerformed

    private void BtnAscendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAscendenteActionPerformed
        // TODO add your handling code here:
        removerTabla(tablaTodos);
        ordenarLibros();
        ordenarLibrosAscendente(); 
    }//GEN-LAST:event_BtnAscendenteActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
        removerTabla(tablaBuscar);
        filtrar(filtro.getSelectedItem().toString(), cajaDato.getText());
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        // TODO add your handling code here:
        if((cajaCodigo.getText().equals("")) || (cajaAutor.getText().equals("")) || (cajaTitulo.getText().equals("")) || (cajaCopias.getText().equals("")) || (cajaPublicacion.getText().equals("")) || (cajaEditorial.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "No se han llenado todos los campos, para registrar necesitas llenar todo los datos");

        }else{
            if(ventana.registros.buscarLibro(cajaCodigo.getText())){
                ventana.cargarLibros(cajaCodigo.getText());
                ventana.tmpL.cantidad=ventana.tmpL.cantidad+Integer.parseInt(cajaCopias.getText());
                JOptionPane.showMessageDialog(null, "El libro ya existe, se agrego el numero de copias nuevas");
                cajaAutor.setText("");
                cajaCodigo.setText("");
                cajaCopias.setText("");
                cajaEditorial.setText("");
                cajaTitulo.setText("");
                cajaPublicacion.setText("");
            }else{
            ventana.tx.datos.nuevoLibro(cajaTitulo.getText(), cajaAutor.getText(), cajaCodigo.getText(), Integer.parseInt(cajaCopias.getText()));
            ventana.tx.datos.libros.get(ventana.tx.datos.libros.size()-1).editorial=cajaEditorial.getText();
            ventana.tx.datos.libros.get(ventana.tx.datos.libros.size()-1).fechaPublicacion=cajaPublicacion.getText();
                            cajaAutor.setText("");
                cajaCodigo.setText("");
                cajaCopias.setText("");
                cajaEditorial.setText("");
                cajaTitulo.setText("");
                cajaPublicacion.setText("");
            JOptionPane.showMessageDialog(null, "Listo se agrego el nuevo libro con el numero de copias");    
            }
        }
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void subVentanaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subVentanaLibrosMouseClicked
        // TODO add your handling code here:
                removerTabla(tablaTodos);
        removerTabla(tablaBuscar);
        ventana.tx.datos.libros.clear();
        ventana.tx.datos.libros = ventana.arregloLibros();
        
        for (int i = 0; i <= (ventana.tx.datos.libros.size()-1); i++) {

            //Se aniade la informacion en este orden a la tabla
            agregarFilaTabla(ventana.tx.datos.libros.get(i).codigo, ventana.tx.datos.libros.get(i).autor,ventana.tx.datos.libros.get(i).titulo, ventana.tx.datos.libros.get(i).cantidad, ventana.tx.datos.libros.get(i).fechaPublicacion, ventana.tx.datos.libros.get(i).editorial,tablaTodos);
        }
        
        
    }//GEN-LAST:event_subVentanaLibrosMouseClicked

    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked
        // TODO add your handling code here:
                removerTabla(tablaBuscar);
        filtrar(filtro.getSelectedItem().toString(), cajaDato.getText());
    }//GEN-LAST:event_BtnBuscarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JButton BtnAscendente;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnDescendete;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Editorial;
    private javax.swing.JLabel Publicacion;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField cajaAutor;
    private javax.swing.JTextField cajaCodigo;
    private javax.swing.JTextField cajaCopias;
    private javax.swing.JTextField cajaDato;
    private javax.swing.JTextField cajaEditorial;
    private javax.swing.JTextField cajaPublicacion;
    private javax.swing.JTextField cajaTitulo;
    private javax.swing.JLabel copias;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelNuevos;
    private javax.swing.JPanel panelTodos;
    private javax.swing.JButton regresarInicio;
    private javax.swing.JScrollPane scrollBuscar;
    private javax.swing.JScrollPane scrollTodos;
    private javax.swing.JTabbedPane subVentanaLibros;
    private javax.swing.JTable tablaBuscar;
    private javax.swing.JTable tablaTodos;
    // End of variables declaration//GEN-END:variables
}
