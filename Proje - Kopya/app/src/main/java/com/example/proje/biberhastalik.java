package com.example.proje;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class biberhastalik  extends Activity {

    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
    private ImageButton imageButton6;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biberhastalik);

        imageButton1=findViewById(R.id.hastalik1);
        imageButton2=findViewById(R.id.hastalik2);
        imageButton3=findViewById(R.id.hastalik3);
        imageButton4=findViewById(R.id.hastalik4);
        imageButton5=findViewById(R.id.hastalik5);
        imageButton6=findViewById(R.id.hastalik6);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),biberbenek.class);
                startActivity(i);

            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),bibergalsinegi.class);
                startActivity(i);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),biberkanser.class);
                startActivity(i);

            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),biberkokcuruklugu.class);
                startActivity(i);

            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),biberkokyanikligi.class);
                startActivity(i);

            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),bibernekroz.class);
                startActivity(i);

            }
        });


    }
}
