package com.example.kazarasupermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttonb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        buttonb=(Button) findViewById(R.id.button2);
        Button buttonc = (Button) findViewById(R.id.button3);
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"please wait a moment",Toast.LENGTH_SHORT).show();
                openMainActivity5();
            }
        });
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"please wait a moment",Toast.LENGTH_SHORT).show();
                openMainActivity4();
            }
        });


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"please wait a moment",Toast.LENGTH_SHORT).show();
                openMainActivity2();


            }
        });
    }

    public void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openMainActivity4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);

    }
    public void openMainActivity5(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);

    }
}
