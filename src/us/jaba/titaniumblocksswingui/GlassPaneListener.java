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
package us.jaba.titaniumblocksswingui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

/**
 *
 * @author tbeckett
 */
public class GlassPaneListener extends MouseInputAdapter
{

    Toolkit toolkit;
    GlassPane glassPane;
    Container contentPane;

    public GlassPaneListener(GlassPane glassPane, Container contentPane)
    {
        toolkit = Toolkit.getDefaultToolkit();

        this.glassPane = glassPane;
        this.contentPane = contentPane;
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {

        redispatchMouseEvent(e, false);
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        redispatchMouseEvent(e, false);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        redispatchMouseEvent(e, false);
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        redispatchMouseEvent(e, false);
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        redispatchMouseEvent(e, false);
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        redispatchMouseEvent(e, false);
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        redispatchMouseEvent(e, true);
    }

    //A basic implementation of redispatching events.
    private void redispatchMouseEvent(MouseEvent e,
            boolean repaint)
    {
        Point glassPanePoint = e.getPoint();
        Container container = contentPane;
        Point containerPoint = SwingUtilities.convertPoint(
                glassPane,
                glassPanePoint,
                contentPane);
        if (containerPoint.y < 0)
        { //we're not in the content pane
            if (containerPoint.y >= 0)
            {
                //The mouse event is over the menu bar.
                //Could handle specially.
            } else
            {
                //The mouse event is over non-system window 
                //decorations, such as the ones provided by
                //the Java look and feel.
                //Could handle specially.
            }
        } else
        {
            //The mouse event is probably over the content pane.
            //Find out exactly which component it's over.  
            Component component
                    = SwingUtilities.getDeepestComponentAt(
                            container,
                            containerPoint.x,
                            containerPoint.y);

        }

        //Update the glass pane if requested.
        if (repaint)
        {
            glassPane.setPoint(glassPanePoint);
            glassPane.repaint();
        }
    }
}
