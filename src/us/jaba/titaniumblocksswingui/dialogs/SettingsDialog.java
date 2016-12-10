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
package us.jaba.titaniumblocksswingui.dialogs;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import us.jaba.titaniumblocksswingui.property.adapterbean.SettingsAdapterBean;

import us.jaba.titaniumblocksswingui.property.panels.BooleanPanel;
import us.jaba.titaniumblocksswingui.property.panels.SliderPanel;

/**
 *
 * @author tbeckett
 */
public class SettingsDialog extends javax.swing.JDialog
{

    GridLayout gl = new GridLayout(8, 0);
    int count = 0;

    /**
     * Creates new form SettingsDialog
     */
    public SettingsDialog(java.awt.Frame parent, boolean modal, SettingsAdapterBean settings)
    {
        super(parent, modal);
        initComponents();
//        this.setLayout(gl);
        setSize(350, 195);

        addPanel(new BooleanPanel("Always on top", settings.isAlwaysOnTop())
        {
            @Override
            protected void update(Boolean b)
            {
                super.update(b);
                settings.setAlwaysOnTop(b);
            }

        }
        );
        addPanel(new BooleanPanel("Drag window", settings.isMovable())
        {
            @Override
            protected void update(Boolean b)
            {
                super.update(b);
                settings.setMovable(b);
            }

        });

        addPanel(new BooleanPanel("Save state to file", settings.isStoreState())
        {
            @Override
            protected void update(Boolean b)
            {
                super.update(b);
                settings.setStoreState(b);
            }

        });

//        this.jPanel1.add(new BooleanPanel("Show time zone", settings.isShowTimezone())
//        {
//            @Override
//            protected void update(Boolean b)
//            {
//                super.update(b);
//                settings.setShowTimezone(b);
//            }
//
//        });
        addPanel(new SliderPanel("Window Size", 1000, 100, settings.getSize())
        {
            @Override
            public void action(Integer value)
            {
                settings.setSize(value);
            }

        }
        );

        this.addWindowListener(new WindowAdapter()
        {

            @Override
            public void windowClosed(WindowEvent e)
            {

            }

            @Override
            public void windowClosing(WindowEvent e)
            {
                dialogClosing();
            }
        });
    }

    protected void dialogClosing()
    {
    }

    public void addPanel(JPanel panel)
    {
        this.jPanel1.add(panel);
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

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(new java.awt.GridLayout(5, 0));
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[])
//    {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(SettingsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(SettingsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(SettingsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(SettingsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable()
//        {
//            public void run()
//            {
//                SettingsDialog dialog = new SettingsDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter()
//                {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e)
//                    {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}