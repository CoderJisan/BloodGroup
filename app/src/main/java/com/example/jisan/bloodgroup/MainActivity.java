package com.example.jisan.bloodgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button but1;

    public void init(){
        but1=(Button) findViewById(R.id.button);
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent toy=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
