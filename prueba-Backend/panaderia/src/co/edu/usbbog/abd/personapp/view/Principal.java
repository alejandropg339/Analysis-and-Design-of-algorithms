/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.abd.personapp.view;

//import co.edu.usbbog.ing.sis.persona.controller.logic.Unificador;
import co.edu.usbbog.abd.personapp.controller.logic.Unificador;
import co.edu.usbbog.abd.personapp.controller.persistence.Mostrar;
import co.edu.usbbog.abd.personapp.controller.persistence.ProductoDAO;
import co.edu.usbbog.abd.personapp.model.Producto;
import javax.swing.JPanel;

/**
 *
 * @author 304
 */
public class Principal extends javax.swing.JFrame {

    private Inicio inicioJPanel;
    private ProductoView pv;
    private Unificador pl;
    private ProductoDAO p3;
    private Mostrar p4;

    /**
     * Creates new form Principal
     */
    public Principal() {
        this.pl = new Unificador();
        this.p3 = new ProductoDAO();
        this.p4 = new Mostrar();
        this.setTitle("Grafica");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        iniciar();
        //initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    protected boolean actualizarProducto(Producto p) {
        return p3.actualizarProducto(p);
    }

    protected boolean registrarProducto(Producto p) {
        return p3.registrarProducto(p);
    }



    protected boolean visualizarGanancias() {
        return p4.visualizarGanancias();
    }
    
        protected boolean visualizarNomCant() {
        return p4.visualizarNomCant();
    }

    protected boolean visualizarProducto(String o) {
        return p4.visualizarProducto(o);
    }

    protected boolean eliminarProducto(String o) {
        return p3.eliminar(o);
    }

    protected void irAVehiculoView(JPanel jPanel) {
        remove(jPanel);
        pv = new ProductoView(this);
        pv.setVisible(true);
        add(pv);
        pack();
        setLocationRelativeTo(null);
    }

    public void iniciar() {
        inicioJPanel = new Inicio(this);
        inicioJPanel.setVisible(true);
        add(inicioJPanel);
        pack();
        setLocationRelativeTo(null);
    }
}

/**
 * this.pl = new Unificador(); this.setTitle("Grafica"); this.setVisible(true);
 * this.setDefaultCloseOperation(EXIT_ON_CLOSE); this.pv = new
 * PersonaView(this); this.pv.setVisible(true); this.add(pv); this.pack();
 * this.setLocationRelativeTo(null);
 */
