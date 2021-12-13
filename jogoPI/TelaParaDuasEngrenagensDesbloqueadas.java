/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoPI;

import javax.swing.JOptionPane;

/**
 *
 * @author Camilly
 */
public class TelaParaDuasEngrenagensDesbloqueadas extends javax.swing.JFrame {

    /**
     * Creates new form telaParaDuasEngrenagensDesbloqueadas
     */
    public TelaParaDuasEngrenagensDesbloqueadas() { //Tela que deverá aparecer quando o jogador acertar DUAS PERGUNTAS!!
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

        jLabel2 = new javax.swing.JLabel();
        botaoContinuarDuasEngrenagens = new javax.swing.JLabel();
        botaoDesistirDuasEngrenagens = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 34, 14));

        botaoContinuarDuasEngrenagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoContinuar.png"))); // NOI18N
        botaoContinuarDuasEngrenagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarDuasEngrenagensMouseClicked(evt);
            }
        });
        getContentPane().add(botaoContinuarDuasEngrenagens, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 120, 40));

        botaoDesistirDuasEngrenagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoDesistir.png"))); // NOI18N
        botaoDesistirDuasEngrenagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDesistirDuasEngrenagensMouseClicked(evt);
            }
        });
        getContentPane().add(botaoDesistirDuasEngrenagens, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/TelaParaDuasEngrenagensDesbloqueadas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoContinuarDuasEngrenagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarDuasEngrenagensMouseClicked
        Telaquiz botaoContinuar = new Telaquiz();
            botaoContinuar.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botaoContinuarDuasEngrenagensMouseClicked

    private void botaoDesistirDuasEngrenagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDesistirDuasEngrenagensMouseClicked
        JOptionPane.showMessageDialog (null, "Não desista. Tente Novamente!");
         System.exit(0);
    }//GEN-LAST:event_botaoDesistirDuasEngrenagensMouseClicked

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
            java.util.logging.Logger.getLogger(TelaParaDuasEngrenagensDesbloqueadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaParaDuasEngrenagensDesbloqueadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaParaDuasEngrenagensDesbloqueadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaParaDuasEngrenagensDesbloqueadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaParaDuasEngrenagensDesbloqueadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoContinuarDuasEngrenagens;
    private javax.swing.JLabel botaoDesistirDuasEngrenagens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}