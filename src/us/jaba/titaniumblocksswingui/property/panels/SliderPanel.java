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

/**
 *
 * @author tbeckett
 */
public class SliderPanel extends javax.swing.JPanel
{

    /**
     * Creates new form StringPanel
     */
    public SliderPanel()
    {
        this("property", 100, 0,  50);
    }

    public SliderPanel(String name, Integer max, Integer min, Integer value)
    {
        initComponents();
        this.jLabel1.setText(name);
        this.jSlider1.setMinimum(min);
        this.jSlider1.setMaximum(max);
        this.jSlider1.setValue(value);
         
    }

    public void action(Integer value)
    {

    }

    public void setValue(Integer value)
    {
        jSlider1.setValue(value);
    }

    public void setText(String text)
    {
        jLabel1.setText(text);
    }

    public void setMajorTickSpacing(int n)
    {
        jSlider1.setMajorTickSpacing(n);
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
        jSlider1 = new javax.swing.JSlider();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("This is the label of the property");
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 18));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 18));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 18));
        add(jLabel1, java.awt.BorderLayout.WEST);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.addAncestorListener(new javax.swing.event.AncestorListener()
        {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt)
            {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt)
            {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt)
            {
                jSlider1AncestorMoved(evt);
            }
        });
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                jSlider1PropertyChange(evt);
            }
        });
        jPanel1.add(jSlider1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1PropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_jSlider1PropertyChange
    {//GEN-HEADEREND:event_jSlider1PropertyChange
        action(this.jSlider1.getValue());
    }//GEN-LAST:event_jSlider1PropertyChange

    private void jSlider1AncestorMoved(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_jSlider1AncestorMoved
    {//GEN-HEADEREND:event_jSlider1AncestorMoved
        action(this.jSlider1.getValue());
    }//GEN-LAST:event_jSlider1AncestorMoved

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jSlider1StateChanged
    {//GEN-HEADEREND:event_jSlider1StateChanged
       action(this.jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
