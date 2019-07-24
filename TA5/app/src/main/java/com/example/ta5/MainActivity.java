package com.example.ta5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //se usa intent para comunicar entre los activitys
    //se pone la acción a cada boton

    //Accion de la clase Main2Activity
    public void video(View view) {
        Intent i = new Intent(this, Main2Activity.class );
        startActivity(i);
    }

    //accion de clase Calendario
    public void calendario(View view) {
        Intent i = new Intent(this, Calendario.class );
        startActivity(i);
    }

    //Accion de la clase Mapa
    public void mapa(View view){
        Intent i= new Intent(this, Mapa.class );
        startActivity(i);
    }

}
