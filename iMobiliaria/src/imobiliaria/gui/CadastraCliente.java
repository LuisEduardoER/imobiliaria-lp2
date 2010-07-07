/*
 * CadastraCliente.java
 *
 * Created on 06/06/2010, 23:05:21
 */

package imobiliaria.gui;


import imobiliaria.auxiliar.*;
import imobiliaria.controladores.*;
import imobiliaria.entidades.*;
import imobiliaria.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level; // Apagar
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 

/**
 * Gui para Cadastramento de clientes
 * @author Thiago Ferreira
 */
public class CadastraCliente extends javax.swing.JFrame {
    private Sistema sis;
    /** Creates new form CadastraCliente */
    public CadastraCliente() {
        sis = new Sistema();
        initComponents();
        setLocationRelativeTo(null);
        try {
            sis.atualizaDados();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroupPreferencia = new javax.swing.ButtonGroup();
        JL_Nome = new javax.swing.JLabel();
        JL_Endereco = new javax.swing.JLabel();
        JL_Cpf = new javax.swing.JLabel();
        JL_Data = new javax.swing.JLabel();
        JTF_Nome = new javax.swing.JTextField();
        JTF_Cpf1 = new javax.swing.JTextField();
        JTF_Endereco = new javax.swing.JTextField();
        JP_Preferencia = new javax.swing.JPanel();
        rdbCasa = new javax.swing.JRadioButton();
        rdbApart = new javax.swing.JRadioButton();
        rdbTerreno = new javax.swing.JRadioButton();
        JL_Ponto1 = new javax.swing.JLabel();
        JL_Ponto2 = new javax.swing.JLabel();
        JL_Ponto3 = new javax.swing.JLabel();
        JTF_Cpf2 = new javax.swing.JTextField();
        JTF_Cpf3 = new javax.swing.JTextField();
        JTF_Cpf4 = new javax.swing.JTextField();
        JL_Barra1 = new javax.swing.JLabel();
        JL_Barra2 = new javax.swing.JLabel();
        JL_TituloCC = new javax.swing.JLabel();
        JL_Info = new javax.swing.JLabel();
        JB_Cadastrar = new javax.swing.JButton();
        JB_Voltar = new javax.swing.JButton();
        JCB_Ano = new javax.swing.JComboBox();
        JCB_Mes = new javax.swing.JComboBox();
        JCB_Dia = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("iMobiliaria - Cadastramento de Cliente");
        setResizable(false);

        JL_Nome.setText("Nome:");

        JL_Endereco.setText("Endereço:");

        JL_Cpf.setText("CPF:");

        JL_Data.setText("Nascimento:");

        JTF_Nome.setToolTipText("Digite aqui seu nome");

        JTF_Cpf1.setToolTipText("Digite seu cpf");

        JTF_Endereco.setToolTipText("Digite seu endereço");

        JP_Preferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Preferencia"));

        bGroupPreferencia.add(rdbCasa);
        rdbCasa.setSelected(true);
        rdbCasa.setText("Casa");

        bGroupPreferencia.add(rdbApart);
        rdbApart.setText("Apartamento");

        bGroupPreferencia.add(rdbTerreno);
        rdbTerreno.setText("Terreno");

        javax.swing.GroupLayout JP_PreferenciaLayout = new javax.swing.GroupLayout(JP_Preferencia);
        JP_Preferencia.setLayout(JP_PreferenciaLayout);
        JP_PreferenciaLayout.setHorizontalGroup(
            JP_PreferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_PreferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_PreferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbCasa)
                    .addComponent(rdbApart)
                    .addComponent(rdbTerreno))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        JP_PreferenciaLayout.setVerticalGroup(
            JP_PreferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_PreferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbCasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbApart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbTerreno)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        JL_Ponto1.setText(".");

        JL_Ponto2.setText(".");

        JL_Ponto3.setText("-");

        JTF_Cpf2.setToolTipText("Digite seu cpf");

        JTF_Cpf3.setToolTipText("Digite seu cpf");

        JTF_Cpf4.setToolTipText("Digite seu cpf");

        JL_Barra1.setText("/");

        JL_Barra2.setText("/");

        JL_TituloCC.setFont(new java.awt.Font("DejaVu Sans", 1, 18));
        JL_TituloCC.setText("Cadastramento de Cliente");

        JL_Info.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        JL_Info.setText("Preencha os dados abaixo, para se cadastrar:");

        JB_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobiliaria/images/okIcon.png"))); // NOI18N
        JB_Cadastrar.setText("Cadastrar-se");
        JB_Cadastrar.setToolTipText("Clique aqui para se cadastrar");
        JB_Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CadastrarActionPerformed(evt);
            }
        });

        JB_Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobiliaria/images/backIcon.png"))); // NOI18N
        JB_Voltar.setText("Voltar");
        JB_Voltar.setToolTipText("Clique aqui para voltar à tela de login");
        JB_Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_VoltarActionPerformed(evt);
            }
        });

        JCB_Ano.setMaximumRowCount(5);
        JCB_Ano.setModel( new javax.swing.DefaultComboBoxModel(datasNascimentoValidas()) );

        JCB_Mes.setMaximumRowCount(5);
        JCB_Mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        JCB_Dia.setMaximumRowCount(5);
        JCB_Dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JP_Preferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(JB_Cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JB_Voltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JL_Nome)
                                    .addComponent(JL_Cpf))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(JTF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(JTF_Cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JL_Ponto1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTF_Cpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JL_Ponto2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTF_Cpf3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JL_Ponto3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTF_Cpf4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JL_Data)
                                .addGap(18, 18, 18)
                                .addComponent(JCB_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JL_Barra1)
                                .addGap(18, 18, 18)
                                .addComponent(JCB_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JL_Barra2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCB_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JL_Endereco)
                                .addGap(35, 35, 35)
                                .addComponent(JTF_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(JL_TituloCC))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JL_Info)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JTF_Endereco, JTF_Nome});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JTF_Cpf1, JTF_Cpf2, JTF_Cpf3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_TituloCC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(JL_Info)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Nome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_Cpf)
                    .addComponent(JTF_Cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_Cpf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Ponto1)
                    .addComponent(JL_Ponto2)
                    .addComponent(JTF_Cpf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Ponto3)
                    .addComponent(JTF_Cpf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_Endereco))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JL_Data)
                                    .addComponent(JL_Barra2)
                                    .addComponent(JCB_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCB_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCB_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JL_Barra1)
                                .addGap(16, 16, 16)))
                        .addComponent(JP_Preferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_Cadastrar)
                            .addComponent(JB_Voltar))))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JL_Barra1, JL_Barra2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JB_Cadastrar, JB_Voltar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_VoltarActionPerformed
        new TelaPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_JB_VoltarActionPerformed
 
    private void JB_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CadastrarActionPerformed
        boolean cadastroOK = false;
        String cpf = JTF_Cpf1.getText()
                + JTF_Cpf2.getText()
                + JTF_Cpf3.getText()
                + JTF_Cpf4.getText();
        String endereco = JTF_Endereco.getText();
        String nome = JTF_Nome.getText();

        TipoImovel preferencia = null;
        if(rdbApart.isSelected()){
            preferencia = TipoImovel.APARTAMENTO;
        } else if( rdbCasa.isSelected()){
            preferencia = TipoImovel.CASA;
        } else if ( rdbTerreno.isSelected()){
            preferencia = TipoImovel.TERRENO;
        }

        String diaStr = JCB_Dia.getSelectedItem().toString();
        int mes = MetodoEntrada.recebeMesPeloNome(JCB_Mes.getSelectedItem().toString());
        String anoStr = JCB_Ano.getSelectedItem().toString();

        int dia = Integer.parseInt(diaStr);
        int ano = Integer.parseInt(anoStr);
        Calendar dataNascimento = new GregorianCalendar(ano,mes,dia);

        try {
            ControladorCliente.getInstance().adicionaCliente(cpf, dataNascimento, endereco, nome, preferencia);
            Cliente novoCliente = ControladorCliente.getInstance().getCliente(
                    FormataEntrada.cpf(cpf));

            ControladorLogin.getInstance().adicionaLogin(novoCliente.getLogin());
            cadastroOK = true;
            sis.salvarDados();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Verifique se esses campos foram\n" +
                    "preenchidos corretamente:\n\n" +ex.getMessage(),
                    "Erro Ao Cadastrar", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(CadastraCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (cadastroOK){
          JOptionPane.showMessageDialog(null, CADASTROEFETUADO,
                    "Cadastro Efetuado", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_JB_CadastrarActionPerformed

    /*
     * Metodo que retorna um array que ira ser adicionado no JComboBox,
     * de datas de nascimentos validas para seremcselecionadas pelo usuario,
     */
    private static String[] datasNascimentoValidas(){
        Calendar hoje = new GregorianCalendar();
        int MAIORDEIDADE = 18;
        int IDADELIMITE = 90;
        int primeiroAnoValido = hoje.get(Calendar.YEAR) - MAIORDEIDADE;
        int ultimoAnoValido = primeiroAnoValido - IDADELIMITE;
        int qtosAnosMostrar = primeiroAnoValido - ultimoAnoValido;
        String[] anosValidos = new String[qtosAnosMostrar];
        
        for(int i=0; i < qtosAnosMostrar;i++){
            int anoAdicionado = primeiroAnoValido - i;
            anosValidos[i] = Integer.toString(anoAdicionado);
        }
        return anosValidos;
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cadastrar;
    private javax.swing.JButton JB_Voltar;
    private javax.swing.JComboBox JCB_Ano;
    private javax.swing.JComboBox JCB_Dia;
    private javax.swing.JComboBox JCB_Mes;
    private javax.swing.JLabel JL_Barra1;
    private javax.swing.JLabel JL_Barra2;
    private javax.swing.JLabel JL_Cpf;
    private javax.swing.JLabel JL_Data;
    private javax.swing.JLabel JL_Endereco;
    private javax.swing.JLabel JL_Info;
    private javax.swing.JLabel JL_Nome;
    private javax.swing.JLabel JL_Ponto1;
    private javax.swing.JLabel JL_Ponto2;
    private javax.swing.JLabel JL_Ponto3;
    private javax.swing.JLabel JL_TituloCC;
    private javax.swing.JPanel JP_Preferencia;
    private javax.swing.JTextField JTF_Cpf1;
    private javax.swing.JTextField JTF_Cpf2;
    private javax.swing.JTextField JTF_Cpf3;
    private javax.swing.JTextField JTF_Cpf4;
    private javax.swing.JTextField JTF_Endereco;
    private javax.swing.JTextField JTF_Nome;
    private javax.swing.ButtonGroup bGroupPreferencia;
    private javax.swing.JRadioButton rdbApart;
    private javax.swing.JRadioButton rdbCasa;
    private javax.swing.JRadioButton rdbTerreno;
    // End of variables declaration//GEN-END:variables
    // Atributos
    
    private final String CADASTROEFETUADO = "Seu cadastro foi efetuado" +
    " com sucesso!\n\nLembre-se:\n" +
    "Seu login é seu cpf:\n" +
    "   Neste formato: 12345678910\n" +
    "Sua senha é sua data de nascimento\n" +
    "   Neste formato: 01011991\n\n" +
    "Você pode mudar seu login/senha quando desejar";
    // Fim de declaracao de atributos
}