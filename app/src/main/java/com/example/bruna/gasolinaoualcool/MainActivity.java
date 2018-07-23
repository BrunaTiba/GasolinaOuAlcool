package com.example.bruna.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool, precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Localizamos os componentes na tela
        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botao_verificarId);
        textoResultado = (TextView) findViewById(R.id.textoResultadoId);


        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperar o valor digitado
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String texyorecoGasolina = precoGasolina.getText().toString();

                //Converter os valores string para numeros
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(texyorecoGasolina);

                //para verificar qual compensa mais usa-se o calculo alcool/gasolina
                Double resultado = valorAlcool/valorGasolina;

                if (resultado>=0.7){
                    //Gasolina
                    textoResultado.setText("É melhor usar a gasolina");
                }else {
                    //Alcool
                    textoResultado.setText("É melhor usar o alcool");
                }
            }
        });

    }
}
