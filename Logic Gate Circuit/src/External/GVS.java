/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package External;

import Internal.Elementas;
import Internal.Input;
import Internal.Schema;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GVS extends javax.swing.JFrame {
    int x_k, y_k;
    int max_lygis = 0;
    Schema schema = null;
    Elementas dabartinis = null;
    static Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement stmt = null;
    /**
     * Creates new form GVS
     */
    public GVS() {
        initComponents();
        setLocationRelativeTo(null);
        drawing1.grabFocus();
        schema = new Schema();
        //Elementas.setNr(1);
        drawing1.sch = schema;
        drawing1.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        AddInput = new javax.swing.JMenuItem();
        AddAnd = new javax.swing.JMenuItem();
        AddOr = new javax.swing.JMenuItem();
        AddNot = new javax.swing.JMenuItem();
        AddXor = new javax.swing.JMenuItem();
        drawing1 = new External.Drawing();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        createCircuit = new javax.swing.JMenuItem();
        createWindow = new javax.swing.JMenuItem();
        help = new javax.swing.JMenuItem();
        exitProgram = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        changeColor = new javax.swing.JMenuItem();
        showResults = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        startSimulation = new javax.swing.JMenuItem();
        stepBack = new javax.swing.JMenuItem();
        stepForward = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        AddInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/inputicon.png"))); // NOI18N
        AddInput.setText("Add Input");
        AddInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddInputActionPerformed(evt);
            }
        });
        jPopupMenu1.add(AddInput);

        AddAnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/addicon.png"))); // NOI18N
        AddAnd.setText("Add AND Gate");
        AddAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAndActionPerformed(evt);
            }
        });
        jPopupMenu1.add(AddAnd);

        AddOr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/oricon.png"))); // NOI18N
        AddOr.setText("Add OR Gate");
        AddOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrActionPerformed(evt);
            }
        });
        jPopupMenu1.add(AddOr);

        AddNot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/noticon.png"))); // NOI18N
        AddNot.setText("Add NOT Gate");
        AddNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNotActionPerformed(evt);
            }
        });
        jPopupMenu1.add(AddNot);

        AddXor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/xoricon.png"))); // NOI18N
        AddXor.setText("Add XOR Gate");
        AddXor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddXorActionPerformed(evt);
            }
        });
        jPopupMenu1.add(AddXor);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logic Circuit");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 600));

        drawing1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawing1MouseDragged(evt);
            }
        });
        drawing1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawing1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawing1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drawing1MouseReleased(evt);
            }
        });
        drawing1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                drawing1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout drawing1Layout = new javax.swing.GroupLayout(drawing1);
        drawing1.setLayout(drawing1Layout);
        drawing1Layout.setHorizontalGroup(
            drawing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        drawing1Layout.setVerticalGroup(
            drawing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        createCircuit.setText("Create Circuit");
        createCircuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCircuitActionPerformed(evt);
            }
        });
        jMenu1.add(createCircuit);

        createWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        createWindow.setText("Clear Window");
        createWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createWindowActionPerformed(evt);
            }
        });
        jMenu1.add(createWindow);

        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        jMenu1.add(help);

        exitProgram.setText("Exit Program");
        exitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProgramActionPerformed(evt);
            }
        });
        jMenu1.add(exitProgram);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Options");

        changeColor.setText("Change Color");
        changeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeColorActionPerformed(evt);
            }
        });
        jMenu4.add(changeColor);

        showResults.setSelected(true);
        showResults.setText("Show Results");
        showResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResultsActionPerformed(evt);
            }
        });
        jMenu4.add(showResults);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Output Simulation");

        startSimulation.setText("Start");
        startSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startSimulationActionPerformed(evt);
            }
        });
        jMenu2.add(startSimulation);

        stepBack.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, java.awt.event.InputEvent.CTRL_MASK));
        stepBack.setText("Step Back");
        stepBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepBackActionPerformed(evt);
            }
        });
        jMenu2.add(stepBack);

        stepForward.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, java.awt.event.InputEvent.CTRL_MASK));
        stepForward.setText("Step Forward");
        stepForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepForwardActionPerformed(evt);
            }
        });
        jMenu2.add(stepForward);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawing1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawing1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProgramActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitProgramActionPerformed

    private void createCircuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCircuitActionPerformed
        schema = new Schema();
        drawing1.help=false;
        schema.pridetiInput(); // 1
        schema.pridetiInput(); // 2
        schema.pridetiInput(); // 3
        schema.pridetiInput(); // 4
        schema.pridetiNOTelementa(); // 5
        schema.pridetiANDelementa(); // 6
        schema.pridetiORelementa(); // 7
        schema.pridetiXORelementa(); // 8
        schema.sujungti(1, 5);
        schema.sujungti(1, 6);
        schema.sujungti(2, 6);
        schema.sujungti(3, 6);
        schema.sujungti(3, 7);
        schema.sujungti(4, 7);
        schema.sujungti(5, 8);
        schema.sujungti(6, 8);
        schema.sujungti(7, 8);
        schema.nustatytiReiksme(2, true);
        schema.nustatytiReiksme(3, true);
        for(Elementas e:schema.getElementai()){
            if(e.getId()>8){
            e.setX((int)(Math.random()*300));
            e.setY((int)(Math.random()*300));
            }
            if(e.getId()==1){
            e.setX(30);
            e.setY(80);
            }
            if(e.getId()==2){
            e.setX(30);
            e.setY(155);
            }
            if(e.getId()==3){
            e.setX(30);
            e.setY(230);
            }
            if(e.getId()==4){
            e.setX(30);
            e.setY(305);
            }
            if(e.getId()==5){
            e.setX(200);
            e.setY(80);
            }
            if(e.getId()==6){
            e.setX(200);
            e.setY(192);
            }
            if(e.getId()==7){
            e.setX(200);
            e.setY(305);
            }
            if(e.getId()==8){
            e.setX(370);
            e.setY(192);
            }
        }
        drawing1.sch = schema;
        drawing1.repaint();
        
    }//GEN-LAST:event_createCircuitActionPerformed

    private void drawing1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawing1MousePressed
        dabartinis = gautiPagalKoordinates(evt.getX(), evt.getY());
        drawing1.dabar = dabartinis;
        drawing1.repaint();
        if(dabartinis!=null){
        x_k = evt.getX()-dabartinis.getX();
        y_k = evt.getY()-dabartinis.getY();
        }
    }//GEN-LAST:event_drawing1MousePressed

    private void drawing1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_drawing1KeyReleased
        if(schema!=null && dabartinis!=null){
            if(evt.getKeyCode()==127){
                schema.salintiElementa(dabartinis.getId());
            }
            drawing1.repaint();
        }
    }//GEN-LAST:event_drawing1KeyReleased

    private void drawing1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawing1MouseDragged
        if(schema!=null && dabartinis!=null){
            if(!evt.isControlDown() && !evt.isShiftDown()){
            dabartinis.setX(evt.getX()-x_k);
            dabartinis.setY(evt.getY()-y_k);
            drawing1.repaint();}
        }
    }//GEN-LAST:event_drawing1MouseDragged

    private void drawing1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawing1MouseClicked
        if(schema!=null && dabartinis!=null){
            if(evt.getClickCount()>1){
                if(dabartinis.getClass().equals(Input.class)){
                    ((Input) dabartinis).nustatytiReiksme(!dabartinis.gautiRezultata());
                    drawing1.dabar = null;
                    drawing1.repaint();
                }
                
            }
        }
    }//GEN-LAST:event_drawing1MouseClicked

    private void drawing1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawing1MouseReleased
        if(schema!=null && dabartinis!=null){
            Elementas iki = gautiPagalKoordinates(evt.getX(), evt.getY());
            if(iki!=null){
                if(evt.isControlDown()){
                schema.sujungti(dabartinis.getId(), iki.getId());
                }
                if(evt.isShiftDown()){
                schema.salintiSujungima(dabartinis.getId(), iki.getId());
                }
                drawing1.repaint();
            }
            
        }
        if(evt.isPopupTrigger()){
           jPopupMenu1.show(this,evt.getX()+8, evt.getY()+53);
        }
    }//GEN-LAST:event_drawing1MouseReleased

    private void showResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResultsActionPerformed
        drawing1.show = showResults.isSelected();
        drawing1.repaint();
    }//GEN-LAST:event_showResultsActionPerformed

    private void changeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeColorActionPerformed
        drawing1.selectedColor = JColorChooser.showDialog(this, "Choose a color", drawing1.selectedColor);
        drawing1.repaint();
    }//GEN-LAST:event_changeColorActionPerformed

    private void createWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createWindowActionPerformed
        schema = new Schema();
        Elementas.setNr(1);
        drawing1.sch = schema;
        drawing1.skaitiklis=0;
        max_lygis=0;
        drawing1.repaint();
    }//GEN-LAST:event_createWindowActionPerformed

    private void AddInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddInputActionPerformed
       schema.pridetiInput();
       Point p = getContentPane().getLocationOnScreen();
       Elementas naujas = schema.getElementai().get(schema.getElementai().size()-1);
       naujas.setX(MouseInfo.getPointerInfo().getLocation().x-p.x);
       naujas.setY(MouseInfo.getPointerInfo().getLocation().y-p.y);
       drawing1.help=false;
       drawing1.repaint();
    }//GEN-LAST:event_AddInputActionPerformed

    private void AddAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAndActionPerformed
       schema.pridetiANDelementa();
       Point p = getContentPane().getLocationOnScreen();
       Elementas naujas = schema.getElementai().get(schema.getElementai().size()-1);
       naujas.setX(MouseInfo.getPointerInfo().getLocation().x-p.x);
       naujas.setY(MouseInfo.getPointerInfo().getLocation().y-p.y);
       drawing1.help=false;
       drawing1.repaint();
    }//GEN-LAST:event_AddAndActionPerformed

    private void AddOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrActionPerformed
       schema.pridetiORelementa();
       Point p = getContentPane().getLocationOnScreen();
       Elementas naujas = schema.getElementai().get(schema.getElementai().size()-1);
       naujas.setX(MouseInfo.getPointerInfo().getLocation().x-p.x);
       naujas.setY(MouseInfo.getPointerInfo().getLocation().y-p.y);
       drawing1.help=false;
       drawing1.repaint();
    }//GEN-LAST:event_AddOrActionPerformed

    private void AddNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNotActionPerformed
       schema.pridetiNOTelementa();
       Point p = getContentPane().getLocationOnScreen();
       Elementas naujas = schema.getElementai().get(schema.getElementai().size()-1);
       naujas.setX(MouseInfo.getPointerInfo().getLocation().x-p.x);
       naujas.setY(MouseInfo.getPointerInfo().getLocation().y-p.y);
       drawing1.help=false;
       drawing1.repaint();
    }//GEN-LAST:event_AddNotActionPerformed

    private void AddXorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddXorActionPerformed
       schema.pridetiXORelementa();
       Point p = getContentPane().getLocationOnScreen();
       Elementas naujas = schema.getElementai().get(schema.getElementai().size()-1);
       naujas.setX(MouseInfo.getPointerInfo().getLocation().x-p.x);
       naujas.setY(MouseInfo.getPointerInfo().getLocation().y-p.y);
       drawing1.help=false;
       drawing1.repaint();
    }//GEN-LAST:event_AddXorActionPerformed

    private void startSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSimulationActionPerformed
        for(Elementas e:schema.getElementai()){
            int lygis = e.gautiLygi();
            e.setSeka(lygis);
            max_lygis = Math.max(max_lygis, lygis);
        }
        SimulateOutputs thread = new SimulateOutputs(drawing1, max_lygis);
        thread.start();
    }//GEN-LAST:event_startSimulationActionPerformed

    private void stepBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepBackActionPerformed
        if(drawing1.skaitiklis>0){
             drawing1.skaitiklis--;
              drawing1.repaint();
        }
    }//GEN-LAST:event_stepBackActionPerformed

    private void stepForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepForwardActionPerformed
        for(Elementas e:schema.getElementai()){
            int lygis = e.gautiLygi();
            e.setSeka(lygis);
            max_lygis = Math.max(max_lygis, lygis);
        }
        if(drawing1.skaitiklis<max_lygis){
            drawing1.skaitiklis++;
            drawing1.repaint();
        }
    }//GEN-LAST:event_stepForwardActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        JOptionPane.showMessageDialog(null, "To add a connection CTRL+Right Click on Gate, then drag to the Gate you want to connect to. \nDouble click Input Gate to change value");
    }//GEN-LAST:event_helpActionPerformed

    public Elementas gautiPagalKoordinates(int x, int y){
        if(schema!=null){
            for(Elementas e: schema.getElementai()){
                if(x>e.getX() && x < e.getX()+drawing1.zoom &&
                        y>e.getY() && y < e.getY()+drawing1.zoom)
                    return e;
            }
        }
        return null;
    }
    
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
            java.util.logging.Logger.getLogger(GVS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GVS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GVS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GVS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GVS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddAnd;
    private javax.swing.JMenuItem AddInput;
    private javax.swing.JMenuItem AddNot;
    private javax.swing.JMenuItem AddOr;
    private javax.swing.JMenuItem AddXor;
    private javax.swing.JMenuItem changeColor;
    private javax.swing.JMenuItem createCircuit;
    private javax.swing.JMenuItem createWindow;
    private External.Drawing drawing1;
    private javax.swing.JMenuItem exitProgram;
    private javax.swing.JMenuItem help;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JCheckBoxMenuItem showResults;
    private javax.swing.JMenuItem startSimulation;
    private javax.swing.JMenuItem stepBack;
    private javax.swing.JMenuItem stepForward;
    // End of variables declaration//GEN-END:variables
}
