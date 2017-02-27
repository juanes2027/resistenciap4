package com.example.juanes.resistenciap4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static com.example.juanes.resistenciap4.R.id.q1amarillo;

public class MainActivity extends AppCompatActivity {

    private String horizontal1, columna2, columna3;
    private boolean b1 =false, b2 =false, b3 =false, b4 =false;
    private boolean bb3 =false;
    private double tol;
    private int vt;
    private int vd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void horizontal1(View view){

        b1 =true;
        switch (view.getId()){
            case R.id.q1negro:
                horizontal1 ="0";
                break;
            case R.id.q1cafe:
                horizontal1 ="1";
                break;
            case R.id.q1rojo:
                horizontal1 ="2";
                break;
            case R.id.q1naranja:
                horizontal1 ="3";
                break;
            case q1amarillo:
                horizontal1 ="4";
                break;
            case R.id.q1verde:
                horizontal1 ="5";
                break;
            case R.id.q1azul:
                horizontal1 ="6";
                break;
            case R.id.q1violeta:
                horizontal1 ="7";
                break;
            case R.id.q1gris:
                horizontal1 ="8";
                break;
            case R.id.q1blanco:
                horizontal1 ="9";
                break;
        }

    }

    public void columna2(View view){
        b2 =true;
        switch (view.getId()){
            case R.id.q2negro:
                columna2 ="0";
                break;
            case R.id.q2cafe:
                columna2 ="1";
                break;
            case R.id.q2rojo:
                columna2 ="2";
                break;
            case R.id.q2naranja:
                columna2 ="3";
                break;
            case R.id.q2amarillo:
                columna2 ="4";
                break;
            case R.id.q2verde:
                columna2 ="5";
                break;
            case R.id.q2azul:
                columna2 ="6";
                break;
            case R.id.q2violeta:
                columna2 ="7";
                break;
            case R.id.q2gris:
                columna2 ="8";
                break;
            case R.id.q2blanco:
                columna2 ="9";
                break;
        }

    }

    public void columna3(View view){
        b3 =true;
        switch (view.getId()){
            case R.id.q3negro:
                columna3 ="";
                bb3 =false;
                break;
            case R.id.q3cafe:
                columna3 ="0";
                bb3 =false;
                break;
            case R.id.q3rojo:
                columna3 ="00";
                bb3 =false;
                break;
            case R.id.q3naranja:
                columna3 ="000";
                bb3 =false;
                break;
            case R.id.q3amarillo:
                columna3 ="0000";
                bb3 =false;
                break;
            case R.id.q3verde:
                columna3 ="00000";
                bb3 =false;
                break;
            case R.id.q3azul:
                columna3 ="000000";
                bb3 =false;
                break;
            case R.id.q3violeta:
                columna3 ="";
                bb3 =true;
                vd =10;
                break;
            case R.id.q3gris:
                columna3 ="";
                bb3 =true;
                vd =100;
                break;
            case R.id.q3blanco:
                bb3 =false;
                columna3 ="";
                break;
        }
    }

    public void columna4(View view){
        b4 =true;
        switch (view.getId()){
            case R.id.qcafe:
                tol =0.01;
                break;
            case R.id.qrojo:
                tol =0.02;
                break;
            case R.id.qdorado:
                tol =0.05;
                break;
            case R.id.qplateado:
                tol =0.1;
                break;
        }
    }

    public void calcular(View view){

        Log.d("valor1",String.valueOf(horizontal1));
        Log.d("valor2",String.valueOf(columna2));
        Log.d("valor3",String.valueOf(columna3));
        if(b1 && b2 && b3 && b4){
            vt =Integer.parseInt(horizontal1 + columna2 + columna3);

            if(bb3){
                vt /= vd;

            }
            Double columna4= vt * tol;
            Log.d("Tolerancia",String.valueOf(columna4));


            Toast.makeText(MainActivity.this,String.valueOf(vt)+"±"+String.format("%.2f",columna4)+" Ω",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this,"Parametro no seleccionado ",Toast.LENGTH_SHORT).show();
        }
    }
}
