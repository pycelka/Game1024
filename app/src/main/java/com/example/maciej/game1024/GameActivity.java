package com.example.maciej.game1024;

import com.example.maciej.game1024.util.SystemUiHider;
import com.example.maciej.game1024.SimpleGestureFilter.SimpleGestureListener;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class GameActivity extends Activity implements SimpleGestureListener  {
    private SimpleGestureFilter detector;
    public static int score = 0;
    public static String name = null;

        public void helper(Button but){
            if (isEmpty(but)==true){but.setTextColor(Color.parseColor("#ffffffff"));}
            if (Integer.parseInt(but.getText().toString()) == 1){but.setTextColor(Color.parseColor("#ffffffff"));}
            if (Integer.parseInt(but.getText().toString()) == 2){but.setTextColor(Color.parseColor("#b3cfba"));}
            if (Integer.parseInt(but.getText().toString()) == 4){but.setTextColor(Color.parseColor("#a1c1cb"));}
            if (Integer.parseInt(but.getText().toString()) == 8){but.setTextColor(Color.parseColor("#37c3e0"));}
            if (Integer.parseInt(but.getText().toString()) == 16){but.setTextColor(Color.parseColor("#147084"));}
            if (Integer.parseInt(but.getText().toString()) == 32){but.setTextColor(Color.parseColor("#008080"));}
            if (Integer.parseInt(but.getText().toString()) == 64){but.setTextColor(Color.parseColor("#ffc0cb"));}
            if (Integer.parseInt(but.getText().toString()) == 128){but.setTextColor(Color.parseColor("#a1c1cb"));}
            if (Integer.parseInt(but.getText().toString()) == 256){but.setTextColor(Color.parseColor("#a1c1cb"));}
            if (Integer.parseInt(but.getText().toString()) == 512){but.setTextColor(Color.parseColor("#a1c1cb"));}
            if (Integer.parseInt(but.getText().toString()) == 1024){but.setTextColor(Color.parseColor("#a1c1cb"));}
            if (Integer.parseInt(but.getText().toString()) == 2048){but.setTextColor(Color.parseColor("#a1c1cb"));}


    }
    public void kolorowanka(){
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
        if (isEmpty(but1)==false)helper(but1);
        if (isEmpty(but2)==false)helper(but2);
        if (isEmpty(but3)==false)helper(but3);
        if (isEmpty(but4)==false)helper(but4);

        if (isEmpty(but5)==false)helper(but5);
        if (isEmpty(but6)==false)helper(but6);
        if (isEmpty(but7)==false)helper(but7);
        if (isEmpty(but8)==false)helper(but8);

        if (isEmpty(but9)==false)helper(but9);
        if (isEmpty(but10)==false)helper(but10);
        if (isEmpty(but11)==false)helper(but11);
        if (isEmpty(but12)==false)helper(but12);

        if (isEmpty(but13)==false)helper(but13);
        if (isEmpty(but14)==false)helper(but14);
        if (isEmpty(but15)==false)helper(but15);
        if (isEmpty(but16)==false)helper(but16);

    }
    public void sound(){
         MediaPlayer mp1 = MediaPlayer.create(this, R.raw.sound);

        mp1.start();
        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            }

            ;
        });

    }
    public void wyczysc(){
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
        but1.setText(""); but2.setText(""); but3.setText(""); but4.setText("");
        but5.setText(""); but6.setText(""); but7.setText(""); but8.setText("");
        but9.setText(""); but10.setText(""); but11.setText(""); but12.setText("");
        but13.setText(""); but14.setText(""); but15.setText(""); but16.setText("");

        TextView punkty = (TextView) findViewById(R.id.score_text);
        punkty.setText("");
    }
    public boolean isEmpty(Button etText) {
        if (etText.getText().toString().trim().length() > 0) {
            return false;
        } else {
            return true;
        }
    }
    public boolean isnot1(Button etText) {
        if (etText.getText().toString() == "1" ) {
            return false;
        } else {
            return true;
        }
    }
    public boolean Sprawdzpelne() {

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

        if ((isEmpty(but1) == false) & (isEmpty(but2) == false) & (isEmpty(but3) == false) & (isEmpty(but4) == false) & (isEmpty(but5) == false) & (isEmpty(but6) == false) & (isEmpty(but7) == false) & (isEmpty(but8) == false) & (isEmpty(but9) == false) & (isEmpty(but10) == false) & (isEmpty(but11) == false) & (isEmpty(but12) == false) & (isEmpty(but13) == false) & (isEmpty(but14) == false) & (isEmpty(but15) == false) & (isEmpty(but16) == false)) {
            return true;
        } else {
            return false;
        }
    }
    public void zliczpunkt(){
        kolorowanka();
        Button but1 = (Button) findViewById(R.id.button); int temp1 = 0;
        Button but2 = (Button) findViewById(R.id.button2); int temp2 = 0;
        Button but3 = (Button) findViewById(R.id.button3); int temp3 = 0;
        Button but4 = (Button) findViewById(R.id.button4); int temp4 = 0;

        Button but5 = (Button) findViewById(R.id.button5);  int temp5 = 0;
        Button but6 = (Button) findViewById(R.id.button6); int temp6 = 0;
        Button but7 = (Button) findViewById(R.id.button7); int temp7 = 0;
        Button but8 = (Button) findViewById(R.id.button8); int temp8 = 0;

        Button but9 = (Button) findViewById(R.id.button9); int temp9 = 0;
        Button but10 = (Button) findViewById(R.id.button10); int temp10 = 0;
        Button but11 = (Button) findViewById(R.id.button11); int temp11 = 0;
        Button but12 = (Button) findViewById(R.id.button12); int temp12 = 0;

        Button but13 = (Button) findViewById(R.id.button13); int temp13 = 0;
        Button but14 = (Button) findViewById(R.id.button14); int temp14 = 0;
        Button but15 = (Button) findViewById(R.id.button15); int temp15 = 0;
        Button but16 = (Button) findViewById(R.id.button16); int temp16 = 0;


        if((isEmpty(but1)== false) && (isnot1(but1)==true)){temp1 = Integer.parseInt(but1.getText().toString(), 10);} else { temp1 = 0;}
        if((isEmpty(but2)== false) && (isnot1(but2)==true)){temp2 = Integer.parseInt(but2.getText().toString(), 10);} else { temp2 = 0;}
        if((isEmpty(but3)== false) && (isnot1(but3)==true)){temp3 = Integer.parseInt(but3.getText().toString(), 10);} else { temp3 = 0;}
        if((isEmpty(but4)== false) && (isnot1(but4)==true)){temp4 = Integer.parseInt(but4.getText().toString(), 10);} else { temp4 = 0;}

        if((isEmpty(but5)== false) && (isnot1(but5)==true)){temp5 = Integer.parseInt(but5.getText().toString(), 10);} else { temp5 = 0;}
        if((isEmpty(but6)== false) && (isnot1(but6)==true)){temp6 = Integer.parseInt(but6.getText().toString(), 10);} else { temp6 = 0;}
        if((isEmpty(but7)== false) && (isnot1(but7)==true)){temp7 = Integer.parseInt(but7.getText().toString(), 10);} else { temp7 = 0;}
        if((isEmpty(but8)== false) && (isnot1(but8)==true)){temp8 = Integer.parseInt(but8.getText().toString(), 10);} else { temp8 = 0;}

        if((isEmpty(but9)== false) && (isnot1(but9)==true)){temp9 = Integer.parseInt(but9.getText().toString(), 10);} else { temp9 = 0;}
        if((isEmpty(but10)== false) && (isnot1(but10)==true)){temp10 = Integer.parseInt(but10.getText().toString(), 10);} else { temp10 = 0;}
        if((isEmpty(but11)== false) && (isnot1(but11)==true)){temp11 = Integer.parseInt(but11.getText().toString(), 10);} else { temp11 = 0;}
        if((isEmpty(but12)== false) && (isnot1(but12)==true)){temp12 = Integer.parseInt(but12.getText().toString(), 10);} else { temp12 = 0;}

        if((isEmpty(but13)== false) && (isnot1(but13)==true)){temp13 = Integer.parseInt(but13.getText().toString(), 10);} else { temp13 = 0;}
        if((isEmpty(but14)== false) && (isnot1(but14)==true)){temp14 = Integer.parseInt(but14.getText().toString(), 10);} else { temp14 = 0;}
        if((isEmpty(but15)== false) && (isnot1(but15)==true)){temp15 = Integer.parseInt(but15.getText().toString(), 10);} else { temp15 = 0;}
        if((isEmpty(but16)== false) && (isnot1(but16)==true)){temp16 = Integer.parseInt(but16.getText().toString(), 10);} else { temp16 = 0;}


            score = temp1 + temp2 + temp3 + temp4 + temp5 + temp6 + temp7 + temp8 + temp9 + temp10 + temp11 + temp12 + temp13 + temp14+ temp15 + temp16;
            TextView punkty = (TextView) findViewById(R.id.score_text);
            punkty.setText(""+score);
        if (Sprawdzpelne()==true) {
            popup();

        }

    }
    public void popup(){
        new AlertDialog.Builder(this)
                .setTitle("Koniec gry")
                .setMessage("Czy chcesz zapisac wynik gry")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent ii=new Intent(GameActivity.this, scoreActivity.class);
                        ii.putExtra("name", name);
                        ii.putExtra("score", score);
                        finish();
                        startActivity(ii);
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                       Intent ii=new Intent(GameActivity.this, StartActivity.class);
                        startActivity(ii);
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
    public void ruch(Button but1, Button but2, Button but3, Button but4) {




            if ((but1.getText().toString().equals(but2.getText().toString()) == true) & (isEmpty(but1) == false) & (isEmpty(but2) == false)) {
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but2.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText("" + temp);
                but2.setText("");
            }
            if ((but2.getText().toString().equals(but3.getText().toString()) == true && (isEmpty(but2) == false) && (isEmpty(but3) == false))) {
                int temp1 = Integer.parseInt(but2.getText().toString(), 10);
                int temp2 = Integer.parseInt(but3.getText().toString(), 10);
                int temp = temp1 + temp2;
                but2.setText("" + temp);
                but3.setText("");
            }
            if ((but1.getText().toString().equals(but3.getText().toString()) == true) & (isEmpty(but1) == false) & (isEmpty(but3) == false) & (isEmpty(but2) == true)) {
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but3.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText("" + temp);
                but3.setText("");
            }
            if ((but3.getText().toString().equals(but4.getText().toString()) == true) & (isEmpty(but3) == false) & (isEmpty(but4) == false)) {
                int temp1 = Integer.parseInt(but3.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but3.setText("" + temp);
                but4.setText("");
            }
            if ((but2.getText().toString().equals(but4.getText().toString()) == true) & (isEmpty(but2) == false) & (isEmpty(but4) == false) & (isEmpty(but3) == true)) {
                int temp1 = Integer.parseInt(but2.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but2.setText("" + temp);
                but4.setText("");
            }
            if ((but1.getText().toString().equals(but4.getText().toString()) == true) & (isEmpty(but1) == false) & (isEmpty(but4) == false) & (isEmpty(but3) == false) & (isEmpty(but2) == false)) {
                int temp1 = Integer.parseInt(but1.getText().toString(), 10);
                int temp2 = Integer.parseInt(but4.getText().toString(), 10);
                int temp = temp1 + temp2;
                but1.setText("" + temp);
                but4.setText("");
            }

            if (isEmpty(but1) == true) {
                if (isEmpty(but2) == false) {
                    but1.setText(but2.getText());
                    but2.setText("");
                } else if (isEmpty(but3) == false) {
                    but1.setText(but3.getText());
                    but3.setText("");
                } else if (isEmpty(but4) == false) {
                    but1.setText(but4.getText());
                    but4.setText("");
                }
            }
            if (isEmpty(but2) == true) {
                if (isEmpty(but3) == false) {
                    but2.setText(but3.getText());
                    but3.setText("");
                } else if (isEmpty(but4) == false) {
                    but2.setText(but4.getText());
                    but4.setText("");
                }

            }
            if (isEmpty(but3) == true) {
                if (isEmpty(but4) == false) {
                    but3.setText(but4.getText());
                    but4.setText("");
                }
            }

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


        int min = 1;
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




             }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        name = (String) b.get("name");
        if (Sprawdzpelne()==true) {
            popup();

        }

        detector = new SimpleGestureFilter(this,this);
        Button koniec = (Button) findViewById(R.id.but_end);
        koniec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup();

            }
        });

        Button reset = (Button) findViewById(R.id.but_reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wyczysc();

            }
        });

        if (Sprawdzpelne()==true){Intent intent = new Intent(GameActivity.this, scoreActivity.class); startActivity(intent); }


}
    @Override
    public boolean dispatchTouchEvent(MotionEvent me){
        // Call onTouchEvent of SimpleGestureFilter class
        this.detector.onTouchEvent(me);
        return super.dispatchTouchEvent(me);
    }
    @Override
    public void onSwipe(int direction) {
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
        String str = "";



        switch (direction) {

            case SimpleGestureFilter.SWIPE_RIGHT : str = "Swipe Right";
                if(Sprawdzpelne()== false){
                    sound();
                    ruch(but4, but3, but2, but1);
                    ruch(but8, but7, but6, but5);
                    ruch(but12, but11, but10, but9);
                    ruch(but16, but15, but14, but13);
                    losuj();
                    zliczpunkt();
                } break;
            case SimpleGestureFilter.SWIPE_LEFT :  str = "Swipe Left";
                if(Sprawdzpelne()== false){
                    sound();
                    ruch(but1, but2, but3, but4);
                    ruch(but5, but6, but7, but8);
                    ruch(but9, but10, but11, but12);
                    ruch(but13, but14, but15, but16);
                    losuj();
                    zliczpunkt();
                } break;
            case SimpleGestureFilter.SWIPE_DOWN :  str = "Swipe Down";
                if(Sprawdzpelne()== false){
                    sound();
                    ruch(but13, but9, but5, but1);
                    ruch(but14, but10, but6, but2);
                    ruch(but15, but11, but7, but3);
                    ruch(but16, but12, but8, but4);
                    losuj();
                    zliczpunkt();
                } break;
            case SimpleGestureFilter.SWIPE_UP :    str = "Swipe Up";
                if(Sprawdzpelne()== false){
                    sound();
                    ruch(but1, but5, but9, but13);
                    ruch(but2, but6, but10, but14);
                    ruch(but3, but7, but11, but15);
                    ruch(but4, but8, but12, but16);
                    losuj();

                    zliczpunkt();
                } break;


        }
        //Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }






    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);



    }


}
