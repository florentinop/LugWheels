package com.example.lugwheels;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityRotaBinding;


public class RotaActivity extends AppCompatActivity {
    private ActivityRotaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRotaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View alterar = findViewById(R.id.alterar);
        alterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}