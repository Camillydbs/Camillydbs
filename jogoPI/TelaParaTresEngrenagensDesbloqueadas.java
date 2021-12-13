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
public class TelaParaTresEngrenagensDesbloqueadas extends javax.swing.JFrame {

    /**
     * Creates new form TelaParaTresEngrenagensDesbloqueadas
     */
    public TelaParaTresEngrenagensDesbloqueadas() {//Tela que deverá aparecer quando o jogador acertar TRÊS PERGUNTAS!!
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

        jLabel1 = new javax.swing.JLabel();
        botaoContinuarTresEngrenagens = new javax.swing.JLabel();
        botaoDesistirTresEngrenagens = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 545));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 140, -1, -1));

        botaoContinuarTresEngrenagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoContinuar.png"))); // NOI18N
        botaoContinuarTresEngrenagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarTresEngrenagensMouseClicked(evt);
            }
        });
        getContentPane().add(botaoContinuarTresEngrenagens, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 120, 40));

        botaoDesistirTresEngrenagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoDesistir.png"))); // NOI18N
        botaoDesistirTresEngrenagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDesistirTresEngrenagensMouseClicked(evt);
            }
        });
        getContentPane().add(botaoDesistirTresEngrenagens, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/TelaParaTresEngrenagensDesbloqueadas.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoContinuarTresEngrenagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarTresEngrenagensMouseClicked
        Telaquiz botaoContinuar = new Telaquiz();
            botaoContinuar.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botaoContinuarTresEngrenagensMouseClicked

    private void botaoDesistirTresEngrenagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDesistirTresEngrenagensMouseClicked
        JOptionPane.showMessageDialog (null, "Não desista. Tente Novamente!");
         System.exit(0);
    }//GEN-LAST:event_botaoDesistirTresEngrenagensMouseClicked

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
            java.util.logging.Logger.getLogger(TelaParaTresEngrenagensDesbloqueadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaParaTresEngrenagensDesbloqueadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaParaTresEngrenagensDesbloqueadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaParaTresEngrenagensDesbloqueadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaParaTresEngrenagensDesbloqueadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoContinuarTresEngrenagens;
    private javax.swing.JLabel botaoDesistirTresEngrenagens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
