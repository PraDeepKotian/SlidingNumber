package com.slidingnumber;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
		ActionBar bar = getActionBar();
		if (bar != null) {
			bar.setHomeButtonEnabled(true);
			bar.setDisplayShowHomeEnabled(true);
		}
        setContentView(R.layout.activity_main);
        Button play=(Button) findViewById(R.id.play);
        play.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), Selector.class);
				startActivity(intent);
			}
		});
        
        Button help=(Button) findViewById(R.id.help);
        help.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), Help.class);
				startActivity(intent);
			}
		});        
       
        Button abt=(Button) findViewById(R.id.about);
        abt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), Credits.class);
				startActivity(intent);
			}
		}); 
        Button Exit=(Button) findViewById(R.id.exit);
        Exit.setOnClickListener(new OnClickListener() {
			

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
			}
		});       
    }
    public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.exitmenu:
			finish();
			break;
		case R.id.helpmenu:
			Intent intent = new Intent(getApplicationContext(), Help.class);
			startActivity(intent);
			break;
		case R.id.creditsmenu:
			Intent i = new Intent(getApplicationContext(), Credits.class);
			startActivity(i);
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	public void onBackPressed() {
        
 	   AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
 	           MainActivity.this);

 	       // set title
 	       alertDialogBuilder.setTitle("Sliding Number");

 	       // set dialog message
 	       alertDialogBuilder
 	           .setMessage("Exit?")
 	           .setCancelable(false)
 	           .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
 	               public void onClick(DialogInterface dialog,int id) {
 	                   // if this button is clicked, close
 	                   // current activity
 	                   MainActivity.this.finish();
 	               }
 	             })
 	           .setNegativeButton("No",new DialogInterface.OnClickListener() {
 	               public void onClick(DialogInterface dialog,int id) {
 	                   // if this button is clicked, just close
 	                   // the dialog box and do nothing
 	                   dialog.cancel();
 	               }
 	           });

 	           // create alert dialog
 	           AlertDialog alertDialog = alertDialogBuilder.create();

 	           // show it
 	           alertDialog.show();
 }
}