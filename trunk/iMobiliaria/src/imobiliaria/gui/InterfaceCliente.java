/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InterfaceCliente.java
 *
 * Created on 06/07/2010, 21:54:04
 */

package imobiliaria.gui;

import imobiliaria.entidades.Cliente;
import imobiliaria.controladores.*;
import imobiliaria.entidades.Imovel;
import imobiliaria.entidades.Sistema;
import javax.swing.JOptionPane;
/**
 *
 * @author bruno
 */
public class InterfaceCliente extends javax.swing.JFrame {

    //Atributos
        private Sistema sis;
	private Cliente cliente;
    /** Creates new form InterfaceCliente */
    public InterfaceCliente(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        sis = new Sistema();
	try {
	    sis.atualizaDados();
	} catch (Exception e) {
	    System.out.println("Erro: " + e.getMessage());
	}
        setLocationRelativeTo(null);
        setTitle("Bem Vindo Cliente");
        atualizaImoveis();
        atualizaPedidos();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_NomeDoCliente = new javax.swing.JLabel();
        JTP_PainelPrincipal = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLI_ImoveisImob = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        JLI_Pedidos = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        JLI_Alugueis = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        JLI_ComprasDoCliente = new javax.swing.JList();
        JB_FazPedido = new javax.swing.JButton();
        JB_CancelaPedido = new javax.swing.JButton();
        JB_CancelaAluguel = new javax.swing.JButton();
        JB_Desloga = new javax.swing.JButton();
        JB_VerificaDadosCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JL_NomeDoCliente.setText("Cliente: ");

        JLI_ImoveisImob.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JLI_ImoveisImob);

        JTP_PainelPrincipal.addTab("Imoveis", jScrollPane1);

        JLI_Pedidos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(JLI_Pedidos);

        JTP_PainelPrincipal.addTab("Pedidos", jScrollPane2);

        JLI_Alugueis.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(JLI_Alugueis);

        JTP_PainelPrincipal.addTab("Alugueis", jScrollPane3);

        JLI_ComprasDoCliente.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(JLI_ComprasDoCliente);

        JTP_PainelPrincipal.addTab("Histórico Compras", jScrollPane4);

        JB_FazPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobiliaria/images/okIcon.png"))); // NOI18N
        JB_FazPedido.setText("Fazer Pedido");
        JB_FazPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_FazPedidoActionPerformed(evt);
            }
        });

        JB_CancelaPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobiliaria/images/exitIcon.png"))); // NOI18N
        JB_CancelaPedido.setText("Cancelar Pedido");
        JB_CancelaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelaPedidoActionPerformed(evt);
            }
        });

        JB_CancelaAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobiliaria/images/exitIcon.png"))); // NOI18N
        JB_CancelaAluguel.setText("Cancelar Aluguel");
        JB_CancelaAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelaAluguelActionPerformed(evt);
            }
        });

        JB_Desloga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobiliaria/images/backIcon.png"))); // NOI18N
        JB_Desloga.setText("Deslogar");
        JB_Desloga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_DeslogaActionPerformed(evt);
            }
        });

        JB_VerificaDadosCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobiliaria/images/procuraIcon.png"))); // NOI18N
        JB_VerificaDadosCliente.setText("Ver Seus Dados ");
        JB_VerificaDadosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_VerificaDadosClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(JL_NomeDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(JB_Desloga, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242)
                        .addComponent(JB_VerificaDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JTP_PainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_CancelaPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(JB_CancelaAluguel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(JB_FazPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_NomeDoCliente)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JTP_PainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(JB_FazPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JB_CancelaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JB_CancelaAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Desloga, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(JB_VerificaDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Imovel[] mostraImoveis(){

        Imovel[] imoveis = ControladorImovel.getInstance().listaImoveisGUI();
        return imoveis;
    }

    public void atualizaImoveis(){

        JLI_ImoveisImob.setModel(new javax.swing.AbstractListModel() {
            final Imovel[] strings = mostraImoveis();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });

    }

    private Imovel[] mostraPedidos(Cliente cliente){
        Imovel[] pedidos = ControladorPedidos.getInstance().listaDePedidosGUI(cliente.getCpf());
        return pedidos;
    }

    public void atualizaPedidos(){
        
        JLI_Pedidos.setModel(new javax.swing.AbstractListModel() {
            final Imovel[] strings = mostraPedidos(cliente);
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });

    }

    private void JB_FazPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_FazPedidoActionPerformed
        Imovel imovelPedido = (Imovel) JLI_ImoveisImob.getSelectedValue();
        System.out.print(imovelPedido.toString());
        try{
            ControladorPedidos.getInstance().adicionaPedido(imovelPedido.getRegistroImovel() + "", cliente.getCpf());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Registro de Imóvel Invalido!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        atualizaPedidos();
        sis.salvarDados();
    }//GEN-LAST:event_JB_FazPedidoActionPerformed

    private void JB_CancelaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelaPedidoActionPerformed
        Imovel imovelPedido = (Imovel) JLI_ImoveisImob.getSelectedValue();
        System.out.print(imovelPedido.toString());
        try{
            ControladorPedidos.getInstance().removePedido(imovelPedido.getRegistroImovel() + "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Registro de Imóvel Invalido!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        atualizaPedidos();
        sis.salvarDados();
    }//GEN-LAST:event_JB_CancelaPedidoActionPerformed

    private void JB_CancelaAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelaAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_CancelaAluguelActionPerformed

    private void JB_DeslogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_DeslogaActionPerformed
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_JB_DeslogaActionPerformed

    private void JB_VerificaDadosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_VerificaDadosClienteActionPerformed
        setVisible(false);
        new InterfaceDadosCliente(cliente).setVisible(true);
    }//GEN-LAST:event_JB_VerificaDadosClienteActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCliente(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_CancelaAluguel;
    private javax.swing.JButton JB_CancelaPedido;
    private javax.swing.JButton JB_Desloga;
    private javax.swing.JButton JB_FazPedido;
    private javax.swing.JButton JB_VerificaDadosCliente;
    private javax.swing.JList JLI_Alugueis;
    private javax.swing.JList JLI_ComprasDoCliente;
    private javax.swing.JList JLI_ImoveisImob;
    private javax.swing.JList JLI_Pedidos;
    private javax.swing.JLabel JL_NomeDoCliente;
    private javax.swing.JTabbedPane JTP_PainelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

}
