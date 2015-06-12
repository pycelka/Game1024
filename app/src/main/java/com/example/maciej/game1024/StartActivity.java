package com.example.maciej.game1024;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class StartActivity extends ActionBarActivity {
    public static int score = 0;
    public static String name = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
               setContentView(R.layout.activity_start);
        final Context context = this;
        Random rand = new Random();
        int value = rand.nextInt(1000000+432424);
       final TextView nick = (TextView) findViewById(R.id.name_text);
        nick.setText("Nickname" + value);
        Button startbutton = (Button) findViewById(R.id.start_button);
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(StartActivity.this, GameActivity.class);

                String name = nick.getText().toString();
                ii.putExtra("name", name);
                startActivity(ii);
            }
        });

        Button wyniki = (Button) findViewById(R.id.but_wyniki);
        wyniki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(StartActivity.this, scoreActivity.class);

                ii.putExtra("name", name);
                ii.putExtra("score", score);
                startActivity(ii);
            }
        });


        Button alert = (Button) findViewById(R.id.name_button);

        //Create onclick listener class
        alert.setOnClickListener(new View.OnClickListener() {
            //When you click the button, Alert dialog will be showed
            public void onClick(View v) {
       /* Alert Dialog Code Start*/
                AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle("Zmiana nazwy gracza"); //Set Alert dialog title here
                alert.setMessage("Wprowadz nowa nazwe");


                final EditText input = new EditText(context);
                alert.setView(input);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        String srt = input.getEditableText().toString();
                        nick.setText(srt);
                    }
                });
                alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = alert.create();
                alertDialog.show();

            }// End of onClick(View v)
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
