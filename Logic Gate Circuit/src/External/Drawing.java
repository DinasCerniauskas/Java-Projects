/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package External;

import Internal.Elementas;
import Internal.Schema;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class Drawing extends javax.swing.JPanel {

    BufferedImage image;
    Schema sch = null;
    boolean help = true;
    int zoom = 50;
    Elementas dabar = null;
    boolean show = true;
    int skaitiklis = 0;
    Font myFont = new Font ("Gill Sans", 1, 17);
    
    Color selectedColor = Color.red;
    
    public Drawing() {
        initComponents();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        String outputNumber;
        g.setFont (myFont);
        if(help){
            g.drawString("Right click mouse to add a Gate", 130, 20);
        }else{
            for(Elementas e:sch.getElementai()){
                if(skaitiklis!=0){
                g.drawString(skaitiklis + "", 10, 20);
                }
                g.setColor(Color.WHITE);
                if(dabar!=null && dabar.getId()==e.getId()){
                    g.setColor(selectedColor);
                }
                String tipas = e.getClass().toString().substring(15);
                
                if (tipas.equals("XOR")){               
                try{
                    image = ImageIO.read(getClass().getResourceAsStream("/Resources/xor.png"));
                }catch(IOException z){
                    z.printStackTrace();
                }  
                g.drawImage(image, e.getX(), e.getY(),null);
                g.drawRect(e.getX(), e.getY(), zoom+12, zoom-5);
                g.setColor(Color.black);
                //g.drawString("Right click mouse to add an element", 130, 20);
                if(show){   
                    if(e.gautiRezultata()){
                        outputNumber = "1";
                    } else {
                        outputNumber = "0";
                    }
                //g.drawString(outputNumber, e.getX()+28, e.getY()+27);
                
                if (skaitiklis == 0) {
                        g.drawString(outputNumber, e.getX()+28, e.getY()+27);
                    }else{
                        if(e.getSeka()<=skaitiklis){
                            g.drawString(outputNumber, e.getX()+28, e.getY()+27);
                        }
                    }
                }
                for(Elementas in:e.getInput()){
                    g.drawLine(e.getX()+12, e.getY()+23, in.getX()+zoom+4, in.getY()+21);
                }
                }
                
                if (tipas.equals("AND")){
                try{
                    image = ImageIO.read(getClass().getResourceAsStream("/Resources/and.png"));
                }catch(IOException z){
                    z.printStackTrace();
                }  
                g.drawImage(image, e.getX(), e.getY(),null);
                g.drawRect(e.getX(), e.getY(), zoom+6, zoom-5);
                g.setColor(Color.black);
                if(show){                   
                if(e.gautiRezultata()){
                        outputNumber = "1";
                    } else {
                        outputNumber = "0";
                    }
                //g.drawString(outputNumber, e.getX()+16, e.getY()+27);
                
                if (skaitiklis == 0) {
                        g.drawString(outputNumber, e.getX()+16, e.getY()+27);
                    }else{
                        if(e.getSeka()<=skaitiklis){
                           g.drawString(outputNumber, e.getX()+16, e.getY()+27);
                        }
                    }
                }
                for(Elementas in:e.getInput()){
                    g.drawLine(e.getX()+2, e.getY()+23, in.getX()+zoom+4, in.getY()+21);
                }
                }
                
                if (tipas.equals("NOT")){
                try{
                    image = ImageIO.read(getClass().getResourceAsStream("/Resources/not.png"));
                }catch(IOException z){
                    z.printStackTrace();
                }  
                g.drawImage(image, e.getX(), e.getY(),null);
                g.drawRect(e.getX(), e.getY(), zoom+9, zoom-8);
                g.setColor(Color.black);
                if(show){                   
                if(e.gautiRezultata()){
                        outputNumber = "1";
                    } else {
                        outputNumber = "0";
                    }
                //g.drawString(outputNumber, e.getX()+14, e.getY()+25);
                
                if (skaitiklis == 0) {
                        g.drawString(outputNumber, e.getX()+14, e.getY()+25);
                    }else{
                        if(e.getSeka()<=skaitiklis){
                            g.drawString(outputNumber, e.getX()+14, e.getY()+25);
                        }
                    }
                }
                for(Elementas in:e.getInput()){
                    g.drawLine(e.getX(), e.getY()+20, in.getX()+zoom+4, in.getY()+21);
                }
                }
                
                if (tipas.equals("OR")){
                try{
                    image = ImageIO.read(getClass().getResourceAsStream("/Resources/or.png"));
                }catch(IOException z){
                    z.printStackTrace();
                }  
                g.drawImage(image, e.getX(), e.getY(),null);
                g.drawRect(e.getX(), e.getY(), zoom+4, zoom-5);
                g.setColor(Color.black);              
                if(show){                   
                if(e.gautiRezultata()){
                        outputNumber = "1";
                    } else {
                        outputNumber = "0";
                    }
                //g.drawString(outputNumber, e.getX()+22, e.getY()+27);
                
                if (skaitiklis == 0) {
                        g.drawString(outputNumber, e.getX()+22, e.getY()+27);
                    }else{
                        if(e.getSeka()<=skaitiklis){
                            g.drawString(outputNumber, e.getX()+22, e.getY()+27);
                        }
                    }
                }
                for(Elementas in:e.getInput()){
                    g.drawLine(e.getX()+12, e.getY()+23, in.getX()+zoom+4, in.getY()+21);
                }
                }
                
                if (tipas.equals("Input")){
                try{
                    image = ImageIO.read(getClass().getResourceAsStream("/Resources/Input.png"));
                }catch(IOException z){
                    z.printStackTrace();
                }  
                g.drawImage(image, e.getX(), e.getY(),null);
                g.drawRect(e.getX()+11, e.getY()-2, zoom-6, zoom-4);
                g.setColor(Color.black);
                if(show){                   
                if(e.gautiRezultata()){
                        outputNumber = "1";
                    } else {
                        outputNumber = "0";
                    }
                //g.drawString(outputNumber, e.getX()+29, e.getY()+26);
                
                if (skaitiklis == 0) {
                        g.drawString(outputNumber, e.getX()+29, e.getY()+26);
                    }else{
                        if(e.getSeka()<=skaitiklis){
                            g.drawString(outputNumber, e.getX()+29, e.getY()+26);
                        }
                    }
                }
                for(Elementas in:e.getInput()){
                    g.drawLine(e.getX(), e.getY()+zoom/2, in.getX()+zoom, in.getY()+zoom/2);
                }
                }
                
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
