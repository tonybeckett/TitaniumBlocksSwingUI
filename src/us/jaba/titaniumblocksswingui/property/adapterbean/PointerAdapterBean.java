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

 
 
import us.jaba.titaniumblocks.core.Scale;
import us.jaba.titaniumblocks.core.color.GradientPalette;
import us.jaba.titaniumblocks.core.pointers.AbstractPointer;

/**
 *
 * @author tbeckett
 */
public class PointerAdapterBean
{

    AbstractPointer pointer;

    public PointerAdapterBean()
    {
    }

    public PointerAdapterBean(AbstractPointer pointer)
    {
        this.pointer = pointer;
        //            System.out.println(String.format("pointer = %d", pointer.));
    } //            System.out.println(String.format("pointer = %d", pointer.));

    //        @PropertyRendererOverride(type = ScaleRenderer.class)
    //        public Scale getScaleFactor()
    //        {
    //            return frame.getScaleFactor();
    //        }
    //
    //        @PropertyEditorOverride(type = ScalePropertyEditor.class)
    //        public void setScaleFactor(Scale scaleFactor)
    //        {
    //            frame.setScaleFactor(scaleFactor);
    //        }
    
    public Scale getCenterScale()
    {
        Scale centerScale = pointer.getCenterScale();
        return centerScale;
    }

   
    public void setCenterScale(Scale centerScale)
    {
        pointer.setCenterScale(centerScale);
    }

    
    public void setFrontScale(Scale scale)
    {
        pointer.setFrontScale(scale);
    }

    public void setShadowActive(Boolean b)
    {
        pointer.setShadowActive(b);
    }

    public Boolean isShadowActive()
    {
        return pointer.isShadowActive();
    }

   
    public void setTailScale(Scale scale)
    {
        pointer.setTailScale(scale);
    }

     
    public Scale getFrontScale()
    {
        return pointer.getFrontScale();
    }

     
    public Scale getTailScale()
    {
        return pointer.getTailScale();
    }

    //        public GradientPalette getPointerColor()
    //        {
    //            return pointer.getPointerColor();
    //        }
    
    public GradientPalette getPrimaryColor()
    {
        return pointer.getPrimaryColor();
    }

     
    public void setPrimaryColor(GradientPalette primaryColor)
    {
        if (primaryColor != null)
        {
            pointer.setPrimaryColor(primaryColor);
        }
    }

    public boolean isCenterPostVisible()
    {
        return pointer.isCenterPostVisible();
    }

    public void setCenterPostVisible(boolean centerPostVisible)
    {
        pointer.setCenterPostVisible(centerPostVisible);
    }

    public boolean isCenterPinVisible()
    {
        return pointer.isCenterPinVisible();
    }

    public void setCenterPinVisible(boolean centerPinVisible)
    {
        pointer.setCenterPinVisible(centerPinVisible);
    }

     
    public GradientPalette getSecondaryColor()
    {
        return pointer.getSecondaryColor();
    }

    
    public void setSecondaryColor(GradientPalette secondaryColor)
    {
        if (secondaryColor != null)
        {
            pointer.setSecondaryColor(secondaryColor);
        }
    }

    public boolean isThreeD()
    {
        return pointer.isThreeD();
    }

    public void setThreeD(boolean threeD)
    {
        pointer.setThreeD(threeD);
    }

}
