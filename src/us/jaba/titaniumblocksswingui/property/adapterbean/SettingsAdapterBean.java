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

import java.io.Serializable;

/**
 *
 * @author tbeckett
 */
public class SettingsAdapterBean implements Serializable
{

    int size;
    boolean alwaysOnTop;
    boolean showTitle;
    boolean movable;
    boolean storeState;

    public SettingsAdapterBean()
    {
        this.size = 100;
        this.alwaysOnTop = false;
        this.movable = true;
        this.showTitle = false;
        this.storeState = false;

    }

    public SettingsAdapterBean(SettingsAdapterBean other)
    {
        this.size = other.size;
        this.alwaysOnTop = other.alwaysOnTop;
        this.movable = other.movable;
        this.showTitle = other.showTitle;
        this.storeState = other.storeState;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public boolean isAlwaysOnTop()
    {
        return alwaysOnTop;
    }

    public void setAlwaysOnTop(boolean alwaysOnTop)
    {
        this.alwaysOnTop = alwaysOnTop;
    }

    public boolean isShowTitle()
    {
        return showTitle;
    }

    public void setShowTitle(boolean showTitle)
    {
        this.showTitle = showTitle;
    }

    public boolean isMovable()
    {
        return movable;
    }

    public void setMovable(boolean movable)
    {
        this.movable = movable;
    }

    public boolean isStoreState()
    {
        return storeState;
    }

    public void setStoreState(boolean storeState)
    {
        this.storeState = storeState;
    }

}
