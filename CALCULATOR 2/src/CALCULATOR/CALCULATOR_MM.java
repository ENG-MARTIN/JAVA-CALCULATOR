
package CALCULATOR;

import java.awt.event.KeyEvent;
import java.util.Scanner;


public class CALCULATOR_MM extends javax.swing.JFrame {
String value;
    double fnum;
    double snum;
    double ans;
   
    public CALCULATOR_MM() {
        setUndecorated(true);
        initComponents();
        on.setEnabled(true);
    }

     public void enable() {
        on.setEnabled(false);
        OFF.setEnabled(true);
        SCREEN.setEnabled(true);
        NO1.setEnabled(true);
        NO2.setEnabled(true);
        NO3.setEnabled(true);
        NO4.setEnabled(true);
        NO5.setEnabled(true);
        NO6.setEnabled(true);
        NO7.setEnabled(true);
        NO8.setEnabled(true);
        NO9.setEnabled(true);
        NO0.setEnabled(true);
        PLUS.setEnabled(true);
        SUB.setEnabled(true);
        MULT.setEnabled(true);
        DIV.setEnabled(true);
        EQUALS.setEnabled(true);
        POINT.setEnabled(true);
        DEL.setEnabled(true);
        DEL.setEnabled(true);
        jButton1.setEnabled(true);
    }

    public void disable() {
        SCREEN.setEnabled(false);
        OFF.setEnabled(false);
        on.setEnabled(true);
        NO1.setEnabled(false);
        NO2.setEnabled(false);
        NO3.setEnabled(false);
        NO4.setEnabled(false);
        NO5.setEnabled(false);
        NO6.setEnabled(false);
        NO7.setEnabled(false);
        NO8.setEnabled(false);
        NO9.setEnabled(false);
        NO0.setEnabled(false);
        PLUS.setEnabled(false);
        SUB.setEnabled(false);
        MULT.setEnabled(false);
        DIV.setEnabled(false);
        EQUALS.setEnabled(false);
        POINT.setEnabled(false);
        DEL.setEnabled(false);
        DEL.setEnabled(false);
        jButton1.setEnabled(false);
    }

    public void inpt() {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
    }

