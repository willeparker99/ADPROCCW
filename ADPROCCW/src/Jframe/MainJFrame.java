/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import Calculations.Calculations;
import CardboardBox.*;
import java.awt.Color;
import java.util.regex.Pattern;

/**
 *
 * @author tama3
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        
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

        ReceiptPane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        OrderButton = new javax.swing.JButton();
        LengthText = new javax.swing.JTextField();
        HeightText = new javax.swing.JTextField();
        WidthText = new javax.swing.JTextField();
        GradeCombo = new javax.swing.JComboBox<>();
        ColourCombo = new javax.swing.JComboBox<>();
        QuantitySpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ReinforcedCheck = new javax.swing.JCheckBox();
        ReinforcedCornerCheck = new javax.swing.JCheckBox();
        SealableCheck = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillText = new javax.swing.JTextPane();
        WarningText = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Receipt = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        ReceiptPane.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OrderButton.setText("Order");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        LengthText.setText("Length");
        LengthText.setToolTipText("Input length of box");
        LengthText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        LengthText.setInheritsPopupMenu(true);
        LengthText.setName("LengthInput"); // NOI18N
        LengthText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LengthTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LengthTextFocusLost(evt);
            }
        });
        LengthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LengthTextActionPerformed(evt);
            }
        });

        HeightText.setText("Height");
        HeightText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HeightTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                HeightTextFocusLost(evt);
            }
        });

        WidthText.setText("Width");
        WidthText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                WidthTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                WidthTextFocusLost(evt);
            }
        });
        WidthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WidthTextActionPerformed(evt);
            }
        });

        GradeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5" }));
        GradeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeComboActionPerformed(evt);
            }
        });
        GradeCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                GradeComboPropertyChange(evt);
            }
        });

        ColourCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Colour" }));
        ColourCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColourComboActionPerformed(evt);
            }
        });

        QuantitySpinner.setValue(1);

        jLabel1.setText("Quantity of Boxes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Cardboard Box Ordering System");

        ReinforcedCheck.setText("Reinforced bottom");
        ReinforcedCheck.setEnabled(false);
        ReinforcedCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinforcedCheckActionPerformed(evt);
            }
        });

        ReinforcedCornerCheck.setText("Reinforced corner");
        ReinforcedCornerCheck.setEnabled(false);
        ReinforcedCornerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinforcedCornerCheckActionPerformed(evt);
            }
        });

        SealableCheck.setText("Sealable top");
        SealableCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SealableCheckActionPerformed(evt);
            }
        });

        jLabel3.setText("Please enter the length, width and height in the appropriate boxes below");

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Select grade of cardboard");

        jLabel5.setText("Select number of colours you would like printed");

        BillText.setEditable(false);
        jScrollPane2.setViewportView(BillText);

        Calculate.setText("Add to Order");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        jLabel6.setText("Checkout Price");

        Receipt.setEditable(false);
        Receipt.setColumns(20);
        Receipt.setRows(5);
        jScrollPane1.setViewportView(Receipt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ExitButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jLabel4)
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LengthText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(WidthText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(HeightText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(GradeCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ReinforcedCheck, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(SealableCheck))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ColourCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ReinforcedCornerCheck)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(24, 24, 24)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(QuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jLabel1)))))
                                            .addComponent(WarningText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Calculate)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel6)
                                        .addGap(38, 38, 38)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(WarningText)
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WidthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HeightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(GradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ReinforcedCheck))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ColourCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ReinforcedCornerCheck)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(SealableCheck))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(QuantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Calculate)))
                        .addGap(93, 93, 93)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderButton)
                    .addComponent(ExitButton))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // To be added to:
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void GradeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeComboActionPerformed
        // TODO add your handling code here:
        String selected = (String)GradeCombo.getSelectedItem();
        switch(selected){
            case "Grade 1":
                ColourCombo.removeAllItems();
                ColourCombo.addItem("No Colour");
                ReinforcedCheck.setSelected(false);
                ReinforcedCheck.setEnabled(false);
                ReinforcedCornerCheck.setSelected(false);
                ReinforcedCornerCheck.setEnabled(false);
                break;
            case "Grade 2":
                ColourCombo.removeAllItems();
                ColourCombo.addItem("No Colour");
                ColourCombo.addItem("1 Colour");
                ColourCombo.addItem("2 Colours");
                ReinforcedCheck.setEnabled(false);
                ReinforcedCornerCheck.setEnabled(false);
                break;
            case "Grade 3":
                ColourCombo.removeAllItems();
                ColourCombo.addItem("No Colour");
                ColourCombo.addItem("1 Colour");
                ColourCombo.addItem("2 Colours");
                ReinforcedCheck.setEnabled(false);
                ReinforcedCornerCheck.setEnabled(false);
                break;
            case "Grade 4":
                ColourCombo.removeAllItems();
                ColourCombo.addItem("1 Colour");
                ColourCombo.addItem("2 Colours");
                ReinforcedCheck.setEnabled(false);
                ReinforcedCornerCheck.setEnabled(false);
                break;
            case "Grade 5":
                ColourCombo.removeAllItems();
                ColourCombo.addItem("2 Colours");
                ReinforcedCheck.setEnabled(true);
                ReinforcedCornerCheck.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_GradeComboActionPerformed

    private void SealableCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SealableCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SealableCheckActionPerformed

    private void LengthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LengthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LengthTextActionPerformed

    private void WidthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WidthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WidthTextActionPerformed

    private void ColourComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColourComboActionPerformed
        // TODO add your handling code here:
        String selectedGrade = (String)GradeCombo.getSelectedItem();
        String selectedColour = (String)ColourCombo.getSelectedItem();
        ReinforcedCornerCheck.setEnabled(true);
        ReinforcedCheck.setEnabled(true);
        if("No Colour".equals(selectedColour) || "1 Colour".equals(selectedColour)){
            ReinforcedCornerCheck.setEnabled(false);
            ReinforcedCornerCheck.setSelected(false);
            ReinforcedCheck.setEnabled(false);
            ReinforcedCheck.setSelected(false);
        } else if("2 Colours".equals(selectedColour)){
            ReinforcedCornerCheck.setEnabled(false);
            ReinforcedCornerCheck.setSelected(false);
            ReinforcedCheck.setEnabled(true);
            ReinforcedCheck.setSelected(false);
        }
        
    }//GEN-LAST:event_ColourComboActionPerformed

    private void ReinforcedCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinforcedCheckActionPerformed
        // TODO add your handling code here:
        if(ReinforcedCheck.isSelected() && !"Grade 2".equals((String)GradeCombo.getSelectedItem())){
            ReinforcedCornerCheck.setEnabled(true);
        } else {
            ReinforcedCornerCheck.setSelected(false);
            ReinforcedCornerCheck.setEnabled(false);
        }
    }//GEN-LAST:event_ReinforcedCheckActionPerformed

    private void ReinforcedCornerCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinforcedCornerCheckActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ReinforcedCornerCheckActionPerformed

    private void LengthTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LengthTextFocusGained
        // TODO add your handling code here:
        if("Length".equals(LengthText.getText()) || "Not A Number".equals(LengthText.getText())){
            LengthText.setBackground(Color.white);
            LengthText.setText("");
        }
    }//GEN-LAST:event_LengthTextFocusGained

    private void LengthTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LengthTextFocusLost
        // TODO add your handling code here:
        if("".equals(LengthText.getText())){
            LengthText.setText("Length");
        } else if(!LengthText.getText().matches("[0-9]+")){
            LengthText.setBackground(Color.red);
            LengthText.setText("Not A Number");
        }
    }//GEN-LAST:event_LengthTextFocusLost

    private void WidthTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WidthTextFocusGained
        // TODO add your handling code here:
        if("Width".equals(WidthText.getText()) || "Not A Number".equals(WidthText.getText())){
            WidthText.setBackground(Color.white);
            WidthText.setText("");
        }
    }//GEN-LAST:event_WidthTextFocusGained

    private void WidthTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_WidthTextFocusLost
        // TODO add your handling code here:
        if("".equals(WidthText.getText())){
            WidthText.setText("Width");
        } else if(!WidthText.getText().matches("[0-9]+")){
            WidthText.setBackground(Color.red);
            WidthText.setText("Not A Number");
        }
    }//GEN-LAST:event_WidthTextFocusLost

    private void HeightTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HeightTextFocusGained
        // TODO add your handling code here:
        if("Height".equals(HeightText.getText()) || "Not A Number".equals(HeightText.getText())){
            HeightText.setBackground(Color.white);
            HeightText.setText("");
        }
    }//GEN-LAST:event_HeightTextFocusGained

    private void HeightTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HeightTextFocusLost
        // TODO add your handling code here:
        if("".equals(HeightText.getText())){
            HeightText.setText("Height");
        } else if(!HeightText.getText().matches("[0-9]+")){
            HeightText.setBackground(Color.red);
            HeightText.setText("Not A Number");
        }
    }//GEN-LAST:event_HeightTextFocusLost

    private void GradeComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_GradeComboPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_GradeComboPropertyChange

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // TODO add your handling code here:
        WarningText.setText("");
        if(WidthText.getText().matches("[0-9]+") && LengthText.getText().matches("[0-9]+") && HeightText.getText().matches("[0-9]+")){
            double area = Double.parseDouble(LengthText.getText()) * Double.parseDouble(WidthText.getText()) * Double.parseDouble(HeightText.getText());
            Calculations calc = new Calculations(Double.parseDouble(LengthText.getText()), Double.parseDouble(WidthText.getText()), Double.parseDouble(HeightText.getText()), SealableCheck.isSelected(), ReinforcedCheck.isSelected(), ReinforcedCornerCheck.isSelected(), (String)GradeCombo.getSelectedItem(), (String)ColourCombo.getSelectedItem(), (int)QuantitySpinner.getValue());
            String ReceiptText = "";
            for(int i = 0; i < calc.getBoxLi().size(); i++){
                ReceiptText += calc.getBoxByIndex(i).getInfo() + "\n";
            }
            Receipt.setText(ReceiptText);
            BillText.setText("£" + Calculations.TotalPrice());
        } else {
            WarningText.setForeground(Color.red);
            WarningText.setText("Warning - Lenghth, Width, Height must have values.");
        }
        LengthText.setText("Length");
        WidthText.setText("Width");
        HeightText.setText("Height");
        GradeCombo.setSelectedIndex(0);
        ColourCombo.removeAllItems();
        ColourCombo.addItem("No Colour");
        ReinforcedCheck.setEnabled(false);
        ReinforcedCheck.setSelected(false);
        ReinforcedCornerCheck.setEnabled(false);
        ReinforcedCornerCheck.setSelected(false);
        SealableCheck.setSelected(false);
        QuantitySpinner.setValue(1);
    }//GEN-LAST:event_CalculateActionPerformed
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane BillText;
    private javax.swing.JButton Calculate;
    private javax.swing.JComboBox<String> ColourCombo;
    private javax.swing.JButton ExitButton;
    private javax.swing.JComboBox<String> GradeCombo;
    private javax.swing.JTextField HeightText;
    private javax.swing.JTextField LengthText;
    private javax.swing.JButton OrderButton;
    private javax.swing.JSpinner QuantitySpinner;
    private javax.swing.JTextArea Receipt;
    private javax.swing.JScrollPane ReceiptPane;
    private javax.swing.JCheckBox ReinforcedCheck;
    private javax.swing.JCheckBox ReinforcedCornerCheck;
    private javax.swing.JCheckBox SealableCheck;
    private javax.swing.JLabel WarningText;
    private javax.swing.JTextField WidthText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    //Open variable Declaration
   
}
