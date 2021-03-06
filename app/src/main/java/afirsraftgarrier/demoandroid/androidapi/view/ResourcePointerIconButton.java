/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package afirsraftgarrier.demoandroid.androidapi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.widget.Button;
import afirsraftgarrier.demoandroid.R;

public class ResourcePointerIconButton extends Button {
    private PointerIcon mCustomIcon;

    public ResourcePointerIconButton(Context context) {
        this(context, null);
    }

    public ResourcePointerIconButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ResourcePointerIconButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ResourcePointerIconButton(Context context, AttributeSet attrs,
                                    int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
        if (mCustomIcon == null) {
            mCustomIcon = PointerIcon.load(getResources(), R.drawable.custom_pointer_icon);
        }
        return mCustomIcon;
    }
}
