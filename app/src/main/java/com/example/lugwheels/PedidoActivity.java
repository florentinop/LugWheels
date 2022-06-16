package com.example.lugwheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityNovopedidoBinding;

public class PedidoActivity extends AppCompatActivity {
    private ActivityNovopedidoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNovopedidoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View back = findViewById(R.id.backB);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        View avancar = findViewById(R.id.avancar);
        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.example.lugwheels.PagamentoActivity.class);
                intent.putExtra("who","PedidoActivity");
                startActivity(intent);
            }
        });

        View add = findViewById(R.id.adicionar);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),  AddItemActivity.class));
            }
        });

        View edit1 = findViewById(R.id.edit1);
        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EditItemActivity.class);
                intent.putExtra("PARAMS1","Mala 1,29 Kg.,120x30x60 cm");
                startActivity(intent);
            }
        });

        View edit2 = findViewById(R.id.edit2);
        edit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EditItemActivity.class);
                intent.putExtra("PARAMS2","Mala 2,85 Kg.,20x30x42 cm");
                startActivity(intent);
            }
        });

        View edit3 = findViewById(R.id.edit3);
        edit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EditItemActivity.class);
                intent.putExtra("PARAMS3","Mala 3,5 Kg.,5x3x6 cm");
                startActivity(intent);
            }
        });

        View edit4 = findViewById(R.id.edit4);
        edit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EditItemActivity.class);
                intent.putExtra("PARAMS4","Mala 3,5 Kg.,5x3x6 cm");
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        System.out.println(intent.getStringExtra("PARAMS1"));
        if(intent.hasExtra("PARAMS1")) {
            String params [] = intent.getStringExtra("PARAMS1").split(",");
            TextView nome = findViewById(R.id.nome1);
            nome.setText(params[0]);
            TextView peso = findViewById(R.id.peso1);
            peso.setText(params[1]);
            TextView tamanho = findViewById(R.id.tamanho1);
            tamanho.setText(params[2]);
        }
        if(intent.hasExtra("PARAMS2")) {
            String params [] = intent.getStringExtra("PARAMS2").split(",");
            TextView nome = findViewById(R.id.nome2);
            nome.setText(params[0]);
            TextView peso = findViewById(R.id.peso2);
            peso.setText(params[1]);
            TextView tamanho = findViewById(R.id.tamanho2);
            tamanho.setText(params[2]);
        }
        if(intent.hasExtra("PARAMS3")) {
            String params [] = intent.getStringExtra("PARAMS3").split(",");
            TextView nome = findViewById(R.id.nome3);
            nome.setText(params[0]);
            TextView peso = findViewById(R.id.peso3);
            peso.setText(params[1]);
            TextView tamanho = findViewById(R.id.tamanho3);
            tamanho.setText(params[2]);
        }

        if(intent.hasExtra("PARAMS4")) {
            View p4 = findViewById(R.id.PostCard4);
            p4.setVisibility(View.VISIBLE);
            String params [] = intent.getStringExtra("PARAMS4").split(",");
            TextView nome = findViewById(R.id.nome4);
            nome.setText(params[0]);
            TextView peso = findViewById(R.id.peso4);
            peso.setText(params[1]);
            TextView tamanho = findViewById(R.id.tamanho4);
            tamanho.setText(params[2]);
        }

        View delete1 = findViewById(R.id.delete1);
        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ly = findViewById(R.id.list);
                ly.removeView(findViewById(R.id.PostCard1));
            }
        });

        View delete2 = findViewById(R.id.delete2);
        delete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ly = findViewById(R.id.list);
                ly.removeView(findViewById(R.id.PostCard2));
            }
        });

        View delete3 = findViewById(R.id.delete3);
        delete3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ly = findViewById(R.id.list);
                ly.removeView(findViewById(R.id.PostCard3));
            }
        });

        View delete4 = findViewById(R.id.delete4);
        delete4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ly = findViewById(R.id.list);
                ly.removeView(findViewById(R.id.PostCard4));
            }
        });

    }
}
