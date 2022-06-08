package com.example.lugwheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
                Intent intent = new Intent(getApplicationContext(), ClientHomeActivity.class);
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

    }
}
