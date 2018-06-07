/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controle.ImovelDAO;
import Modelo.Cliente;
import Modelo.Imovel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author klebe
 */
public class TelaCadLocacao extends Cabecalho {

    private TelaCliente TCliente = new TelaCliente();
    private Cliente cliente = new Cliente();
    
    public TelaCadLocacao() {
        initComponents();
        configTela();
        
    }
    
    public TelaCadLocacao(Imovel imv) {
        initComponents();
        System.out.println("entrou na tela cad locacao valor de id " + imv.getId());
        
        jLabelImvId.setText(Integer.toString(imv.getId()));
        jLabelImvRua.setText(imv.getRua());
        jLabelImvNum.setText(Integer.toString(imv.getNumero()));//convertendo para String
        jLabelImvBairro.setText(imv.getBairro());
        jLabelImvCidade.setText(imv.getCidade());
        jLabelImvCep.setText(imv.getCEP());
        jLabelImvTipo.setText(imv.getTipo());
        jLabelImvQuartos.setText(Integer.toString(imv.getQtdQuarto()));
        jLabelImvTamanho.setText(Double.toString(imv.getTamanho()));
        jLabelImvValor.setText(Double.toString(imv.getValor()));
        jLabelImvObs.setText(imv.getObs());
        // UM OUTRO GEITO DE HABILITAR OS BOTÕES
        configTela();
        }
    
    
    
