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


import us.jaba.titaniumblocksswingui.ClassMapper;
import us.jaba.titaniumblocks.core.Scale;
import us.jaba.titaniumblocks.core.color.GradientCoreInfo;
import us.jaba.titaniumblocks.core.color.GradientPalette;
import us.jaba.titaniumblocksswingui.property.adapterbean.PointerAdapterBean;
import us.jaba.titaniumblocksswingui.property.panels.BooleanPanel;
import us.jaba.titaniumblocksswingui.property.panels.ComboboxPanel;
import us.jaba.titaniumblocksswingui.property.panels.SliderPanel;

/**
 *
 * @author tbeckett
 */
public class PointerPropertyDialog extends javax.swing.JDialog
{

    ClassMapper<GradientPalette> colorMapper;
    ClassMapper<GradientPalette> secColorMapper;

    /**
     * Creates new form SettingsDialog
     */
    public PointerPropertyDialog(java.awt.Frame parent, boolean modal, PointerAdapterBean pointerBean)
    {
        super(parent, modal);
        initComponents();
        setTitle("Pointer Property Dialog");
        setSize(400, 380);

        this.PropertyPanel.add(new SliderPanel("Center Size", 100, 1, (int) (pointerBean.getCenterScale().getValue() * 100.0))
        {
            @Override
            public void action(Integer value)
            {
                pointerBean.setCenterScale(new Scale(value / 100.0));
            }

        }
        );
        this.PropertyPanel.add(new SliderPanel("Front Size", 100, 1, (int) (pointerBean.getFrontScale().getValue() * 100.0))
        {
            @Override
            public void action(Integer value)
            {
                pointerBean.setFrontScale(new Scale(value / 100.0));
            }

        }
        );

        this.PropertyPanel.add(new SliderPanel("Rear Size", 100, 1, (int) (pointerBean.getTailScale().getValue() * 100.0))
        {
            @Override
            public void action(Integer value)
            {
                pointerBean.setTailScale(new Scale(value / 100.0));
            }

        }
        );

        colorMapper = new ClassMapper(GradientCoreInfo.getInstanceOfEach(), pointerBean.getPrimaryColor());
        this.PropertyPanel.add(new ComboboxPanel("Primary Color", colorMapper.getList(), pointerBean.getPrimaryColor().getClass().getSimpleName())
        {
            @Override
            protected void action(String text)
            {
                pointerBean.setPrimaryColor(colorMapper.getItem(text));
            }
        }
        );

        secColorMapper = new ClassMapper(GradientCoreInfo.getInstanceOfEach(), pointerBean.getSecondaryColor());
        this.PropertyPanel.add(new ComboboxPanel("Secondary Color", colorMapper.getList(), pointerBean.getSecondaryColor().getClass().getSimpleName())
        {
            @Override
            protected void action(String text)
            {
                pointerBean.setSecondaryColor(colorMapper.getItem(text));
            }
        }
        );

        this.PropertyPanel.add(new BooleanPanel("Show center pin", pointerBean.isCenterPinVisible())
        {
            @Override
            protected void update(Boolean b)
            {
                super.update(b);
                pointerBean.setCenterPinVisible(b);
            }

        }
        );

        this.PropertyPanel.add(new BooleanPanel("Show center post", pointerBean.isCenterPostVisible())
        {
            @Override
            protected void update(Boolean b)
            {
                super.update(b);
                pointerBean.setCenterPostVisible(b);
            }

        }
        );

        this.PropertyPanel.add(new BooleanPanel("Show 3d", pointerBean.isThreeD())
        {
            @Override
            protected void update(Boolean b)
            {
                super.update(b);
                pointerBean.setThreeD(b);
            }

        }
        );
        this.PropertyPanel.add(new BooleanPanel("Show Shadow", pointerBean.isShadowActive())
        {
            @Override
            protected void update(Boolean b)
            {
                super.update(b);
                pointerBean.setShadowActive(b);
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
        PropertyPanel.setLayout(new java.awt.GridLayout(10, 0));
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
