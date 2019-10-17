package proyecto;

import java.awt.Color;

/**
 *
 * @author 18PROGB0073
 */
public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        initComponents();
    this.getContentPane().setBackground(Color.darkGray); 
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        label1 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuNeuronas = new javax.swing.JMenu();
        mniPartes = new javax.swing.JMenuItem();
        mniFunciones = new javax.swing.JMenuItem();
        mniCarac = new javax.swing.JMenuItem();
        mnuCelulasGliales = new javax.swing.JMenu();
        mniSchwann = new javax.swing.JMenuItem();
        mniOli = new javax.swing.JMenuItem();
        mniMicroglia = new javax.swing.JMenuItem();
        mniAstrocitos = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/imagen002.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/imagen001.jpg"))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Texto de prueba");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 102, 102));
        label1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        label1.setText("Células del sistema nervioso");

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        mnuNeuronas.setText("Neuronas");

        mniPartes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mniPartes.setText("Partes de la neurona ");
        mniPartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPartesActionPerformed(evt);
            }
        });
        mnuNeuronas.add(mniPartes);

        mniFunciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mniFunciones.setText("Funciones de la neurona ");
        mniFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFuncionesActionPerformed(evt);
            }
        });
        mnuNeuronas.add(mniFunciones);

        mniCarac.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mniCarac.setText("Caracterisiticas Morfologicas de la Neurona ");
        mniCarac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCaracActionPerformed(evt);
            }
        });
        mnuNeuronas.add(mniCarac);

        jMenuBar1.add(mnuNeuronas);

        mnuCelulasGliales.setText("Celulas gliales");

        mniSchwann.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mniSchwann.setText("Celulas de Schwann");
        mnuCelulasGliales.add(mniSchwann);

        mniOli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mniOli.setText("Oligondedrocitos");
        mnuCelulasGliales.add(mniOli);

        mniMicroglia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mniMicroglia.setText("Microglía");
        mnuCelulasGliales.add(mniMicroglia);

        mniAstrocitos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mniAstrocitos.setText("Astrocitos");
        mnuCelulasGliales.add(mniAstrocitos);

        jMenuBar1.add(mnuCelulasGliales);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2))
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFuncionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniFuncionesActionPerformed

    private void mniCaracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCaracActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniCaracActionPerformed

    private void mniPartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPartesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniPartesActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    private javax.swing.JMenuItem mniAstrocitos;
    private javax.swing.JMenuItem mniCarac;
    private javax.swing.JMenuItem mniFunciones;
    private javax.swing.JMenuItem mniMicroglia;
    private javax.swing.JMenuItem mniOli;
    private javax.swing.JMenuItem mniPartes;
    private javax.swing.JMenuItem mniSchwann;
    private javax.swing.JMenu mnuCelulasGliales;
    private javax.swing.JMenu mnuNeuronas;
    // End of variables declaration//GEN-END:variables
}
