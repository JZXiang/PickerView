package com.jzxiang.pickerview.config;

import android.support.annotation.StringRes;

import com.jzxiang.pickerview.R;
import com.jzxiang.pickerview.data.Type;

/**
 * Created by jzxiang on 16/5/15.
 */
public class DefaultConfig {
    public static final Type TYPE = Type.ALL;
    public static final int COLOR = 0XFFE60012;
    public static final int TOOLBAR_TV_COLOR = 0xFFFFFFFF;
    public static final int TV_NORMAL_COLOR = 0xFF999999;
    public static final int TV_SELECTOR_COLOR = 0XFF404040;
    public static final int TV_SIZE = 12;
    public static final boolean CYCLIC = true;
    @StringRes public static int CANCEL = R.string.picker_cancel;
    @StringRes public static int SURE =  R.string.picker_sure;
    @StringRes public static int TITLE = R.string.picker_title;
    @StringRes public static int YEAR =  R.string.picker_year;
    @StringRes public static int MONTH =  R.string.picker_month;
    @StringRes public static int DAY =  R.string.picker_day;
    @StringRes public static int HOUR =  R.string.picker_hour;
    @StringRes public static int MINUTE =  R.string.picker_minute;
    public static int TIMEGAP = 1;


}
