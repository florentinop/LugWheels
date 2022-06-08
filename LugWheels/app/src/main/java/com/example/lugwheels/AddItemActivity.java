package com.example.lugwheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityAdditemBinding;
import com.example.lugwheels.databinding.ActivityNovopedidoBinding;

public class AddItemActivity extends AppCompatActivity {
    private ActivityAdditemBinding binding;

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
                startActivity(new Intent(getApplicationContext(),  PedidoActivity.class));
            }
        });

    }
}