package com.jzxiang.pickerview.config;

import android.support.annotation.StringRes;

import com.jzxiang.pickerview.data.Type;
import com.jzxiang.pickerview.data.WheelCalendar;
import com.jzxiang.pickerview.listener.OnDateSetListener;


/**
 * Created by jzxiang on 16/5/15.
 */
public class PickerConfig {

    public Type mType = DefaultConfig.TYPE;
    public int mThemeColor = DefaultConfig.COLOR;

    @StringRes public int mCancelString = DefaultConfig.CANCEL;
    @StringRes public int mSureString = DefaultConfig.SURE;
    @StringRes public int mTitleString = DefaultConfig.TITLE;
    public int mToolBarTVColor = DefaultConfig.TOOLBAR_TV_COLOR;

    public int mWheelTVNormalColor = DefaultConfig.TV_NORMAL_COLOR;
    public int mWheelTVSelectorColor = DefaultConfig.TV_SELECTOR_COLOR;
    public int mWheelTVSize = DefaultConfig.TV_SIZE;
    public boolean cyclic = DefaultConfig.CYCLIC;

    @StringRes public int mYear = DefaultConfig.YEAR;
    @StringRes public int mMonth = DefaultConfig.MONTH;
    @StringRes public int mDay = DefaultConfig.DAY;
    @StringRes public int mHour = DefaultConfig.HOUR;
    @StringRes public int mMinute = DefaultConfig.MINUTE;
    public int mTimeGap = DefaultConfig.TIMEGAP;

    /**
     * The min timeMillseconds
     */
    public WheelCalendar mMinCalendar = new WheelCalendar(0);

    /**
     * The max timeMillseconds
     */
    public WheelCalendar mMaxCalendar = new WheelCalendar(0);

    /**
     * The default selector timeMillseconds
     */
    public WheelCalendar mCurrentCalendar = new WheelCalendar(System.currentTimeMillis());

    public OnDateSetListener mCallBack;
}
