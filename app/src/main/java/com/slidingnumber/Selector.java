package com.slidingnumber;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Selector extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selector);
        Button btn1=(Button) findViewById(R.id.btn9);
        btn1.setOnClickListener(new OnClickListener() {
			

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
            	Intent intent = new Intent(getApplicationContext(), Gamenine.class);
				startActivity(intent);
			}
		});   
        
        Button btn2=(Button) findViewById(R.id.btn16);
        btn2.setOnClickListener(new OnClickListener() {
			

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
            	Intent intent = new Intent(getApplicationContext(), Gameonesix.class);
				startActivity(intent);
			}
		});

        Button btn3=(Button) findViewById(R.id.btn25);
        btn3.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Gametwofive.class);
                startActivity(intent);
            }
        });
    }
    }
