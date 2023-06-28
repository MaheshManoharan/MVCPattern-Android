package com.mahi.patternsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    Button btn;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    //implementing MVC Pattern
    public MyModel GetAppFromModel()
    {
        return new MyModel("Master Coding App", 900000, 4);
    }

    public void DisplayAppinText(View view)
    {
        textView.setText(GetAppFromModel().getAppName() + " Downloads "+ GetAppFromModel().getAppDownloads());
    }

}