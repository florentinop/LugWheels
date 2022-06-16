package com.example.lugwheels;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityPedidoRotaBinding;
import com.example.lugwheels.databinding.ActivityRotaBinding;


public class PedidoRotaActivity extends AppCompatActivity {
    private ActivityPedidoRotaBinding binding;
    private int p=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPedidoRotaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View recolha = findViewById(R.id.recolha);
        recolha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout buttons = findViewById(R.id.buttons);
                buttons.removeView(findViewById(R.id.recolha));
            }
        });

        View entrega = findViewById(R.id.entrega);
        entrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}