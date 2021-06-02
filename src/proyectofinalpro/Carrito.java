
package proyectofinalpro;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Carrito extends javax.swing.JFrame {
    
    ProyectoFinalPro enlace = new ProyectoFinalPro();
    Connection conect = enlace.conectar();
    Conector con = new Conector();
    
    
    

    public Carrito() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
       
        
        
        Lebron ir24 = new Lebron();
        CactusJack irTS = new CactusJack();
        Wacko irW = new Wacko();
        airForce irAir = new airForce();
        airMAX irMax = new airMAX();
        jordan1 irJordan = new jordan1();
        
        Ventana1 ven = new Ventana1();
        
        
         
        if(irJordan.Modelo == "JORDAN 1 HIGH CHICAGO" ||irJordan.Modelo == "JORDAN 1 HIGH UNIVERSITY BLUE"  ||irJordan.Modelo == "JORDAN 1 HIGH ROYAL BLUE" ){
        NombreModelo.setText(irJordan.Modelo);
        codigo.setText(irJordan.Codigo);
        color1.setText(irJordan.Color);
        precio.setText(irJordan.Precio);
        }
        if(ir24.Modelo == "LEBRON 15.2" ||ir24.Modelo == "LEBRON 15"  ||ir24.Modelo == "DUNK LOW TS" ){
        NombreModelo.setText(ir24.Modelo);
        codigo.setText(ir24.Codigo);
        color1.setText(ir24.Color);
        precio.setText(ir24.Precio);
        }
        if(irTS.Modelo == "JORDAN1 TS" ||irTS.Modelo == "JORDAN 6 KAKI TS"  ||irTS.Modelo == "DUNK LOW TS" ){
        NombreModelo.setText(irTS.Modelo);
        codigo.setText(irTS.Codigo);
        color1.setText(irTS.Color);
        precio.setText(irTS.Precio);
        }
        if(irAir.Modelo == "AIR FORCE 1 BLACK" ||irAir.Modelo == "AIR FORCE 1 LIGHT-YELLOW x OFFWHITE"  ||irAir.Modelo == "AIR FORCE 1 SAND" ){
        NombreModelo.setText(irAir.Modelo);
        codigo.setText(irAir.Codigo);
        color1.setText(irAir.Color);
        precio.setText(irAir.Precio);
        }
        if(irMax.Modelo == "AIR MAX 90 LIGTH YELLOW" ||irMax.Modelo == "AIR MAX 97 BLACK"  ||irMax.Modelo == "AIR MAX UPTEMPO BLACK" ){
        NombreModelo.setText(irMax.Modelo);
        codigo.setText(irMax.Codigo);
        color1.setText(irMax.Color);
        precio.setText(irMax.Precio);
        }
        if(irW.Modelo == "VANS X WAKO" ||irW.Modelo == "BLAZZER LOW BLACK"  ||irW.Modelo == "BLAZZER LOW LEOPARD" ){
        NombreModelo.setText(irW.Modelo);
        codigo.setText(irW.Codigo);
        color1.setText(irW.Color);
        precio.setText(irW.Precio);
        }
        
        
        
        /*
        NombreModelo.setText(ir24.Modelo);
        NombreModelo.setText(irTS.Modelo);
        NombreModelo.setText(irW.Modelo);
        NombreModelo.setText(irAir.Modelo);
        NombreModelo.setText(irMax.Modelo);
        NombreModelo.setText(irJordan.Modelo);
        
        codigo.setText(ir24.Codigo);
        codigo.setText(irTS.Codigo);
        codigo.setText(irW.Codigo);
        codigo.setText(irAir.Codigo);
        codigo.setText(irMax.Codigo);
        codigo.setText(irJordan.Codigo);
                
        color1.setText(ir24.Color);
        color1.setText(irTS.Color);
        color1.setText(irW.Color);
        color1.setText(irAir.Color);
        color1.setText(irMax.Color);
        color1.setText(irJordan.Color);
        
        precio.setText(ir24.Precio);
        precio.setText(irW.Precio);
        precio.setText(irTS.Precio);
        precio.setText(irAir.Precio);
        precio.setText(irMax.Precio);
        precio.setText(irJordan.Precio);
        */
    }

   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NombreModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Numunidades = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NomCompra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        Compra = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        color1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        talla = new javax.swing.JComboBox<>();
        completar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lmarca = new javax.swing.JTextField();
        conectar = new javax.swing.JToggleButton();
        completar1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel5.setText("Numero de Unidades");

        jLabel7.setText("DATOS DE ENVIO");

        jLabel9.setText("Cliente");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setBackground(new java.awt.Color(255, 51, 51));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jToggleButton1.setText("CERRAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("COMPLETE SU COMPRA");

        jLabel3.setText("Codigo:");

        NombreModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreModeloActionPerformed(evt);
            }
        });

        jLabel2.setText("Talla:");

        jLabel4.setText("Color:");

        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero de Unidades:");

        Numunidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumunidadesActionPerformed(evt);
            }
        });

        jLabel8.setText("DATOS DE PEDIDO");

        jLabel10.setText("Cliente:");

        NomCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomCompraActionPerformed(evt);
            }
        });

        jLabel11.setText("Dirección envío:");

        Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionActionPerformed(evt);
            }
        });

        Compra.setBackground(new java.awt.Color(102, 255, 102));
        Compra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Compra.setText("COMPRAR");
        Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraActionPerformed(evt);
            }
        });

        jLabel12.setText("Precio:");

        color1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color1ActionPerformed(evt);
            }
        });

        jLabel13.setText("INTRODUCE TU NOMBRE");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        jLabel14.setText("Modelo: ");

        talla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", " ", " " }));
        talla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tallaActionPerformed(evt);
            }
        });

        completar.setBackground(new java.awt.Color(102, 255, 102));
        completar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        completar.setText("COMPLETAR");
        completar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarActionPerformed(evt);
            }
        });

        jLabel15.setText("Marca:");

        conectar.setBackground(new java.awt.Color(255, 51, 51));
        conectar.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        conectar.setText("CONECTAR");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });

        completar1.setBackground(new java.awt.Color(102, 255, 102));
        completar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        completar1.setText("COMPLETAR");
        completar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(completar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Compra)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NombreModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lmarca)
                                .addGap(122, 122, 122))
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Numunidades, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(color1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(talla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(conectar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addComponent(jLabel13)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(talla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(color1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Numunidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Compra)
                    .addComponent(completar)
                    .addComponent(completar1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void NombreModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreModeloActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void NumunidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumunidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumunidadesActionPerformed

    private void NomCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomCompraActionPerformed

    private void CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraActionPerformed
         BufferedWriter bw= null;

        ArrayList<String> lista = new ArrayList<String>();
        
        lista.add("Nombre:   " + NomCompra.getText());
        lista.add("Modelo:   " + NombreModelo.getText());
        lista.add("Precio:   " +precio.getText()+ "€");
        lista.add("Talla:   " + (String) talla.getSelectedItem());
        lista.add("Unidades:   " + Numunidades.getText());
        lista.add("Direccion:   " + Direccion.getText());
        int nUnidades2 = Integer.parseInt(Numunidades.getText());
        
       
        try {
            //Statement leer = con.connect.createStatement();
            //ResultSet resultado = leer.executeQuery("select precio from zapatillas");
            //int numero = Integer.parseInt(resultado.getString(1));
            String ruta = "recivo.txt";
               File f = new File(ruta);
               FileWriter fw = new FileWriter(f);
               BufferedWriter escritura = new BufferedWriter(fw);
               escritura.write("ESTE ES TU TICKET");
               escritura.newLine();
               escritura.write("\n");
               escritura.newLine();
        for(int i=0;i<lista.size();i++){
            escritura.write(lista.get(i));
            escritura.newLine();

        }
        int total= Integer.parseInt(precio.getText()) * nUnidades2;
        escritura.write("Precio Total= " + total + "€");
        escritura.newLine();
        escritura.write("\n");
        escritura.newLine();
        escritura.write("GRACIAS POR COMPRAR EN NUESTRA TIENDA");
        escritura.newLine();
        escritura.close();
       
        } catch (IOException ex) {
            System.out.println("UPS!!");
        }
        
        try{
            Statement leer = con.connect.createStatement();
             ResultSet resultado = leer.executeQuery("select unidades from zapatillas");
             int numero = Integer.parseInt(resultado.getString(1));
             
            int unidades = Integer.parseInt(this.Numunidades.getText().trim());   
            String codigo = this.codigo.getText().trim();   
            int resultado1 = numero - unidades;
            PreparedStatement pst = con.connect.prepareStatement("UPDATE zapatillas SET unidades ='"+ resultado1 +"' WHERE Codigo= '"+codigo+"'");
            pst.executeUpdate();
            

        }catch(Exception e){
            
        }
        
        
        /*
        BufferedWriter bw= null;
        FileWriter fw= null;

        try {
            File fi = new File("Recivo.txt");
            PrintWriter esc = new PrintWriter(new FileWriter(fi, true));
            if (!fi.exists()) {
            fi.createNewFile();
            }
            fw = new FileWriter(fi.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(NombreModelo.getText()+", ");
            bw.write(precio.getText()+", ");
            bw.write(talla.getSelectedItem()+", ");//solucionar por gabri
            bw.write(Numunidades.getText()+", ");
            bw.write(NomCompra.getText()+", ");
            bw.write(Direccion.getText());
            bw.write("\n");
       
        } catch (IOException ex) {
            System.out.println("UPS!!");
        }
        finally{
            if (bw != null)
                try {
                    bw.close();
            } catch (IOException ex) {
                System.out.println("UPS!!");
            }
            if (fw != null)
                try {
                    fw.close();
            } catch (IOException ex) {
                    System.out.println("UPS!!");
            }
        

        }
        
           try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into pedidos values(?,?,?,?,?,?)");
            
            pst.setString(1, NombreModelo.getText().trim());
            pst.setString(2, codigo.getText().trim());
            pst.setString(3, (String) talla.getSelectedItem());//solucionar por gabri
            pst.setString(4, color1.getText().trim());
            pst.setString(5, precio.getText().trim());
            pst.setString(6, Numunidades.getText().trim());
            pst.setString(7, NomCompra.getText().trim());
            pst.setString(8, Direccion.getText().trim());
            pst.executeUpdate();
            

        }catch ( Exception e){
            System.out.println("No funciona la compra");

        }
        */
          this.setVisible(false);
    }//GEN-LAST:event_CompraActionPerformed

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionActionPerformed

    private void color1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_color1ActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void completarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarActionPerformed
        try{
            PreparedStatement pt = con.connect.prepareStatement("select codigo,marca,nombre,color,talla,precio from zapatillas where nombre = ? and talla = ?");
            
            pt.setString(1, this.NombreModelo.getText().trim());
            pt.setString(2, (String) this.talla.getSelectedItem());
            
            ResultSet rs = pt.executeQuery();
            
            if(rs.next()){
                
                this.codigo.setText(rs.getString("codigo"));
                this.lmarca.setText(rs.getString("marca"));
                this.color1.setText(rs.getString("color"));
                this.precio.setText(rs.getString("precio"));
                
                
            }else{
                JOptionPane.showMessageDialog(null, "No hay esa zapatilla");
            }
       }catch(Exception e){
           
       }
    }//GEN-LAST:event_completarActionPerformed

    private void tallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tallaActionPerformed

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
        con.connect();
    }//GEN-LAST:event_conectarActionPerformed

    private void completar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completar1ActionPerformed
        //String []datos = new String[1];
        try{
            Statement leer = con.connect.createStatement();
             ResultSet resultado = leer.executeQuery("select unidades from zapatillas");
             int numero = Integer.parseInt(resultado.getString(1));
             
            int unidades = Integer.parseInt(this.Numunidades.getText().trim());   
            String codigo = this.codigo.getText().trim();   
            int resultado1 = numero - unidades;
            PreparedStatement pst = con.connect.prepareStatement("UPDATE zapatillas SET unidades ='"+ resultado1 +"' WHERE Codigo= '"+codigo+"'");
            pst.executeUpdate();
            

        }catch(Exception e){
            
        }
    }//GEN-LAST:event_completar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compra;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField NomCompra;
    private javax.swing.JTextField NombreModelo;
    private javax.swing.JTextField Numunidades;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField color1;
    private javax.swing.JButton completar;
    private javax.swing.JButton completar1;
    private javax.swing.JToggleButton conectar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField lmarca;
    private javax.swing.JTextField precio;
    private javax.swing.JComboBox<String> talla;
    // End of variables declaration//GEN-END:variables
}
