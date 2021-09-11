
package javaapplication2;
import java.util.ArrayList;
import java.sql.*;  
import javax.swing.table.DefaultTableModel;

public class AdminGuncelleme extends javax.swing.JPanel {

    int combo;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DOMAIN_NAME = "localhost";
    static final String DB_NAME = "muzik_dosyam";
    static final String DB_URL = "jdbc:mysql://" + DOMAIN_NAME + "/" + DB_NAME;
    
     //  Database credentials
     static final String USER = "root";//MySQL connection'ın değerlerini değiştirdiyseniz, burayıda ona göre değiştirmelisiniz.
        static final String PASS = "cZ.;dIS1g";//MySQL connection'ın değerlerini değiştirdiyseniz, burayıda ona göre değiştirmelisiniz.
        
    public AdminGuncelleme() {
        initComponents();
         combo = 1;
        showList();
        combo = 2;
        showList();
        combo = 3;
        showList();
    }
public ArrayList<Onelist> useList(){
    ArrayList<Onelist> userList = new ArrayList<>();
     Connection conn = null;
       PreparedStatement psmt = null;
     
    try{
            String sql = null;
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
           
     
           // SELECT li sql querylerinde kullanıyoruz.
            Onelist olist;
              
            if(combo == 1){
            sql="SELECT * FROM oynatma_listesi";
            psmt = conn.prepareStatement(sql);
             ResultSet rs = psmt.executeQuery();
             while(rs.next()){
     olist = new Onelist(rs.getString(1), rs.getString(2), rs.getString(3));
            userList.add(olist);
            }
            
            }
            if(combo == 2){
            sql="SELECT * FROM sarki";
            psmt = conn.prepareStatement(sql);
             ResultSet rs = psmt.executeQuery();
            while(rs.next()){
     olist = new Onelist(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
            userList.add(olist);
            }
            
            }
            if(combo == 3){
            sql="SELECT * FROM kullanici";
            psmt = conn.prepareStatement(sql);
             ResultSet rs = psmt.executeQuery();
            while(rs.next()){
     olist = new Onelist(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            userList.add(olist);
            }
          
            } 
          
         
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    return userList;
    }
 public void showList(){
     
  ArrayList<Onelist> list = useList();
  DefaultTableModel a = null;
  int x = 0;
  Object[] row = null ;
  
  if(combo == 1){
     a = (DefaultTableModel) jTable1.getModel();  x = 3;
  row = new Object[x];
   int imax = list.size();
     for (int i = 0; i < imax; i++) {
         
         row[0] = list.get(i).getA1();
         row[1] = list.get(i).getA2();
         row[2] = list.get(i).getA3();
       
       a.addRow(row);
     }
  
  }
  if(combo == 2){
     a = (DefaultTableModel) jTable2.getModel(); x = 8;
  row = new Object[x];
   int imax = list.size();
     for (int i = 0; i < imax; i++) {
         row[0] = list.get(i).getA1();
         row[1] = list.get(i).getA2();
         row[2] = list.get(i).getA3();
         row[3] = list.get(i).getA4();
         row[4] = list.get(i).getA5();
         row[5] = list.get(i).getA6();
         row[6] = list.get(i).getA7();
         row[7] = list.get(i).getA8();
       a.addRow(row);
     }
  }
  if(combo == 3){
     a = (DefaultTableModel) jTable3.getModel(); x = 5;
   row = new Object[x];
   int imax = list.size();
     for (int i = 0; i < imax; i++) {
         
         row[0] = list.get(i).getA1();
         row[1] = list.get(i).getA2();
         row[2] = list.get(i).getA3();
         row[3] = list.get(i).getA4();
         row[4] = list.get(i).getA5();
      
       a.addRow(row);
     }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "no", "Kullanici ID", "Sarki ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sarki ID", "Sarki_Adi", "Tarih", "Sanatci", "Albüm", "Tür", "Sure", "Dinlenme_sayisi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanici_id", "Kullanici_adi", "Email", "Sifre", "Abonelik_turu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel2.setText("Kullanici ID");

        jLabel3.setText("Sarki ID");

        jButton1.setText("Guncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Sarki Adi");

        jLabel5.setText("Tarih");

        jLabel6.setText("Sanatci");

        jLabel7.setText("Album");

        jLabel8.setText("Tur");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "jazz", "pop", "klasik" }));

        jLabel9.setText("Sure (saniye)");

        jButton2.setText("Guncelle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Kullanici Adi");

        jLabel11.setText("Email");

        jLabel12.setText("Sifre");

        jLabel13.setText("Abonelik Turu");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Premium" }));

        jButton3.setText("Guncelle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("GERI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(47, 47, 47)
                        .addComponent(jTextField2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jTextField12)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField14)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(jTextField22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)))
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12)
                                            .addComponent(jButton2)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton3)
                        .addGap(38, 38, 38)
                        .addComponent(jButton4)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String a1 = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 1);
        String a2 = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 2);
        
        
        jTextField1.setText(a1);
        jTextField2.setText(a2);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
           String a1 = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 1);
           String a2 = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 2);
           String a3 = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 3);
           String a4 = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 4);
           String a5 = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 6);
           String a6 = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 5);
           if(a6.equals("jazz"))
           jComboBox1.setSelectedIndex(0);
           if(a6.equals("pop"))
           jComboBox1.setSelectedIndex(1);
           if(a6.equals("klasik"))
           jComboBox1.setSelectedIndex(2);
        jTextField11.setText(a1);
        jTextField12.setText(a2);
        jTextField13.setText(a3);
        jTextField14.setText(a4);
        jTextField16.setText(a5);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
           String a1 = (String) jTable3.getValueAt(jTable3.getSelectedRow(), 1);
           String a2 = (String) jTable3.getValueAt(jTable3.getSelectedRow(), 2);
           String a3 = (String) jTable3.getValueAt(jTable3.getSelectedRow(), 3);
           String a6 = (String) jTable3.getValueAt(jTable3.getSelectedRow(), 4);
           if(a6.equals("Normal"))
           jComboBox1.setSelectedIndex(0);
           if(a6.equals("Premium"))
           jComboBox1.setSelectedIndex(1);
         
        jTextField21.setText(a1);
        jTextField22.setText(a2);
        jTextField23.setText(a3);
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Connection conn = null;
    if(jTable1.isRowSelected(jTable1.getSelectedRow())){
    try{
        int no_id = Integer.parseInt((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
       
        int Kullanici_id_ch = Integer.parseInt(jTextField1.getText());
        int Sarki_id_ch = Integer.parseInt(jTextField2.getText());
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            String query = "update oynatma_listesi set idkullanici = ?, idsarki = ?   where no_id = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
             preparedStmt.setInt(1, Kullanici_id_ch); 
             preparedStmt.setInt(2, Sarki_id_ch);
             preparedStmt.setInt(3, no_id);
           preparedStmt.executeUpdate();
           conn.close();
          
           
           
            combo = 1;
            cleantable();
            showList();
      
        } catch (SQLException | ClassNotFoundException se) {
            //Handle errors for JDBC

        }
        //Handle errors for Class.forName
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Connection conn = null;
    if(jTable2.isRowSelected(jTable2.getSelectedRow())){
    try{
        int no_id = Integer.parseInt((String) jTable2.getValueAt(jTable2.getSelectedRow(), 0));
       
        int tarih_ch = Integer.parseInt(jTextField12.getText());
        int sure_ch = Integer.parseInt(jTextField16.getText());
        String Sarki_adi_ch = jTextField11.getText();
        String Sanatci_ch = jTextField13.getText();
        String Album_ch = jTextField14.getText();
        String tur_ch = jComboBox1.getSelectedItem().toString();
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            String query = "update sarki set Sarki_Adi = ?, Tarih = ?, Sanatci = ?, Albüm = ?, Tür = ?, Sure = ? where SarkiID = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
             preparedStmt.setString(1, Sarki_adi_ch); 
             preparedStmt.setInt(2, tarih_ch);
             preparedStmt.setString(3, Sanatci_ch);
             preparedStmt.setString(4, Album_ch);
             preparedStmt.setString(5, tur_ch);
             preparedStmt.setInt(6, sure_ch);
             preparedStmt.setInt(7, no_id);
             
           preparedStmt.executeUpdate();
           conn.close();
          
       
            combo = 2;
            cleantable();
            showList();
      
        } catch (SQLException | ClassNotFoundException se) {
            //Handle errors for JDBC

        }
        //Handle errors for Class.forName
        
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            Connection conn = null;
    if(jTable3.isRowSelected(jTable3.getSelectedRow())){
    try{
        int k_id = Integer.parseInt((String) jTable3.getValueAt(jTable3.getSelectedRow(), 0));
       
       
        String k_adi_ch = jTextField21.getText();
        String email_ch = jTextField22.getText();
        String sifre_ch = jTextField23.getText();
        String aboneliktur_ch = jComboBox2.getSelectedItem().toString();
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            String query = "update kullanici set Kullanici_adi = ?, Email = ?, Sifre = ?, Abonelik_turu = ? where Kullanici_id = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
             preparedStmt.setString(1, k_adi_ch); 
             preparedStmt.setString(2, email_ch);
             preparedStmt.setString(3, sifre_ch);
             preparedStmt.setString(4, aboneliktur_ch);
             preparedStmt.setInt(5, k_id);
         
             
           preparedStmt.executeUpdate();
           conn.close();
          
       
            combo = 3;
            cleantable();
            showList();
      
        } catch (SQLException | ClassNotFoundException se) {
            //Handle errors for JDBC

        }
        //Handle errors for Class.forName
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
           AdminPanel ap = new AdminPanel();
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);
        jTable1.setVisible(false);
        jTable2.setVisible(false);
        jTable3.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField11.setVisible(false);
        jTextField12.setVisible(false);
        jTextField13.setVisible(false);
        jTextField14.setVisible(false);
        jTextField16.setVisible(false);
        jTextField21.setVisible(false);
        jTextField22.setVisible(false);
        jTextField23.setVisible(false);
        ap.setBounds(0, 0, 1006, 623);
        add(ap);
        ap.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    // End of variables declaration//GEN-END:variables

    public void cleantable()
{
  DefaultTableModel dm = null;
  if(combo == 1)
     dm = (DefaultTableModel) jTable1.getModel();
  if(combo == 2)
     dm = (DefaultTableModel) jTable2.getModel(); 
  if(combo == 3)
     dm = (DefaultTableModel) jTable3.getModel();
int rowCount = dm.getRowCount();
//Remove rows one by one from the end of the table
for (int i = rowCount - 1; i >= 0; i--) {
    dm.removeRow(i);
}
}
public class Onelist{
String a1,a2,a3,a4,a5,a6,a7,a8;
    public Onelist(String a1,String a2, String a3, String a4, String a5, String a6, String a7, String a8){
   this.a1 = a1;
   this.a2 = a2;
   this.a3 = a3;
   this.a4 = a4;
   this.a5 = a5;
   this.a6 = a6;
   this.a7 = a7;
   this.a8 = a8;
    }
    public Onelist(String a1, String a2, String a3){
   
    this.a1 = a1;
   this.a2 = a2;
   this.a3 = a3;
  
    }
     public Onelist(String a1,String a2, String a3, String a4, String a5){
   
   this.a1 = a1;
   this.a2 = a2;
   this.a3 = a3;
   this.a4 = a4;
   this.a5 = a5;
    }
        
     
     public String getA1() {
            return a1;
        }
        public String getA2() {
            return a2;
        }

        public String getA3() {
            return a3;
        }

        public String getA4() {
            return a4;
        }

        public String getA5() {
            return a5;
        }

        public String getA6() {
            return a6;
        }

        public String getA7() {
            return a7;
        }

        public String getA8() {
            return a8;
        }
    
}
}