package com.dip.dipay.countrieslistview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {
    Toolbar Tool2;
    ImageView flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Tool2 =(Toolbar)findViewById(R.id.Tool2);
        flag =(ImageView)findViewById(R.id.flag);

        Bundle bundle=getIntent().getExtras();
        if(bundle !=null){
            Tool2.setTitle(bundle.getString("CountryName"));
            if(Tool2.getTitle().toString().equalsIgnoreCase("India")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,R.drawable.india));
            } else if (Tool2.getTitle().toString().equalsIgnoreCase("Australia")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,R.drawable.australia));
            }else if (Tool2.getTitle().toString().equalsIgnoreCase("Pakisthan")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,R.drawable.pakistan));
            }else if (Tool2.getTitle().toString().equalsIgnoreCase("USA")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,R.drawable.usa));
            }else if (Tool2.getTitle().toString().equalsIgnoreCase("Russia")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,R.drawable.russia));
            }else if (Tool2.getTitle().toString().equalsIgnoreCase("Nepal")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,R.drawable.nepal));
            }else if (Tool2.getTitle().toString().equalsIgnoreCase("China")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,R.drawable.china));
            }else if (Tool2.getTitle().toString().equalsIgnoreCase("Brazil")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,R.drawable.brazil));
            }


        }


    }
}
