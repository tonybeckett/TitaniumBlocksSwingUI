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
import java.awt.Font;
import us.jaba.titaniumblocks.core.Scale;
import us.jaba.titaniumblocks.core.math.Angle;

import us.jaba.titaniumblocks.core.text.painter.BasicRadialTextPainter;
import us.jaba.titaniumblocks.core.text.types.PolarText;

/**
 *
 * @author tbeckett
 */
public class PolarTextAdapterBean
{

    PolarText delegate;

    public PolarTextAdapterBean()
    {
    }

    public PolarTextAdapterBean(PolarText text)
    {
        this.delegate = text;
    }

    public Font getFont()
    {
        return delegate.getFont();
    }

    public void setFont(Font font)
    {
        delegate.setFont(font);
    }

    public Scale getRadiusAdjust()
    {
        return delegate.getRadiusAdjust();
    }

    public void setRadiusAdjust(Scale radiusAdjust)
    {
        delegate.setRadiusAdjust(radiusAdjust);
    }

    public Angle getAngle()
    {
        return delegate.getAngle();
    }

    public void setAngle(Angle angle)
    {
        delegate.setAngle(angle);
    }

    public Color getColor()
    {
        return delegate.getColor();
    }

    public void setColor(Color color)
    {
        delegate.setColor(color);
    }

  

    public BasicRadialTextPainter getTextPainter()
    {
        return delegate.getTextPainter();
    }

    public void setTextPainter(BasicRadialTextPainter textPainter)
    {
        delegate.setTextPainter(textPainter);
    }

    public Scale getTextSizeScale()
    {
        return delegate.getTextSizeScale();
    }

    public void setTextSizeScale(Scale textSizeScale)
    {
        delegate.setTextSizeScale(textSizeScale);
    }

}
