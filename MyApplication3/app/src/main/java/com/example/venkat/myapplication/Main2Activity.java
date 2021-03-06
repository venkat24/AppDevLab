package com.example.venkat.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Context ctx = this.getApplicationContext();

        final TextView newTextView = (TextView) findViewById(R.id.textView2);
        newTextView.setText(newTextView.getText() + "\n" + "Hit OnCreate!");

        final Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ctx, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        final TextView newTextView = (TextView) findViewById(R.id.textView2);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        newTextView.setText(newTextView.getText() + "\n" + "Hit OnStart!" + currentDateTimeString);
    }

    @Override
    protected void onStop() {
        super.onStop();
        final TextView newTextView = (TextView) findViewById(R.id.textView2);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        newTextView.setText(newTextView.getText() + "\n" + "Hit OnStop!" + currentDateTimeString);
    }

    @Override
    protected void onPause() {
        super.onPause();
        final TextView newTextView = (TextView) findViewById(R.id.textView2);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        newTextView.setText(newTextView.getText() + "\n" + "Hit OnPause!" + currentDateTimeString);
    }

    @Override
    protected void onResume() {
        super.onResume();
        final TextView newTextView = (TextView) findViewById(R.id.textView2);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        newTextView.setText(newTextView.getText() + "\n" + "Hit OnResume!" + currentDateTimeString);
    }
}
