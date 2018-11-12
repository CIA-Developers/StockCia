/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
/**
 *
 * @author Octaviano
 */
public class ViewSucursalesEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form Clientes
     */
    public ViewSucursalesEmpleados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_barra = new javax.swing.JPanel();
        jl_titulo = new javax.swing.JLabel();
        jl_imagen = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_vista = new javax.swing.JTable();
        jl_buscar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jp_barra.setBackground(new java.awt.Color(153, 204, 255));

        jl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(102, 102, 102));
        jl_titulo.setText("Sucursales");

        jl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sucursales.png"))); // NOI18N

        javax.swing.GroupLayout jp_barraLayout = new javax.swing.GroupLayout(jp_barra);
        jp_barra.setLayout(jp_barraLayout);
        jp_barraLayout.setHorizontalGroup(
            jp_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_barraLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_imagen)
                .addGap(61, 61, 61))
        );
        jp_barraLayout.setVerticalGroup(
            jp_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_barraLayout.createSequentialGroup()
                .addGroup(jp_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_imagen)
                    .addComponent(jl_titulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jt_vista.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jt_vista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No  Sucursal", "Calle", "Colonia", "Numero", "Telefono", "Codigo Producto", "Nombre Prodcto", "Stock", "Stock maximo", "Stock minimo"
            }
        ));
        jScrollPane1.setViewportView(jt_vista);

        jl_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscar .png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_buscar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_buscar;
    public javax.swing.JLabel jl_imagen;
    public javax.swing.JLabel jl_titulo;
    public javax.swing.JPanel jp_barra;
    public javax.swing.JTable jt_vista;
    public javax.swing.JTextField jtf_buscar;
    // End of variables declaration//GEN-END:variables
}
