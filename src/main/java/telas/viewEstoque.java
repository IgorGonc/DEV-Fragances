/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane;
import models.Produto;

import javax.swing.JLabel;

/**
 *
 * @author tigor
 */
public class viewEstoque extends javax.swing.JFrame {

    static final int QUANTIDADE = 50;

    /*
     * Creates new form viewEstoque
     */
    public viewEstoque() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        spiLacome = new javax.swing.JSpinner();
        spiDior = new javax.swing.JSpinner();
        spiKenzo = new javax.swing.JSpinner();
        spiLavie = new javax.swing.JSpinner();
        spiMilion = new javax.swing.JSpinner();
        spiCoco = new javax.swing.JSpinner();
        spiJadore = new javax.swing.JSpinner();
        spiDolce = new javax.swing.JSpinner();
        spiLight = new javax.swing.JSpinner();
        spiCarolina = new javax.swing.JSpinner();
        txtQtdLacome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtProduto1 = new javax.swing.JLabel();
        txtProduto2 = new javax.swing.JLabel();
        txtProduto3 = new javax.swing.JLabel();
        txtProduto4 = new javax.swing.JLabel();
        txtProduto5 = new javax.swing.JLabel();
        txtProduto6 = new javax.swing.JLabel();
        txtProduto7 = new javax.swing.JLabel();
        txtProduto8 = new javax.swing.JLabel();
        txtProduto9 = new javax.swing.JLabel();
        txtProduto10 = new javax.swing.JLabel();
        txtPRODUTOS = new javax.swing.JLabel();
        txtPRECOS = new javax.swing.JLabel();
        txtPreco1 = new javax.swing.JLabel();
        txtPreco2 = new javax.swing.JLabel();
        txtPreco3 = new javax.swing.JLabel();
        txtPreco4 = new javax.swing.JLabel();
        txtPreco5 = new javax.swing.JLabel();
        txtPreco6 = new javax.swing.JLabel();
        txtPreco7 = new javax.swing.JLabel();
        txtPreco8 = new javax.swing.JLabel();
        txtPreco9 = new javax.swing.JLabel();
        txtPreco10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnVoltarMenu = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(219, 182, 238));

        jPanel2.setBackground(new java.awt.Color(219, 182, 238));

        spiLacome.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiLacome.setToolTipText("");
        spiLacome.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                spiLacomeHierarchyChanged(evt);
            }
        });
        spiLacome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                spiLacomeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        spiLacome.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiLacomeStateChanged(evt);
            }
        });
        spiLacome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spiLacomeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                spiLacomeMousePressed(evt);
            }
        });

        spiDior.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiDior.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiDiorStateChanged(evt);
            }
        });

        spiKenzo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiKenzo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiKenzoStateChanged(evt);
            }
        });

        spiLavie.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiLavie.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiLavieStateChanged(evt);
            }
        });

        spiMilion.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiMilion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiMilionStateChanged(evt);
            }
        });

        spiCoco.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiCoco.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiCocoStateChanged(evt);
            }
        });

        spiJadore.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiJadore.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiJadoreStateChanged(evt);
            }
        });

        spiDolce.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiDolce.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiDolceStateChanged(evt);
            }
        });

        spiLight.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiLight.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiLightStateChanged(evt);
            }
        });

        spiCarolina.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spiCarolina.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiCarolinaStateChanged(evt);
            }
        });

        txtQtdLacome.setForeground(new java.awt.Color(0, 0, 0));
        txtQtdLacome.setText("Quantidade disponível: 50");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Quantidade disponível: 50");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Quantidade disponível: 50");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quantidade disponível: 50");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Quantidade disponível: 50");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Quantidade disponível: 50");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Quantidade disponível: 50");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Quantidade disponível: 50");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Quantidade disponível: 50");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Quantidade disponível: 50");

        txtProduto1.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto1.setText("Lancôme");

        txtProduto2.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto2.setText("1 Milion");

        txtProduto3.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto3.setText("Kenzo");

        txtProduto4.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto4.setText("La Vie Est Belle");

        txtProduto5.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto5.setText("Coco Mademoiselle");

        txtProduto6.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto6.setText("J'adore, dior");

        txtProduto7.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto7.setText("Light Blue");

        txtProduto8.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto8.setText("Dolce & Gabbana");

        txtProduto9.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto9.setText("Carolina Herrera");

        txtProduto10.setForeground(new java.awt.Color(0, 0, 0));
        txtProduto10.setText("Dior");

        txtPRODUTOS.setForeground(new java.awt.Color(0, 0, 0));
        txtPRODUTOS.setText("PRODUTOS");

        txtPRECOS.setForeground(new java.awt.Color(0, 0, 0));
        txtPRECOS.setText("PREÇOS");

        txtPreco1.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco1.setText("R$ 20,00");

        txtPreco2.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco2.setText("R$ 40,00");

        txtPreco3.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco3.setText("R$ 25,00");

        txtPreco4.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco4.setText("R$ 90,00");

        txtPreco5.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco5.setText("R$ 46,00");

        txtPreco6.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco6.setText("R$ 150,00");

        txtPreco7.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco7.setText("R$ 105,00");

        txtPreco8.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco8.setText("R$ 215,00");

        txtPreco9.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco9.setText("R$ 255,00");

        txtPreco10.setForeground(new java.awt.Color(0, 0, 0));
        txtPreco10.setText("R$ 303,00");

        txtTotal.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtTotal.setText("Total: R$ 0,00");

        btnVoltarMenu.setText("Voltar para o menu");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar Compra");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPRODUTOS)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtProduto8)
                                    .addGap(12, 12, 12))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtProduto9)
                                    .addGap(21, 21, 21))
                                .addComponent(txtProduto7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProduto5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProduto4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProduto3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProduto2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProduto1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtProduto6)
                                    .addGap(45, 45, 45)))
                            .addComponent(txtProduto10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPRECOS)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spiLacome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spiMilion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                        .addComponent(spiDior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spiKenzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spiLavie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spiCoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spiJadore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spiLight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spiDolce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPreco9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spiCarolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel10))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtQtdLacome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                                        .addComponent(txtTotal)
                                        .addGap(41, 41, 41))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPRODUTOS)
                    .addComponent(txtPRECOS))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiLacome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtdLacome)
                            .addComponent(txtProduto1)
                            .addComponent(txtPreco1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiMilion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtPreco2)
                            .addComponent(txtProduto2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spiKenzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(txtPreco3))
                            .addComponent(txtProduto3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiLavie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtProduto4)
                            .addComponent(txtPreco4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiCoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtProduto5)
                            .addComponent(txtPreco5))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiJadore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtProduto6)
                            .addComponent(txtPreco6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiLight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtProduto7)
                            .addComponent(txtPreco7))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiDolce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtProduto8)
                            .addComponent(txtPreco8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiCarolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtProduto9)
                            .addComponent(txtPreco9))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spiDior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtProduto10)
                            .addComponent(txtPreco10))
                        .addGap(43, 158, Short.MAX_VALUE))))
        );

        spiLacome.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spiLacomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spiLacomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_spiLacomeMouseClicked

    private void spiLacomeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_spiLacomeAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_spiLacomeAncestorAdded

    private void spiLacomeHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_spiLacomeHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spiLacomeHierarchyChanged

    private void spiLacomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spiLacomeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_spiLacomeMousePressed

    private void spiLacomeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiLacomeStateChanged
        // TODO add your handling code here:
        int qtd = QUANTIDADE;
        qtd -= (int) spiLacome.getValue();
        txtQtdLacome.setText("Quantidade disponível: " + String.valueOf(qtd));

        // Lista de Preços baseado no índice do produto
        double preco = 20.00;
        double total = preco * (QUANTIDADE - qtd);
        System.out.printf("\n Preço %.2f. Qtd: %d", preco, qtd);
        txtTotal.setText("Total R$ " + String.valueOf(total));
    }//GEN-LAST:event_spiLacomeStateChanged

    private void spiMilionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiMilionStateChanged
        // TODO add your handling code here:
        int qtd = QUANTIDADE;
        qtd -= (int) spiMilion.getValue();
        jLabel2.setText("Quantidade disponível: " + String.valueOf(qtd));
    }//GEN-LAST:event_spiMilionStateChanged

    private void spiKenzoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiKenzoStateChanged
        // TODO add your handling code here:

        int qtd = QUANTIDADE;
        qtd -= (int) spiKenzo.getValue();
        jLabel3.setText("Quantidade disponível: " + String.valueOf(qtd));
    }//GEN-LAST:event_spiKenzoStateChanged

    private void spiLavieStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiLavieStateChanged
        // TODO add your handling code here:
        int qtd = QUANTIDADE;
        qtd -= (int) spiLavie.getValue();
        jLabel5.setText("Quantidade disponível: " + String.valueOf(qtd));
    }//GEN-LAST:event_spiLavieStateChanged

    private void spiCocoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiCocoStateChanged
        // TODO add your handling code here:
        int qtd = QUANTIDADE;
        qtd -= (int) spiCoco.getValue();
        jLabel4.setText("Quantidade disponível: " + String.valueOf(qtd));
    }//GEN-LAST:event_spiCocoStateChanged

    private void spiJadoreStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiJadoreStateChanged
        // TODO add your handling code here:
        int qtd = QUANTIDADE;
        qtd -= (int) spiJadore.getValue();
        jLabel6.setText("Quantidade disponível: " + String.valueOf(qtd));
    }//GEN-LAST:event_spiJadoreStateChanged

    private void spiLightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiLightStateChanged
        // TODO add your handling code here:
        int qtd = QUANTIDADE;
        qtd -= (int) spiLight.getValue();
        jLabel7.setText("Quantidade disponível: " + String.valueOf(qtd));
    }//GEN-LAST:event_spiLightStateChanged

    private void spiDolceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiDolceStateChanged
        // TODO add your handling code here:
        int qtd = QUANTIDADE;
        qtd -= (int) spiDolce.getValue();
        jLabel8.setText("Quantidade disponível: " + String.valueOf(qtd));
    }//GEN-LAST:event_spiDolceStateChanged

    private void spiCarolinaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiCarolinaStateChanged
        // TODO add your handling code here:
        int qtd = QUANTIDADE;
        qtd -= (int) spiCarolina.getValue();
        jLabel10.setText("Quantidade disponível: " + String.valueOf(qtd));
    }//GEN-LAST:event_spiCarolinaStateChanged

    private void spiDiorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiDiorStateChanged
        // TODO add your handling code here:
        int qtd = QUANTIDADE;
        qtd -= (int) spiDior.getValue();
        jLabel9.setText("Quantidade disponível: " + String.valueOf(qtd));
    }//GEN-LAST:event_spiDiorStateChanged

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        // TODO add your handling code here:

        dispose(); // Fecha o JFrame atual
        //Abre o novo 
        TelaInicio telaInicio = new TelaInicio();
        //   newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas o JFrame secundário
        telaInicio.setVisible(true);
    }//GEN-LAST:event_btnVoltarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(viewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnFinalizar;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner spiCarolina;
    private javax.swing.JSpinner spiCoco;
    private javax.swing.JSpinner spiDior;
    private javax.swing.JSpinner spiDolce;
    private javax.swing.JSpinner spiJadore;
    private javax.swing.JSpinner spiKenzo;
    private javax.swing.JSpinner spiLacome;
    private javax.swing.JSpinner spiLavie;
    private javax.swing.JSpinner spiLight;
    private javax.swing.JSpinner spiMilion;
    private javax.swing.JLabel txtPRECOS;
    private javax.swing.JLabel txtPRODUTOS;
    private javax.swing.JLabel txtPreco1;
    private javax.swing.JLabel txtPreco10;
    private javax.swing.JLabel txtPreco2;
    private javax.swing.JLabel txtPreco3;
    private javax.swing.JLabel txtPreco4;
    private javax.swing.JLabel txtPreco5;
    private javax.swing.JLabel txtPreco6;
    private javax.swing.JLabel txtPreco7;
    private javax.swing.JLabel txtPreco8;
    private javax.swing.JLabel txtPreco9;
    private javax.swing.JLabel txtProduto1;
    private javax.swing.JLabel txtProduto10;
    private javax.swing.JLabel txtProduto2;
    private javax.swing.JLabel txtProduto3;
    private javax.swing.JLabel txtProduto4;
    private javax.swing.JLabel txtProduto5;
    private javax.swing.JLabel txtProduto6;
    private javax.swing.JLabel txtProduto7;
    private javax.swing.JLabel txtProduto8;
    private javax.swing.JLabel txtProduto9;
    private javax.swing.JLabel txtQtdLacome;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
