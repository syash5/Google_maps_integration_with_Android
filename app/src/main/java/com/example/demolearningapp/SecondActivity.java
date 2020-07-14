package com.example.demolearningapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

public class SecondActivity extends AppCompatActivity implements OnMapReadyCallback {
    Button btl_login;
    private MapView mview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btl_login = findViewById(R.id.btn_login2);
        btl_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent loginPage = new Intent( SecondActivity.this, MapsActivity.class);
                startActivity(loginPage);
            }
        });

        mview = (MapView) findViewById(R.id.mapView);
        mview.onCreate(savedInstanceState);
        mview.getMapAsync(this);

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
    }

    @Override
    protected void onStart() {
        super.onStart();
        mview.onStart();
    }


    @Override
    protected void onResume() {
        super.onResume();
        mview.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mview.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mview.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        mview.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mview.onLowMemory();
    }
}