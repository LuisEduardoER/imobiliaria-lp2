/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InterfaceCliente.java
 *
 * Created on 04/07/2010, 14:30:19
 */

package imobiliaria.gui;

/**
 * @author bruno
 */
public class InterfaceCliente extends javax.swing.JFrame {

    /** Creates new form InterfaceCliente */
    public InterfaceCliente() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        JL_Cliente = new javax.swing.JLabel();
        JL_NomeDeCliente = new javax.swing.JLabel();
        JB_VerificaDadosCliente = new javax.swing.JButton();
        JB_Desloga = new javax.swing.JButton();
        JTP_PainelPedidAlugCompras = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        JLI_PedidosCliente = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        JLI_AlugueisCliente = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLI_HistComprasCliente = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JL_Cliente.setText("CLIENTE");

        JL_NomeDeCliente.setText("- Nome Do Cliente Que Se Logou Ficará Aqui Entre Os Hífens -");

        JB_VerificaDadosCliente.setText("Verificar Seus Dados");
        JB_VerificaDadosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_VerificaDadosClienteActionPerformed(evt);
            }
        });

        JB_Desloga.setIcon(new javax.swing.ImageIcon("/home/bruno/workspacelcc3/iMobiliaria/src/imobiliaria/images/exitIcon.png")); // NOI18N
        JB_Desloga.setText("Deslogar");
        JB_Desloga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_DeslogaActionPerformed(evt);
            }
        });

        JLI_PedidosCliente.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(JLI_PedidosCliente);

        JTP_PainelPedidAlugCompras.addTab("Pedidos", jScrollPane3);

        JLI_AlugueisCliente.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(JLI_AlugueisCliente);

        JTP_PainelPedidAlugCompras.addTab("Alugueis", jScrollPane2);

        JLI_HistComprasCliente.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JLI_HistComprasCliente);

        JTP_PainelPedidAlugCompras.addTab("Histórico De Compras", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(JL_Cliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(JL_NomeDeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(JB_Desloga, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(JB_VerificaDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                        .addGap(36, 36, 36)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTP_PainelPedidAlugCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_Cliente)
                .addGap(18, 18, 18)
                .addComponent(JL_NomeDeCliente)
                .addGap(18, 18, 18)
                .addComponent(JTP_PainelPedidAlugCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_VerificaDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Desloga, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>

    private void JB_VerificaDadosClienteActionPerformed(java.awt.event.ActionEvent evt) {
    	//abre uma nova janela contendo os dados do cliente
    }

    private void JB_DeslogaActionPerformed(java.awt.event.ActionEvent evt) {
        new TelaPrincipal().setVisible(true);
        dispose();
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton JB_Desloga;
    private javax.swing.JButton JB_VerificaDadosCliente;
    private javax.swing.JList JLI_AlugueisCliente;
    private javax.swing.JList JLI_HistComprasCliente;
    private javax.swing.JList JLI_PedidosCliente;
    private javax.swing.JLabel JL_Cliente;
    private javax.swing.JLabel JL_NomeDeCliente;
    private javax.swing.JTabbedPane JTP_PainelPedidAlugCompras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration

    //JL_NomeDeCliente = Cliente.getNome();
    
}
