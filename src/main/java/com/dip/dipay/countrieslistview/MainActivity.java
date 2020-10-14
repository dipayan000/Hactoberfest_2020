package com.dip.dipay.countrieslistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar Tool;
    ListView ListCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tool = (Toolbar)findViewById(R.id.Tool);
        Tool.setTitle(getResources().getString(R.string.app_name));
        ListCountry = (ListView)findViewById(R.id.ListCountry);


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Country_names));

        ListCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("CountryName",ListCountry.getItemAtPosition(position).toString());
                startActivity(intent);

            }
        });
        ListCountry.setAdapter(adapter);
    }
}
