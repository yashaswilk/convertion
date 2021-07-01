package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView view;
    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        view=findViewById(R.id.view);
        num=findViewById(R.id.num);
        view.setVisibility(View.GONE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=num.getText().toString();
                int g=Integer.parseInt(id);
                int t=g*74;
                view.setText("CONVERTION OF $"+ g+" " + "IS" +" "+ "Rs"+t);
                view.setVisibility(View.VISIBLE);
            }
        });
    }
}