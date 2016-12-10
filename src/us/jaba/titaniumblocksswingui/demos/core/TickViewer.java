/*
 * Copyright (c) 2015, Tony Beckett
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
package us.jaba.titaniumblocksswingui.demos.core;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import us.jaba.titaniumblocks.core.Images;
import us.jaba.titaniumblocks.core.color.ColorPalette;
import us.jaba.titaniumblocks.core.tickmarks.ticks.LinearTickImageFactory;
import us.jaba.titaniumblocks.core.tickmarks.ticks.TickCoreInfo;
import us.jaba.titaniumblocks.core.tickmarks.ticks.LinearTickModel;

/**
 *
 * @author tbeckett
 */
public class TickViewer extends javax.swing.JFrame
{

    JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    JPanel list = new JPanel();

    /**
     *
     * @throws NoSuchMethodException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     */
    public TickViewer() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        initComponents();

        this.setLayout(new java.awt.BorderLayout());

//        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        List<Class<?>> classes = TickCoreInfo.getAvailableClasses();

        int len = classes.size();
        GridLayout gl = new GridLayout();
        gl.setRows(len);
        list.setLayout(gl);
        Dimension dim = new Dimension(200, 200);
        for (int i = 0; i < len; i++)
        {
            JPanel panel = new JPanel();
//            panel.setBorder(new LineBorder(ColorPalette.BLACK, 1));
            panel.setLayout(new BorderLayout());
            Class<?> aClass = classes.get(i);
            Constructor c = aClass.getConstructor();
            LinearTickModel pp = (LinearTickModel) c.newInstance();

            JLabel jlabel = new JLabel();
            jlabel.setText(aClass.getSimpleName().replace("TickPainter", ""));
            jlabel.setIcon(new ImageIcon(new LinearTickImageFactory(pp).build(dim)));
//            jlabel.setForeground(ColorPalette.BLACK);
            jlabel.setBackground(ColorPalette.WHITE);
            panel.setBackground(ColorPalette.WHITE);
            panel.add(jlabel, BorderLayout.CENTER);

            list.add(panel);
        }
        jScrollPane1.setViewportView(list);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
        this.setIconImage(Images.titaniumblocks16);
        this.setSize(new Dimension(400, 800));
    }

    private void initComponents()
    {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TitaniumBlocks - TickViewer");
        pack();
    }// 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TickViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TickViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TickViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TickViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    new TickViewer().setVisible(true);
                } catch (NoSuchMethodException ex)
                {
                    Logger.getLogger(TickViewer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex)
                {
                    Logger.getLogger(TickViewer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex)
                {
                    Logger.getLogger(TickViewer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex)
                {
                    Logger.getLogger(TickViewer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex)
                {
                    Logger.getLogger(TickViewer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
