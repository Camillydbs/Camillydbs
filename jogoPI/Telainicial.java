/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoPI;

/**
 *
 * @author Camilly
 */
public class Telainicial extends javax.swing.JFrame {

    /**
     * Creates new form telas
     */
    public Telainicial() {
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

        iniciar = new javax.swing.JButton();
        instruções = new javax.swing.JButton();
        botaoIniciar = new javax.swing.JLabel();
        botaoInstrucoes = new javax.swing.JLabel();
        Telainicial = new javax.swing.JLabel();

        iniciar.setBackground(new java.awt.Color(255, 255, 255));
        iniciar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        iniciar.setForeground(new java.awt.Color(0, 102, 153));
        iniciar.setText("INICIAR");
        iniciar.setActionCommand("");
        iniciar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        instruções.setBackground(new java.awt.Color(255, 255, 255));
        instruções.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        instruções.setForeground(new java.awt.Color(0, 102, 153));
        instruções.setText("INSTRUÇÕES");
        instruções.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        instruções.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruçõesActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        setForeground(java.awt.Color.orange);
        setMinimumSize(new java.awt.Dimension(1045, 523));
        setPreferredSize(new java.awt.Dimension(1045, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoIniciar.png"))); // NOI18N
        botaoIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIniciarMouseClicked(evt);
            }
        });
        getContentPane().add(botaoIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 120, 40));

        botaoInstrucoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoInstrucoes.png"))); // NOI18N
        botaoInstrucoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoInstrucoesMouseClicked(evt);
            }
        });
        getContentPane().add(botaoInstrucoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 120, 40));

        Telainicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/telainicio.png"))); // NOI18N
        getContentPane().add(Telainicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void instruçõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instruçõesActionPerformed
     
    }//GEN-LAST:event_instruçõesActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        
    }//GEN-LAST:event_iniciarActionPerformed

    private void botaoIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIniciarMouseClicked
         Telapresentacaodojogo botaoIniciar = new Telapresentacaodojogo();
           botaoIniciar.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_botaoIniciarMouseClicked

    private void botaoInstrucoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoInstrucoesMouseClicked
        Telainstrucoes botaoInstrucoes = new Telainstrucoes();
        botaoInstrucoes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoInstrucoesMouseClicked

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
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telainicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Telainicial;
    private javax.swing.JLabel botaoIniciar;
    private javax.swing.JLabel botaoInstrucoes;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton instruções;
    // End of variables declaration//GEN-END:variables
}
