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
public class Telagameover extends javax.swing.JFrame {

    /**
     * Creates new form telaGameOver
     */
    public Telagameover() {
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

        botaoReiniciar2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoSair2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Telagamover = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoReiniciar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoReiniciar.png"))); // NOI18N
        botaoReiniciar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoReiniciar2MouseClicked(evt);
            }
        });
        getContentPane().add(botaoReiniciar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 120, 40));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        botaoSair2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoSair.png"))); // NOI18N
        botaoSair2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSair2MouseClicked(evt);
            }
        });
        getContentPane().add(botaoSair2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/caveira.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 520, 230));

        Telagamover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/telagameover.png"))); // NOI18N
        getContentPane().add(Telagamover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1050, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSair2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSair2MouseClicked
         JOptionPane.showMessageDialog (null, "Não desista. Tente Novamente!");
         System.exit(0); //código para fazer sair da tela
    }//GEN-LAST:event_botaoSair2MouseClicked

    private void botaoReiniciar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoReiniciar2MouseClicked
         Telainicial botaoReiniciar2 = new Telainicial();
           botaoReiniciar2.setVisible(true);
           this.dispose();        
    }//GEN-LAST:event_botaoReiniciar2MouseClicked

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
            java.util.logging.Logger.getLogger(Telagameover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telagameover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telagameover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telagameover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telagameover().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Telagamover;
    private javax.swing.JLabel botaoReiniciar2;
    private javax.swing.JLabel botaoSair2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
