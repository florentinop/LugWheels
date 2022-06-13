package com.example.lugwheels;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityAdditemBinding;
import com.example.lugwheels.databinding.ActivityNovopedidoBinding;
import com.example.lugwheels.databinding.ActivityPagamentoBinding;
import com.example.lugwheels.databinding.ActivityPagamentoEfetuadoBinding;

public class PagamentoEfetuado extends AppCompatActivity {
    private ActivityPagamentoEfetuadoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPagamentoEfetuadoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View avancar = findViewById(R.id.avancar);
        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ClientHomeActivity.class);
                startActivity(intent);
            }
        });

    }
}