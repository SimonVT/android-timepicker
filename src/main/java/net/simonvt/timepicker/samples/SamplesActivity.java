package net.simonvt.timepicker.samples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SamplesActivity extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samples);

        findViewById(R.id.btnDialog).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(SamplesActivity.this, DialogSample.class);
                startActivity(i);
            }
        });

        findViewById(R.id.btnLayout).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(SamplesActivity.this, LayoutSample.class);
                startActivity(i);
            }
        });
    }
}
