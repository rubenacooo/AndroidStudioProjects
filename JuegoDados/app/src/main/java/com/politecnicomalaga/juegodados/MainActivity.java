package com.politecnicomalaga.juegodados;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView TVJG, jg1, jg2, title;
    Tirada tirada1;
    Tirada tirada2;
    private ImageView d1, d2, d3, d4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TVJG = (TextView)findViewById(R.id.textViewG);
        jg1 = (TextView)findViewById(R.id.j1);
        jg2 = (TextView)findViewById(R.id.j2);
        title = (TextView)findViewById(R.id.titulo);
        tirada1 = new Tirada();
        tirada2 = new Tirada();
        d1 = (ImageView)findViewById(R.id.image1);
        d2 = (ImageView)findViewById(R.id.image2);
        d3 = (ImageView)findViewById(R.id.image3);
        d4 = (ImageView)findViewById(R.id.image4);
    }

    public void jugar(View view){
        tirada1.tirarDeNuevo();
        tirada2.tirarDeNuevo();
        title.setVisibility(view.INVISIBLE);
        jg1.setVisibility(view.VISIBLE);
        jg2.setVisibility(view.VISIBLE);
        d1.setVisibility(view.VISIBLE);
        d2.setVisibility(view.VISIBLE);
        d3.setVisibility(view.VISIBLE);
        d4.setVisibility(view.VISIBLE);
        switch (tirada1.getDado1()){
            case 1:
                d1.setImageResource(R.drawable.dado1);
                break;
            case 2:
                d1.setImageResource(R.drawable.dado2);
                break;
            case 3:
                d1.setImageResource(R.drawable.dado3);
                break;
            case 4:
                d1.setImageResource(R.drawable.dado4);
                break;
            case 5:
                d1.setImageResource(R.drawable.dado5);
                break;
            case 6:
                d1.setImageResource(R.drawable.dado6);
        }

        switch (tirada1.getDado2()){
            case 1:
                d2.setImageResource(R.drawable.dado1);
                break;
            case 2:
                d2.setImageResource(R.drawable.dado2);
                break;
            case 3:
                d2.setImageResource(R.drawable.dado3);
                break;
            case 4:
                d2.setImageResource(R.drawable.dado4);
                break;
            case 5:
                d2.setImageResource(R.drawable.dado5);
                break;
            case 6:
                d2.setImageResource(R.drawable.dado6);
        }

        switch (tirada2.getDado1()){
            case 1:
                d3.setImageResource(R.drawable.dado1);
                break;
            case 2:
                d3.setImageResource(R.drawable.dado2);
                break;
            case 3:
                d3.setImageResource(R.drawable.dado3);
                break;
            case 4:
                d3.setImageResource(R.drawable.dado4);
                break;
            case 5:
                d3.setImageResource(R.drawable.dado5);
                break;
            case 6:
                d3.setImageResource(R.drawable.dado6);
        }

        switch (tirada2.getDado2()){
            case 1:
                d4.setImageResource(R.drawable.dado1);
                break;
            case 2:
                d4.setImageResource(R.drawable.dado2);
                break;
            case 3:
                d4.setImageResource(R.drawable.dado3);
                break;
            case 4:
                d4.setImageResource(R.drawable.dado4);
                break;
            case 5:
                d4.setImageResource(R.drawable.dado5);
                break;
            case 6:
                d4.setImageResource(R.drawable.dado6);
        }

        if (tirada1.haGanado(tirada2) == -1){
            TVJG.setText("HA GANADO EL JUGADOR 1");
        }else if (tirada1.haGanado(tirada2) == 1){
            TVJG.setText("HA GANADO EL JUGADOR 2");
        }else{
            TVJG.setText("EMPATE");
        }
    }
}