    //CONFIGURAÇÃO DE AÇÃO DOS BOTÕES
    private void configTela() {
        populaCliente();
        //ACESANDO A TELA DE BUSCA/CADASTRO DE CLIENTE
        jButtonNovoCliente.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                TCliente.setVisible(true);
                
            }
        });
    }
    
    
    ImovelDAO imov = new ImovelDAO();
    private String nomeCliente;

    private void populaCliente(){
        try {
            this.nomeCliente = imov.retornaNomeCliente("1");
            jLabelNomeCliente.setText(nomeCliente);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //gets e sets
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelCliente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jButtonNovoCliente = new javax.swing.JToggleButton();
        jButtonBuscaClienteCPF1 = new javax.swing.JToggleButton();
        jPanelContaBancaria = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldAg = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxOperacaoBanc = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNumConta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldDiaDebito = new javax.swing.JTextField();
        jTextFieldNumConta1 = new javax.swing.JTextField();
        jPanelInfImovel = new javax.swing.JPanel();
        jLabelImvCidade = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelImvRua = new javax.swing.JLabel();
        jLabelImvId = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelImvBairro = new javax.swing.JLabel();
        jLabelImvCep = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelImvEstado = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelImvObs = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabelImvValor = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldValorLocado = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabelImvNum = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldValorLocado1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabelImvTipo = new javax.swing.JLabel();
        jLabelImvQuartos = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabelImvTamanho = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelComandosLocacao = new javax.swing.JPanel();
        jButtonSalvarLocacao = new javax.swing.JToggleButton();
        jButtonCancelarVoltarLocacao = new javax.swing.JToggleButton();
        jLabelNovaLocacao = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel8.setText("Sexo");

        jLabelSexo.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel9.setText("Nascimento:");

        jLabelDataNascimento.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelDataNascimento.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel4.setText("Cliente:");

        jLabelNomeCliente.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelNomeCliente.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel7.setText("CPF:");

        jLabelCPF.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(51, 51, 51));

        jButtonNovoCliente.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jButtonNovoCliente.setText("Novo Cliente");
        jButtonNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoClienteActionPerformed(evt);
            }
        });

        jButtonBuscaClienteCPF1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jButtonBuscaClienteCPF1.setText("Buscar Cliente");
        jButtonBuscaClienteCPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaClienteCPF1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(23, 23, 23)
                                .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 76, Short.MAX_VALUE))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonNovoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscaClienteCPF1)))
                        .addContainerGap())))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(jLabelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscaClienteCPF1)
                    .addComponent(jButtonNovoCliente))
                .addGap(34, 34, 34))
        );

        jPanelContaBancaria.setPreferredSize(new java.awt.Dimension(569, 225));

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel12.setText("Agencia:");

        jTextFieldAg.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextFieldAg.setForeground(new java.awt.Color(0, 0, 51));
        jTextFieldAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAgActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel13.setText("Operação:");

        jComboBoxOperacaoBanc.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jComboBoxOperacaoBanc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01 - C. Corrente", "02 - C. Poupaça", "03 - C. Jurídica" }));
        jComboBoxOperacaoBanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperacaoBancActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel6.setText("Banco:");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel10.setText("Informe os dados para débito automático:");

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel11.setText("Conta:");

        jTextFieldNumConta.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextFieldNumConta.setForeground(new java.awt.Color(0, 0, 51));
        jTextFieldNumConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumContaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel14.setText("Dia do débito:");

        jTextFieldDiaDebito.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextFieldDiaDebito.setForeground(new java.awt.Color(0, 0, 51));
        jTextFieldDiaDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiaDebitoActionPerformed(evt);
            }
        });

        jTextFieldNumConta1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextFieldNumConta1.setForeground(new java.awt.Color(0, 0, 51));
        jTextFieldNumConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumConta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContaBancariaLayout = new javax.swing.GroupLayout(jPanelContaBancaria);
        jPanelContaBancaria.setLayout(jPanelContaBancariaLayout);
        jPanelContaBancariaLayout.setHorizontalGroup(
            jPanelContaBancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContaBancariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContaBancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContaBancariaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNumConta))
                    .addGroup(jPanelContaBancariaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAg, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxOperacaoBanc, 0, 1, Short.MAX_VALUE))
                    .addGroup(jPanelContaBancariaLayout.createSequentialGroup()
                        .addGroup(jPanelContaBancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanelContaBancariaLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDiaDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addGroup(jPanelContaBancariaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)
                        .addComponent(jTextFieldNumConta1)))
                .addGap(37, 37, 37))
        );
        jPanelContaBancariaLayout.setVerticalGroup(
            jPanelContaBancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContaBancariaLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanelContaBancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNumConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContaBancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelContaBancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOperacaoBanc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelContaBancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContaBancariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDiaDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabelImvCidade.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvCidade.setForeground(new java.awt.Color(51, 51, 51));

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel15.setText("Cidade:");

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel16.setText("Rua:");

        jLabelImvRua.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvRua.setForeground(new java.awt.Color(51, 51, 51));

        jLabelImvId.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvId.setForeground(new java.awt.Color(51, 51, 51));

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel18.setText("Bairro:");

        jLabelImvBairro.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvBairro.setForeground(new java.awt.Color(51, 51, 51));

        jLabelImvCep.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvCep.setForeground(new java.awt.Color(51, 51, 51));

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel19.setText("CEP");

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel20.setText("UF");

        jLabelImvEstado.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvEstado.setForeground(new java.awt.Color(51, 51, 51));

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel21.setText("Observações");

        jLabelImvObs.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvObs.setForeground(new java.awt.Color(51, 51, 51));

        jLabel22.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel22.setText("Valor Locado: ");

        jLabelImvValor.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvValor.setForeground(new java.awt.Color(51, 51, 51));

        jLabel23.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel23.setText("Valor da Locação:");

        jTextFieldValorLocado.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextFieldValorLocado.setForeground(new java.awt.Color(0, 0, 51));
        jTextFieldValorLocado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorLocadoActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel24.setText("N°:");

        jLabelImvNum.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvNum.setForeground(new java.awt.Color(51, 51, 51));

        jLabel25.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel25.setText("Data final do contrato:");

        jTextFieldValorLocado1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextFieldValorLocado1.setForeground(new java.awt.Color(0, 0, 51));
        jTextFieldValorLocado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorLocado1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel26.setText("Informações do Imóvel código:");

        jLabel27.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel27.setText("Tipo:");

        jLabelImvTipo.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvTipo.setForeground(new java.awt.Color(51, 51, 51));

        jLabelImvQuartos.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvQuartos.setForeground(new java.awt.Color(51, 51, 51));

        jLabel28.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel28.setText("Quartos:");

        jLabel29.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel29.setText("m²");

        jLabelImvTamanho.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelImvTamanho.setForeground(new java.awt.Color(51, 51, 51));

        jLabel30.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel30.setText("Tamanho");

        javax.swing.GroupLayout jPanelInfImovelLayout = new javax.swing.GroupLayout(jPanelInfImovel);
        jPanelInfImovel.setLayout(jPanelInfImovelLayout);
        jPanelInfImovelLayout.setHorizontalGroup(
            jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImvTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImvQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImvTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                        .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelImvId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelImvCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelImvEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelImvValor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorLocado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldValorLocado1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfImovelLayout.createSequentialGroup()
                        .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(23, 23, 23)
                                .addComponent(jLabelImvObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelImvCep, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelImvRua, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelImvNum, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelImvBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );
        jPanelInfImovelLayout.setVerticalGroup(
            jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelImvId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                        .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelImvCep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelImvRua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel24)
                            .addComponent(jLabelImvNum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelImvBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelImvCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelImvEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                        .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                                .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelImvTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelImvQuartos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfImovelLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(11, 11, 11))
                            .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldValorLocado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldValorLocado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelImvValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInfImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabelImvObs, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelInfImovelLayout.createSequentialGroup()
                        .addComponent(jLabelImvTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jButtonSalvarLocacao.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jButtonSalvarLocacao.setText("Salvar");
        jButtonSalvarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarLocacaoActionPerformed(evt);
            }
        });

        jButtonCancelarVoltarLocacao.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jButtonCancelarVoltarLocacao.setText("Cancelar e voltar");
        jButtonCancelarVoltarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVoltarLocacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelComandosLocacaoLayout = new javax.swing.GroupLayout(jPanelComandosLocacao);
        jPanelComandosLocacao.setLayout(jPanelComandosLocacaoLayout);
        jPanelComandosLocacaoLayout.setHorizontalGroup(
            jPanelComandosLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComandosLocacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvarLocacao)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelarVoltarLocacao)
                .addGap(24, 24, 24))
        );
        jPanelComandosLocacaoLayout.setVerticalGroup(
            jPanelComandosLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComandosLocacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelComandosLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarLocacao)
                    .addComponent(jButtonCancelarVoltarLocacao))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabelNovaLocacao.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabelNovaLocacao.setText("Cadastro de Nova Locação:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelInfImovel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNovaLocacao)
                            .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jPanelContaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelComandosLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanelContaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNovaLocacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelInfImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelComandosLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoClienteActionPerformed
    }//GEN-LAST:event_jButtonNovoClienteActionPerformed

    private void jTextFieldNumContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumContaActionPerformed
    }//GEN-LAST:event_jTextFieldNumContaActionPerformed

    private void jTextFieldAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAgActionPerformed
    }//GEN-LAST:event_jTextFieldAgActionPerformed

    private void jComboBoxOperacaoBancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperacaoBancActionPerformed
    }//GEN-LAST:event_jComboBoxOperacaoBancActionPerformed

    private void jTextFieldValorLocadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorLocadoActionPerformed
    }//GEN-LAST:event_jTextFieldValorLocadoActionPerformed

    private void jTextFieldValorLocado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorLocado1ActionPerformed
    }//GEN-LAST:event_jTextFieldValorLocado1ActionPerformed

    private void jButtonSalvarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarLocacaoActionPerformed
    }//GEN-LAST:event_jButtonSalvarLocacaoActionPerformed

    private void jButtonCancelarVoltarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVoltarLocacaoActionPerformed
        dispose();
        TelaInicial tInicial = new TelaInicial();
        tInicial.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarVoltarLocacaoActionPerformed

    private void jTextFieldDiaDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiaDebitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiaDebitoActionPerformed

    private void jTextFieldNumConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumConta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumConta1ActionPerformed

    private void jButtonBuscaClienteCPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaClienteCPF1ActionPerformed
        String cpf;
        cpf = JOptionPane.showInputDialog(null, "Digite o CPF", "Busca Cliente", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("FAZER MÉTODO QUE VERIFICA SE EXISTE UM CLIENTE PARA DEPOIS PREENCHER OS CAMPOS");
        
        
    }//GEN-LAST:event_jButtonBuscaClienteCPF1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jButtonBuscaClienteCPF1;
    private javax.swing.JToggleButton jButtonCancelarVoltarLocacao;
    private javax.swing.JToggleButton jButtonNovoCliente;
    private javax.swing.JToggleButton jButtonSalvarLocacao;
    private javax.swing.JComboBox jComboBoxOperacaoBanc;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelImvBairro;
    private javax.swing.JLabel jLabelImvCep;
    private javax.swing.JLabel jLabelImvCidade;
    private javax.swing.JLabel jLabelImvEstado;
    private javax.swing.JLabel jLabelImvId;
    private javax.swing.JLabel jLabelImvNum;
    private javax.swing.JLabel jLabelImvObs;
    private javax.swing.JLabel jLabelImvQuartos;
    private javax.swing.JLabel jLabelImvRua;
    private javax.swing.JLabel jLabelImvTamanho;
    private javax.swing.JLabel jLabelImvTipo;
    private javax.swing.JLabel jLabelImvValor;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelNovaLocacao;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelComandosLocacao;
    private javax.swing.JPanel jPanelContaBancaria;
    private javax.swing.JPanel jPanelInfImovel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldAg;
    private javax.swing.JTextField jTextFieldDiaDebito;
    private javax.swing.JTextField jTextFieldNumConta;
    private javax.swing.JTextField jTextFieldNumConta1;
    private javax.swing.JTextField jTextFieldValorLocado;
    private javax.swing.JTextField jTextFieldValorLocado1;
    // End of variables declaration//GEN-END:variables
}
