package com.example.demolearningapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.hololo.tutorial.library.PermissionStep;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

import java.security.Permission;

//public class MainActivity extends TutorialActivity {
    public class MainActivity extends AppCompatActivity {
    Button btl_login;
    ImageView img_view;
    private boolean mLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btl_login = findViewById(R.id.btn_login);
        img_view = findViewById(R.id.img_view);

        btl_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent loginPage = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(loginPage);
                Log.e("Button Ka Click Test =>", "yes i am click");

                Toast.makeText(MainActivity.this, "Hello i am back", Toast.LENGTH_LONG).show();
            }
        });

        img_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Button Ka Click Test =>", "yes i am click");

                Toast.makeText(MainActivity.this, "Hello i am back", Toast.LENGTH_LONG).show();
            }
        });

        ProgressBar progressBar = (ProgressBar)findViewById(R.id.spin_kit);
        Sprite doubleBounce = new DoubleBounce();
        progressBar.setIndeterminateDrawable(doubleBounce);

//        addFragment(
//                new Step.Builder()
//                        .setTitle("HOMEPAGE")
//                        .setContent("HERE YOU CAN SEE HOW MANY POINTS YOU HAVE EARNED")
//                        .setBackgroundColor(Color.parseColor("#00D4BA"))
//                        .setDrawable(R.drawable.home_page_walkthrough)
//                        .build());
//        addFragment(
//                new Step.Builder()
//                        .setTitle("UNABLE TO SCAN CODE?")
//                        .setContent("ENTER THE COUPON DETAILS MANUALLY AND SUBMIT TO EARN THE POINTS")
//                        .setBackgroundColor(Color.parseColor("#CA70F3"))
//                        .setDrawable(R.drawable.unable_to_scan_walkthrough)
//                        .build());
//        addFragment(
//                new Step.Builder()
//                        .setTitle("PROBLEM WHILE SCANNING A COUPON?")
//                        .setContent("RAISE COMPLAINT BY GIVING COUPON NUMBER AND RELEVANT DETAILS")
//                        .setBackgroundColor(Color.parseColor("#ff3838"))
//                        .setDrawable(R.drawable.raise_complaint_walkthrough)
//                        .build());
//        addFragment(
//                new Step.Builder()
//                        .setTitle("gdfbsdfbfgbfbfgesome)")
//                        .setContent("getdsfbbfg fg ng)")
//                        .setBackgroundColor(Color.parseColor("#1098FE"))
//                        .setDrawable(R.drawable.images)
//                        .setSummary("getString(R.string.thank_you)")
//                        .build());
//
//    }
//
//
//    @Override
//    public void currentFragmentPosition(int position) {
//    }
//
//    @Override
//    public void finishTutorial() {
//        Toast.makeText(this, "Tutorial finished", Toast.LENGTH_SHORT).show();
//        finish();



    }

//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if(requestCode == 9001 && grantResults[1] == PackageManager.PERMISSION_GRANTED){
//            mLocation= true;
//            Toast.makeText(this, "Permission granted", Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(this, "Permission not granted", Toast.LENGTH_SHORT).show();
//        }
//    }

}



