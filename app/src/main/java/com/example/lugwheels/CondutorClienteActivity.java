package com.example.lugwheels;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityRotaBinding;
import com.example.lugwheels.databinding.CondutorClienteBinding;


public class CondutorClienteActivity extends AppCompatActivity {
    private CondutorClienteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = CondutorClienteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View cliente = findViewById(R.id.Cliente);
        cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),  ClientHomeActivity.class));
            }
        });

        View back = findViewById(R.id.backB);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}