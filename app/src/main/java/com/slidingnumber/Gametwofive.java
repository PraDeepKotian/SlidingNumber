package com.slidingnumber;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;


@SuppressWarnings("deprecation")
public class Gametwofive extends AppCompatActivity {
   
	private TextView moveCounter;
 	private TextView feedbackText;
 	private Button[] buttons;
    private Boolean bad_move=false;
   	private static final Integer[] goal = new Integer[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
   	
	private ArrayList<Integer> cells = new ArrayList<Integer>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game25);
        buttons=findButtons();
       
        for(int i=0;i<25;i++)
        {
            this.cells.add(i);
        }
        Collections.shuffle(this.cells); //random cells array
        
        fill_grid();
       
        
       moveCounter = (TextView) findViewById(R.id.MoveCounter);
	   feedbackText = (TextView) findViewById(R.id.FeedbackText);
		
		for (int i = 1; i < 25; i++) {
			buttons[i].setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					makeMove((Button) v);
				}
			});
		}
		
		
		moveCounter.setText("0");
		feedbackText.setText(R.string.game_feedback_text);
    
}
    public Button[] findButtons() {
		Button[] b = new Button[25];
		
		b[0] = (Button) findViewById(R.id.Button00);
		b[1] = (Button) findViewById(R.id.Button01);
		b[2] = (Button) findViewById(R.id.Button02);
		b[3] = (Button) findViewById(R.id.Button03);
		b[4] = (Button) findViewById(R.id.Button04);
		b[5] = (Button) findViewById(R.id.Button05);
		b[6] = (Button) findViewById(R.id.Button06);
		b[7] = (Button) findViewById(R.id.Button07);
		b[8] = (Button) findViewById(R.id.Button08);
		b[9] = (Button) findViewById(R.id.Button09);
		b[10] = (Button) findViewById(R.id.Button010);
		b[11] = (Button) findViewById(R.id.Button011);
		b[12] = (Button) findViewById(R.id.Button012);
		b[13] = (Button) findViewById(R.id.Button013);
		b[14] = (Button) findViewById(R.id.Button014);
		b[15] = (Button) findViewById(R.id.Button015);
		b[16] = (Button) findViewById(R.id.Button016);
		b[17] = (Button) findViewById(R.id.Button017);
		b[18] = (Button) findViewById(R.id.Button018);
		b[19] = (Button) findViewById(R.id.Button019);
		b[20] = (Button) findViewById(R.id.Button020);
		b[21] = (Button) findViewById(R.id.Button021);
		b[22] = (Button) findViewById(R.id.Button022);
		b[23] = (Button) findViewById(R.id.Button023);
		b[24] = (Button) findViewById(R.id.Button024);
		return b;
	}
   
	public void makeMove(final Button b) {
        bad_move=true;
		int b_text,b_pos,zuk_pos;
		b_text=Integer.parseInt((String) b.getText());
     	b_pos=find_pos(b_text);
   		zuk_pos=find_pos(0);
   		switch(zuk_pos)
   		{
   		case(0):
   			if(b_pos==1||b_pos==5)
   		    bad_move=false;
   		    break;
   		case(1):
   			if(b_pos==0||b_pos==6||b_pos==2)
   		    bad_move=false;
   		    break;
   		case(2):
   			if(b_pos==1||b_pos==7||b_pos==3)
   		    bad_move=false;
   		    break;
   		case(3):
   			if(b_pos==2||b_pos==8||b_pos==4)
   		    bad_move=false;
   		    break;
   		case(4):
   			if(b_pos==3||b_pos==9)
   		    bad_move=false;
   		    break;
   		case(5):
   			if(b_pos==0||b_pos==6||b_pos==10)
   		    bad_move=false;
   		    break;
   		case(6):
   			if(b_pos==1||b_pos==5||b_pos==7||b_pos==11)
   		    bad_move=false;
   		    break;
   		case(7):
   			if(b_pos==2||b_pos==6||b_pos==8||b_pos==12)
   		    bad_move=false;
   		    break;
   		case(8):
   			if(b_pos==3||b_pos==7||b_pos==9||b_pos==13)
   		    bad_move=false;
   		    break;
   		case(9):
   			if(b_pos==4||b_pos==8||b_pos==14)
   		    bad_move=false;
   		    break;
   		case(10):
   			if(b_pos==5||b_pos==11||b_pos==15)
   		    bad_move=false;
   		    break;
   		 case(11):
   	   		if(b_pos==6||b_pos==10||b_pos==12||b_pos==16)
   	    	bad_move=false;
   	    	break;
   		case(12):
   			if(b_pos==7||b_pos==11||b_pos==13||b_pos==17)
   		    bad_move=false;
   		    break;
   		case(13):
   			if(b_pos==8||b_pos==12||b_pos==14||b_pos==18)
   		    bad_move=false;
   		    break;
   		case(14):
   			if(b_pos==9||b_pos==13||b_pos==19)
   		    bad_move=false;
   		    break;
   		case(15):
   			if(b_pos==10||b_pos==16||b_pos==20)
   		    bad_move=false;
   		    break;
		case(16):
			if(b_pos==11||b_pos==15||b_pos==17||b_pos==21)
				bad_move=false;
			break;
		case(17):
			if(b_pos==12||b_pos==16||b_pos==18||b_pos==22)
				bad_move=false;
			break;
		case(18):
			if(b_pos==13||b_pos==17||b_pos==19||b_pos==23)
				bad_move=false;
			break;
		case(19):
			if(b_pos==14||b_pos==18||b_pos==24)
				bad_move=false;
			break;
		case(20):
			if(b_pos==15||b_pos==21)
				bad_move=false;
			break;
		case(21):
			if(b_pos==16||b_pos==20||b_pos==22)
				bad_move=false;
			break;
		case(22):
			if(b_pos==17||b_pos==21||b_pos==23)
				bad_move=false;
			break;
		case(23):
			if(b_pos==18||b_pos==22||b_pos==24)
				bad_move=false;
			break;
		case(24):
			if(b_pos==19||b_pos==23)
				bad_move=false;
			break;
   		}

   		
   		if(bad_move==true)
   		{
   			feedbackText.setText("Move Not Allowed");
   			return;
   		}
   		feedbackText.setText("Move OK");
   		cells.remove(b_pos);
   		cells.add(b_pos, 0);
   		cells.remove(zuk_pos);
   		cells.add(zuk_pos,b_text);
   		
	
    	fill_grid();
		moveCounter.setText(Integer.toString(Integer.parseInt((String) moveCounter.getText())+1));

		 for(int i=0;i<25;i++)
	        {
	           if(cells.get(i)!=goal[i])
	           {
	        	        	   return;
	           }
	        }
		 feedbackText.setText("You Won");
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("You won");
		builder.setCancelable(true);
		AlertDialog alertDialog = builder.create();
		alertDialog.show();

	}
	
	public void fill_grid()
    {
	 for(int i=0;i<25;i++)
	 {
		 int text=cells.get(i);
		 AbsoluteLayout.LayoutParams absParams = 
			    (AbsoluteLayout.LayoutParams)buttons[text].getLayoutParams();
		 switch(i)
		 {case(0):
		 
			absParams.x = 5;
			absParams.y = 5;
			buttons[text].setLayoutParams(absParams);
			break;
		 case(1):
			
				absParams.x = 125;
				absParams.y = 5;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(2):
			
				absParams.x = 240;
				absParams.y = 5;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(3):
			
				absParams.x = 355;
				absParams.y = 5;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(4):
			
				absParams.x =470;
				absParams.y =5;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(5):
			 
				absParams.x = 5;
				absParams.y =125;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(6):
			 
				absParams.x = 125;
				absParams.y = 125;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(7):
			 
				absParams.x = 240;
				absParams.y = 125;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(8):
			 
				absParams.x = 355;
				absParams.y = 125;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(9):
			 
				absParams.x = 470;
				absParams.y = 125;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(10):
			 
				absParams.x = 5;
				absParams.y = 240;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(11):
			 
				absParams.x = 125;
				absParams.y = 240;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(12):
			 
				absParams.x = 240;
				absParams.y = 240;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(13):
			 
				absParams.x = 355;
				absParams.y = 240;
				buttons[text].setLayoutParams(absParams);
				break;
				
		 case(14):
			 
				absParams.x = 470;
				absParams.y = 240;
				buttons[text].setLayoutParams(absParams);
				break;
		 case(15):
					 
				absParams.x = 5;
				absParams.y = 355;
				buttons[text].setLayoutParams(absParams);
				break;

		 case(16):

			 absParams.x = 120;
			 absParams.y = 355;
			 buttons[text].setLayoutParams(absParams);
			 break;
		 case(17):

			 absParams.x = 240;
			 absParams.y = 355;
			 buttons[text].setLayoutParams(absParams);
			 break;
		 case(18):

			 absParams.x = 355;
			 absParams.y = 355;
			 buttons[text].setLayoutParams(absParams);
			 break;
		 case(19):

			 absParams.x = 470;
			 absParams.y = 355;
			 buttons[text].setLayoutParams(absParams);
			 break;
		 case(20):

			 absParams.x = 5;
			 absParams.y = 470;
			 buttons[text].setLayoutParams(absParams);
			 break;
		 case(21):

			 absParams.x = 125;
			 absParams.y = 470;
			 buttons[text].setLayoutParams(absParams);
			 break;
		 case(22):

			 absParams.x = 240;
			 absParams.y = 470;
			 buttons[text].setLayoutParams(absParams);
			 break;
		 case(23):

			 absParams.x = 355;
			 absParams.y = 470;
			 buttons[text].setLayoutParams(absParams);
			 break;
		 case(24):

			 absParams.x = 470;
			 absParams.y = 470;
			 buttons[text].setLayoutParams(absParams);
			 break;



		 }
		
		 
		}
		
	}
	
	public int find_pos(int element)
	{
		int i=0;
		 for(i=0;i<25;i++)
	        {
	           if(cells.get(i)==element)
	           {
	        	        	   break;
	           }
	        }
		 return i;
	}
	}

    