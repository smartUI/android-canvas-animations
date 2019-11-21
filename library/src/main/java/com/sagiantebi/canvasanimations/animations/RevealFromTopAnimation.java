/*
 * RevealFromTopAnimation.java
 *
 * Copyright 2019 Sagi Antebi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sagiantebi.canvasanimations.animations;

import android.graphics.Canvas;

/**
 * A simple clipping animation for revealing or hiding the view from the top
 */
public class RevealFromTopAnimation extends CanvasAnimation {

    /**
     * {@inheritDoc}
     */
    public RevealFromTopAnimation() {
        super();
    }

    /**
     * {@inheritDoc}
     * @param canvas The canvas of the layout
     * @param step The current animation step
     */
    @Override
    protected void dispatchDraw(Canvas canvas, float step) {
        float w = getLayout().getContentView().getWidth();
        float h = getLayout().getContentView().getHeight();
        int top = 0;
        float bottom = h * step;
        canvas.clipRect(0, top, w, bottom);
        getLayout().commitDraw(canvas);
    }

}
