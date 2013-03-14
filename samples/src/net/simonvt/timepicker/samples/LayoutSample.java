package net.simonvt.timepicker.samples;

import net.simonvt.timepicker.TimePicker;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Simon Vig Therkildsen <simonvt@gmail.com>
 */
public class LayoutSample extends Activity {

    private static final String TAG = "LayoutSample";

    TimePicker mTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        mTimePicker = (TimePicker) findViewById(R.id.timePicker);
    }
}
