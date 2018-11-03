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
public class ViewProductos extends javax.swing.JPanel {

    /**
     * Creates new form Clientes
     */
    public ViewProductos() {
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
        jl_icon_buscar = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();
        jp_datos = new javax.swing.JPanel();
        jl_precio_unitario = new javax.swing.JLabel();
        jtf_marca = new javax.swing.JTextField();
        jtf_precio_unitario = new javax.swing.JTextField();
        jl_codigo_prod = new javax.swing.JLabel();
        jtf_no_sucursal = new javax.swing.JTextField();
        jl_Existencia = new javax.swing.JLabel();
        jtf_tipo_prod = new javax.swing.JTextField();
        jtf_unidad_medida = new javax.swing.JTextField();
        jtf_codigo_prod = new javax.swing.JTextField();
        jl_numero = new javax.swing.JLabel();
        jl_tipo_prod = new javax.swing.JLabel();
        jl_nom_prod = new javax.swing.JLabel();
        jtf_status = new javax.swing.JTextField();
        jl_unidad_medida = new javax.swing.JLabel();
        jl_status = new javax.swing.JLabel();
        jl_existencia_total = new javax.swing.JLabel();
        jl_descripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_descripcion = new javax.swing.JTextArea();
        jl_image_producto = new javax.swing.JLabel();
        jp_vista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_vista = new javax.swing.JTable();
        jp_botones = new javax.swing.JPanel();
        jb_nuevo = new javax.swing.JButton();
        jl_nuevo = new javax.swing.JLabel();
        jb_modificar = new javax.swing.JButton();
        jl_modificar = new javax.swing.JLabel();
        jb_eliminar = new javax.swing.JButton();
        jl_eliminar = new javax.swing.JLabel();
        jb_guardar = new javax.swing.JButton();
        jl_guadar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jp_barra.setBackground(new java.awt.Color(153, 204, 255));

        jl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(102, 102, 102));
        jl_titulo.setText("Productos");

        jl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/productos.png"))); // NOI18N

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

        jl_icon_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscar .png"))); // NOI18N

        jp_datos.setBackground(new java.awt.Color(255, 255, 255));
        jp_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        jl_precio_unitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_precio_unitario.setForeground(new java.awt.Color(51, 51, 51));
        jl_precio_unitario.setText("Precio unitario:");

        jl_codigo_prod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_codigo_prod.setForeground(new java.awt.Color(51, 51, 51));
        jl_codigo_prod.setText("Codigo Producto:");

        jl_Existencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_Existencia.setForeground(new java.awt.Color(51, 51, 51));
        jl_Existencia.setText("Stock TOTAL:");

        jl_numero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_numero.setForeground(new java.awt.Color(51, 51, 51));
        jl_numero.setText("Marca:");

        jl_tipo_prod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_tipo_prod.setForeground(new java.awt.Color(51, 51, 51));
        jl_tipo_prod.setText("Tipo producto:");

        jl_nom_prod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_nom_prod.setForeground(new java.awt.Color(51, 51, 51));
        jl_nom_prod.setText("Nombre producto:");

        jl_unidad_medida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_unidad_medida.setForeground(new java.awt.Color(51, 51, 51));
        jl_unidad_medida.setText("unidad medida:");

        jl_status.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_status.setForeground(new java.awt.Color(51, 51, 51));
        jl_status.setText("Status:");

        jl_existencia_total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_existencia_total.setForeground(new java.awt.Color(51, 153, 255));
        jl_existencia_total.setText("0");

        jl_descripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_descripcion.setForeground(new java.awt.Color(51, 51, 51));
        jl_descripcion.setText("descripcion:");

        jta_descripcion.setColumns(20);
        jta_descripcion.setRows(5);
        jScrollPane2.setViewportView(jta_descripcion);

