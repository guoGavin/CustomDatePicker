package com.test.gavinguo.customdatepicker;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;

import com.test.gavinguo.library.DatePicker;
import com.test.gavinguo.library.DatePickerSignalSelection;

/**
 * @author Simon Vig Therkildsen <simonvt@gmail.com>
 */
public class MyLayoutSample extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_single);

        DatePickerSignalSelection datePicker = (DatePickerSignalSelection) findViewById(R.id.datePicker);
        DatePickerSignalSelection datePicker2 = (DatePickerSignalSelection) findViewById(R.id.datePicker2);

        boolean showCalendar = false;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            showCalendar = getResources().getConfiguration().smallestScreenWidthDp >= 600;
        } else {
            showCalendar =
                    (getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_XLARGE;
        }

        datePicker.setCalendarViewShown(showCalendar);
        datePicker2.setCalendarViewShown(showCalendar);
    }
}
