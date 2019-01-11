package com.example.erics.belmat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.erics.belmat.database.DatabaseHandler;
import com.facebook.stetho.Stetho;

public class MainActivity extends AppCompatActivity {
    ImageView btnA,btnB,btnC;
    private Button tmbh;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Stetho.initializeWithDefaults(this);


        btnA = (ImageView) findViewById(R.id.pil);
        btnB = (ImageView) findViewById(R.id.tent);
        btnC = (ImageView) findViewById(R.id.kel);
        tmbh = (Button) findViewById(R.id.tambah);

        tmbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,InputSoal.class);
                startActivity(intent);
            }
        });

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PilBil.class);
                startActivity(intent);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tent.class);
                startActivity(intent);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });
    }
}
