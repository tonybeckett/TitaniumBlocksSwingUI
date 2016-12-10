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
import us.jaba.titaniumblocks.core.text.painter.BasicRadialTextPainter;
import us.jaba.titaniumblocks.core.tickmarks.marks.types.AbstractRadialTickmark;

/**
 *
 * @author tbeckett
 */
public class TickmarkAdapterBean
{

    protected AbstractRadialTickmark tickmark;

    public TickmarkAdapterBean()
    {
    }

    public TickmarkAdapterBean(AbstractRadialTickmark tickmark)
    {
        this.tickmark = tickmark;
    }

    public Font getFont()
    {
        return tickmark.getFont();
    }

    public void setFont(Font font)
    {
        tickmark.setFont(font);
    }

    public Color getMajorColor()
    {
        return tickmark.getMajorColor();
    }

    public void setMajorColor(Color majorColor)
    {
        tickmark.setMajorColor(majorColor);
    }

    public Color getMediumColor()
    {
        return tickmark.getMediumColor();
    }

    public void setMediumColor(Color mediumColor)
    {
        tickmark.setMediumColor(mediumColor);
    }

    public Color getMinorColor()
    {
        return tickmark.getMinorColor();
    }

    public void setMinorColor(Color minorColor)
    {
        tickmark.setMinorColor(minorColor);
    }

    public Color getTextColor()
    {
        return tickmark.getTextColor();
    }

    public void setTextColor(Color textColor)
    {
        tickmark.setTextColor(textColor);
    }

    public Scale getTextPositionScale()
    {
        return tickmark.getTextPositionScale();
    }

    public void setTextPositionScale(Scale textPositionScale)
    {
        tickmark.setTextPositionScale(textPositionScale);
    }

    public Scale getTicksPositionScale()
    {
        return tickmark.getTicksPositionScale();
    }

    public void setTicksPositionScale(Scale ticksPositionScale)
    {
        tickmark.setTicksPositionScale(ticksPositionScale);
    }

    public Scale getTextSizeScale()
    {
        return tickmark.getTextSizeScale();
    }

    public void setTextSizeScale(Scale textSizeScale)
    {
        tickmark.setTextSizeScale(textSizeScale);
    }

    public BasicRadialTextPainter getTextPainter()
    {
        return tickmark.getTextPainter();
    }

    public void setTextPainter(BasicRadialTextPainter textPainter)
    {
        tickmark.setTextPainter(textPainter);
    }

}
