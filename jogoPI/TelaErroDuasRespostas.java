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
public class TelaErroDuasRespostas extends javax.swing.JFrame {

    /**
     * Creates new form TelaErroDuasRespostas
     */
    public TelaErroDuasRespostas() {//Essa tela deverá ir para  A PRÓXIMA PERGUNTA (TELAQUIZ)!!
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
        jLabel3 = new javax.swing.JLabel();
        botaoProximoErroDuasPerguntas = new javax.swing.JLabel();
        botaoProximoErroDuasRespostas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 96, 140, 44));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));
        getContentPane().add(botaoProximoErroDuasPerguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        botaoProximoErroDuasRespostas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoProximo.png"))); // NOI18N
        botaoProximoErroDuasRespostas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoProximoErroDuasRespostasMouseClicked(evt);
            }
        });
        getContentPane().add(botaoProximoErroDuasRespostas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 120, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/TelaErrouDuasRespostas.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1050, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProximoErroDuasRespostasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoProximoErroDuasRespostasMouseClicked
        Telaquiz botaoProximo = new Telaquiz();
            botaoProximo.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botaoProximoErroDuasRespostasMouseClicked

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
            java.util.logging.Logger.getLogger(TelaErroDuasRespostas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaErroDuasRespostas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaErroDuasRespostas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaErroDuasRespostas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaErroDuasRespostas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botaoProximoErroDuasPerguntas;
    private javax.swing.JLabel botaoProximoErroDuasRespostas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
