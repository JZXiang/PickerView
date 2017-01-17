/*
 *  Copyright 2011 Yuri Kanivets
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.jzxiang.pickerview.adapters;

import android.content.Context;
import android.support.annotation.StringRes;
import android.text.TextUtils;

import com.jzxiang.pickerview.utils.PickerContants;

/**
 * Numeric Wheel adapter.
 */
public class NumericWheelAdapter extends AbstractWheelTextAdapter {

    /**
     * The default min value
     */
    public static final int DEFAULT_MAX_VALUE = 9;

    /**
     * The default max value
     */
    private static final int DEFAULT_MIN_VALUE = 0;

    /**
     * The default time gep value
     */
    private static final int DEFAULT_MIN_TIME_GEP = 1;

    Context context;
    // Values
    private int minValue;
    private int maxValue;
    private int timeGap = DEFAULT_MIN_TIME_GEP;

    // format
    private String format;
    //unit
    @StringRes private int unit;
    //type
    private int type;

    /**
     * Constructor
     *
     * @param context  the current context
     * @param minValue the wheel min value
     * @param maxValue the wheel max value
     * @param format   the format string
     * @param unit     the wheel unit value
     */
    public NumericWheelAdapter(Context context, int minValue, int maxValue, String format, @StringRes int unit, int type) {
        super(context);
        this.context = context;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.format = format;
        this.unit = unit;
        this.type = type;
    }

    /**
     * Constructor
     *
     * @param context  the current context
     * @param minValue the wheel min value
     * @param maxValue the wheel max value
     * @param format   the format string
     * @param unit     the wheel unit value
     * @param type     the wheel type value
     * @param type     the wheel type value
     */
    public NumericWheelAdapter(Context context, int minValue, int maxValue, String format, @StringRes int unit, int type, int timeGap) {
        super(context);
        this.context = context;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.format = format;
        this.unit = unit;
        this.type = type;
        this.timeGap = timeGap;
    }

    @Override
    public CharSequence getItemText(int index) {
        if (index >= 0 && index < getItemsCount()) {
            int value = minValue + index;

            if(type == PickerContants.MINUTE) {
               value = minValue + (index * timeGap);
            }
            String text = !TextUtils.isEmpty(format) ? String.format(format, value) : Integer.toString(value);
            text = TextUtils.isEmpty(context.getString(unit)) ? text : text + context.getString(unit);

            return text;
        }
        return null;
    }

    @Override
    public int getItemsCount() {
        if(type == PickerContants.MINUTE) {
            return (( maxValue - minValue) / timeGap) + 1;
        } else {
            return maxValue - minValue + 1;
        }
    }
}
