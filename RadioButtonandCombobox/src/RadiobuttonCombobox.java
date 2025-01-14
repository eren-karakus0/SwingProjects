
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author EREN
 */
public class RadiobuttonCombobox extends javax.swing.JFrame {

    Set<String> diller = new LinkedHashSet<String>();
    
    /**
     * Creates new form RadiobuttonCombobox
     */
    public RadiobuttonCombobox() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        dil_goster = new javax.swing.JButton();
        java_radio = new javax.swing.JRadioButton();
        python_radio = new javax.swing.JRadioButton();
        php_radio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dil_goster.setText("Göster");
        dil_goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dil_gosterActionPerformed(evt);
            }
        });

        buttonGroup1.add(java_radio);
        java_radio.setText("Java");

        buttonGroup1.add(python_radio);
        python_radio.setText("Python");

        buttonGroup1.add(php_radio);
        php_radio.setText("PHP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dil_goster)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(python_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(java_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(php_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(java_radio)
                .addGap(18, 18, 18)
                .addComponent(python_radio)
                .addGap(18, 18, 18)
                .addComponent(php_radio)
                .addGap(57, 57, 57)
                .addComponent(dil_goster)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dilGoster(){
        String message = "Şu diller seçildi: ";
        
        for(String dil:diller)
        {
            message += dil + " ";
        }
        JOptionPane.showMessageDialog(this, message);
        //radiobutton da sadece bir tane seçmemiz gerekiyor
        //bu nedenle buttongroup kullanırız
        //radiobuttonları groupbuttona ekleriz
    }
    private void dil_gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dil_gosterActionPerformed
        if(java_radio.isSelected())
        {
            diller.add("Java");
        }
        else
        {
            diller.remove("Java");
        }
        if(python_radio.isSelected())
        {
            diller.add("Python");
        }
        else
        {
            diller.remove("Python");
        }
        if(php_radio.isSelected())
        {
            diller.add("PHP");
        }
        else
        {
            diller.remove("PHP");
        }
        dilGoster();
    }//GEN-LAST:event_dil_gosterActionPerformed

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
            java.util.logging.Logger.getLogger(RadiobuttonCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadiobuttonCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadiobuttonCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadiobuttonCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadiobuttonCombobox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dil_goster;
    private javax.swing.JRadioButton java_radio;
    private javax.swing.JRadioButton php_radio;
    private javax.swing.JRadioButton python_radio;
    // End of variables declaration//GEN-END:variables
}
