
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fabricio.pvilla
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form manu
     */
    public Menu() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCafe = new javax.swing.JMenu();
        itmTiposCafe = new javax.swing.JMenuItem();
        itmQualidadeCafe = new javax.swing.JMenuItem();
        itmEmpreasCafe = new javax.swing.JMenuItem();
        mnuReceitas = new javax.swing.JMenu();
        itmAdicionarReceitas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmListarReceitas = new javax.swing.JMenuItem();
        itmBuscarReceitas = new javax.swing.JMenuItem();
        itmAtendimento = new javax.swing.JMenu();

        jMenuItem5.setText("jMenuItem5");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Café");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        img.setName(""); // NOI18N
        getContentPane().add(img);
        img.setBounds(0, 0, 640, 0);
        img.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/café - Copia.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 600);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(null);

        mnuCafe.setText("Café");

        itmTiposCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graos-de-cafe (1).png"))); // NOI18N
        itmTiposCafe.setText("Tipos");
        itmTiposCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTiposCafeActionPerformed(evt);
            }
        });
        mnuCafe.add(itmTiposCafe);

        itmQualidadeCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xicara-de-cafe.png"))); // NOI18N
        itmQualidadeCafe.setText("Qualidade");
        itmQualidadeCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmQualidadeCafeActionPerformed(evt);
            }
        });
        mnuCafe.add(itmQualidadeCafe);

        itmEmpreasCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/companhia.png"))); // NOI18N
        itmEmpreasCafe.setText("Empresas");
        itmEmpreasCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEmpreasCafeActionPerformed(evt);
            }
        });
        mnuCafe.add(itmEmpreasCafe);

        jMenuBar1.add(mnuCafe);

        mnuReceitas.setText("Receitas");

        itmAdicionarReceitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adicionar.png"))); // NOI18N
        itmAdicionarReceitas.setText("Adicionar ");
        itmAdicionarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdicionarReceitasActionPerformed(evt);
            }
        });
        mnuReceitas.add(itmAdicionarReceitas);
        mnuReceitas.add(jSeparator1);

        itmListarReceitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarefa.png"))); // NOI18N
        itmListarReceitas.setText("Listar");
        itmListarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarReceitasActionPerformed(evt);
            }
        });
        mnuReceitas.add(itmListarReceitas);

        itmBuscarReceitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/procurar.png"))); // NOI18N
        itmBuscarReceitas.setText("Buscar");
        itmBuscarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarReceitasActionPerformed(evt);
            }
        });
        mnuReceitas.add(itmBuscarReceitas);

        jMenuBar1.add(mnuReceitas);

        itmAtendimento.setText("Ajuda");
        itmAtendimento.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                itmAtendimentoMenuSelected(evt);
            }
        });
        jMenuBar1.add(itmAtendimento);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(976, 658));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmTiposCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTiposCafeActionPerformed
        new Tipo().setVisible(true);
    }//GEN-LAST:event_itmTiposCafeActionPerformed

    private void itmListarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarReceitasActionPerformed
        new Listar().setVisible(true);
    }//GEN-LAST:event_itmListarReceitasActionPerformed

    private void itmEmpreasCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEmpreasCafeActionPerformed
        new Empresas().setVisible(true);
    }//GEN-LAST:event_itmEmpreasCafeActionPerformed

    private void itmBuscarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarReceitasActionPerformed
        String u;
        u = JOptionPane.showInputDialog("Receita a buscar");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
            
            PreparedStatement st = conectar.prepareStatement("SELeCT * FROM receitas WHERE nome = ? ");
            st.setString(1, u);
            ResultSet usuario = st.executeQuery();
            
            if (usuario.next()) {
                String nm, dsc;
                nm = usuario.getString("nome");
                dsc = usuario.getString("descrição");
                JOptionPane.showMessageDialog(null,
                        nm + "\n" +
                        "\n" + dsc 
                );
            }else{
                JOptionPane.showMessageDialog(null, "Receita não encontrada");
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showInternalMessageDialog(null, "entre em contato com o suporte e informe o erro: "+ ex.getMessage());
        }
    }//GEN-LAST:event_itmBuscarReceitasActionPerformed

    private void itmAdicionarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdicionarReceitasActionPerformed
        new Adicionar().setVisible(true);
    }//GEN-LAST:event_itmAdicionarReceitasActionPerformed

    private void itmAtendimentoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_itmAtendimentoMenuSelected
        new Ajuda().setVisible(true);
    }//GEN-LAST:event_itmAtendimentoMenuSelected

    private void itmQualidadeCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmQualidadeCafeActionPerformed
        new Qualidade().setVisible(true);
    }//GEN-LAST:event_itmQualidadeCafeActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JMenuItem itmAdicionarReceitas;
    private javax.swing.JMenu itmAtendimento;
    private javax.swing.JMenuItem itmBuscarReceitas;
    private javax.swing.JMenuItem itmEmpreasCafe;
    private javax.swing.JMenuItem itmListarReceitas;
    private javax.swing.JMenuItem itmQualidadeCafe;
    private javax.swing.JMenuItem itmTiposCafe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuCafe;
    private javax.swing.JMenu mnuReceitas;
    // End of variables declaration//GEN-END:variables
}

