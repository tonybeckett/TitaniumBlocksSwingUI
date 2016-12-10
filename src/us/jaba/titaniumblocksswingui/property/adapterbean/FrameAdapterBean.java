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
package us.jaba.titaniumblocksswingui.property.adapterbean;

import java.awt.Color;
  
import us.jaba.titaniumblocks.core.Scale;
import us.jaba.titaniumblocks.core.frames.BasicEffect;
import us.jaba.titaniumblocks.core.frames.RoundFrame;

/**
 *
 * @author tbeckett
 */
public class FrameAdapterBean
{
    
    RoundFrame frame;

    public FrameAdapterBean()
    {
    }

    public FrameAdapterBean(RoundFrame frame)
    {
        this.frame = frame;
    }

    
    public Scale getScaleFactor()
    {
        return frame.getScaleFactor();
    }

     
    public void setScaleFactor(Scale scaleFactor)
    {
        frame.setScaleFactor(scaleFactor);
    }

    
    public BasicEffect getEffect()
    {
        return frame.getEffect();
    }

    
    public void setEffect(BasicEffect effect)
    {
        frame.setEffect(effect);
    }

    public Color getInnerFrameColor()
    {
        return (Color) frame.getInnerFrameColor();
    }

    public Color getOuterFrameColor()
    {
        return (Color) frame.getOuterFrameColor();
    }

    public void setInnerFrameColor(Color innerFrameColor)
    {
        frame.setInnerFrameColor(innerFrameColor);
    }

    public void setOuterFrameColor(Color outerFrameColor)
    {
        frame.setOuterFrameColor(outerFrameColor);
    }

    public Color getPrimaryColor()
    {
        return frame.getPrimaryColor();
    }

    public void setPrimaryColor(Color primaryColor)
    {
        frame.setPrimaryColor(primaryColor);
    }
    
}
