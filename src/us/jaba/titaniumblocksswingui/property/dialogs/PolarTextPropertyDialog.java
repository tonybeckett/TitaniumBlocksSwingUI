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
package us.jaba.titaniumblocksswingui.property.dialogs;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import us.jaba.titaniumblocks.core.Scale;
import us.jaba.titaniumblocks.core.math.Angle;
import us.jaba.titaniumblocks.core.text.TextFacingCoreInfo;
import us.jaba.titaniumblocks.core.text.painter.BasicRadialTextPainter;
import us.jaba.titaniumblocksswingui.ClassMapper;
import us.jaba.titaniumblocksswingui.property.adapterbean.PolarTextAdapterBean;
import us.jaba.titaniumblocksswingui.property.panels.ColorPanel;
import us.jaba.titaniumblocksswingui.property.panels.ComboboxPanel;
import us.jaba.titaniumblocksswingui.property.panels.FontPanel;
import us.jaba.titaniumblocksswingui.property.panels.SliderPanel;

/**
 *
 * @author tbeckett
 */
public class PolarTextPropertyDialog extends javax.swing.JDialog
{

    private final Frame frame;
    private ClassMapper textPainterMapper;

    public PolarTextPropertyDialog(Frame parent, boolean modal, PolarTextAdapterBean polarText)
    {
        super(parent, modal);
        this.frame = parent;
        initComponents();
        init(polarText);

    }

    private void init(PolarTextAdapterBean polarText)
    {
        setTitle("Polar text Property Dialog");
        setSize(400, 320);

        this.PropertyPanel.add(new ColorPanel("Text Color", polarText.getColor())
        {
            @Override
            protected void update(Color color)
            {
                super.update(color);
                polarText.setColor(color);
            }

        }
        );

        this.PropertyPanel.add(new FontPanel(frame, "Text Font", polarText.getFont())
        {
            @Override
            public void fontChanged(Font font)
            {
                super.fontChanged(font);
                polarText.setFont(font);
            }
        }
        );

        this.PropertyPanel.add(new SliderPanel("Text Position", 100, 1, (int) (polarText.getRadiusAdjust().getValue() * 100.0))
        {
            @Override
            public void action(Integer value)
            {
                polarText.setRadiusAdjust(new Scale(value / 100.0));
            }

        }
        );

        textPainterMapper = new ClassMapper(TextFacingCoreInfo.getInstanceOfEach(), polarText.getTextPainter());
        this.PropertyPanel.add(new ComboboxPanel("Text Rotation", textPainterMapper.getList(), polarText.getTextPainter().getClass().getSimpleName())
        {
            @Override
            protected void action(String text)
            {
                polarText.setTextPainter((BasicRadialTextPainter) textPainterMapper.getItem(text));
            }

        }
        );

        this.PropertyPanel.add(new SliderPanel("Text Size", 100, 1, (int) (polarText.getTextSizeScale().getValue() * 100.0))
        {
            @Override
            public void action(Integer value)
            {
                polarText.setTextSizeScale(new Scale(value / 100.0));
            }

        }
        );

        
          this.PropertyPanel.add(new SliderPanel(" Angle", 360, 0, (int) (polarText.getAngle().getValue()))
        {
            @Override
            public void action(Integer value)
            {
                polarText.setAngle(new Angle(value));
            }

        }
        );
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

        PropertyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PropertyPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        PropertyPanel.setMinimumSize(new java.awt.Dimension(400, 300));
        PropertyPanel.setLayout(new java.awt.GridLayout(9, 0));
        getContentPane().add(PropertyPanel, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JPanel PropertyPanel;
    // End of variables declaration//GEN-END:variables
}
