package com.example.lugwheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityAdditemBinding;
import com.example.lugwheels.databinding.ActivityNovopedidoBinding;

public class AddItemActivity extends AppCompatActivity {
    private ActivityAdditemBinding binding;
    protected static int mala = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAdditemBinding.inflate(getLayoutInflater());
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
                EditText nome = findViewById(R.id.nome2);
                EditText peso = findViewById(R.id.peso2);
                EditText tamanho = findViewById(R.id.tamanho2);
                Intent intent = new Intent(getApplicationContext(), PedidoActivity.class);
                intent.putExtra("PARAMS"+mala,nome.getText().toString()+","+peso.getText().toString()+","+tamanho.getText().toString());
                if(mala==1)
                    PedidoActivity.pc1=true;
                if(mala==2)
                    PedidoActivity.pc2=true;
                if(mala==3)
                    PedidoActivity.pc3=true;
                if(mala==4)
                    PedidoActivity.pc4=true;
                startActivity(intent);
                mala++;
            }
        });

    }
}
