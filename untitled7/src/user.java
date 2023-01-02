/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tanta.losser;

/**
 *
 * @author ahmed
 */
public class DetalisAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DetalisAdmin
     */
    public DetalisAdmin() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddQuestion = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        Recources = new javax.swing.JLabel();
        MakeQuiz = new javax.swing.JLabel();
        Result = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddQuestion.setBackground(new java.awt.Color(255, 255, 255));
        AddQuestion.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        AddQuestion.setForeground(new java.awt.Color(255, 255, 255));
        AddQuestion.setIcon(new javax.swing.ImageIcon("/home/ahmed/Documents/PIC\\/add new question.png")); // NOI18N
        AddQuestion.setText("Add New Question");
        AddQuestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddQuestionMouseClicked(evt);
            }
        });
        getContentPane().add(AddQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 23, -1, -1));

        Search.setBackground(new java.awt.Color(255, 255, 255));
        Search.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setIcon(new javax.swing.ImageIcon("/home/ahmed/Documents/PIC\\/Search.jpg")); // NOI18N
        Search.setText("Search Question");
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 23, -1, -1));

        Recources.setBackground(new java.awt.Color(255, 255, 255));
        Recources.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Recources.setForeground(new java.awt.Color(255, 255, 255));
        Recources.setIcon(new javax.swing.ImageIcon("/home/ahmed/Documents/PIC\\/all questions.png")); // NOI18N
        Recources.setText("Resources");
        Recources.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Recources.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecourcesMouseClicked(evt);
            }
        });
        getContentPane().add(Recources, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 23, -1, -1));

        MakeQuiz.setBackground(new java.awt.Color(255, 255, 255));
        MakeQuiz.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        MakeQuiz.setForeground(new java.awt.Color(255, 255, 255));
        MakeQuiz.setIcon(new javax.swing.ImageIcon("/home/ahmed/Documents/PIC\\/Quiz.jpg")); // NOI18N
        MakeQuiz.setText("Make a Quiz");
        MakeQuiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MakeQuiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MakeQuizMouseClicked(evt);
            }
        });
        getContentPane().add(MakeQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 23, -1, -1));

        Result.setBackground(new java.awt.Color(255, 255, 255));
        Result.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Result.setForeground(new java.awt.Color(255, 255, 255));
        Result.setIcon(new javax.swing.ImageIcon("/home/ahmed/Documents/PIC\\/all student result.png")); // NOI18N
        Result.setText("All Student Result");
        Result.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Result, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 23, -1, -1));

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon("/home/ahmed/Documents/PIC\\/Logout.png")); // NOI18N
        Logout.setText("Logout");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1129, 23, -1, -1));

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon("/home/ahmed/Documents/PIC\\/Close.png")); // NOI18N
        Exit.setText("Exit");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1266, 23, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/ahmed/Documents/PIC\\/background2.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1390, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddQuestionMouseClicked
        AddQuestion login = new AddQuestion();
        this.dispose();
    }//GEN-LAST:event_AddQuestionMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        SearchQuestion login = new SearchQuestion();
        this.dispose();
    }//GEN-LAST:event_SearchMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        Homepage login = new Homepage();
        this.dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        LoginAdmin login = new LoginAdmin();
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void RecourcesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecourcesMouseClicked
        Resources login = new Resources();
        this.dispose();
    }//GEN-LAST:event_RecourcesMouseClicked

    private void MakeQuizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MakeQuizMouseClicked
        MakeAQuiz login = new MakeAQuiz();
        this.dispose();
    }//GEN-LAST:event_MakeQuizMouseClicked

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
            java.util.logging.Logger.getLogger(DetalisAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalisAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalisAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalisAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DetalisAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddQuestion;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel MakeQuiz;
    private javax.swing.JLabel Recources;
    private javax.swing.JLabel Result;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}