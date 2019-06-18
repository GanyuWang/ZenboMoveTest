package com.example.wgy.zenbomovetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.asus.robotframework.API.MotionControl;
import com.asus.robotframework.API.RobotAPI;

public class MainActivity extends AppCompatActivity {

    //    debug
    private String TAG = "MainActivity";

    //    zenbo
    private RobotAPI mRobotAPI;

    //    button
    private Button mButtonB;
    private Button mButtonL;
    private Button mButtonF;
    private Button mButtonR;
    private Button mButtonS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRobotAPI  = new RobotAPI(this);

        mButtonB = findViewById(R.id.b_button);
        mButtonL = findViewById(R.id.l_button);
        mButtonR = findViewById(R.id.r_button);
        mButtonF = findViewById(R.id.f_button);
        mButtonS = findViewById(R.id.s_button);

        mButtonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRobotAPI.motion.remoteControlBody(MotionControl.Direction.Body.BACKWARD);
                Log.d(TAG, "f");
            }
        });
        mButtonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRobotAPI.motion.remoteControlBody(MotionControl.Direction.Body.TURN_LEFT);
                Log.d(TAG, "l");
            }
        });

        mButtonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRobotAPI.motion.remoteControlBody(MotionControl.Direction.Body.TURN_RIGHT);
                Log.d(TAG, "r");
            }
        });

        mButtonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRobotAPI.motion.remoteControlBody(MotionControl.Direction.Body.FORWARD);
                Log.d(TAG, "b");
            }
        });

        mButtonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRobotAPI.motion.remoteControlBody(MotionControl.Direction.Body.STOP);
                Log.d(TAG, "s");
            }
        });


    }






}
