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
    protected static boolean pc1=false,pc2=false,pc3=false,pc4=false;
    protected static String params1 [];
    protected static String params2 [];
    protected static String params3 [];
    protected static String params4 [];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNovopedidoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView nome1 = findViewById(R.id.nome1);
        TextView peso1 = findViewById(R.id.peso1);
        TextView tamanho1 = findViewById(R.id.tamanho1);

        TextView nome2 = findViewById(R.id.nome2);
        TextView peso2 = findViewById(R.id.peso2);
        TextView tamanho2 = findViewById(R.id.tamanho2);

        TextView nome3 = findViewById(R.id.nome3);
        TextView peso3 = findViewById(R.id.peso3);
        TextView tamanho3 = findViewById(R.id.tamanho3);

        TextView nome4 = findViewById(R.id.nome4);
        TextView peso4 = findViewById(R.id.peso4);
        TextView tamanho4 = findViewById(R.id.tamanho4);

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
                intent.putExtra("PARAMS1",nome1.getText()+","+peso1.getText()+","+tamanho1.getText());
                startActivity(intent);
            }
        });

        View edit2 = findViewById(R.id.edit2);
        edit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EditItemActivity.class);
                intent.putExtra("PARAMS2",nome2.getText()+","+peso2.getText()+","+tamanho2.getText());
                startActivity(intent);
            }
        });

        View edit3 = findViewById(R.id.edit3);
        edit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EditItemActivity.class);
                intent.putExtra("PARAMS3",nome3.getText()+","+peso3.getText()+","+tamanho3.getText());
                startActivity(intent);
            }
        });

        View edit4 = findViewById(R.id.edit4);
        edit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EditItemActivity.class);
                intent.putExtra("PARAMS4",nome4.getText()+","+peso4.getText()+","+tamanho4.getText());
                startActivity(intent);
            }
        });

        Intent intent = getIntent();



        if(intent.hasExtra("PARAMS1")) {
            View p1 = findViewById(R.id.PostCard1);
            p1.setVisibility(View.VISIBLE);
            params1 = intent.getStringExtra("PARAMS1").split(",");
            nome1.setText(params1[0]);
            peso1.setText(params1[1]);
            tamanho1.setText(params1[2]);
        }

        if(intent.hasExtra("PARAMS2")) {
            View p2 = findViewById(R.id.PostCard2);
            p2.setVisibility(View.VISIBLE);
            params2 = intent.getStringExtra("PARAMS2").split(",");
            nome2.setText(params2[0]);
            peso2.setText(params2[1]);
            tamanho2.setText(params2[2]);
        }

        if(intent.hasExtra("PARAMS3")) {
            View p3 = findViewById(R.id.PostCard3);
            p3.setVisibility(View.VISIBLE);
            params3 = intent.getStringExtra("PARAMS3").split(",");
            nome3.setText(params3[0]);
            peso3.setText(params3[1]);
            tamanho3.setText(params3[2]);
        }

        if(intent.hasExtra("PARAMS4")) {
            View p4 = findViewById(R.id.PostCard4);
            p4.setVisibility(View.VISIBLE);
            params4 = intent.getStringExtra("PARAMS4").split(",");
            nome4.setText(params4[0]);
            peso4.setText(params4[1]);
            tamanho4.setText(params4[2]);
        }

        if(pc1){
            View p1 = findViewById(R.id.PostCard1);
            p1.setVisibility(View.VISIBLE);
            nome1.setText(params1[0]);
            peso1.setText(params1[1]);
            tamanho1.setText(params1[2]);
        }

        if (pc2){
            View p2 = findViewById(R.id.PostCard2);
            p2.setVisibility(View.VISIBLE);
            nome2.setText(params2[0]);
            peso2.setText(params2[1]);
            tamanho2.setText(params2[2]);
        }

        if (pc3){
            View p3 = findViewById(R.id.PostCard3);
            p3.setVisibility(View.VISIBLE);
            nome3.setText(params3[0]);
            peso3.setText(params3[1]);
            tamanho3.setText(params3[2]);
        }

        if (pc4){
            View p4 = findViewById(R.id.PostCard4);
            p4.setVisibility(View.VISIBLE);
            nome4.setText(params4[0]);
            peso4.setText(params4[1]);
            tamanho4.setText(params4[2]);
        }

        View delete1 = findViewById(R.id.delete1);
        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ly = findViewById(R.id.list);
                ly.removeView(findViewById(R.id.PostCard1));
                pc1=false;
            }
        });

        View delete2 = findViewById(R.id.delete2);
        delete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ly = findViewById(R.id.list);
                ly.removeView(findViewById(R.id.PostCard2));
                pc2=false;
            }
        });

        View delete3 = findViewById(R.id.delete3);
        delete3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ly = findViewById(R.id.list);
                ly.removeView(findViewById(R.id.PostCard3));
                pc3=false;
            }
        });

        View delete4 = findViewById(R.id.delete4);
        delete4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ly = findViewById(R.id.list);
                ly.removeView(findViewById(R.id.PostCard4));
                pc4=false;
            }
        });

    }
}
