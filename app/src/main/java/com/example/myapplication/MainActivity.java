package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12, tv13, tv14, tv15, tv16, tvResultado;
    Button btnVerificar, btnLimpiar;
    EditText edtPalabra;
    String letra;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=           findViewById(R.id.tvLetra1);
        tv2=           findViewById(R.id.tvLetra2);
        tv3=           findViewById(R.id.tvLetra3);
        tv4=           findViewById(R.id.tvLetra4);
        tv5=           findViewById(R.id.tvLetra5);
        tv6=           findViewById(R.id.tvLetra6);
        tv7=           findViewById(R.id.tvLetra7);
        tv8=           findViewById(R.id.tvLetra8);
        tv9=           findViewById(R.id.tvLetra9);
        tv10=          findViewById(R.id.tvLetra10);
        tv11=          findViewById(R.id.tvLetra11);
        tv12=          findViewById(R.id.tvLetra12);
        tv13=          findViewById(R.id.tvLetra13);
        tv14=          findViewById(R.id.tvLetra14);
        tv15=          findViewById(R.id.tvLetra15);
        tv16=          findViewById(R.id.tvLetra16);
        tvResultado=   findViewById(R.id.tvResultado);

        btnLimpiar=     findViewById(R.id.btnLimpiar);
        btnVerificar=   findViewById(R.id.btnVerificar);
        edtPalabra=     findViewById(R.id.edtPalabra) ;

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                letra=edtPalabra.getText().toString().trim();

                if(TextUtils.isEmpty(letra)){
                    edtPalabra.setError("valor requerido...");
                    edtPalabra.requestFocus();
                }
                else if(letra.equals("E")){
                    tv1.setText("E");
                    tv3.setText("E");
                    edtPalabra.setText("");
                }else if (letra.equals("L")) {
                    tv2.setText("L");
                    edtPalabra.setText("");
                }else if (letra.equals("C")) {
                    tv4.setText("C");
                    edtPalabra.setText("");
                }else if (letra.equals("T")) {
                    tv5.setText("T");
                    edtPalabra.setText("");
                }else if (letra.equals("I")) {
                    tv6.setText("I");
                    edtPalabra.setText("");
                }
                else if (letra.equals("V")) {
                    tv7.setText("V");
                    edtPalabra.setText("");
                }else if (letra.equals("A")) {
                    tv8.setText("A");
                    edtPalabra.setText("");
                }
                else   {
                    cont=cont+1;
                    edtPalabra.setText("");
                }

                if(cont==1){
                    tv9.setText("A");
                }else if (cont==2){
                    tv10.setText("H");
                } else if (cont==3){
                    tv11.setText("O");
                }else if (cont==4){
                    tv12.setText("R");
                }else if (cont==5){
                    tv13.setText("C");
                }else if (cont==6){
                    tv14.setText("A");
                }else if (cont==7){
                    tv15.setText("D");
                }
                else if (cont==8){
                    tv16.setText("O");
                    Toast.makeText(getApplicationContext(), "Fin del juego :(", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont=0;
                tv1.setText("x");
                tv2.setText("x");
                tv3.setText("x");
                tv4.setText("x");
                tv5.setText("x");
                tv6.setText("x");
                tv7.setText("x");
                tv8.setText("x");
                tv9.setText("");
                tv10.setText("");
                tv11.setText("");
                tv12.setText("");
                tv13.setText("");
                tv14.setText("");
                tv15.setText("");
                tv16.setText("");
            }
        });
    }
}
