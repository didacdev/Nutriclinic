
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
 * Muestra los datos de los clientes registrados y lanza la ventana de registro y edición de datos
 * @author diego
 */
public class Clientes extends javax.swing.JPanel {

    
    
    public Clientes() {
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
        nuevo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Clientes");
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
        jLabel2.setText("Editar");
        edit.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 80, -1));

        nuevo.setBackground(new java.awt.Color(18, 90, 173));
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nuevo.setMinimumSize(new java.awt.Dimension(70, 25));
        nuevo.setPreferredSize(new java.awt.Dimension(70, 25));
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevoMousePressed(evt);
            }
        });
        nuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nuevo");
        nuevo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 80, -1));

        clientes.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        clientes.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Nombre", "Apellidos", "Fecha nacimiento", "Teléfono", "Email", "Municipio", "Provincia", "Fecha de inicio", "Fecha de finalización"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientes.getTableHeader().setReorderingAllowed(false);
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(clientes);
        if (clientes.getColumnModel().getColumnCount() > 0) {
            clientes.getColumnModel().getColumn(0).setPreferredWidth(10);
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

    private void nuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseEntered
        setColor(nuevo);
    }//GEN-LAST:event_nuevoMouseEntered

    private void nuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseExited
        resetColor(nuevo);
    }//GEN-LAST:event_nuevoMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        setColor(search);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        resetColor(search);
    }//GEN-LAST:event_searchMouseExited
    
    /** 
     * Shows the register window
     * @param evt 
     */
    private void nuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMousePressed
        
        UpCliente p1 = new UpCliente();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_nuevoMousePressed

    private void usrnmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMouseReleased
        //nothing
    }//GEN-LAST:event_usrnmMouseReleased

    private void clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMousePressed
        if(usrnm.getText().equals("") || usrnm.getText() == null || usrnm.getText().equals(" "))
            usrnm.setText("Ingrese el nombre de usuario a buscar");
    }//GEN-LAST:event_clientesMousePressed
    
   
    /**
     * Edits de data of a client
     * @param evt 
     */
    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed
        
        DatabaseConnection connection = new DatabaseConnection(Dashboard.user, Dashboard.pwd);
        
        try {
            int idcell = clientes.getSelectedRow();
            if(idcell <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a editar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                
                Statement stmt = connection.getConexion().createStatement();
                ResultSet counter = stmt.executeQuery("select clientes.ID, nombre, apellidos, fecha_nacimiento, fecha_inicio, fecha_final, telefono, email, municipio, provincia, nombre_plan, bono\n" +
                                                    "from clientes, contactos, residencias\n" +
                                                    "natural left outer join\n" +
                                                    "((select plan_id as id, nombre_plan, bono\n" +
                                                    "from planes \n" +
                                                    "left join bonos\n" +
                                                    "on plan_id = bonos_id)\n" +
                                                    "union\n" +
                                                    "(select bonos_id as id, nombre_plan, bono\n" +
                                                    "from planes \n" +
                                                    "right join bonos\n" +
                                                    "on plan_id = bonos_id)) as a\n" +
                                                    "where clientes.ID = contacto_id and clientes.ID = residencias.residencia_id and clientes.ID = a.id;");

                int count = 0;
                while(counter.next()){count++;}

                String list[][] = new String[count][12];
                int i = 0;
                ResultSet re = stmt.executeQuery("select clientes.ID, nombre, apellidos, fecha_nacimiento, fecha_inicio, fecha_final, telefono, email, municipio, provincia, nombre_plan, bono\n" +
                                                "from clientes, contactos, residencias\n" +
                                                "natural left outer join\n" +
                                                "((select plan_id as id, nombre_plan, bono\n" +
                                                "from planes \n" +
                                                "left join bonos\n" +
                                                "on plan_id = bonos_id)\n" +
                                                "union\n" +
                                                "(select bonos_id as id, nombre_plan, bono\n" +
                                                "from planes \n" +
                                                "right join bonos\n" +
                                                "on plan_id = bonos_id)) as a\n" +
                                                "where clientes.ID = contacto_id and clientes.ID = residencias.residencia_id and clientes.ID = a.id;");
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
                    i++;
                }
                
                String id = list[idcell][0];
                if(id == null || id.equals("")){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    String usid = list[idcell][0];
                    String usname = list[idcell][1];
                    String usapellidos= list[idcell][2];
                    String ufechaNacimiento = list[idcell][3];
                    String ufechaInicio = list[idcell][4];
                    String ufechaFinal = list[idcell][5];
                    String uTelefono = list[idcell][6];
                    String uEmail = list[idcell][7];
                    String uMunicipio = list[idcell][8];
                    String uProvincia = list[idcell][9];
                    String uPlan = list[idcell][10];
                    String uBono = list[idcell][11];
                    
                    UpCliente p1 = new UpCliente(usid, usname, usapellidos, ufechaNacimiento, ufechaInicio, ufechaFinal, uTelefono, uEmail, uMunicipio, uProvincia, uPlan, uBono);
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
            ResultSet counter = stmt.executeQuery("select ID, nombre, apellidos, fecha_nacimiento, telefono, email, municipio, provincia, fecha_inicio, fecha_final " +
                                                "from clientes, contactos, residencias " + 
                                                "where clientes.ID = contactos.contacto_id and clientes.ID = residencias.residencia_id and nombre like '"+inf+"%'");
            while(counter.next()){count++;}
            stmt.close();
        }
        catch(Exception sqle){
            System.out.println("Excepcion : " + sqle);
        }
        
        String list[][] = new String[count][10];
        int i = 0;
        
        try{
            Statement stmt = connection.getConexion().createStatement();
            ResultSet re = stmt.executeQuery("select ID, nombre, apellidos, fecha_nacimiento, telefono, email, municipio, provincia, fecha_inicio, fecha_final " +
                                                "from clientes, contactos, residencias " + 
                                                "where clientes.ID = contactos.contacto_id and clientes.ID = residencias.residencia_id and nombre like '"+inf+"%'");
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
                i++;
            }
            stmt.close();
            connection.cierraConexion();
        }
        catch(Exception sqle){
            System.out.println("Excepcion : " + sqle);
        }
        
        clientes.setModel(new javax.swing.table.DefaultTableModel(
        list,
        new String [] {
            "ID", "Nombre", "Apellidos", "Fecha de nacimiento", "Teléfono", "Email", "Municipio", "Provincia", "Fecha de inicio", "Fecha de finalización"
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
            ResultSet counter = stmt.executeQuery("select ID, nombre, apellidos, fecha_nacimiento, telefono, email, municipio, provincia, fecha_inicio, fecha_final " +
                                                "from clientes, contactos, residencias " + 
                                                "where clientes.ID = contactos.contacto_id and clientes.ID = residencias.residencia_id");
            while(counter.next()){count++;}
            stmt.close();
        }
        catch(Exception sqle){
            System.out.println("Excepcion : " + sqle);
        }
        
        String list[][] = new String[count][10];
        int i = 0;
        
        try{
            Statement stmt = connection.getConexion().createStatement();
            ResultSet re = stmt.executeQuery("select ID, nombre, apellidos, fecha_nacimiento, telefono, email, municipio, provincia, fecha_inicio, fecha_final " +
                                                "from clientes, contactos, residencias " + 
                                                "where clientes.ID = contactos.contacto_id and clientes.ID = residencias.residencia_id");
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
                i++;
            }
            stmt.close();
            connection.cierraConexion();
        }
        catch(Exception sqle){
            System.out.println("Excepcion : " + sqle);
        }
        
        clientes.setModel(new javax.swing.table.DefaultTableModel(
        list,
        new String [] {
            "ID", "Nombre", "Apellidos", "Fecha de nacimiento", "Teléfono", "Email", "Municipio", "Provincia", "Fecha de inicio", "Fecha de finalización"
        }));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JTable clientes;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel nuevo;
    private javax.swing.JPanel search;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables
}
