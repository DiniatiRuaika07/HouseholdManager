package activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lulua.tesyant.householdmanager.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setTitle(getString(R.string.about));
    }
}
