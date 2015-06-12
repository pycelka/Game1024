package com.example.maciej.game1024;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.parse.CountCallback;
import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class scoreActivity extends ActionBarActivity {

    public static int score = 0;
    public static String name = null;
    String [] listName;
    Number [] listScore;
    private TextView records;


    int countO;




    public void parse( ){
        ParseObject Parse = new ParseObject("TestObject");
        Parse.put("name", name);
        Parse.put("score", score);
        Parse.saveInBackground();


    }
    public void wyswietlnie()
    {

        records = (TextView)findViewById(R.id.textView2);
        ParseQuery<ParseObject> query = ParseQuery.getQuery("GameScore");
        query.countInBackground(new CountCallback() {
            @Override
            public void done(int count, com.parse.ParseException e) {

                if (e == null) {
                    countO = count;
                    listName = new String[countO];
                    listScore = new Number[countO];
                } else {
                    records.setText("Przepraszamy, brak danych. Sprawdz swoje polaczenie z Internetem");
                }
            }
        });
        ParseQuery<ParseObject> query2 = ParseQuery.getQuery("GameScore");
        query2.addDescendingOrder("score");
        query2.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> list, com.parse.ParseException e) {

                if (e == null) {
                    for (int i = 0; i < countO; i++) {
                        listName[i] = list.get(i).getString("name");
                        listScore[i] = list.get(i).getNumber("score");
                        records.append(listName[i] + " :  " + listScore[i] + "  -  ");
                        records.append("\n");
                    }
                }
            }
        });





    }

    public void getnamescore() {
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        name = (String) b.get("name");
        score = (Integer) b.get("score");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        getnamescore();
        parse();
        wyswietlnie();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_score, menu);

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
