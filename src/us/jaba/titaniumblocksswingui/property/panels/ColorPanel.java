/*
 * Copyright (c) 2016, Tony Beckett
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * The names of its contributors may not be used to endorse or promote
 * products derived from this software without specific prior written
 * permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.jaba.titaniumblocksswingui.property.panels;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author tbeckett
 */
public class ColorPanel extends javax.swing.JPanel
{

    private Color color;

    /**
     * Creates new form StringPanel
     */
    public ColorPanel()
    {
        this("property", Color.RED);
    }

    public ColorPanel(String name, Color value)
    {
        initComponents();
        this.jLabel1.setText(name);
        setValue(value);
        this.color = value;
    }

    protected void update(Color color)
    {
        setValue(color);
    }

    private void buttonPushed()
    {
        color = JColorChooser.showDialog(null, "Choose color", color);
        update(color);
    }

    public final void setValue(Color color)
    {
        this.jLabel2.setText(String.format("%d,%d,%d", color.getRed(), color.getGreen(), color.getBlue()));
        this.jLabel3.setBackground(color);
        this.jLabel3.setForeground(color);
        this.color = color;
    }

    public void setText(String text)
    {
        jLabel1.setText(text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("This is the label of the property");
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 18));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 18));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 18));
        add(jLabel1, java.awt.BorderLayout.WEST);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("     ");
        jLabel3.setToolTipText("");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, java.awt.BorderLayout.WEST);

        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.LINE_END);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        buttonPushed();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
