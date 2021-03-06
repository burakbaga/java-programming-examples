
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bagat
 */
public class SiparisUygulamasi extends javax.swing.JFrame {

    Map<String, Integer> siparisler = new LinkedHashMap<String, Integer>();

    /**
     * Creates new form SiparisUygulamasi
     */
    public SiparisUygulamasi() {
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

        iskender = new javax.swing.JCheckBox();
        beyti = new javax.swing.JCheckBox();
        ayran = new javax.swing.JCheckBox();
        salata = new javax.swing.JCheckBox();
        goster = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iskender.setText("İskender - 15 TL");

        beyti.setText("Beyti - 12 TL");

        ayran.setText("Ayran -2 TL");

        salata.setText("Salata - 5TL");

        goster.setText("Siparisleri Göster");
        goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(salata)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iskender)
                            .addComponent(beyti, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ayran, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(goster))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(iskender)
                .addGap(18, 18, 18)
                .addComponent(beyti)
                .addGap(18, 18, 18)
                .addComponent(salata)
                .addGap(18, 18, 18)
                .addComponent(ayran)
                .addGap(33, 33, 33)
                .addComponent(goster)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void siparisleriGoster(){
        String message =" ";
        int tutar = 0;
        if(siparisler.isEmpty()){
            message = "Siparişiniz bulunmamaktadır.";
        }else{
            message +="Siparişler \n ";
            for(Map.Entry<String,Integer> entry : siparisler.entrySet())
            {
                message += entry.getKey()+"\n";
                tutar+=entry.getValue();
            }
            
            message+="Toplam tutar: "+tutar+ " TL";
                }
        
        JOptionPane.showMessageDialog(this, message);
    }
    
    private void gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterActionPerformed

        if (iskender.isSelected()) {
            siparisler.put("İskender", 15);

        } else {
            siparisler.remove("iskender");
        }
        if (beyti.isSelected()) {
            siparisler.put("beyti", 12);

        } else {
            siparisler.remove("beyti");
        }
        if (salata.isSelected()) {
            siparisler.put("salata", 5);

        } else {
            siparisler.remove("salata");
        }
        if (ayran.isSelected()) {
            siparisler.put("ayran", 2);

        } else {
            siparisler.remove("ayran");
        }

        siparisleriGoster();

    }//GEN-LAST:event_gosterActionPerformed

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
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ayran;
    private javax.swing.JCheckBox beyti;
    private javax.swing.JButton goster;
    private javax.swing.JCheckBox iskender;
    private javax.swing.JCheckBox salata;
    // End of variables declaration//GEN-END:variables
}
