package com.example.lugwheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityEdicaoImpossivelBinding;
import com.example.lugwheels.databinding.ActivityPagamentoEfetuadoBinding;

public class EdicaoImpossivel extends AppCompatActivity {
    private ActivityEdicaoImpossivelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEdicaoImpossivelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View avancar = findViewById(R.id.avancar);
        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}