package com.locadora.xaolo.locadora;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] veiculos = {"Uno", "Gol", "Corsa", "Palio", "Fiesta"};
        ListView listaVeiculos = (ListView) findViewById(R.id.listaVeiculos);
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, veiculos);
        listaVeiculos.setAdapter(itemsAdapter);
        FloatingActionButton buttonGoNewCar = (FloatingActionButton) findViewById(R.id.floatingActionButton);

        buttonGoNewCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intentGoToForm = new Intent(MainActivity.this, FormActivity.class);
                startActivity(intentGoToForm);
            }
        });
    }
}
