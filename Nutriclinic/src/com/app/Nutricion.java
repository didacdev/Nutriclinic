
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
public class Nutricion extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Nutricion() {
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
        jSeparator2 = new javax.swing.JSeparator();
        usrnm = new javax.swing.JTextField();
        search = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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
        Title.setText("Pacientes");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 10));

        usrnm.setForeground(new java.awt.Color(102, 102, 102));
        usrnm.setText("Ingrese el nombre de usuario a buscar");
        usrnm.setBorder(null);
        usrnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usrnmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usrnmMouseReleased(evt);
            }
        });
        add(usrnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 30));

        search.setBackground(new java.awt.Color(18, 90, 173));
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchMousePressed(evt);
            }
        });
        search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buscar");
        search.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 30));

        edit.setBackground(new java.awt.Color(18, 90, 173));
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Medidas");
        edit.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, -1));

        add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 110, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Plan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void usrnmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMousePressed
       if(usrnm.getText().equals("Ingrese el nombre de usuario a buscar"))
        usrnm.setText("");
    }//GEN-LAST:event_usrnmMousePressed

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        setColor(edit);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        resetColor(edit);
    }//GEN-LAST:event_editMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        setColor(search);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        resetColor(search);
    }//GEN-LAST:event_searchMouseExited
    
    private void usrnmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMouseReleased
        //nothing
    }//GEN-LAST:event_usrnmMouseReleased

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if(usrnm.getText().equals("") || usrnm.getText() == null || usrnm.getText().equals(" "))
            usrnm.setText("Ingrese el nombre de usuario a buscar");
    }//GEN-LAST:event_jTable1MousePressed
    
   
    /**
     * Edits de data of a client
     * @param evt 
     */
    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed
        String id;
        DatabaseConnection connection = new DatabaseConnection(Dashboard.user, Dashboard.pwd);
        
        try{ 
            int idcell = jTable1.getSelectedRow();
            if(idcell <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un usuario. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else{

                Statement stmt = connection.getConexion().createStatement();
                ResultSet counter = stmt.executeQuery("select ID, nombre, apellidos, nombre_plan " +
                                                    "from clientes, planes " + 
                                                    "where clientes.ID = planes.plan_id");

                int count = 0;
                while(counter.next()){count++;}

                String list[][] = new String[count][4];
                int i = 0;
                ResultSet re = stmt.executeQuery("select ID, nombre, apellidos, nombre_plan " +
                                                    "from clientes, planes " + 
                                                    "where clientes.ID = planes.plan_id");
                while(re.next()){
                    list[i][0] = re.getString(1);
                    list[i][1] = re.getString(2);
                    list[i][2] = re.getString(3);
                    list[i][3] = re.getString(4);
                    i++;
                }
                id = list[idcell][0];
                if(id == null || id.equals("")){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{

                     // Abrir secci??n
                    Medidas p1 = new Medidas(Integer.parseInt(id));
                    p1.setSize(750, 430);
                    p1.setLocation(0,0);

                    content.removeAll();
                    content.add(p1, BorderLayout.CENTER);
                    content.revalidate();
                    content.repaint();
                }
                
                stmt.close();
                connection.cierraConexion();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Medidas.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_editMousePressed
    
    /**
     * Searches for a client using the name
     * @param evt 
     */
    private void searchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMousePressed
        String inf = usrnm.getText();

        DatabaseConnection connection = new DatabaseConnection(Dashboard.user, Dashboard.pwd);
        
        int count = 0;
        
        try{
            Statement stmt = connection.getConexion().createStatement();
            ResultSet counter = stmt.executeQuery("select ID, nombre, apellidos, nombre_plan " +
                                                "from clientes, planes " + 
                                                "where clientes.ID = planes.plan_id and nombre like '"+inf+"%'");
            while(counter.next()){count++;}
            stmt.close();
        }
        catch(Exception sqle){
            System.out.println("Excepcion : " + sqle);
        }
        
        String list[][] = new String[count][4];
        int i = 0;
        
        try{
            Statement stmt = connection.getConexion().createStatement();
            ResultSet re = stmt.executeQuery("select ID, nombre, apellidos, nombre_plan " +
                                                "from clientes, planes " + 
                                                "where clientes.ID = planes.plan_id and nombre like '"+inf+"%'");
            while(re.next()){
                list[i][0] = re.getString(1);
                list[i][1] = re.getString(2);
                list[i][2] = re.getString(3);
                list[i][3] = re.getString(4);
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
            "ID", "Nombre", "Apellidos", "Plan"
        }));
    }//GEN-LAST:event_searchMousePressed

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
            ResultSet counter = stmt.executeQuery("select ID, nombre, apellidos, nombre_plan " +
                                                "from clientes, planes " + 
                                                "where clientes.ID = planes.plan_id");
            while(counter.next()){count++;}
            stmt.close();
        }
        catch(Exception sqle){
            System.out.println("Excepcion : " + sqle);
        }
        
        String list[][] = new String[count][4];
        int i = 0;
        
        try{
            Statement stmt = connection.getConexion().createStatement();
            ResultSet re = stmt.executeQuery("select ID, nombre, apellidos, nombre_plan " +
                                                "from clientes, planes " + 
                                                "where clientes.ID = planes.plan_id");
            while(re.next()){
                list[i][0] = re.getString(1);
                list[i][1] = re.getString(2);
                list[i][2] = re.getString(3);
                list[i][3] = re.getString(4);
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
            "ID", "Nombre", "Apellidos", "Plan"
        }));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel search;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables
}
