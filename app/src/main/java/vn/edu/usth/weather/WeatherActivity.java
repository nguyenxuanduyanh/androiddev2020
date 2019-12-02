package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "Weather Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        PagerAdapter adapter = new WeatherAndForecastFragmentPagerAdapter(
                getSupportFragmentManager());
        ViewPager pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
        Log.i(TAG,"this is onCreate Function");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"this is onStart Function");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"this is onResume Function");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"this is onPause Function");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"this is onStop Function");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"this is onDestroy Function");
    }


}