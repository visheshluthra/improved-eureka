

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JOptionPane;
/**
 *
 * @author nandinigarg
 */
public class vdn extends javax.swing.JFrame {   

    private String start="X";
    private int x=0;
    private int o=0;
    
    private void score()
    {
jLabel2.setText(String.valueOf(x));
jLabel3.setText(String.valueOf(o));
    }
    
    private void playerturn()
    {
       if(start.equalsIgnoreCase("X"))
       {start="O";
       jLabel5.setText(start);}
       else
       {start="X";
       jLabel5.setText(start);}
        
    }
    
    private void winningGame()
    {
    
    String b1= jButton1.getText(); 
    String b2= jButton2.getText();
    String b3= jButton5.getText();
    
    String b4= jButton11.getText();
    String b5= jButton7.getText();
    String b6= jButton6.getText();
    
    String b7= jButton10.getText();
    String b8= jButton9.getText();
    String b9= jButton8.getText();
    {
    if(b1==("X") && b2==("X") && b3==("X") )
            {
            
            jButton1.setBackground(Color.ORANGE);
            jButton2.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player X wins!");
            x++;
            score();
            jButton3.doClick();
            }
    else if(b1==("O") && b2==("O") && b3==("O") )
            {
           
            jButton1.setBackground(Color.ORANGE);
            jButton2.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player O wins!");
            o++;
            score();
            jButton3.doClick();
            }
    }
    {
    if(b4==("X") && b5==("X") && b6==("X") )
            {
   
            jButton11.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player X wins!");
                     
            x++;
            score();
            jButton3.doClick();
            }
    else if(b4==("O") && b5==("O") && b6==("O") )
            {
          
            jButton11.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player O wins!");
              
            o++;
            score();
            jButton3.doClick();
            }
    }
    {
    if(b7==("X") && b8==("X") && b9==("X") )
            {
            
           
            jButton10.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player X wins!");
             x++;
            score();
            jButton3.doClick();
            }
   else if(b7==("O") && b8==("O") && b9==("O") )
            {
            
           
            jButton10.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player O wins!");
             o++;
            score();
            jButton3.doClick();
            }
    }
    { if(b1==("X") && b4==("X") && b7==("X") )
            {
        
            jButton1.setBackground(Color.ORANGE);
            jButton11.setBackground(Color.ORANGE);
            jButton10.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player X wins!");
                
            x++;
            score();
            jButton3.doClick();
            }
    if(b1==("O") && b4==("O") && b7==("O") )
            {
           
            jButton1.setBackground(Color.ORANGE);
            jButton11.setBackground(Color.ORANGE);
            jButton10.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player O wins!");
            
             
            o++;
            score();
            jButton3.doClick();
            }
    }
    {if(b2==("X") && b5==("X") && b8==("X") )
            {
          
            jButton2.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player X wins!");
              
            x++;
            score();
           jButton3.doClick();
            }
    else if(b2==("O") && b5==("O") && b8==("O") )
            {
         
            jButton2.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player O wins!");
               
            o++;
            score();
            jButton3.doClick();
            }}
    {if(b3==("X") && b6==("X") && b9==("X") )
            {
         
            jButton5.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player X wins!");
               
            x++;
            score();
            jButton3.doClick();
            }
    else if(b3==("O") && b6==("O") && b9==("O") )
            {
         
            jButton5.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player O wins!");
               
            o++;
            score();
            jButton3.doClick();
            }}
    { if(b1==("X") && b5==("X") && b9==("X") )
            {
          
            jButton1.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player X wins!");
              
            x++;
            score();
            jButton3.doClick();
            }
    else if(b1==("O") && b5==("O") && b9==("O") )
            {
         
            jButton1.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player O wins!");
               
            o++;
            score();
            jButton3.doClick();
            }}
    {if(b3==("X") && b5==("X") && b7==("X") )
            {
           
            jButton5.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton10.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player X wins!");
             x++;
            score();
            jButton3.doClick();
            }
    else if(b3==("O") && b5==("O") && b7==("O") )
            {
        
            jButton5.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton10.setBackground(Color.ORANGE);
            jOptionPane1.showMessageDialog(null,"Player X wins!");
             o++;
            score();
            jButton3.doClick();
    }}}
    
    
    /**
     * Creates new form vdn
     */
    public vdn() {
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
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jOptionPane1 = new javax.swing.JOptionPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("gaga");
        setBackground(new java.awt.Color(255, 102, 51));
        setMinimumSize(new java.awt.Dimension(200, 160));
        setPreferredSize(new java.awt.Dimension(2000, 1600));
        setSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/nandinigarg/Desktop/tttlogo1.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 190);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 200, 180, 160);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(190, 200, 180, 160);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(370, 200, 190, 160);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel12);
        jPanel12.setBounds(10, 360, 180, 160);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel13);
        jPanel13.setBounds(190, 360, 180, 160);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel14);
        jPanel14.setBounds(370, 360, 190, 160);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton10, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel15);
        jPanel15.setBounds(10, 520, 180, 160);

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton9, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel16);
        jPanel16.setBounds(190, 520, 180, 160);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel17);
        jPanel17.setBounds(370, 520, 190, 160);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(680, 510, 150, 70);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(780, 210, 140, 60);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(780, 280, 140, 60);

        jLabel4.setBackground(new java.awt.Color(102, 255, 0));
        jLabel4.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel4.setText("PLAYER WITH X :");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 210, 190, 60);

        jLabel6.setBackground(new java.awt.Color(102, 255, 0));
        jLabel6.setFont(new java.awt.Font("Bradley Hand", 1, 18)); // NOI18N
        jLabel6.setText("PLAYER WITH O :");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(580, 280, 190, 60);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(590, 350, 330, 150);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 51));
        jButton4.setText("EXIT");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(680, 600, 150, 70);
        getContentPane().add(jOptionPane1);
        jOptionPane1.setBounds(660, 360, 184, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jButton1.setText(null);jButton1.setBackground(null);
jButton2.setText(null);jButton2.setBackground(null);
jButton5.setText(null);jButton5.setBackground(null);
jButton11.setText(null);jButton11.setBackground(null);
jButton7.setText(null);jButton7.setBackground(null);
jButton6.setText(null);jButton6.setBackground(null);
jButton10.setText(null);jButton10.setBackground(null);
jButton9.setText(null);jButton9.setBackground(null);
jButton8.setText(null);jButton8.setBackground(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
 if(start.equalsIgnoreCase("X"))
{
   jButton1.setForeground(Color.RED);
           }
else
{
  
  jButton1.setForeground(Color.BLUE);
}
    jButton1.setText(start);
    playerturn();
        winningGame();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 if(start.equalsIgnoreCase("X"))
{
   jButton2.setForeground(Color.RED);
           }
else
{
  
  jButton2.setForeground(Color.BLUE);
}
    jButton2.setText(start);
    playerturn();   
    winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 if(start.equalsIgnoreCase("X"))
{
   jButton5.setForeground(Color.RED);
           }
else
{
  
  jButton5.setForeground(Color.BLUE);
}
    jButton5.setText(start);
    playerturn();  
    winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 if(start.equalsIgnoreCase("X"))
{
   jButton11.setForeground(Color.RED);
           }
else
{
  
  jButton11.setForeground(Color.BLUE);
}
    jButton11.setText(start);
    playerturn();  
    winningGame();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 if(start.equalsIgnoreCase("X"))
{
   jButton7.setForeground(Color.RED);
           }
else
{
  
  jButton7.setForeground(Color.BLUE);
}
    jButton7.setText(start);
    playerturn(); 
    winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 if(start.equalsIgnoreCase("X"))
{
   jButton6.setForeground(Color.RED);
           }
else
{
  
  jButton6.setForeground(Color.BLUE);
}
    jButton6.setText(start);
    playerturn(); 
    winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(start.equalsIgnoreCase("X"))
{
   jButton10.setForeground(Color.RED);
           }
else
{
  
  jButton10.setForeground(Color.BLUE);
}
    jButton10.setText(start);
    playerturn(); 
winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 if(start.equalsIgnoreCase("X"))
{
   jButton9.setForeground(Color.RED);
           }
else
{
  
  jButton9.setForeground(Color.BLUE);
}
    jButton9.setText(start);
    playerturn();   
    winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 if(start.equalsIgnoreCase("X"))
{
   jButton8.setForeground(Color.RED);
           }
else
{
  
  jButton8.setForeground(Color.BLUE);
}
    jButton8.setText(start);
    playerturn(); 
    winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(vdn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vdn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vdn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vdn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vdn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
