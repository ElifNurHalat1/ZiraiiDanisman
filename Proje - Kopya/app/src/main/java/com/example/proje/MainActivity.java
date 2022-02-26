package com.example.proje;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListView bitkiler=findViewById(R.id.bitkiler);
        bitkiler.setAdapter(new islemler(this));


        bitkiler.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
               Intent i;
                if(groupPosition==0) {
                    switch (childPosition) {
                        case 0: {
                            i = new Intent(getApplicationContext(), domates.class);
                            startActivity(i);
                            break;
                        }
                        case 1: {
                            i = new Intent(getApplicationContext(), biber.class);
                            startActivity(i);
                            break;
                        }
                        case 2: {
                            i = new Intent(getApplicationContext(), fasulye.class);
                            startActivity(i);
                            break;
                        }
                        case 3: {
                            i = new Intent(getApplicationContext(), havuc.class);
                            startActivity(i);
                            break;
                        }
                        case 4: {
                            i = new Intent(getApplicationContext(), ıspanak.class);
                            startActivity(i);
                            break;
                        }
                        case 5: {
                            i = new Intent(getApplicationContext(), karnabahar.class);
                            startActivity(i);
                            break;
                        }
                        case 6: {
                            i = new Intent(getApplicationContext(), patates.class);
                            startActivity(i);
                            break;
                        }
                        case 7: {
                            i = new Intent(getApplicationContext(), patlican.class);
                            startActivity(i);
                            break;
                        }
                        case 8: {
                            i = new Intent(getApplicationContext(), salatalik.class);
                            startActivity(i);
                            break;
                        }
                        case 9: {
                            i = new Intent(getApplicationContext(), sogan.class);
                            startActivity(i);
                            break;
                        }
                    }

                }
               else if(groupPosition==1)
                {
                    switch (childPosition){

                        case 0:
                        {
                            i = new Intent(getApplicationContext(), cilek.class);
                            startActivity(i);
                            break;
                        }
                        case 1:
                        {
                            i = new Intent(getApplicationContext(), ceviz.class);
                            startActivity(i);
                            break;
                        }
                        case 2:
                        {
                            i = new Intent(getApplicationContext(), dut.class);
                            startActivity(i);
                            break;
                        }
                        case 3:
                        {
                            i = new Intent(getApplicationContext(), elma.class);
                            startActivity(i);
                            break;
                        }
                        case 4:
                        {
                            i = new Intent(getApplicationContext(), erik.class);
                            startActivity(i);
                            break;
                        }
                        case 5:
                        {
                            i = new Intent(getApplicationContext(), karpuz.class);
                            startActivity(i);
                            break;
                        }
                        case 6:
                        {
                            i = new Intent(getApplicationContext(), kayisi.class);
                            startActivity(i);
                            break;
                        }
                        case 7:
                        {
                            i = new Intent(getApplicationContext(), kiraz.class);
                            startActivity(i);
                            break;
                        }
                        case 8:
                        {
                            i = new Intent(getApplicationContext(), portakal.class);
                            startActivity(i);
                            break;
                        }
                        case 9:
                        {
                            i = new Intent(getApplicationContext(), uzum.class);
                            startActivity(i);
                            break;
                        }
                    }
                }
                else if(groupPosition==2){
                    switch (childPosition){
                        case 0:
                        {
                            i = new Intent(getApplicationContext(), aloevera.class);
                            startActivity(i);
                            break;
                        }
                        case 1:
                        {
                            i = new Intent(getApplicationContext(), begonya.class);
                            startActivity(i);
                            break;
                        }
                        case 2:
                        {
                            i = new Intent(getApplicationContext(), glayol.class);
                            startActivity(i);
                            break;
                        }
                        case 3:
                        {
                            i = new Intent(getApplicationContext(), gul.class);
                            startActivity(i);
                            break;
                        }
                        case 4:
                        {
                            i = new Intent(getApplicationContext(), kaktus.class);
                            startActivity(i);
                            break;
                        }
                        case 5:
                        {
                            i = new Intent(getApplicationContext(), karanfil.class);
                            startActivity(i);
                            break;
                        }
                        case 6:
                        {
                            i = new Intent(getApplicationContext(), lale.class);
                            startActivity(i);
                            break;
                        }
                        case 7:
                        {
                            i = new Intent(getApplicationContext(), petunya.class);
                            startActivity(i);
                            break;
                        }
                        case 8:
                        {
                            i = new Intent(getApplicationContext(), sardunya.class);
                            startActivity(i);
                            break;
                        }
                        case 9:
                        {
                            i = new Intent(getApplicationContext(), sumbul.class);
                            startActivity(i);
                            break;
                        }
                    }
                }
                return true;

            }

        });
    }



}