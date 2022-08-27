/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import static com.app.Dashboard.content;
import com.bd.DatabaseConnection;

/**
 *
 * @author Antonio
 */
public class Medidas extends javax.swing.JPanel {

    private int id;
    
    /**
     * Creates new form Principal
     */
    public Medidas(int id) {
        this.id = id;
        initComponents();
        getClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Medidas");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        add.setBackground(new java.awt.Color(18, 90, 173));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMousePressed(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Añadir");
        add.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 395, 110, 30));

        edit.setBackground(new java.awt.Color(18, 90, 173));
        edit.setMinimumSize(new java.awt.Dimension(110, 30));
        edit.setName(""); // NOI18N
        edit.setPreferredSize(new java.awt.Dimension(100, 30));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editMousePressed(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar");
        edit.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 395, 110, 30));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha consulta", "Peso", "Altura", "Masa muscular", "Masa grasa", "Agua", "Metabolismo", "Edad metabólica", "Pecho", "Cintura", "Cadera", "Bajo glúteo", "Muslo", "Tobillo", "Brazo", "Muñeca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 90, 740, 290));
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        setColor(add);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        resetColor(add);
    }//GEN-LAST:event_addMouseExited
        
   
    /**
     * Edits de data of a client
     * @param evt 
     */
    private void addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMousePressed
        UpMedidas p1 = new UpMedidas(id);
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_addMousePressed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MousePressed

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        setColor(edit);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        resetColor(edit);
    }//GEN-LAST:event_editMouseExited

    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed
        DatabaseConnection connection = new DatabaseConnection(Dashboard.user, Dashboard.pwd);
        
        try {
            int idcell = jTable1.getSelectedRow();
            if(idcell <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar la cita a editar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                
                Statement stmt = connection.getConexion().createStatement();
                ResultSet counter = stmt.executeQuery("select bioimpedancias.fecha_consulta, peso, altura, masa_muscular, masa_grasa, agua, metabolismo_basal, edad_metabolica, pecho, cintura, cadera, bajo_gluteo, muslo, tobillo, brazo, wrist " + 
                                                   "from  bioimpedancias natural join medidas " +
                                                   "where bioimpedancias.ID =" + id + " " +
                                                   "order by fecha_consulta DESC");

                int count = 0;
                while(counter.next()){count++;}

                String list[][] = new String[count][16];
                int i = 0;
                ResultSet re = stmt.executeQuery("select bioimpedancias.fecha_consulta, peso, altura, masa_muscular, masa_grasa, agua, metabolismo_basal, edad_metabolica, pecho, cintura, cadera, bajo_gluteo, muslo, tobillo, brazo, wrist " + 
                                                   "from  bioimpedancias natural join medidas " +
                                                   "where bioimpedancias.ID =" + id + " " +
                                                   "order by fecha_consulta DESC");
                while(re.next()){
                    list[i][0] = re.getString(1);
                    list[i][1] = re.getString(2);
                    list[i][2] = re.getString(3);
                    list[i][3] = re.getString(4);
                    list[i][4] = re.getString(5);
                    list[i][5] = re.getString(6);
                    list[i][6] = re.getString(7);
                    list[i][7] = re.getString(8);
                    list[i][8] = re.getString(9);
                    list[i][9] = re.getString(10);
                    list[i][10] = re.getString(11);
                    list[i][11] = re.getString(12);
                    list[i][12] = re.getString(13);
                    list[i][13] = re.getString(14);
                    list[i][14] = re.getString(15);
                    list[i][15] = re.getString(16);
                    i++;
                }
                String id = list[idcell][0];
                if(id == null || id.equals("")){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar la cita a editar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    String ufecha = list[idcell][0];
                    String upeso = list[idcell][1];
                    String ualtura = list[idcell][2];
                    String umasaMuscular = list[idcell][3];
                    String umasaGrasa = list[idcell][4];
                    String uagua = list[idcell][5];
                    String umetabolismo = list[idcell][6];
                    String uedad = list[idcell][7];
                    String upecho = list[idcell][8];
                    String ucintura = list[idcell][9];
                    String ucadera = list[idcell][10];
                    String ugluteo = list[idcell][11];
                    String umuslo = list[idcell][12];
                    String utobillo = list[idcell][13];
                    String ubrazo = list[idcell][14];
                    String uwrist = list[idcell][15];
                    
                    EditMedidas p1 = new EditMedidas(this.id, ufecha, upeso, ualtura, umasaMuscular, umasaGrasa, uagua, umetabolismo, uedad, upecho, ucintura, ucadera, ugluteo, umuslo, utobillo, ubrazo, uwrist);
                    p1.setSize(750, 430);
                    p1.setLocation(0, 0);

                    content.removeAll();
                    content.add(p1, BorderLayout.CENTER);
                    content.revalidate();
                    content.repaint();
                }
                
                stmt.close();
                connection.cierraConexion();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editMousePressed
    
    private void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    
    private void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    /**
     * Returns a table with the client's data
     */
    public void getClientes(){
        DatabaseConnection connection = new DatabaseConnection(Dashboard.user, Dashboard.pwd);
        
        int count = 0;
        
        try{
            Statement stmt = connection.getConexion().createStatement();
            ResultSet counter = stmt.executeQuery("select bioimpedancias.fecha_consulta, peso, altura, masa_muscular, masa_grasa, agua, metabolismo_basal, edad_metabolica, pecho, cintura, cadera, bajo_gluteo, muslo, tobillo, brazo, wrist " + 
                                                   "from  bioimpedancias natural join medidas " +
                                                   "where bioimpedancias.ID =" + id + " " +
                                                   "order by fecha_consulta DESC");
            while(counter.next()){count++;}
            stmt.close();
        }
        catch(Exception sqle){
            System.out.println("Excepcion : " + sqle);
        }
        
        String list[][] = new String[count][16];
        int i = 0;
        
        try{
            Statement stmt = connection.getConexion().createStatement();
            ResultSet re = stmt.executeQuery("select bioimpedancias.fecha_consulta, peso, altura, masa_muscular, masa_grasa, agua, metabolismo_basal, edad_metabolica, pecho, cintura, cadera, bajo_gluteo, muslo, tobillo, brazo, wrist " + 
                                                "from  bioimpedancias natural join medidas " +
                                                "where bioimpedancias.ID =" + id + " " +
                                                "order by fecha_consulta DESC");
            while(re.next()){
                list[i][0] = re.getString(1);
                list[i][1] = re.getString(2);
                list[i][2] = re.getString(3);
                list[i][3] = re.getString(4);
                list[i][4] = re.getString(5);
                list[i][5] = re.getString(6);
                list[i][6] = re.getString(7);
                list[i][7] = re.getString(8);
                list[i][8] = re.getString(9);
                list[i][9] = re.getString(10);
                list[i][10] = re.getString(11);
                list[i][11] = re.getString(12);
                list[i][12] = re.getString(13);
                list[i][13] = re.getString(14);
                list[i][14] = re.getString(15);
                list[i][15] = re.getString(16);
                i++;
            }
            stmt.close();
            connection.cierraConexion();
        }
        catch(Exception sqle){
            System.out.println("Excepcion : " + sqle);
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        list,
        new String [] {
            "Fecha consulta", "Peso", "Altura", "Masa muscular", "Masa grasa", "Agua", "Metabolismo", "Edad metabólica", "Pecho", "Cintura", "Cadera", "Glúteo", "Muslo", "Tobillo", "Brazo", "Muñeca"
        }));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel add;
    private javax.swing.JPanel body;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}