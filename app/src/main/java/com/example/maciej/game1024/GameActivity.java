package com.example.maciej.game1024;

import com.example.maciej.game1024.util.SystemUiHider;
import com.example.maciej.game1024.SimpleGestureFilter.SimpleGestureListener;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class GameActivity extends Activity implements SimpleGestureListener{
    private SimpleGestureFilter detector;


    private boolean isEmpty(Button etText) {
        if (etText.getText().toString().trim().length() > 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean Sprawdzpelne() {

        Button but1 = (Button) findViewById(R.id.button);
        Button but2 = (Button) findViewById(R.id.button2);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button4);
        Button but5 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but7 = (Button) findViewById(R.id.button7);
        Button but8 = (Button) findViewById(R.id.button8);
        Button but9 = (Button) findViewById(R.id.button9);
        Button but10 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        Button but12 = (Button) findViewById(R.id.button12);
        Button but13 = (Button) findViewById(R.id.button13);
        Button but14 = (Button) findViewById(R.id.button14);
        Button but15 = (Button) findViewById(R.id.button15);
        Button but16 = (Button) findViewById(R.id.button16);

        if ((isEmpty(but1) == false) & (isEmpty(but2) == false) & (isEmpty(but3) == false) & (isEmpty(but4) == false) & (isEmpty(but5) == false) & (isEmpty(but6) == false) & (isEmpty(but7) == false) & (isEmpty(but8) == false) & (isEmpty(but9) == false) & (isEmpty(but10) == false) & (isEmpty(but11) == false) & (isEmpty(but12) == false) & (isEmpty(but13) == false) & (isEmpty(but14) == false) & (isEmpty(but15) == false) & (isEmpty(but16) == false))
        {
            return true;
        } else {
            return false;
        }
    }
    public void wlewo_1wiersz(){
        Button but1 = (Button) findViewById(R.id.button);
        Button but2 = (Button) findViewById(R.id.button2);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button4);
        Button but5 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but7 = (Button) findViewById(R.id.button7);
        Button but8 = (Button) findViewById(R.id.button8);
        Button but9 = (Button) findViewById(R.id.button9);
        Button but10 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        Button but12 = (Button) findViewById(R.id.button12);
        Button but13 = (Button) findViewById(R.id.button13);
        Button but14 = (Button) findViewById(R.id.button14);
        Button but15 = (Button) findViewById(R.id.button15);
        Button but16 = (Button) findViewById(R.id.button16);


        if (isEmpty(but1)==false){
            if (isEmpty(but2)==false && (but2.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but2.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but2.setText("");
            }else if (isEmpty(but3)==false && (but3.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but3.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but3.setText("");
            }else if (isEmpty(but4)==false && (but4.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but4.setText("");
            }
        }
        if (isEmpty(but2)==false){
            if (isEmpty(but3)==false && (but2.getText().toString().equals(but3.getText().toString())==true )){
                int temp1 = Integer.parseInt(but2.getText().toString(), 10);
                int temp2 = Integer.parseInt(but3.getText().toString(), 10);
                int temp = temp1 + temp2;
                but2.setText(""+temp);
                but3.setText("");
            }else if (isEmpty(but4)==false && (but2.getText().toString().equals(but4.getText().toString())==true )){
                int temp1 = Integer.parseInt(but2.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but2.setText(""+temp);
                but4.setText("");
            }
        }
        if (isEmpty(but3)==false){
            if (isEmpty(but4)==false && (but3.getText().toString().equals(but4.getText().toString())==true )){
                int temp1 = Integer.parseInt(but3.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but3.setText(""+temp);
                but4.setText("");
            }
        }
        if (isEmpty(but1)== true){
            if(isEmpty(but2)== false){
                but1.setText(but2.getText());
                but2.setText("");
            }else if (isEmpty(but3)==false){
                but1.setText(but3.getText());
                but3.setText("");
            } else if (isEmpty(but4)==false){
                but1.setText(but4.getText());
                but4.setText("");
            }
        }else if(isEmpty(but1)==false){
            if (isEmpty(but2)==true){
                if (isEmpty(but3)==false){
                    but2.setText(but3.getText());
                    but3.setText("");
                }else if (isEmpty(but4)==false){
                    but2.setText(but4.getText());
                    but4.setText("");
                }
            }else if (isEmpty(but3)==true){
                if (isEmpty(but4)==false){
                    but3.setText(but4.getText());
                    but4.setText("");
                }
            }
        }
        
    }
    public void wlewo_2wiersz(){
        Button but1 = (Button) findViewById(R.id.button);
        Button but2 = (Button) findViewById(R.id.button2);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button4);
        Button but5 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but7 = (Button) findViewById(R.id.button7);
        Button but8 = (Button) findViewById(R.id.button8);
        Button but9 = (Button) findViewById(R.id.button9);
        Button but10 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        Button but12 = (Button) findViewById(R.id.button12);
        Button but13 = (Button) findViewById(R.id.button13);
        Button but14 = (Button) findViewById(R.id.button14);
        Button but15 = (Button) findViewById(R.id.button15);
        Button but16 = (Button) findViewById(R.id.button16);




        if (isEmpty(but5)==false){
            if (isEmpty(but6)==false && (but6.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but6.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but6.setText("");
            }else if (isEmpty(but7)==false && (but7.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but7.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but7.setText("");
            }else if (isEmpty(but8)==false && (but8.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but8.setText("");
            }
        }
        if (isEmpty(but6)==false){
            if (isEmpty(but7)==false && (but6.getText().toString().equals(but7.getText().toString())==true )){
                int temp1 = Integer.parseInt(but6.getText().toString(), 10);
                int temp2 = Integer.parseInt(but7.getText().toString(), 10);
                int temp = temp1 + temp2;
                but6.setText(""+temp);
                but7.setText("");
            }else if (isEmpty(but8)==false && (but6.getText().toString().equals(but8.getText().toString())==true )){
                int temp1 = Integer.parseInt(but6.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but6.setText(""+temp);
                but8.setText("");
            }
        }
        if (isEmpty(but7)==false){
            if (isEmpty(but8)==false && (but7.getText().toString().equals(but8.getText().toString())==true )){
                int temp1 = Integer.parseInt(but7.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but7.setText(""+temp);
                but8.setText("");
            }
        }
        if (isEmpty(but5)== true){
            if(isEmpty(but6)== false){
                but5.setText(but6.getText());
                but6.setText("");
            }else if (isEmpty(but7)==false){
                but5.setText(but7.getText());
                but7.setText("");
            } else if (isEmpty(but8)==false){
                but5.setText(but8.getText());
                but8.setText("");
            }
        }else if(isEmpty(but5)==false){
            if (isEmpty(but6)==true){
                if (isEmpty(but7)==false){
                    but6.setText(but7.getText());
                    but7.setText("");
                }else if (isEmpty(but8)==false){
                    but6.setText(but8.getText());
                    but8.setText("");
                }
            }else if (isEmpty(but7)==true){
                if (isEmpty(but8)==false){
                    but7.setText(but8.getText());
                    but8.setText("");
                }
            }
        }
    }
    public void wlewo_3wiersz(){
        Button but1 = (Button) findViewById(R.id.button);
        Button but2 = (Button) findViewById(R.id.button2);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button4);
        Button but5 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but7 = (Button) findViewById(R.id.button7);
        Button but8 = (Button) findViewById(R.id.button8);
        Button but9 = (Button) findViewById(R.id.button9);
        Button but10 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        Button but12 = (Button) findViewById(R.id.button12);
        Button but13 = (Button) findViewById(R.id.button13);
        Button but14 = (Button) findViewById(R.id.button14);
        Button but15 = (Button) findViewById(R.id.button15);
        Button but16 = (Button) findViewById(R.id.button16);

        if (isEmpty(but9)==false){
            if (isEmpty(but10)==false && (but10.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but10.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but10.setText("");
            }else if (isEmpty(but11)==false && (but11.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but11.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but11.setText("");
            }else if (isEmpty(but12)==false && (but12.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but12.setText("");
            }
        }
        if (isEmpty(but10)==false){
            if (isEmpty(but11)==false && (but10.getText().toString().equals(but11.getText().toString())==true )){
                int temp1 = Integer.parseInt(but10.getText().toString(), 10);
                int temp2 = Integer.parseInt(but11.getText().toString(), 10);
                int temp = temp1 + temp2;
                but10.setText(""+temp);
                but11.setText("");
            }else if (isEmpty(but12)==false && (but10.getText().toString().equals(but12.getText().toString())==true )){
                int temp1 = Integer.parseInt(but10.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but10.setText(""+temp);
                but12.setText("");
            }
        }
        if (isEmpty(but11)==false){
            if (isEmpty(but12)==false && (but11.getText().toString().equals(but12.getText().toString())==true )){
                int temp1 = Integer.parseInt(but11.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but11.setText(""+temp);
                but12.setText("");
            }
        }
        if (isEmpty(but9)== true){
            if(isEmpty(but10)== false){
                but9.setText(but10.getText());
                but10.setText("");
            }else if (isEmpty(but11)==false){
                but9.setText(but11.getText());
                but11.setText("");
            } else if (isEmpty(but12)==false){
                but9.setText(but12.getText());
                but12.setText("");
            }
        }else if(isEmpty(but9)==false){
            if (isEmpty(but10)==true){
                if (isEmpty(but11)==false){
                    but10.setText(but11.getText());
                    but11.setText("");
                }else if (isEmpty(but12)==false){
                    but10.setText(but12.getText());
                    but12.setText("");
                }
            }else if (isEmpty(but11)==true){
                if (isEmpty(but12)==false){
                    but11.setText(but12.getText());
                    but12.setText("");
                }
            }
        }


    }
    public void wlewo_4wiersz(){
        Button but1 = (Button) findViewById(R.id.button);
        Button but2 = (Button) findViewById(R.id.button2);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button4);
        Button but5 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but7 = (Button) findViewById(R.id.button7);
        Button but8 = (Button) findViewById(R.id.button8);
        Button but9 = (Button) findViewById(R.id.button9);
        Button but10 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        Button but12 = (Button) findViewById(R.id.button12);
        Button but13 = (Button) findViewById(R.id.button13);
        Button but14 = (Button) findViewById(R.id.button14);
        Button but15 = (Button) findViewById(R.id.button15);
        Button but16 = (Button) findViewById(R.id.button16);


        if (isEmpty(but13)==false){
            if (isEmpty(but14)==false && (but14.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but14.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but14.setText("");
            }else if (isEmpty(but15)==false && (but15.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but15.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but15.setText("");
            }else if (isEmpty(but16)==false && (but16.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but14)==false){
            if (isEmpty(but15)==false && (but14.getText().toString().equals(but15.getText().toString())==true )){
                int temp1 = Integer.parseInt(but14.getText().toString(), 10);
                int temp2 = Integer.parseInt(but15.getText().toString(), 10);
                int temp = temp1 + temp2;
                but14.setText(""+temp);
                but15.setText("");
            }else if (isEmpty(but16)==false && (but14.getText().toString().equals(but16.getText().toString())==true )){
                int temp1 = Integer.parseInt(but14.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but14.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but15)==false){
            if (isEmpty(but16)==false && (but15.getText().toString().equals(but16.getText().toString())==true )){
                int temp1 = Integer.parseInt(but15.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but15.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but13)== true){
            if(isEmpty(but14)== false){
                but13.setText(but14.getText());
                but14.setText("");
            }else if (isEmpty(but15)==false){
                but13.setText(but15.getText());
                but15.setText("");
            } else if (isEmpty(but16)==false){
                but13.setText(but16.getText());
                but16.setText("");
            }
        }else if(isEmpty(but13)==false){
            if (isEmpty(but14)==true){
                if (isEmpty(but15)==false){
                    but14.setText(but15.getText());
                    but15.setText("");
                }else if (isEmpty(but16)==false){
                    but14.setText(but16.getText());
                    but16.setText("");
                }
            }else if (isEmpty(but15)==true){
                if (isEmpty(but16)==false){
                    but15.setText(but16.getText());
                    but16.setText("");
                }
            }
        }

    }

    public void wprawo_1wiersz(){
        Button but4 = (Button) findViewById(R.id.button);
        Button but3 = (Button) findViewById(R.id.button2);
        Button but2 = (Button) findViewById(R.id.button3);
        Button but1 = (Button) findViewById(R.id.button4);
        Button but8 = (Button) findViewById(R.id.button5);
        Button but7 = (Button) findViewById(R.id.button6);
        Button but6 = (Button) findViewById(R.id.button7);
        Button but5 = (Button) findViewById(R.id.button8);
        Button but12 = (Button) findViewById(R.id.button9);
        Button but11 = (Button) findViewById(R.id.button10);
        Button but10 = (Button) findViewById(R.id.button11);
        Button but9 = (Button) findViewById(R.id.button12);
        Button but16 = (Button) findViewById(R.id.button13);
        Button but15 = (Button) findViewById(R.id.button14);
        Button but14 = (Button) findViewById(R.id.button15);
        Button but13 = (Button) findViewById(R.id.button16);




        if (isEmpty(but1)==false){
            if (isEmpty(but2)==false && (but2.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but2.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but2.setText("");
            }else if (isEmpty(but3)==false && (but3.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but3.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but3.setText("");
            }else if (isEmpty(but4)==false && (but4.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but4.setText("");
            }
        }
        if (isEmpty(but2)==false){
            if (isEmpty(but3)==false && (but2.getText().toString().equals(but3.getText().toString())==true )){
                int temp1 = Integer.parseInt(but2.getText().toString(), 10);
                int temp2 = Integer.parseInt(but3.getText().toString(), 10);
                int temp = temp1 + temp2;
                but2.setText(""+temp);
                but3.setText("");
            }else if (isEmpty(but4)==false && (but2.getText().toString().equals(but4.getText().toString())==true )){
                int temp1 = Integer.parseInt(but2.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but2.setText(""+temp);
                but4.setText("");
            }
        }
        if (isEmpty(but3)==false){
            if (isEmpty(but4)==false && (but3.getText().toString().equals(but4.getText().toString())==true )){
                int temp1 = Integer.parseInt(but3.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but3.setText(""+temp);
                but4.setText("");
            }
        }
        if (isEmpty(but1)== true){
            if(isEmpty(but2)== false){
                but1.setText(but2.getText());
                but2.setText("");
            }else if (isEmpty(but3)==false){
                but1.setText(but3.getText());
                but3.setText("");
            } else if (isEmpty(but4)==false){
                but1.setText(but4.getText());
                but4.setText("");
            }
        }else if(isEmpty(but1)==false){
            if (isEmpty(but2)==true){
                if (isEmpty(but3)==false){
                    but2.setText(but3.getText());
                    but3.setText("");
                }else if (isEmpty(but4)==false){
                    but2.setText(but4.getText());
                    but4.setText("");
                }
            }else if (isEmpty(but3)==true){
                if (isEmpty(but4)==false){
                    but3.setText(but4.getText());
                    but4.setText("");
                }
            }
        }

    }
    public void wprawo_2wiersz(){
        Button but4 = (Button) findViewById(R.id.button);
        Button but3 = (Button) findViewById(R.id.button2);
        Button but2 = (Button) findViewById(R.id.button3);
        Button but1 = (Button) findViewById(R.id.button4);
        Button but8 = (Button) findViewById(R.id.button5);
        Button but7 = (Button) findViewById(R.id.button6);
        Button but6 = (Button) findViewById(R.id.button7);
        Button but5 = (Button) findViewById(R.id.button8);
        Button but12 = (Button) findViewById(R.id.button9);
        Button but11 = (Button) findViewById(R.id.button10);
        Button but10 = (Button) findViewById(R.id.button11);
        Button but9 = (Button) findViewById(R.id.button12);
        Button but16 = (Button) findViewById(R.id.button13);
        Button but15 = (Button) findViewById(R.id.button14);
        Button but14 = (Button) findViewById(R.id.button15);
        Button but13 = (Button) findViewById(R.id.button16);





        if (isEmpty(but5)==false){
            if (isEmpty(but6)==false && (but6.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but6.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but6.setText("");
            }else if (isEmpty(but7)==false && (but7.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but7.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but7.setText("");
            }else if (isEmpty(but8)==false && (but8.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but8.setText("");
            }
        }
        if (isEmpty(but6)==false){
            if (isEmpty(but7)==false && (but6.getText().toString().equals(but7.getText().toString())==true )){
                int temp1 = Integer.parseInt(but6.getText().toString(), 10);
                int temp2 = Integer.parseInt(but7.getText().toString(), 10);
                int temp = temp1 + temp2;
                but6.setText(""+temp);
                but7.setText("");
            }else if (isEmpty(but8)==false && (but6.getText().toString().equals(but8.getText().toString())==true )){
                int temp1 = Integer.parseInt(but6.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but6.setText(""+temp);
                but8.setText("");
            }
        }
        if (isEmpty(but7)==false){
            if (isEmpty(but8)==false && (but7.getText().toString().equals(but8.getText().toString())==true )){
                int temp1 = Integer.parseInt(but7.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but7.setText(""+temp);
                but8.setText("");
            }
        }

        if (isEmpty(but5)== true){
            if(isEmpty(but6)== false){
                but5.setText(but6.getText());
                but6.setText("");
            }else if (isEmpty(but7)==false){
                but5.setText(but7.getText());
                but7.setText("");
            } else if (isEmpty(but8)==false){
                but5.setText(but8.getText());
                but8.setText("");
            }
        }else if(isEmpty(but5)==false){
            if (isEmpty(but6)==true){
                if (isEmpty(but7)==false){
                    but6.setText(but7.getText());
                    but7.setText("");
                }else if (isEmpty(but8)==false){
                    but6.setText(but8.getText());
                    but8.setText("");
                }
            }else if (isEmpty(but7)==true){
                if (isEmpty(but8)==false){
                    but7.setText(but8.getText());
                    but8.setText("");
                }
            }
        }
    }
    public void wprawo_3wiersz(){
        Button but4 = (Button) findViewById(R.id.button);
        Button but3 = (Button) findViewById(R.id.button2);
        Button but2 = (Button) findViewById(R.id.button3);
        Button but1 = (Button) findViewById(R.id.button4);
        Button but8 = (Button) findViewById(R.id.button5);
        Button but7 = (Button) findViewById(R.id.button6);
        Button but6 = (Button) findViewById(R.id.button7);
        Button but5 = (Button) findViewById(R.id.button8);
        Button but12 = (Button) findViewById(R.id.button9);
        Button but11 = (Button) findViewById(R.id.button10);
        Button but10 = (Button) findViewById(R.id.button11);
        Button but9 = (Button) findViewById(R.id.button12);
        Button but16 = (Button) findViewById(R.id.button13);
        Button but15 = (Button) findViewById(R.id.button14);
        Button but14 = (Button) findViewById(R.id.button15);
        Button but13 = (Button) findViewById(R.id.button16);


        if (isEmpty(but9)==false){
            if (isEmpty(but10)==false && (but10.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but10.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but10.setText("");
            }else if (isEmpty(but11)==false && (but11.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but11.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but11.setText("");
            }else if (isEmpty(but12)==false && (but12.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but12.setText("");
            }
        }
        if (isEmpty(but10)==false){
            if (isEmpty(but11)==false && (but10.getText().toString().equals(but11.getText().toString())==true )){
                int temp1 = Integer.parseInt(but10.getText().toString(), 10);
                int temp2 = Integer.parseInt(but11.getText().toString(), 10);
                int temp = temp1 + temp2;
                but10.setText(""+temp);
                but11.setText("");
            }else if (isEmpty(but12)==false && (but10.getText().toString().equals(but12.getText().toString())==true )){
                int temp1 = Integer.parseInt(but10.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but10.setText(""+temp);
                but12.setText("");
            }
        }
        if (isEmpty(but11)==false){
            if (isEmpty(but12)==false && (but11.getText().toString().equals(but12.getText().toString())==true )){
                int temp1 = Integer.parseInt(but11.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but11.setText(""+temp);
                but12.setText("");
            }
        }

        if (isEmpty(but9)== true){
            if(isEmpty(but10)== false){
                but9.setText(but10.getText());
                but10.setText("");
            }else if (isEmpty(but11)==false){
                but9.setText(but11.getText());
                but11.setText("");
            } else if (isEmpty(but12)==false){
                but9.setText(but12.getText());
                but12.setText("");
            }
        }else if(isEmpty(but9)==false){
            if (isEmpty(but10)==true){
                if (isEmpty(but11)==false){
                    but10.setText(but11.getText());
                    but11.setText("");
                }else if (isEmpty(but12)==false){
                    but10.setText(but12.getText());
                    but12.setText("");
                }
            }else if (isEmpty(but11)==true){
                if (isEmpty(but12)==false){
                    but11.setText(but12.getText());
                    but12.setText("");
                }
            }
        }

    }
    public void wprawo_4wiersz(){
        Button but4 = (Button) findViewById(R.id.button);
        Button but3 = (Button) findViewById(R.id.button2);
        Button but2 = (Button) findViewById(R.id.button3);
        Button but1 = (Button) findViewById(R.id.button4);
        Button but8 = (Button) findViewById(R.id.button5);
        Button but7 = (Button) findViewById(R.id.button6);
        Button but6 = (Button) findViewById(R.id.button7);
        Button but5 = (Button) findViewById(R.id.button8);
        Button but12 = (Button) findViewById(R.id.button9);
        Button but11 = (Button) findViewById(R.id.button10);
        Button but10 = (Button) findViewById(R.id.button11);
        Button but9 = (Button) findViewById(R.id.button12);
        Button but16 = (Button) findViewById(R.id.button13);
        Button but15 = (Button) findViewById(R.id.button14);
        Button but14 = (Button) findViewById(R.id.button15);
        Button but13 = (Button) findViewById(R.id.button16);


        if (isEmpty(but13)==false){
            if (isEmpty(but14)==false && (but14.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but14.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but14.setText("");
            }else if (isEmpty(but15)==false && (but15.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but15.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but15.setText("");
            }else if (isEmpty(but16)==false && (but16.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but14)==false){
            if (isEmpty(but15)==false && (but14.getText().toString().equals(but15.getText().toString())==true )){
                int temp1 = Integer.parseInt(but14.getText().toString(), 10);
                int temp2 = Integer.parseInt(but15.getText().toString(), 10);
                int temp = temp1 + temp2;
                but14.setText(""+temp);
                but15.setText("");
            }else if (isEmpty(but16)==false && (but14.getText().toString().equals(but16.getText().toString())==true )){
                int temp1 = Integer.parseInt(but14.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but14.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but15)==false){
            if (isEmpty(but16)==false && (but15.getText().toString().equals(but16.getText().toString())==true )){
                int temp1 = Integer.parseInt(but15.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but15.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but13)== true){
            if(isEmpty(but14)== false){
                but13.setText(but14.getText());
                but14.setText("");
            }else if (isEmpty(but15)==false){
                but13.setText(but15.getText());
                but15.setText("");
            } else if (isEmpty(but16)==false){
                but13.setText(but16.getText());
                but16.setText("");
            }
        }else if(isEmpty(but13)==false){
            if (isEmpty(but14)==true){
                if (isEmpty(but15)==false){
                    but14.setText(but15.getText());
                    but15.setText("");
                }else if (isEmpty(but16)==false){
                    but14.setText(but16.getText());
                    but16.setText("");
                }
            }else if (isEmpty(but15)==true){
                if (isEmpty(but16)==false){
                    but15.setText(but16.getText());
                    but16.setText("");
                }
            }
        }

    }

    public void wgore_1wiersz(){
        Button but1 = (Button) findViewById(R.id.button);
        Button but5 = (Button) findViewById(R.id.button2);
        Button but9 = (Button) findViewById(R.id.button3);
        Button but13 = (Button) findViewById(R.id.button4);
        Button but2 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but10 = (Button) findViewById(R.id.button7);
        Button but14 = (Button) findViewById(R.id.button8);
        Button but3 = (Button) findViewById(R.id.button9);
        Button but7 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        Button but15 = (Button) findViewById(R.id.button12);
        Button but4 = (Button) findViewById(R.id.button13);
        Button but8 = (Button) findViewById(R.id.button14);
        Button but12 = (Button) findViewById(R.id.button15);
        Button but16 = (Button) findViewById(R.id.button16);




        if (isEmpty(but1)==false){
            if (isEmpty(but2)==false && (but2.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but2.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but2.setText("");
            }else if (isEmpty(but3)==false && (but3.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but3.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but3.setText("");
            }else if (isEmpty(but4)==false && (but4.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but4.setText("");
            }
        }
        if (isEmpty(but2)==false){
            if (isEmpty(but3)==false && (but2.getText().toString().equals(but3.getText().toString())==true )){
                int temp1 = Integer.parseInt(but2.getText().toString(), 10);
                int temp2 = Integer.parseInt(but3.getText().toString(), 10);
                int temp = temp1 + temp2;
                but2.setText(""+temp);
                but3.setText("");
            }else if (isEmpty(but4)==false && (but2.getText().toString().equals(but4.getText().toString())==true )){
                int temp1 = Integer.parseInt(but2.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but2.setText(""+temp);
                but4.setText("");
            }
        }
        if (isEmpty(but3)==false){
            if (isEmpty(but4)==false && (but3.getText().toString().equals(but4.getText().toString())==true )){
                int temp1 = Integer.parseInt(but3.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but3.setText(""+temp);
                but4.setText("");
            }
        }

        if (isEmpty(but1)== true){
            if(isEmpty(but2)== false){
                but1.setText(but2.getText());
                but2.setText("");
            }else if (isEmpty(but3)==false){
                but1.setText(but3.getText());
                but3.setText("");
            } else if (isEmpty(but4)==false){
                but1.setText(but4.getText());
                but4.setText("");
            }
        }else if(isEmpty(but1)==false){
            if (isEmpty(but2)==true){
                if (isEmpty(but3)==false){
                    but2.setText(but3.getText());
                    but3.setText("");
                }else if (isEmpty(but4)==false){
                    but2.setText(but4.getText());
                    but4.setText("");
                }
            }else if (isEmpty(but3)==true){
                if (isEmpty(but4)==false){
                    but3.setText(but4.getText());
                    but4.setText("");
                }
            }
        }

    }
    public void wgore_2wiersz(){
        Button but1 = (Button) findViewById(R.id.button);
        Button but5 = (Button) findViewById(R.id.button2);
        Button but9 = (Button) findViewById(R.id.button3);
        Button but13 = (Button) findViewById(R.id.button4);
        Button but2 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but10 = (Button) findViewById(R.id.button7);
        Button but14 = (Button) findViewById(R.id.button8);
        Button but3 = (Button) findViewById(R.id.button9);
        Button but7 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        Button but15 = (Button) findViewById(R.id.button12);
        Button but4 = (Button) findViewById(R.id.button13);
        Button but8 = (Button) findViewById(R.id.button14);
        Button but12 = (Button) findViewById(R.id.button15);
        Button but16 = (Button) findViewById(R.id.button16);





        if (isEmpty(but5)==false){
            if (isEmpty(but6)==false && (but6.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but6.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but6.setText("");
            }else if (isEmpty(but7)==false && (but7.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but7.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but7.setText("");
            }else if (isEmpty(but8)==false && (but8.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but8.setText("");
            }
        }
        if (isEmpty(but6)==false){
            if (isEmpty(but7)==false && (but6.getText().toString().equals(but7.getText().toString())==true )){
                int temp1 = Integer.parseInt(but6.getText().toString(), 10);
                int temp2 = Integer.parseInt(but7.getText().toString(), 10);
                int temp = temp1 + temp2;
                but6.setText(""+temp);
                but7.setText("");
            }else if (isEmpty(but8)==false && (but6.getText().toString().equals(but8.getText().toString())==true )){
                int temp1 = Integer.parseInt(but6.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but6.setText(""+temp);
                but8.setText("");
            }
        }
        if (isEmpty(but7)==false){
            if (isEmpty(but8)==false && (but7.getText().toString().equals(but8.getText().toString())==true )){
                int temp1 = Integer.parseInt(but7.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but7.setText(""+temp);
                but8.setText("");
            }
        }

        if (isEmpty(but5)== true){
            if(isEmpty(but6)== false){
                but5.setText(but6.getText());
                but6.setText("");
            }else if (isEmpty(but7)==false){
                but5.setText(but7.getText());
                but7.setText("");
            } else if (isEmpty(but8)==false){
                but5.setText(but8.getText());
                but8.setText("");
            }
        }else if(isEmpty(but5)==false){
            if (isEmpty(but6)==true){
                if (isEmpty(but7)==false){
                    but6.setText(but7.getText());
                    but7.setText("");
                }else if (isEmpty(but8)==false){
                    but6.setText(but8.getText());
                    but8.setText("");
                }
            }else if (isEmpty(but7)==true){
                if (isEmpty(but8)==false){
                    but7.setText(but8.getText());
                    but8.setText("");
                }
            }
        }
    }
    public void wgore_3wiersz(){
        Button but1 = (Button) findViewById(R.id.button);
        Button but5 = (Button) findViewById(R.id.button2);
        Button but9 = (Button) findViewById(R.id.button3);
        Button but13 = (Button) findViewById(R.id.button4);
        Button but2 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but10 = (Button) findViewById(R.id.button7);
        Button but14 = (Button) findViewById(R.id.button8);
        Button but3 = (Button) findViewById(R.id.button9);
        Button but7 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        Button but15 = (Button) findViewById(R.id.button12);
        Button but4 = (Button) findViewById(R.id.button13);
        Button but8 = (Button) findViewById(R.id.button14);
        Button but12 = (Button) findViewById(R.id.button15);
        Button but16 = (Button) findViewById(R.id.button16);


        if (isEmpty(but9)==false){
            if (isEmpty(but10)==false && (but10.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but10.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but10.setText("");
            }else if (isEmpty(but11)==false && (but11.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but11.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but11.setText("");
            }else if (isEmpty(but12)==false && (but12.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but12.setText("");
            }
        }
        if (isEmpty(but10)==false){
            if (isEmpty(but11)==false && (but10.getText().toString().equals(but11.getText().toString())==true )){
                int temp1 = Integer.parseInt(but10.getText().toString(), 10);
                int temp2 = Integer.parseInt(but11.getText().toString(), 10);
                int temp = temp1 + temp2;
                but10.setText(""+temp);
                but11.setText("");
            }else if (isEmpty(but12)==false && (but10.getText().toString().equals(but12.getText().toString())==true )){
                int temp1 = Integer.parseInt(but10.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but10.setText(""+temp);
                but12.setText("");
            }
        }
        if (isEmpty(but11)==false){
            if (isEmpty(but12)==false && (but11.getText().toString().equals(but12.getText().toString())==true )){
                int temp1 = Integer.parseInt(but11.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but11.setText(""+temp);
                but12.setText("");
            }
        }
        if (isEmpty(but9)== true){
            if(isEmpty(but10)== false){
                but9.setText(but10.getText());
                but10.setText("");
            }else if (isEmpty(but11)==false){
                but9.setText(but11.getText());
                but11.setText("");
            } else if (isEmpty(but12)==false){
                but9.setText(but12.getText());
                but12.setText("");
            }
        }else if(isEmpty(but9)==false){
            if (isEmpty(but10)==true){
                if (isEmpty(but11)==false){
                    but10.setText(but11.getText());
                    but11.setText("");
                }else if (isEmpty(but12)==false){
                    but10.setText(but12.getText());
                    but12.setText("");
                }
            }else if (isEmpty(but11)==true){
                if (isEmpty(but12)==false){
                    but11.setText(but12.getText());
                    but12.setText("");
                }
            }
        }

    }
    public void wgore_4wiersz(){
        Button but1 = (Button) findViewById(R.id.button);
        Button but5 = (Button) findViewById(R.id.button2);
        Button but9 = (Button) findViewById(R.id.button3);
        Button but13 = (Button) findViewById(R.id.button4);
        Button but2 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but10 = (Button) findViewById(R.id.button7);
        Button but14 = (Button) findViewById(R.id.button8);
        Button but3 = (Button) findViewById(R.id.button9);
        Button but7 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        Button but15 = (Button) findViewById(R.id.button12);
        Button but4 = (Button) findViewById(R.id.button13);
        Button but8 = (Button) findViewById(R.id.button14);
        Button but12 = (Button) findViewById(R.id.button15);
        Button but16 = (Button) findViewById(R.id.button16);


        if (isEmpty(but13)==false){
            if (isEmpty(but14)==false && (but14.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but14.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but14.setText("");
            }else if (isEmpty(but15)==false && (but15.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but15.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but15.setText("");
            }else if (isEmpty(but16)==false && (but16.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but14)==false){
            if (isEmpty(but15)==false && (but14.getText().toString().equals(but15.getText().toString())==true )){
                int temp1 = Integer.parseInt(but14.getText().toString(), 10);
                int temp2 = Integer.parseInt(but15.getText().toString(), 10);
                int temp = temp1 + temp2;
                but14.setText(""+temp);
                but15.setText("");
            }else if (isEmpty(but16)==false && (but14.getText().toString().equals(but16.getText().toString())==true )){
                int temp1 = Integer.parseInt(but14.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but14.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but15)==false){
            if (isEmpty(but16)==false && (but15.getText().toString().equals(but16.getText().toString())==true )){
                int temp1 = Integer.parseInt(but15.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but15.setText(""+temp);
                but16.setText("");
            }
        }

        if (isEmpty(but13)== true){
            if(isEmpty(but14)== false){
                but13.setText(but14.getText());
                but14.setText("");
            }else if (isEmpty(but15)==false){
                but13.setText(but15.getText());
                but15.setText("");
            } else if (isEmpty(but16)==false){
                but13.setText(but16.getText());
                but16.setText("");
            }
        }else if(isEmpty(but13)==false){
            if (isEmpty(but14)==true){
                if (isEmpty(but15)==false){
                    but14.setText(but15.getText());
                    but15.setText("");
                }else if (isEmpty(but16)==false){
                    but14.setText(but16.getText());
                    but16.setText("");
                }
            }else if (isEmpty(but15)==true){
                if (isEmpty(but16)==false){
                    but15.setText(but16.getText());
                    but16.setText("");
                }
            }
        }

    }


    public void wdol_1wiersz(){
        Button but4 = (Button) findViewById(R.id.button);
        Button but8 = (Button) findViewById(R.id.button2);
        Button but12 = (Button) findViewById(R.id.button3);
        Button but16 = (Button) findViewById(R.id.button4);
        Button but3 = (Button) findViewById(R.id.button5);
        Button but7 = (Button) findViewById(R.id.button6);
        Button but11 = (Button) findViewById(R.id.button7);
        Button but15 = (Button) findViewById(R.id.button8);
        Button but2 = (Button) findViewById(R.id.button9);
        Button but6 = (Button) findViewById(R.id.button10);
        Button but10 = (Button) findViewById(R.id.button11);
        Button but14= (Button) findViewById(R.id.button12);
        Button but1 = (Button) findViewById(R.id.button13);
        Button but5 = (Button) findViewById(R.id.button14);
        Button but9 = (Button) findViewById(R.id.button15);
        Button but13 = (Button) findViewById(R.id.button16);



        if (isEmpty(but1)==false){
            if (isEmpty(but2)==false && (but2.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but2.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but2.setText("");
            }else if (isEmpty(but3)==false && (but3.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but3.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but3.setText("");
            }else if (isEmpty(but4)==false && (but4.getText().toString().equals(but1.getText().toString())==true )){
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText(""+temp);
                but4.setText("");
            }
        }
        if (isEmpty(but2)==false){
            if (isEmpty(but3)==false && (but2.getText().toString().equals(but3.getText().toString())==true )){
                int temp1 = Integer.parseInt(but2.getText().toString(), 10);
                int temp2 = Integer.parseInt(but3.getText().toString(), 10);
                int temp = temp1 + temp2;
                but2.setText(""+temp);
                but3.setText("");
            }else if (isEmpty(but4)==false && (but2.getText().toString().equals(but4.getText().toString())==true )){
                int temp1 = Integer.parseInt(but2.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but2.setText(""+temp);
                but4.setText("");
            }
        }
        if (isEmpty(but3)==false){
            if (isEmpty(but4)==false && (but3.getText().toString().equals(but4.getText().toString())==true )){
                int temp1 = Integer.parseInt(but3.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but3.setText(""+temp);
                but4.setText("");
            }
        }

        if (isEmpty(but1)== true){
            if(isEmpty(but2)== false){
                but1.setText(but2.getText());
                but2.setText("");
            }else if (isEmpty(but3)==false){
                but1.setText(but3.getText());
                but3.setText("");
            } else if (isEmpty(but4)==false){
                but1.setText(but4.getText());
                but4.setText("");
            }
        }else if(isEmpty(but1)==false){
            if (isEmpty(but2)==true){
                if (isEmpty(but3)==false){
                    but2.setText(but3.getText());
                    but3.setText("");
                }else if (isEmpty(but4)==false){
                    but2.setText(but4.getText());
                    but4.setText("");
                }
            }else if (isEmpty(but3)==true){
                if (isEmpty(but4)==false){
                    but3.setText(but4.getText());
                    but4.setText("");
                }
            }
        }

    }
    public void wdol_2wiersz(){
        Button but4 = (Button) findViewById(R.id.button);
        Button but8 = (Button) findViewById(R.id.button2);
        Button but12 = (Button) findViewById(R.id.button3);
        Button but16 = (Button) findViewById(R.id.button4);
        Button but3 = (Button) findViewById(R.id.button5);
        Button but7 = (Button) findViewById(R.id.button6);
        Button but11 = (Button) findViewById(R.id.button7);
        Button but15 = (Button) findViewById(R.id.button8);
        Button but2 = (Button) findViewById(R.id.button9);
        Button but6 = (Button) findViewById(R.id.button10);
        Button but10 = (Button) findViewById(R.id.button11);
        Button but14= (Button) findViewById(R.id.button12);
        Button but1 = (Button) findViewById(R.id.button13);
        Button but5 = (Button) findViewById(R.id.button14);
        Button but9 = (Button) findViewById(R.id.button15);
        Button but13 = (Button) findViewById(R.id.button16);


        if (isEmpty(but5)==false){
            if (isEmpty(but6)==false && (but6.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but6.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but6.setText("");
            }else if (isEmpty(but7)==false && (but7.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but7.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but7.setText("");
            }else if (isEmpty(but8)==false && (but8.getText().toString().equals(but5.getText().toString())==true )){
                int temp1 = Integer.parseInt(but5.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but5.setText(""+temp);
                but8.setText("");
            }
        }
        if (isEmpty(but6)==false){
            if (isEmpty(but7)==false && (but6.getText().toString().equals(but7.getText().toString())==true )){
                int temp1 = Integer.parseInt(but6.getText().toString(), 10);
                int temp2 = Integer.parseInt(but7.getText().toString(), 10);
                int temp = temp1 + temp2;
                but6.setText(""+temp);
                but7.setText("");
            }else if (isEmpty(but8)==false && (but6.getText().toString().equals(but8.getText().toString())==true )){
                int temp1 = Integer.parseInt(but6.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but6.setText(""+temp);
                but8.setText("");
            }
        }
        if (isEmpty(but7)==false){
            if (isEmpty(but8)==false && (but7.getText().toString().equals(but8.getText().toString())==true )){
                int temp1 = Integer.parseInt(but7.getText().toString(), 10);
                int temp2 = Integer.parseInt(but8.getText().toString(), 10);
                int temp = temp1 + temp2;
                but7.setText(""+temp);
                but8.setText("");
            }
        }




        if (isEmpty(but5)== true){
            if(isEmpty(but6)== false){
                but5.setText(but6.getText());
                but6.setText("");
            }else if (isEmpty(but7)==false){
                but5.setText(but7.getText());
                but7.setText("");
            } else if (isEmpty(but8)==false){
                but5.setText(but8.getText());
                but8.setText("");
            }
        }else if(isEmpty(but5)==false){
            if (isEmpty(but6)==true){
                if (isEmpty(but7)==false){
                    but6.setText(but7.getText());
                    but7.setText("");
                }else if (isEmpty(but8)==false){
                    but6.setText(but8.getText());
                    but8.setText("");
                }
            }else if (isEmpty(but7)==true){
                if (isEmpty(but8)==false){
                    but7.setText(but8.getText());
                    but8.setText("");
                }
            }
        }
    }
    public void wdol_3wiersz(){
        Button but4 = (Button) findViewById(R.id.button);
        Button but8 = (Button) findViewById(R.id.button2);
        Button but12 = (Button) findViewById(R.id.button3);
        Button but16 = (Button) findViewById(R.id.button4);
        Button but3 = (Button) findViewById(R.id.button5);
        Button but7 = (Button) findViewById(R.id.button6);
        Button but11 = (Button) findViewById(R.id.button7);
        Button but15 = (Button) findViewById(R.id.button8);
        Button but2 = (Button) findViewById(R.id.button9);
        Button but6 = (Button) findViewById(R.id.button10);
        Button but10 = (Button) findViewById(R.id.button11);
        Button but14= (Button) findViewById(R.id.button12);
        Button but1 = (Button) findViewById(R.id.button13);
        Button but5 = (Button) findViewById(R.id.button14);
        Button but9 = (Button) findViewById(R.id.button15);
        Button but13 = (Button) findViewById(R.id.button16);



        if (isEmpty(but9)==false){
            if (isEmpty(but10)==false && (but10.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but10.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but10.setText("");
            }else if (isEmpty(but11)==false && (but11.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but11.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but11.setText("");
            }else if (isEmpty(but12)==false && (but12.getText().toString().equals(but9.getText().toString())==true )){
                int temp1 = Integer.parseInt(but9.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but9.setText(""+temp);
                but12.setText("");
            }
        }
        if (isEmpty(but10)==false){
            if (isEmpty(but11)==false && (but10.getText().toString().equals(but11.getText().toString())==true )){
                int temp1 = Integer.parseInt(but10.getText().toString(), 10);
                int temp2 = Integer.parseInt(but11.getText().toString(), 10);
                int temp = temp1 + temp2;
                but10.setText(""+temp);
                but11.setText("");
            }else if (isEmpty(but12)==false && (but10.getText().toString().equals(but12.getText().toString())==true )){
                int temp1 = Integer.parseInt(but10.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but10.setText(""+temp);
                but12.setText("");
            }
        }
        if (isEmpty(but11)==false){
            if (isEmpty(but12)==false && (but11.getText().toString().equals(but12.getText().toString())==true )){
                int temp1 = Integer.parseInt(but11.getText().toString(), 10);
                int temp2 = Integer.parseInt(but12.getText().toString(), 10);
                int temp = temp1 + temp2;
                but11.setText(""+temp);
                but12.setText("");
            }
        }

        if (isEmpty(but9)== true){
            if(isEmpty(but10)== false){
                but9.setText(but10.getText());
                but10.setText("");
            }else if (isEmpty(but11)==false){
                but9.setText(but11.getText());
                but11.setText("");
            } else if (isEmpty(but12)==false){
                but9.setText(but12.getText());
                but12.setText("");
            }
        }else if(isEmpty(but9)==false){
            if (isEmpty(but10)==true){
                if (isEmpty(but11)==false){
                    but10.setText(but11.getText());
                    but11.setText("");
                }else if (isEmpty(but12)==false){
                    but10.setText(but12.getText());
                    but12.setText("");
                }
            }else if (isEmpty(but11)==true){
                if (isEmpty(but12)==false){
                    but11.setText(but12.getText());
                    but12.setText("");
                }
            }
        }

    }
    public void wdol_4wiersz(){
        Button but4 = (Button) findViewById(R.id.button);
        Button but8 = (Button) findViewById(R.id.button2);
        Button but12 = (Button) findViewById(R.id.button3);
        Button but16 = (Button) findViewById(R.id.button4);
        Button but3 = (Button) findViewById(R.id.button5);
        Button but7 = (Button) findViewById(R.id.button6);
        Button but11 = (Button) findViewById(R.id.button7);
        Button but15 = (Button) findViewById(R.id.button8);
        Button but2 = (Button) findViewById(R.id.button9);
        Button but6 = (Button) findViewById(R.id.button10);
        Button but10 = (Button) findViewById(R.id.button11);
        Button but14= (Button) findViewById(R.id.button12);
        Button but1 = (Button) findViewById(R.id.button13);
        Button but5 = (Button) findViewById(R.id.button14);
        Button but9 = (Button) findViewById(R.id.button15);
        Button but13 = (Button) findViewById(R.id.button16);



        if (isEmpty(but13)==false){
            if (isEmpty(but14)==false && (but14.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but14.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but14.setText("");
            }else if (isEmpty(but15)==false && (but15.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but15.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but15.setText("");
            }else if (isEmpty(but16)==false && (but16.getText().toString().equals(but13.getText().toString())==true )){
                int temp1 = Integer.parseInt(but13.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but13.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but14)==false){
            if (isEmpty(but15)==false && (but14.getText().toString().equals(but15.getText().toString())==true )){
                int temp1 = Integer.parseInt(but14.getText().toString(), 10);
                int temp2 = Integer.parseInt(but15.getText().toString(), 10);
                int temp = temp1 + temp2;
                but14.setText(""+temp);
                but15.setText("");
            }else if (isEmpty(but16)==false && (but14.getText().toString().equals(but16.getText().toString())==true )){
                int temp1 = Integer.parseInt(but14.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but14.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but15)==false){
            if (isEmpty(but16)==false && (but15.getText().toString().equals(but16.getText().toString())==true )){
                int temp1 = Integer.parseInt(but15.getText().toString(), 10);
                int temp2 = Integer.parseInt(but16.getText().toString(), 10);
                int temp = temp1 + temp2;
                but15.setText(""+temp);
                but16.setText("");
            }
        }
        if (isEmpty(but13)== true){
            if(isEmpty(but14)== false){
                but13.setText(but14.getText());
                but14.setText("");
            }else if (isEmpty(but15)==false){
                but13.setText(but15.getText());
                but15.setText("");
            } else if (isEmpty(but16)==false){
                but13.setText(but16.getText());
                but16.setText("");
            }
        }else if(isEmpty(but13)==false){
            if (isEmpty(but14)==true){
                if (isEmpty(but15)==false){
                    but14.setText(but15.getText());
                    but15.setText("");
                }else if (isEmpty(but16)==false){
                    but14.setText(but16.getText());
                    but16.setText("");
                }
            }else if (isEmpty(but15)==true){
                if (isEmpty(but16)==false){
                    but15.setText(but16.getText());
                    but16.setText("");
                }
            }
        }
    }

    public void wprawo(){
        wprawo_1wiersz();
        wprawo_2wiersz();
        wprawo_3wiersz();
        wprawo_4wiersz();

    }
    public void wlewo (){
    wlewo_1wiersz();
    wlewo_2wiersz();
    wlewo_3wiersz();
    wlewo_4wiersz();
    }
    public void wgore(){
        wgore_1wiersz();
        wgore_2wiersz();
        wgore_3wiersz();
        wgore_4wiersz();
    }
    public void wdol(){
        wdol_1wiersz();
        wdol_2wiersz();
        wdol_3wiersz();
        wdol_4wiersz();
    }






    public void losuj(){

        Button but1 = (Button) findViewById(R.id.button);
        Button but2 = (Button) findViewById(R.id.button2);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button4);
        Button but5 = (Button) findViewById(R.id.button5);
        Button but6 = (Button) findViewById(R.id.button6);
        Button but7 = (Button) findViewById(R.id.button7);
        Button but8 = (Button) findViewById(R.id.button8);
        Button but9 = (Button) findViewById(R.id.button9);
        Button but10 = (Button) findViewById(R.id.button10);
        Button but11 = (Button) findViewById(R.id.button11);
        Button but12 = (Button) findViewById(R.id.button12);
        Button but13 = (Button) findViewById(R.id.button13);
        Button but14 = (Button) findViewById(R.id.button14);
        Button but15 = (Button) findViewById(R.id.button15);
        Button but16 = (Button) findViewById(R.id.button16);

        int min = 0;
        int max = 16;
        Random r = new Random();
        int i = r.nextInt(max - min + 1) + min;



        switch (i) {
            case 0:
                if(isEmpty(but1) == true){
                    but1.setText("1");
                    break;
                }


            case 1:
                if(isEmpty(but2) == true){
                    but2.setText("1");
                    break;
                }
            case 2:
                if(isEmpty(but3) == true){
                    but3.setText("1");
                    break;
                }

            case 3:
                if(isEmpty(but4) == true){
                    but4.setText("1");
                    break;
                }
            case 4:
                if(isEmpty(but5) == true){
                    but5.setText("1");
                    break;
                }
            case 5:
                if(isEmpty(but6) == true){
                    but6.setText("1");
                    break;
                }
            case 6:
                if(isEmpty(but7) == true){
                    but7.setText("1");
                    break;
                }
            case 7:
                if(isEmpty(but8) == true){
                    but8.setText("1");
                    break;
                }
            case 8:
                if(isEmpty(but9) == true){
                    but9.setText("1");
                    break;
                }
            case 9:
                if(isEmpty(but10) == true){
                    but10.setText("1");
                    break;
                }
            case 10:
                if(isEmpty(but11) == true){
                    but11.setText("1");
                    break;
                }
            case 11:
                if(isEmpty(but12) == true){
                    but12.setText("1");
                    break;
                }
            case 12:
                if(isEmpty(but13) == true){
                    but13.setText("1");
                    break;
                }
            case 13:
                if(isEmpty(but14) == true){
                    but14.setText("1");
                    break;
                }
            case 14:
                if(isEmpty(but15) == true){
                    but15.setText("1");
                    break;
                }

            case 15:
                if(isEmpty(but16) == true){
                    but16.setText("1");
                    break;

                }

            default:

                losuj();


             }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);
        detector = new SimpleGestureFilter(this,this);

}
    @Override
    public boolean dispatchTouchEvent(MotionEvent me){
        // Call onTouchEvent of SimpleGestureFilter class
        this.detector.onTouchEvent(me);
        return super.dispatchTouchEvent(me);
    }
    @Override
    public void onSwipe(int direction) {
        String str = "";

        switch (direction) {

            case SimpleGestureFilter.SWIPE_RIGHT : str = "Swipe Right";
                if(Sprawdzpelne()== false){
                    wprawo();
                    losuj();
                }else
                {
                }
                break;
            case SimpleGestureFilter.SWIPE_LEFT :  str = "Swipe Left";
                if(Sprawdzpelne()== false){
                    wlewo();
                    losuj();
                }else
                {
                }
                break;
            case SimpleGestureFilter.SWIPE_DOWN :  str = "Swipe Down";
                if(Sprawdzpelne()== false){
                    wdol();
                    losuj();
                }else
                {
                }
                break;
            case SimpleGestureFilter.SWIPE_UP :    str = "Swipe Up";
                if(Sprawdzpelne()== false){
                    wgore();
                    losuj();
                }else
                {
                }
                break;

        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDoubleTap() {
        Toast.makeText(this, "Double Tap", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);



    }


}