    public void answer() {
        int x = SCREEN.getText().length();
        fnum = Double.parseDouble(value.substring(0, value.indexOf(" ")));
        snum = Double.parseDouble(value.substring(value.indexOf(" ") + 2, x));
        String operator = value.substring(value.indexOf("") + 1, value.indexOf("" + 2));
        if (operator.equals("+")) {
            ans = fnum + snum;
        }
        if (operator.equals("-")) {
            ans = fnum - snum;
        }
        if (operator.equals("/")) {
            ans = fnum / snum;
        }
        if (operator.equals("*")) {
            ans = fnum * snum;
        }
        SCREEN.setText(String.valueOf(ans));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DEL = new javax.swing.JButton();
        on = new javax.swing.JRadioButton();
        OFF = new javax.swing.JRadioButton();
        CLEAR = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SCREEN = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        NO1 = new javax.swing.JButton();
        NO4 = new javax.swing.JButton();
        NO7 = new javax.swing.JButton();
        NO0 = new javax.swing.JButton();
        NO2 = new javax.swing.JButton();
        NO3 = new javax.swing.JButton();
        NO5 = new javax.swing.JButton();
        NO6 = new javax.swing.JButton();
        NO8 = new javax.swing.JButton();
        NO9 = new javax.swing.JButton();
        POINT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        MULT = new javax.swing.JButton();
        PLUS = new javax.swing.JButton();
        EQUALS = new javax.swing.JButton();
        DIV = new javax.swing.JButton();
        SUB = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        close = new javax.swing.JMenuItem();
        minimise = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DEL.setBackground(new java.awt.Color(153, 255, 153));
        DEL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CALCULATOR/icons8_clear_symbol_48px.png"))); // NOI18N
        DEL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        DEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELActionPerformed(evt);
            }
        });
        DEL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DELKeyPressed(evt);
            }
        });
        jPanel2.add(DEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 100, 40));

        on.setBackground(new java.awt.Color(204, 255, 255));
        on.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        on.setForeground(new java.awt.Color(0, 153, 0));
        on.setText("ON");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });
        jPanel2.add(on, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        OFF.setBackground(new java.awt.Color(0, 255, 204));
        OFF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OFF.setText("OFF");
        OFF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 2, new java.awt.Color(0, 0, 0)));
        OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFFActionPerformed(evt);
            }
        });
        jPanel2.add(OFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 70, 30));

        CLEAR.setBackground(new java.awt.Color(153, 255, 153));
        CLEAR.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        CLEAR.setForeground(new java.awt.Color(255, 255, 255));
        CLEAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CALCULATOR/icons8_broom_24px.png"))); // NOI18N
        CLEAR.setText("CLEAR");
        CLEAR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        jPanel2.add(CLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 120, 40));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 480, 60));

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("MARTIN'S CALCULATOR");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 380, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 480, 60));

        SCREEN.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel4.add(SCREEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 480, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NO1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NO1.setText("1");
        NO1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        NO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO1ActionPerformed(evt);
            }
        });
        jPanel1.add(NO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 60));

        NO4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NO4.setText("4");
        NO4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        NO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO4ActionPerformed(evt);
            }
        });
        jPanel1.add(NO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 60));

        NO7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NO7.setText("7");
        NO7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        NO7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO7ActionPerformed(evt);
            }
        });
        jPanel1.add(NO7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 60));

        NO0.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NO0.setText("0");
        NO0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO0ActionPerformed(evt);
            }
        });
        jPanel1.add(NO0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 80, 50));

        NO2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NO2.setText("2");
        NO2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        NO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO2ActionPerformed(evt);
            }
        });
        jPanel1.add(NO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, 60));

        NO3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NO3.setText("3");
        NO3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        NO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO3ActionPerformed(evt);
            }
        });
        jPanel1.add(NO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, 60));

        NO5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NO5.setText("5");
        NO5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        NO5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO5ActionPerformed(evt);
            }
        });
        jPanel1.add(NO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 100, 60));

        NO6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NO6.setText("6");
        NO6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        NO6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO6ActionPerformed(evt);
            }
        });
        jPanel1.add(NO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 100, 60));

        NO8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NO8.setText("8");
        NO8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        NO8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO8ActionPerformed(evt);
            }
        });
        jPanel1.add(NO8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 100, 60));

        NO9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        NO9.setText("9");
        NO9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        NO9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO9ActionPerformed(evt);
            }
        });
        jPanel1.add(NO9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 100, 60));

        POINT.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        POINT.setText(".");
        POINT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        POINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POINTActionPerformed(evt);
            }
        });
        jPanel1.add(POINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 80, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("+/-");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MULT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MULT.setText("X");
        MULT.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        MULT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTActionPerformed(evt);
            }
        });
        jPanel3.add(MULT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 50));

        PLUS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PLUS.setText("+");
        PLUS.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        PLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLUSActionPerformed(evt);
            }
        });
        jPanel3.add(PLUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 50));

        EQUALS.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        EQUALS.setText("=");
        EQUALS.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        EQUALS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQUALSActionPerformed(evt);
            }
        });
        jPanel3.add(EQUALS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 50));

        DIV.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DIV.setText("/");
        DIV.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        DIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVActionPerformed(evt);
            }
        });
        jPanel3.add(DIV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 50));

        SUB.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SUB.setText("-");
        SUB.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        SUB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBActionPerformed(evt);
            }
        });
        jPanel3.add(SUB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 100, 310));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 10, 310));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 10, 300));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 480, 340));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 480, 10));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 480, 10));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 580));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jMenu1.add(close);

        minimise.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        minimise.setText("Minimise");
        minimise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimiseActionPerformed(evt);
            }
        });
        jMenu1.add(minimise);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELActionPerformed
        // TODO add your handling code here
        SCREEN.setText(SCREEN.getText().substring(0,SCREEN.getText().length()-1));
       /* String txt=SCREEN.getText();
        if(txt!=null&&txt.indexOf("-")==0){
            txt="-"+txt.substring(1,txt.length());
        }
        else if(txt!=null&&txt.indexOf("+")==0){
            txt="-"+ txt.substring(1,txt.length());
        }
        else{
            txt="-"+(txt!=null? txt:"");
        }
        SCREEN.setText(txt);*/
    }//GEN-LAST:event_DELActionPerformed

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
        // TODO add your handling code here:
        enable();
    }//GEN-LAST:event_onActionPerformed

    private void OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFActionPerformed
        // TODO add your handling code here:
        disable();
    }//GEN-LAST:event_OFFActionPerformed

    private void NO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO1ActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + 1;
        SCREEN.setText(value);
    }//GEN-LAST:event_NO1ActionPerformed

    private void NO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO4ActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + 4;
        SCREEN.setText(value);
    }//GEN-LAST:event_NO4ActionPerformed

    private void NO7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO7ActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + 7;
        SCREEN.setText(value);
    }//GEN-LAST:event_NO7ActionPerformed

    private void NO0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO0ActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + 0;
        SCREEN.setText(value);
    }//GEN-LAST:event_NO0ActionPerformed

    private void NO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO2ActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + 2;
        SCREEN.setText(value);
    }//GEN-LAST:event_NO2ActionPerformed

    private void NO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO3ActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + 3;
        SCREEN.setText(value);
    }//GEN-LAST:event_NO3ActionPerformed

    private void NO5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO5ActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + 5;
        SCREEN.setText(value);
    }//GEN-LAST:event_NO5ActionPerformed

    private void NO6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO6ActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + 6;
        SCREEN.setText(value);
    }//GEN-LAST:event_NO6ActionPerformed

    private void NO8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO8ActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + 8;
        SCREEN.setText(value);
    }//GEN-LAST:event_NO8ActionPerformed

    private void NO9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO9ActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + 9;
        SCREEN.setText(value);
    }//GEN-LAST:event_NO9ActionPerformed

    private void POINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POINTActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + " . ";
        SCREEN.setText(value);
    }//GEN-LAST:event_POINTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double x = Double.valueOf(SCREEN.getText());
        double y = -1 * x;
        SCREEN.setText(String.valueOf(y));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MULTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + " * ";
        SCREEN.setText(value);
    }//GEN-LAST:event_MULTActionPerformed

    private void PLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLUSActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + " + ";
        SCREEN.setText(value);
    }//GEN-LAST:event_PLUSActionPerformed

    private void EQUALSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQUALSActionPerformed
        // TODO add your handling code here:
        int x = SCREEN.getText().length();
        fnum = Double.parseDouble(value.substring(0, value.indexOf(" ")));
        snum = Double.parseDouble(value.substring(value.indexOf(" ") + 2, x));
        String operator = value.substring(value.indexOf(" ") + 1, value.indexOf(" ") + 2);
        if (operator.equals("+")) {
            ans = fnum + snum;
        }
        if (operator.equals("-")) {
            ans = fnum - snum;
        }
        if (operator.equals("/")) {
            ans = fnum / snum;
        }
        if (operator.equals("*")) {
            ans = fnum * snum;
        }
        SCREEN.setText(String.valueOf(ans));
    }//GEN-LAST:event_EQUALSActionPerformed

    private void DIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + " / ";
        SCREEN.setText(value);
    }//GEN-LAST:event_DIVActionPerformed

    private void SUBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBActionPerformed
        // TODO add your handling code here:
        value = SCREEN.getText() + " - ";
        SCREEN.setText(value);
    }//GEN-LAST:event_SUBActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        // TODO add your handling code here:
         SCREEN.setText("");
    }//GEN-LAST:event_CLEARActionPerformed

    private void DELKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DELKeyPressed
        // TODO add your handling code here:
       
            SCREEN.setText("-"+SCREEN.getText());
        
    }//GEN-LAST:event_DELKeyPressed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_closeActionPerformed

    private void minimiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimiseActionPerformed
        // TODO add your handling code here:
        setState(CALCULATOR_MM.ICONIFIED);
    }//GEN-LAST:event_minimiseActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(CALCULATOR_MM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR_MM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR_MM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CALCULATOR_MM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CALCULATOR_MM().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton DEL;
    private javax.swing.JButton DIV;
    private javax.swing.JButton EQUALS;
    private javax.swing.JButton MULT;
    private javax.swing.JButton NO0;
    private javax.swing.JButton NO1;
    private javax.swing.JButton NO2;
    private javax.swing.JButton NO3;
    private javax.swing.JButton NO4;
    private javax.swing.JButton NO5;
    private javax.swing.JButton NO6;
    private javax.swing.JButton NO7;
    private javax.swing.JButton NO8;
    private javax.swing.JButton NO9;
    private javax.swing.JRadioButton OFF;
    private javax.swing.JButton PLUS;
    private javax.swing.JButton POINT;
    private javax.swing.JTextField SCREEN;
    private javax.swing.JButton SUB;
    private javax.swing.JMenuItem close;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JMenuItem minimise;
    private javax.swing.JRadioButton on;
    // End of variables declaration//GEN-END:variables
}
