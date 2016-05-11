package com.example.ruan_.trabalhoedilene;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.*;
import android.content.*;

public class trabalho extends AppCompatActivity {

    private EditText nome;
    private EditText cpf;
    private EditText peso;
    private EditText altura;
    private RadioButton masculino;
    private RadioButton feminino;
    private EditText DataNascimento;
    private Button ok;
    private Button cancela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_trabalho);

        peso = (EditText) findViewById(R.id.peso);
        altura = (EditText) findViewById(R.id.altura);
        masculino = (RadioButton) findViewById(R.id.masculino);
        feminino = (RadioButton) findViewById(R.id.feminino);
        ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View z) {
                setContentView(R.layout.activity_layout2);
                }
        });

            cancela=(Button)

            findViewById(R.id.cancela);

            cancela.setOnClickListener(new View.OnClickListener()

            {
                public void onClick (View v){
                System.exit(0);
            }
            }

            );

            final EditText cpf = (EditText) findViewById(R.id.cpf);
            cpf.addTextChangedListener(Mask.insert("###.###.###-##",cpf));

            final EditText DataNascimento = (EditText) findViewById(R.id.DataNascimento);
            DataNascimento.addTextChangedListener(Mask.insert("##/##/####", DataNascimento));

        }
    }
