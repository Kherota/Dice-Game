/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicesimulator;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
/**
 *
 * @author Khero
 */
public class DiceFrame extends javax.swing.JFrame {
    
    
    public final static int RESET_GAME = 0;
    public final static int BEFORE_1ST_ROLL = 1;
    public final static int BEFORE_2ND_ROLL = 2;
    public final static int BEFORE_3RD_ROLL = 3;
    public final static int AFTER_3RD_ROLL = 4;
    public final static int SCORING = 5;
    public final static int GAME_OVER = 6;
    
            
     
    public DiceFrame() { //CONSTRACTOR
        initComponents();
        // PLACERAR ALLA KNAPPAR I VÅR ARRAY.
        holdButtons = new JToggleButton[NUM_DICE];
        holdButtons[0] = jToggleButton1;
        holdButtons[1] = jToggleButton2;
        holdButtons[2] = jToggleButton3;
        holdButtons[3] = jToggleButton4;
        holdButtons[4] = jToggleButton5;
        myDice = new Dice(NUM_DICE, NUM_SIDES);
        holdArray = new boolean [NUM_DICE]; 
        
        manageUIState(BEFORE_1ST_ROLL);
        
        
    }
    
    
    public void manageUIState(int nextState){
     switch (nextState)   {
         case RESET_GAME:
             break;
             
         case BEFORE_1ST_ROLL:
             clearAndDisableHoldButtons(); // Slår på holdButtons (TÄRNINGARENA) kanppen (återåtkommlig)
            
             
             jButtonRoll.setEnabled(true); // Slår av rullaknappen 
             
             clearHoldArray();// Rensar alla holdButtons (TÄNINGAR)
             break;
             
         case   BEFORE_2ND_ROLL:
             enableHoldButtons();  //  vet ej ännu !! TODO
             
             break;
             
             case BEFORE_3RD_ROLL:
             break;
             
         case AFTER_3RD_ROLL:
             jButtonRoll.setEnabled(false);
             break;
             
          case SCORING:
             break;    
             
          case GAME_OVER:
             break;    
             
          default: 
              JOptionPane.showMessageDialog(this,"Oj något gick fel");          
             break;
             
     }
     currentUIState = nextState;
    }
    
    private void clearAndDisableHoldButtons(){
        
        
        for (int i = 0; i < holdButtons.length; i++){
            holdButtons[i].setText("");
            holdButtons[i].setEnabled(false);
            holdButtons[i].setSelected(false);
        }
        
    }
    
    private void clearHoldArray(){
        
         for (int i = 0; i < holdArray.length; i++){
            holdArray[i] = (false);
         }
    }
    
    private void enableHoldButtons(){
        
        for (int i = 0; i < holdButtons.length; i++){
            holdButtons[i].setEnabled(true);
            
        }
    }
    
    public Dice myDice;

     public final static int NUM_DICE = 5;
     public final static int NUM_SIDES = 6;

     public JToggleButton[] holdButtons;
     public boolean[] holdArray;     
     public int currentUIState;
     
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRoll = new javax.swing.JButton();
        jButtonScore = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRoll.setText("Roll");
        jButtonRoll.setToolTipText("null");
        jButtonRoll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRollActionPerformed(evt);
            }
        });

        jButtonScore.setText("Score");
        jButtonScore.setToolTipText("null");
        jButtonScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScoreActionPerformed(evt);
            }
        });

        jToggleButton1.setToolTipText("null");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setToolTipText("null");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setToolTipText("null");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setToolTipText("null");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setToolTipText("null");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonScore, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRollActionPerformed
    
        for(int i = 0; i < NUM_DICE; i++){
        
            // Om användare inte håller tärningen 
        if(!holdArray[i]){
            myDice.rollDie(i);
            holdButtons[i].setText("" + myDice.getDieValue(i));
       
        }
    }
    
        if (currentUIState == BEFORE_1ST_ROLL){
        
            manageUIState (BEFORE_2ND_ROLL);
        }
        else if (currentUIState == BEFORE_2ND_ROLL){       
        
            manageUIState (BEFORE_3RD_ROLL);
        }
        else if (currentUIState == BEFORE_3RD_ROLL){       
       
            manageUIState (AFTER_3RD_ROLL);
        


        }
    
        
    }//GEN-LAST:event_jButtonRollActionPerformed

    private void jButtonScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScoreActionPerformed
       
        manageUIState(BEFORE_1ST_ROLL);
        
        
        
       /* jButtonRoll.setEnabled(true);
        
        
        for (int i = 0; i < holdArray.length; i++){
            
            if (!holdArray[i]){
                
                holdButtons[i].doClick();
            }
            holdArray[i] = false;
            holdButtons[i].setText("");
           
        }*/
    }//GEN-LAST:event_jButtonScoreActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
          holdArray[0] = !holdArray[0];   
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        holdArray[1] = !holdArray[1];
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
     holdArray[2] = !holdArray[2];
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
      holdArray[3] = !holdArray[3];
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        holdArray[4] = !holdArray[4];
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(DiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRoll;
    private javax.swing.JButton jButtonScore;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    // End of variables declaration//GEN-END:variables



}
