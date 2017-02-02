package com.introtoandroid.button_counter_bradley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;



public class ButtonCounter extends AppCompatActivity {

    private Button incre;
    private Button decre;
    private Button clear;
    private TextView countView;

    private Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_counter);

        incre = (Button) findViewById(R.id.incre);
        decre = (Button) findViewById(R.id.decre);
        clear = (Button) findViewById(R.id.clearButton);
        countView = (TextView) findViewById(R.id.countView);

        incre.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                count += 1;
                countView.setText(count.toString());
            }
        });

        decre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View w) {
                count -= 1;
                countView.setText(count.toString());
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View w) {
                count = 0;
                countView.setText(count.toString());
            }
        });

    }
}
