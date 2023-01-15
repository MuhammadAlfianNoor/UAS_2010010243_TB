
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class PengisianKRS extends javax.swing.JFrame {
      private void kosongkan_form(){
        txtNPM.setEditable(true);
        txtNPM.setText(null);
        txtNama.setText(null);
        cbInterman.setSelectedItem(this);
        cbTeknologi.setSelectedItem(this);
        cbStruktur.setSelectedItem(this);
        cbSistem.setSelectedItem(this);
        cbJaringan.setSelectedItem(this);
        cbMatematika.setSelectedItem(this);
        cbTeknik.setSelectedItem(this);
       
    }
    
    private void tampilkan_data(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("NPM");
        model.addColumn("Nama");
        model.addColumn("Interman");
        model.addColumn("Teknologi");
        model.addColumn("Struktur");
        model.addColumn("Sistem");
        model.addColumn("Jaringan");
        model.addColumn("Matematika");
        model.addColumn("Teknik");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM inputkrs";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);  
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9)});
          
            }
            tabelKrs.setModel(model);
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
            
        }
    }
    
    
    public PengisianKRS() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNPM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cbInterman = new javax.swing.JComboBox<>();
        cbTeknologi = new javax.swing.JComboBox<>();
        cbStruktur = new javax.swing.JComboBox<>();
        cbSistem = new javax.swing.JComboBox<>();
        cbJaringan = new javax.swing.JComboBox<>();
        cbMatematika = new javax.swing.JComboBox<>();
        cbTeknik = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKrs = new javax.swing.JTable();
        btProfilMahasiswa = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKASI INPUT KRS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PENGAMBILAN KRS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 23, 282, 23));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NPM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 64, 69, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 101, 60, 24));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Teknik Kompilasi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 310, -1, 18));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Teknologi Grafika");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 158, -1, 22));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Struktur Data");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 187, -1, 22));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Sistem Terdistribusi");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 216, -1, 22));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Jaringan Komputer");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 245, -1, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Matematika Diskrit");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 276, -1, 22));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Interman");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 132, -1, -1));
        getContentPane().add(txtNPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 71, 138, -1));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 105, 286, -1));

        cbInterman.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbInterman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambil", "Tidak Ambil" }));
        cbInterman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIntermanActionPerformed(evt);
            }
        });
        getContentPane().add(cbInterman, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 131, 165, -1));

        cbTeknologi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbTeknologi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambil", "Tidak Ambil" }));
        getContentPane().add(cbTeknologi, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 160, 165, -1));

        cbStruktur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbStruktur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambil", "Tidak Ambil" }));
        getContentPane().add(cbStruktur, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 189, 165, -1));

        cbSistem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbSistem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambil", "Tidak Ambil" }));
        getContentPane().add(cbSistem, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 218, 165, -1));

        cbJaringan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbJaringan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambil", "Tidak Ambil" }));
        getContentPane().add(cbJaringan, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 248, 165, -1));

        cbMatematika.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbMatematika.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambil", "Tidak Ambil" }));
        getContentPane().add(cbMatematika, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 278, 165, -1));

        cbTeknik.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbTeknik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ambil", "Tidak Ambil" }));
        getContentPane().add(cbTeknik, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 307, 165, -1));

        tabelKrs.setBackground(new java.awt.Color(153, 255, 153));
        tabelKrs.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 0)));
        tabelKrs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelKrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKrsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKrs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 416, 712, 127));

        btProfilMahasiswa.setBackground(new java.awt.Color(153, 255, 51));
        btProfilMahasiswa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btProfilMahasiswa.setText("Profil Mahasiswa");
        btProfilMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProfilMahasiswaActionPerformed(evt);
            }
        });
        getContentPane().add(btProfilMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 346, -1, 43));

        btSimpan.setBackground(new java.awt.Color(0, 153, 51));
        btSimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 346, -1, 43));

        btEdit.setBackground(new java.awt.Color(0, 153, 51));
        btEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        getContentPane().add(btEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 346, -1, 43));

        btHapus.setBackground(new java.awt.Color(153, 153, 255));
        btHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 346, -1, 43));

        btbatal.setBackground(new java.awt.Color(255, 255, 153));
        btbatal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btbatal.setText("Batal");
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });
        getContentPane().add(btbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 346, -1, 43));

        btKeluar.setBackground(new java.awt.Color(153, 204, 255));
        btKeluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btKeluar.setText("Keluar");
        btKeluar.setToolTipText("");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 346, 91, 43));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentasi.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 710, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btProfilMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProfilMahasiswaActionPerformed
        // TODO add your handling code here:
        new profilmahasiswa().setVisible(true);
            javax.swing.JOptionPane.showMessageDialog(null, "SILAHKAN LENGKAPI DATA TERLEBIH DAHULU");
            dispose();
    }//GEN-LAST:event_btProfilMahasiswaActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_btKeluarActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "DELETE FRROM inputkrs WHERE npm='"+txtNPM.getText()+"'";
        java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "HAPUS DAtA BERHASIL.....");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
    }                                      
    tampilkan_data();
    kosongkan_form();
    }//GEN-LAST:event_btHapusActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
        // TODO add your handling code here:
       kosongkan_form();
    }//GEN-LAST:event_btbatalActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO inputkrs VALUES ('"+txtNPM.getText()+"','"+txtNama.getText()+"','"+cbInterman.getSelectedItem()+"','"+cbTeknologi.getSelectedItem()+"','"+cbStruktur.getSelectedItem()+"','"+cbSistem.getSelectedItem()+"','"+cbJaringan.getSelectedItem()+"'.'"+cbMatematika.getSelectedItem()+"','"+cbTeknik.getSelectedItem()+"')";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
             JOptionPane.showMessageDialog(null, "PROSES PENGAMBILAN KRS BERHASIL");
             tampilkan_data();
             kosongkan_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }    
    }//GEN-LAST:event_btSimpanActionPerformed

    private void cbIntermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIntermanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIntermanActionPerformed

    private void tabelKrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKrsMouseClicked
        // TODO add your handling code here:
        int baris = tabelKrs.rowAtPoint(evt.getPoint());
        String npm =tabelKrs.getValueAt(baris, 1).toString();
        txtNPM.setText(npm);
        
        String nama =tabelKrs.getValueAt(baris, 2).toString();
        txtNama.setText(nama);
        
        String interman =tabelKrs.getValueAt(baris, 3).toString();
        cbInterman.setSelectedItem(interman);
        
        String teknologi_grafika =tabelKrs.getValueAt(baris, 4).toString();
        cbTeknologi.setSelectedItem(teknologi_grafika);
        
        String struktur_data =tabelKrs.getValueAt(baris, 5).toString();
        cbStruktur.setSelectedItem(struktur_data);
        
        String sistem_terdistribusi =tabelKrs.getValueAt(baris, 6).toString();
        cbSistem.setSelectedItem(sistem_terdistribusi);
        
         String jaringan_komputer =tabelKrs.getValueAt(baris, 7).toString();
        cbJaringan.setSelectedItem(jaringan_komputer);
        
        String matematika_diskrit =tabelKrs.getValueAt(baris, 8).toString();
        cbMatematika.setSelectedItem(matematika_diskrit);
        
        String teknik_kompilasi =tabelKrs.getValueAt(baris, 9).toString();
        cbTeknik.setSelectedItem(teknik_kompilasi);
    }//GEN-LAST:event_tabelKrsMouseClicked

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        try{String sql = "UPDATE inputkrs SET npm ='"+txtNPM.getText()+"',nama='"+txtNama.getText()+"',interman='"+cbInterman.getSelectedItem()+"',teknologi_grafika='"+cbTeknologi.getSelectedItem()+"',struktur_data='"+cbStruktur.getSelectedItem()+"',sistem_terdistribusi='"+cbSistem.getSelectedItem()+"',jaringan_komputer='"+cbJaringan.getSelectedItem()+"',matematika_diskrit='"+cbMatematika.getSelectedItem()+"',teknik_kompilasi='"+cbTeknik.getSelectedItem()+"' WHERE npm = '"+txtNPM.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "EDIT DATA BERHASIL");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
    }//GEN-LAST:event_btEditActionPerformed
  tampilkan_data();
  kosongkan_form();

    }
    
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
            java.util.logging.Logger.getLogger(PengisianKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengisianKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengisianKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengisianKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengisianKRS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btProfilMahasiswa;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btbatal;
    private javax.swing.JComboBox<String> cbInterman;
    private javax.swing.JComboBox<String> cbJaringan;
    private javax.swing.JComboBox<String> cbMatematika;
    private javax.swing.JComboBox<String> cbSistem;
    private javax.swing.JComboBox<String> cbStruktur;
    private javax.swing.JComboBox<String> cbTeknik;
    private javax.swing.JComboBox<String> cbTeknologi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelKrs;
    private javax.swing.JTextField txtNPM;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
