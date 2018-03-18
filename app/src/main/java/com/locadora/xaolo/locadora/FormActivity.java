package com.locadora.xaolo.locadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button botaoSalvar = (Button) findViewById(R.id.formulario_salvar);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Toast.makeText(FormActivity.this, "Veiculo salvo com sucesso!" , Toast.LENGTH_LONG).show();
                Intent vaiparaLista = new Intent(FormActivity.this, MainActivity.class);
                startActivity(vaiparaLista);

            }
        });
    }
}
