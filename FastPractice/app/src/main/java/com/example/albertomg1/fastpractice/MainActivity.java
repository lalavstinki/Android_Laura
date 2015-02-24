package com.example.albertomg1.fastpractice;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    final public static String NOM_USUARI = "com.example.albertomg1.fastpractice"; // ezto eh una constante :D
    final public static String COGNOM_USUARI = "com.example.albertomg1.fastpractice";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Llamar_funcion(View v) {
        Intent in= new Intent(this,Clase3_2.class);

        EditText Name2 = (EditText) findViewById(R.id.Name); //(EditText) -> Hacer un cast

        String nombre = Name2.getText().toString();

        in.putExtra(NOM_USUARI, nombre);

        startActivity(in);
    }


}
