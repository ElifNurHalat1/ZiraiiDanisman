package com.example.proje;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class kaktushastalik  extends Activity {

    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kaktushastalik);

        imageButton1=findViewById(R.id.hastalik1);
        imageButton2=findViewById(R.id.hastalik2);
        imageButton3=findViewById(R.id.hastalik3);
        imageButton4=findViewById(R.id.hastalik4);
        imageButton5=findViewById(R.id.hastalik5);


        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),kaktusasirisulama.class);
                startActivity(i);

            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),kaktusfusarium.class);
                startActivity(i);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),kaktusgunesyanikligi.class);
                startActivity(i);

            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),kaktuskursunikuf.class);
                startActivity(i);

            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),kaktusyetersizsulama.class);
                startActivity(i);

            }
        });



    }
}
