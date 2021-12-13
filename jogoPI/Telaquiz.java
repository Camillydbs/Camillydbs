/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoPI;

import java.util.Random;


//Principal tela com os códigos de funcionamento do jogo
/**
 *
 * @author Camilly
 */
public class Telaquiz extends javax.swing.JFrame {
    static int score = 0;
    static int erro = 0;
    static String[] pergunta = new String[10];//O vetor criado (função global??)
    static int num;
    
   
  

     
    /**
     * Creates new form Telaquiz
     */
    public Telaquiz() {
        initComponents();
        setText(); //método que faz a pergunta aparecer no balao de pergunta
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        D = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        questao = new javax.swing.JLabel();
        BalaoPergunta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        D.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
        });
        jPanel1.add(D);
        D.setBounds(400, 322, 120, 40);

        C.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });
        jPanel1.add(C);
        C.setBounds(180, 322, 120, 40);

        A.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
        });
        jPanel1.add(A);
        A.setBounds(180, 250, 120, 40);

        B.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        B.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
        });
        jPanel1.add(B);
        B.setBounds(400, 250, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/einstein.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 30, 580, 360);
        jPanel1.add(questao);
        questao.setBounds(190, 50, 320, 150);

        BalaoPergunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/balaoPerguntas.png"))); // NOI18N
        jPanel1.add(BalaoPergunta);
        BalaoPergunta.setBounds(20, 40, 560, 180);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 80, 210, 100);

        label9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoVazio.png"))); // NOI18N
        jPanel1.add(label9);
        label9.setBounds(180, 250, 120, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoVazio.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(400, 250, 120, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoVazio.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 320, 120, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/botaoVazio.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(400, 320, 120, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoPI/imagens/imagens/telaquiz.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 0, 1060, 450);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1040, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //Essa parte se refere as alternativas e a label que está o número ou texto esta clicavel e do tamanho exato da imagem do botão, não é mais o botão em si q é clicavel
    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
       if (num == 3 || num == 9)    {
            score++;
            if(score == 0){
                TelaParaUmaEngrenagemDesbloqueada botao1 = new TelaParaUmaEngrenagemDesbloqueada();
                botao1.setVisible(true);
                this.dispose();
            }
            else if(score == 1){
                TelaParaDuasEngrenagensDesbloqueadas botao1 = new TelaParaDuasEngrenagensDesbloqueadas();
                botao1.setVisible(true);
                this.dispose();
            }
            else if(score == 2){
                TelaParaTresEngrenagensDesbloqueadas botao1 = new TelaParaTresEngrenagensDesbloqueadas();
                botao1.setVisible(true);
                this.dispose();
            }
            else if(score == 3){
                TelaParaQuatroEngrenagensDesbloqueadas botao1 = new TelaParaQuatroEngrenagensDesbloqueadas();
                botao1.setVisible(true);
                this.dispose();
            }
            else if(score == 4){
                TelaParaCincoEngrenagensDesbloqueadas botao1 = new TelaParaCincoEngrenagensDesbloqueadas();
                botao1.setVisible(true);
                this.dispose();
                score = 0;
            }
        }
        else if(erro == 0){
            erro++;
            TelaErroUmaResposta botao1 = new TelaErroUmaResposta();
                botao1.setVisible(true);
                this.dispose();
        }
        else if (erro == 1) {
            erro++;
            TelaErroDuasRespostas botao1 = new TelaErroDuasRespostas();
                botao1.setVisible(true);
                this.dispose();
        }
        else if (erro == 2) {
            TelaErroTresRespostas botao1 = new TelaErroTresRespostas();
                botao1.setVisible(true);
                this.dispose();
            erro = 0;
        }                     
                     
    }//GEN-LAST:event_AMouseClicked

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
         if (num == 4 || num == 7 || num == 8)    {
            score++;
            if(score == 0){
                TelaParaUmaEngrenagemDesbloqueada botao2 = new TelaParaUmaEngrenagemDesbloqueada();
                botao2.setVisible(true);
                this.dispose();
            }
            else if(score == 1){
                TelaParaDuasEngrenagensDesbloqueadas botao2 = new TelaParaDuasEngrenagensDesbloqueadas();
                botao2.setVisible(true);
                this.dispose();
            }
            else if(score == 2){
                TelaParaTresEngrenagensDesbloqueadas botao2 = new TelaParaTresEngrenagensDesbloqueadas();
                botao2.setVisible(true);
                this.dispose();
            }
            else if(score == 3){
                TelaParaQuatroEngrenagensDesbloqueadas botao2 = new TelaParaQuatroEngrenagensDesbloqueadas();
                botao2.setVisible(true);
                this.dispose();
            }
            else if(score == 4){
                TelaParaCincoEngrenagensDesbloqueadas botao2 = new TelaParaCincoEngrenagensDesbloqueadas();
                botao2.setVisible(true);
                this.dispose();
                score = 0;
            }
        }
        else if(erro == 0){
            erro++;
            TelaErroUmaResposta botao2 = new TelaErroUmaResposta();
                botao2.setVisible(true);
                this.dispose();
        }
        else if (erro == 1) {
            erro++;
            TelaErroDuasRespostas botao2 = new TelaErroDuasRespostas();
                botao2.setVisible(true);
                this.dispose();
        }
        else if (erro == 2) {
            TelaErroTresRespostas botao2 = new TelaErroTresRespostas();
                botao2.setVisible(true);
                this.dispose();
            erro = 0;
        }
    }//GEN-LAST:event_BMouseClicked

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
           if (num == 2 || num == 5 || num == 6)    {
            score++;
            if(score == 0){
                TelaParaUmaEngrenagemDesbloqueada botao3 = new TelaParaUmaEngrenagemDesbloqueada();
                botao3.setVisible(true);
                this.dispose();
            }
            else if(score == 1){
                TelaParaDuasEngrenagensDesbloqueadas botao3 = new TelaParaDuasEngrenagensDesbloqueadas();
                botao3.setVisible(true);
                this.dispose();
            }
            else if(score == 2){
                TelaParaTresEngrenagensDesbloqueadas botao3 = new TelaParaTresEngrenagensDesbloqueadas();
                botao3.setVisible(true);
                this.dispose();
            }
            else if(score == 3){
                TelaParaQuatroEngrenagensDesbloqueadas botao3 = new TelaParaQuatroEngrenagensDesbloqueadas();
                botao3.setVisible(true);
                this.dispose();
            }
            else if(score == 4){
                TelaParaCincoEngrenagensDesbloqueadas botao3 = new TelaParaCincoEngrenagensDesbloqueadas();
                botao3.setVisible(true);
                this.dispose();
                score = 0;
            }
        }
        else if(erro == 0){
            erro++;
            TelaErroUmaResposta botao3 = new TelaErroUmaResposta();
                botao3.setVisible(true);
                this.dispose();
        }
        else if (erro == 1) {
            erro++;
            TelaErroDuasRespostas botao3 = new TelaErroDuasRespostas();
                botao3.setVisible(true);
                this.dispose();
        }
        else if (erro == 2) {
            TelaErroTresRespostas botao3 = new TelaErroTresRespostas();
                botao3.setVisible(true);
                this.dispose();
            erro = 0;
        }
    }//GEN-LAST:event_CMouseClicked

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
           if (num == 0 || num == 1)    {
            score++;
            if(score == 0){
                TelaParaUmaEngrenagemDesbloqueada botao4 = new TelaParaUmaEngrenagemDesbloqueada();
                botao4.setVisible(true);
                this.dispose();
            }
            else if(score == 1){
                TelaParaDuasEngrenagensDesbloqueadas botao4 = new TelaParaDuasEngrenagensDesbloqueadas();
                botao4.setVisible(true);
                this.dispose();
            }
            else if(score == 2){
                TelaParaTresEngrenagensDesbloqueadas botao4 = new TelaParaTresEngrenagensDesbloqueadas();
                botao4.setVisible(true);
                this.dispose();
            }
            else if(score == 3){
                TelaParaQuatroEngrenagensDesbloqueadas botao4 = new TelaParaQuatroEngrenagensDesbloqueadas();
                botao4.setVisible(true);
                this.dispose();
            }
            else if(score == 4){
                TelaParaCincoEngrenagensDesbloqueadas botao4 = new TelaParaCincoEngrenagensDesbloqueadas();
                botao4.setVisible(true);
                this.dispose();
                score = 0;
            }
        }
        else if(erro == 0){
            erro++;
            TelaErroUmaResposta botao4 = new TelaErroUmaResposta();
                botao4.setVisible(true);
                this.dispose();
        }
        else if (erro == 1) {
            erro++;
            TelaErroDuasRespostas botao4 = new TelaErroDuasRespostas();
                botao4.setVisible(true);
                this.dispose();
        }
        else if (erro == 2) {
            erro++;
            TelaErroTresRespostas botao4 = new TelaErroTresRespostas();
                botao4.setVisible(true);
                this.dispose();
            erro = 0;
            
        }
    }//GEN-LAST:event_DMouseClicked

    public void setText(){ //Função que apresenta o método que vai colocar as perguntas no balao de pergunta
      
      
        pergunta [0] = "<html>Ao multiplicar esse número por qualquer outro, você vai ver que a resposta será sempre a mesma. Que número é esse?</html>";// a)5  b)100 c)2 d)0 *REespostas: D        
        pergunta [1] = "<html>Você viajou para uma época x que é 3 vezes mais antiga do que uma época y. Essas duas épocas juntas resultam em 48 a.c. Qual é a época x e y, respectivamente?"; //a)34 a.c. e 14 a.c.; b) 32 a.c. e 16 a.c.; c) 33 a.c. e 15 a.c.; d) 36 a.c. e 12 a.c. *Resposta:D
        pergunta [2] = "<html>Uma máquina do tempo “a” tem 6 botões a mais do que uma máquina do tempo “b”. As duas juntas têm 54 botões. Quantos tem cada uma?</html>"; //a) Máquina “a” tem 24, Máquina “b” 30; b)	Máquina “a” tem 28, Máquina “b” 22; c)	Máquina “a” tem 30, Máquina “b” 24; d)	Máquina “a” tem 36, Máquina “b” 30 *Resposta:C
        pergunta [3] = "<html>Uma vez me perguntaram a minha idade, eu respondi: “Daqui a 30 anos, terei três vezes a idade de agora.” Qual era a minha idade naquela época?</html>";//a)	15 anos; b)	12 anos; c)	14 anos; d)	13 anos *Resposta:A
        pergunta [4] = "<html>Conforme o uso, a temperatura da sua máquina do tempo subiu 6 graus, o que representa a metade da temperatura de antes. A quantos graus ela está agora?</html>";//a)	12 graus; b)	18 graus; c)	16 graus; d)	22 graus *Resposta: B
        pergunta [5] = "<html>Se sua máquina do tempo tivesse duas engrenagens a mais, o triplo desse número seria 450. Quantas engrenagens a sua máquina tem?</html>";//a)	165; b)	141; c)	148; d)	150 *Resposta: C
        pergunta [6] = "<html>No meio de suas pesquisas percebeu que o primeiro protótipo da máquina do tempo possuía metade da capacidade do segundo protótipo. Se a primeiro armazenava 20 quilos, juntando os dois, quantos quilos teremos?</html>";//a)   40 quilos; b)   12,5 quilos; c)   30 quilos; d)120 quilos *Resposta: C
        pergunta [7] = "<html>No começo das pesquisas você pegou 18 porcas para seus parafusos. Perdeu 5, mas comprou outras 13. Em outro dia emprestou 21 e ganhou 4. Quantas porcas para parafusos restaram?</html>";//a)30 b)9 c)10 d)1 *Resposta: B
        pergunta [8] = "<html>Quantas vezes o número 1 pode ser subtraído do número 1.111?</html>";//a)0 b)1 c)4 d)5 *Resposta: B
        pergunta [9] = "<html>Se 5 máquinas do tempo fizerem 5 viagens em 5 minutos. Quanto tempo levará 100 máquinas para fazer 100 viagens?</html>";//a)5 min b)30 min c)1 hora d)15 horas *Resposta: A
    
        Random aleatorio = new Random(); //Random que sorteia uma das "perguntas"
        num = aleatorio.nextInt(pergunta.length); //variavel que vai guardar a pergunta que foi sorteada
        questao.setText(pergunta[num]);// Vai colocar a pergunta sorteada la no balao da pergunta
        
         
  
  
switch (num){
    
   case 0:
         {   A.setText("5");
             B.setText("100");
             C.setText("2");
             D.setText("0");}//alternativa certa:D
          
        
    break;
    
   
    case 1:
         {   A.setText("34 e 14 a.c");
             B.setText("32 e 16 a.c");
             C.setText("33 e 15 a.c");
             D.setText("36 e 12 a.c");}//alternativa certa: D
         
    break;
   
    
    case 2:
         {   A.setText("a:24, b:30");
             B.setText("a:28, b:22");
             C.setText("a:30, b:24");//alternativa certa: C
             D.setText("a:36, b:30");}
    break;

    
    case 3:
        {    A.setText("15 anos");//alternativa certa: A
             B.setText("12 ano");
             C.setText("14 ano");
             D.setText("13 anos");}
    break;  
    
    
    case 4: 
         {   A.setText("12 graus");
             B.setText("18 graus");//alternativa certa: B
             C.setText("16 graus");
             D.setText("22 graus");}   
   break;
   
    
    case 5:
         {   A.setText("165");
             B.setText("141");
             C.setText("148");//alternativa certa: C
             D.setText("150");}
   break;
    
   
    case 6:
         {   A.setText("40 quilos");
             B.setText("12,5 quilos");
             C.setText("30 quilos");//alternativa certa: C
             D.setText("120 quilos");}
    break;
   
    
    case 7:
         {   A.setText("30");
             B.setText("9");//alternativa certa: B
             C.setText("10");
             D.setText("1");}
    break;
    
    
    case 8:
         {   A.setText("0");
             B.setText("1");//alternativa certa: B
             C.setText("4");
             D.setText("5");}
    break;
    
    
   case 9:
         {   A.setText("5 min");//alternativa certa: A
             B.setText("30 min");
             C.setText("1 hora");
             D.setText("15 horas");}
    break;
     }  
    }
   
  
    
   
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
            java.util.logging.Logger.getLogger(Telaquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telaquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telaquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telaquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
	
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telaquiz().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JLabel BalaoPergunta;
    public javax.swing.JLabel C;
    public javax.swing.JLabel D;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel questao;
    // End of variables declaration//GEN-END:variables
}