        jl_image_producto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jp_datosLayout = new javax.swing.GroupLayout(jp_datos);
        jp_datos.setLayout(jp_datosLayout);
        jp_datosLayout.setHorizontalGroup(
            jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_datosLayout.createSequentialGroup()
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_datosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_codigo_prod)
                            .addComponent(jl_tipo_prod)
                            .addComponent(jl_numero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_codigo_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_datosLayout.createSequentialGroup()
                                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_tipo_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_datosLayout.createSequentialGroup()
                                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jl_status)
                                            .addComponent(jl_unidad_medida))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtf_unidad_medida, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtf_status, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jp_datosLayout.createSequentialGroup()
                                        .addComponent(jl_precio_unitario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_precio_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jp_datosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jl_nom_prod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_no_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_datosLayout.createSequentialGroup()
                        .addComponent(jl_Existencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_existencia_total))
                    .addComponent(jl_descripcion))
                .addGap(49, 49, 49)
                .addComponent(jl_image_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_datosLayout.setVerticalGroup(
            jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_datosLayout.createSequentialGroup()
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl_Existencia)
                        .addComponent(jl_existencia_total))
                    .addGroup(jp_datosLayout.createSequentialGroup()
                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_codigo_prod)
                            .addComponent(jtf_codigo_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_datosLayout.createSequentialGroup()
                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_no_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_nom_prod))
                        .addGap(18, 18, 18)
                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_tipo_prod)
                            .addComponent(jtf_tipo_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_numero))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_datosLayout.createSequentialGroup()
                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jl_precio_unitario)
                                .addComponent(jtf_precio_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_datosLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jl_descripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jp_datosLayout.createSequentialGroup()
                                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtf_unidad_medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jl_unidad_medida))
                                        .addGap(18, 18, 18)
                                        .addGroup(jp_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jl_status)
                                            .addComponent(jtf_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jp_datosLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jl_image_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jp_vista.setBackground(new java.awt.Color(255, 255, 255));
        jp_vista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        jt_vista.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jt_vista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Producto", "Nombre Producto", "Tipo Producto", "Marca", "Precio Unitario", "Unidad de medida", "Status", "Stock Total", "Desripcion"
            }
        ));
        jScrollPane1.setViewportView(jt_vista);

        javax.swing.GroupLayout jp_vistaLayout = new javax.swing.GroupLayout(jp_vista);
        jp_vista.setLayout(jp_vistaLayout);
        jp_vistaLayout.setHorizontalGroup(
            jp_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jp_vistaLayout.setVerticalGroup(
            jp_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_vistaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jp_botones.setBackground(new java.awt.Color(255, 255, 51));

        jb_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuevo.png"))); // NOI18N

        jl_nuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_nuevo.setForeground(new java.awt.Color(51, 51, 51));
        jl_nuevo.setText("Nuevo");

        jb_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Modificar.png"))); // NOI18N

        jl_modificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_modificar.setForeground(new java.awt.Color(51, 51, 51));
        jl_modificar.setText("Modificar");

        jb_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N

        jl_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_eliminar.setForeground(new java.awt.Color(51, 51, 51));
        jl_eliminar.setText("Eliminar");

        jb_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N

        jl_guadar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jl_guadar.setForeground(new java.awt.Color(51, 51, 51));
        jl_guadar.setText("Guardar");

        javax.swing.GroupLayout jp_botonesLayout = new javax.swing.GroupLayout(jp_botones);
        jp_botones.setLayout(jp_botonesLayout);
        jp_botonesLayout.setHorizontalGroup(
            jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_botonesLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nuevo))
                .addGap(60, 60, 60)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_modificar)
                    .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_botonesLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jl_eliminar))
                    .addGroup(jp_botonesLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_guadar)
                    .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jp_botonesLayout.setVerticalGroup(
            jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_guardar)
                    .addComponent(jb_nuevo)
                    .addComponent(jb_modificar)
                    .addComponent(jb_eliminar))
                .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_botonesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_guadar))
                    .addGroup(jp_botonesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jl_nuevo)
                                .addComponent(jl_modificar))
                            .addComponent(jl_eliminar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jp_vista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jl_icon_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jp_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_icon_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_vista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jb_eliminar;
    public javax.swing.JButton jb_guardar;
    public javax.swing.JButton jb_modificar;
    public javax.swing.JButton jb_nuevo;
    public javax.swing.JLabel jl_Existencia;
    public javax.swing.JLabel jl_codigo_prod;
    public javax.swing.JLabel jl_descripcion;
    public javax.swing.JLabel jl_eliminar;
    public javax.swing.JLabel jl_existencia_total;
    public javax.swing.JLabel jl_guadar;
    public javax.swing.JLabel jl_icon_buscar;
    private javax.swing.JLabel jl_image_producto;
    public javax.swing.JLabel jl_imagen;
    public javax.swing.JLabel jl_modificar;
    public javax.swing.JLabel jl_nom_prod;
    public javax.swing.JLabel jl_nuevo;
    public javax.swing.JLabel jl_numero;
    public javax.swing.JLabel jl_precio_unitario;
    public javax.swing.JLabel jl_status;
    public javax.swing.JLabel jl_tipo_prod;
    public javax.swing.JLabel jl_titulo;
    public javax.swing.JLabel jl_unidad_medida;
    public javax.swing.JPanel jp_barra;
    public javax.swing.JPanel jp_botones;
    public javax.swing.JPanel jp_datos;
    public javax.swing.JPanel jp_vista;
    public javax.swing.JTable jt_vista;
    private javax.swing.JTextArea jta_descripcion;
    public javax.swing.JTextField jtf_buscar;
    public javax.swing.JTextField jtf_codigo_prod;
    public javax.swing.JTextField jtf_marca;
    public javax.swing.JTextField jtf_no_sucursal;
    public javax.swing.JTextField jtf_precio_unitario;
    public javax.swing.JTextField jtf_status;
    public javax.swing.JTextField jtf_tipo_prod;
    public javax.swing.JTextField jtf_unidad_medida;
    // End of variables declaration//GEN-END:variables
}