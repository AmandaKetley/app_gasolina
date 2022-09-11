package com.example.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_preco_alcool;
    EditText et_preco_gasolina;
    Button btn_calcular;
    TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_preco_alcool = findViewById(R.id.et_preco_alcool);
        et_preco_gasolina = findViewById(R.id.et_preco_gasolina);
        et_preco_gasolina.setText("0.0");
        et_preco_alcool.setText("0.0");
        btn_calcular = findViewById(R.id.btn_calular);
        tv_resultado = findViewById(R.id.tv_resultado);
    }

    public void calcular(View v) {
        et_preco_alcool = findViewById(R.id.et_preco_alcool);
        et_preco_gasolina = findViewById(R.id.et_preco_gasolina);


                double alcool, gasolina, resultado;
                alcool = Double.parseDouble(et_preco_alcool.getText().toString());
                gasolina =Double.parseDouble(et_preco_gasolina.getText().toString());
                if(alcool == 0.0 && gasolina == 0.0) {
                    tv_resultado.setText("RESULTADO");
                }else{

                resultado = alcool/gasolina;
                if (resultado >= 0.7){
                    tv_resultado.setText("MELHOR USAR GASOLINA");
                }else {
                    tv_resultado.setText("MELHOR USAR ÁLCOOL");
                }
                et_preco_gasolina.setText("0.0");
                et_preco_alcool.setText("0.0");
            }
    }
}
