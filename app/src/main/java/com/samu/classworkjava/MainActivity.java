package com.samu.classworkjava;


import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        // creating LinearLayout
        LinearLayout linLayout = new LinearLayout(this);


        // specifying vertical orientation
        linLayout.setOrientation(LinearLayout.VERTICAL);

        // creating LayoutParams
        LinearLayout.LayoutParams linLayoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);


        // set Layout as a root element of the screen
        setContentView(linLayout, linLayoutParam);

        // add Button with Right position
        LinearLayout.LayoutParams centerGravityParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        centerGravityParams.gravity = Gravity.CENTER;
        Button btn2 = new Button(this);
        btn2.setText("Right");
        linLayout.addView(btn2, centerGravityParams);

        // add TextView with Right position
        LinearLayout.LayoutParams rightGravityParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        rightGravityParams.gravity = Gravity.CENTER;
        TextView text2 = new TextView(this);
        text2.setText("TEXT");
        linLayout.addView(text2, rightGravityParams);


        TextView tv = new TextView(this);
        LinearLayout.LayoutParams lpView = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        tv.setText("i am TextView");
        tv.setLayoutParams(lpView);
        linLayout.addView(tv);



        EditText et = new EditText(this);
        et.setText("Dynamic EditText");
        et.setMinLines(1);
      //  et.setMaxLines(3);
        linLayout.addView(et);

        EditText et1 = new EditText(this);
        et1.setText("samu");
        linLayout.addView(et1);




       /* // creating RelativeLayout
        RelativeLayout relativeLayout = new RelativeLayout(this);


        // creating RelativeParams
        RelativeLayout.LayoutParams relaLayoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        // set Layout as a root element of the screen
        setContentView(relativeLayout, relaLayoutParams);*/


    }
}
