package com.fer.aula02_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int valor;
    Button btn01;
    EditText ed1, ed2;
    TextView txt02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novo_layout);
        btn01 = findViewById(R.id.btn01);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        txt02 = findViewById(R.id.txt02);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //valor = Integer.parseInt(ed1.getText().toString());
                //valor += Integer.parseInt(ed2.getText().toString());
                //txt02.setText("Resposta: "+valor);
                //Toast.makeText(MainActivity.this,"Resposta: "+valor,Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this , SegundaAtividade.class);
                startActivity(i);
                finish();
            }
        });

    }
}