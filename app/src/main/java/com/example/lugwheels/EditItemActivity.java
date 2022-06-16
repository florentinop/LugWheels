package com.example.lugwheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.PedidoActivity;
import com.example.lugwheels.R;
import com.example.lugwheels.databinding.ActivityAdditemBinding;
import com.example.lugwheels.databinding.ActivityEditItemBinding;

public class EditItemActivity extends AppCompatActivity {
    private ActivityEditItemBinding binding;
    private int m = 0;
    private EditText nome,peso,tamanho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEditItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View back = findViewById(R.id.backB);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        View add = findViewById(R.id.adicionar);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), PedidoActivity.class);
                        intent.putExtra("PARAMS"+m,nome.getText().toString()+","+peso.getText().toString()+","+tamanho.getText().toString());
                        startActivity(intent);
            }
        });

        Intent intent = getIntent();
        if(intent.hasExtra("PARAMS1")) {
            m=1;
            String params [] = intent.getStringExtra("PARAMS1").split(",");
            nome = findViewById(R.id.nome2);
            nome.setText(params[0]);
            peso = findViewById(R.id.peso2);
            peso.setText(params[1]);
            tamanho = findViewById(R.id.tamanho2);
            tamanho.setText(params[2]);
            setIntent(intent);
        }
        if(intent.hasExtra("PARAMS2")) {
            m=2;
            String params [] = intent.getStringExtra("PARAMS2").split(",");
            nome = findViewById(R.id.nome2);
            nome.setText(params[0]);
            peso = findViewById(R.id.peso2);
            peso.setText(params[1]);
            tamanho = findViewById(R.id.tamanho2);
            tamanho.setText(params[2]);
            setIntent(intent);
        }
        if(intent.hasExtra("PARAMS3")) {
            m=3;
            String params [] = intent.getStringExtra("PARAMS3").split(",");
            nome = findViewById(R.id.nome2);
            nome.setText(params[0]);
            peso = findViewById(R.id.peso2);
            peso.setText(params[1]);
            tamanho = findViewById(R.id.tamanho2);
            tamanho.setText(params[2]);
            setIntent(intent);
        }
        if(intent.hasExtra("PARAMS4")) {
            m=4;
            String params [] = intent.getStringExtra("PARAMS4").split(",");
            nome = findViewById(R.id.nome2);
            nome.setText(params[0]);
            peso = findViewById(R.id.peso2);
            peso.setText(params[1]);
            tamanho = findViewById(R.id.tamanho2);
            tamanho.setText(params[2]);
            setIntent(intent);
        }


    }
}
