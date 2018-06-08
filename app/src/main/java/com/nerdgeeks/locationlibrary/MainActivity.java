package com.nerdgeeks.locationlibrary;

import android.content.Intent;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.nerdgeeks.logutil.LocationCallBack;
import com.nerdgeeks.logutil.LocationHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocationHelper.with(this).updateLocation(new LocationCallBack() {
            @Override
            public void onLocationCallBack(Location location) {
                Toast.makeText(MainActivity.this, "Location Updated with latlng - "+ location.getLatitude(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        LocationHelper.with(this).onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        LocationHelper.with(this).onActivityResult(requestCode,resultCode,data);
    }

    public void showLastLocation(View view) {
        Location lastLocation = LocationHelper.with(this).getLastLocation();
        Toast.makeText(MainActivity.this, "Location Updated with latlng - "+ lastLocation.getLatitude(), Toast.LENGTH_SHORT).show();
    }
}
