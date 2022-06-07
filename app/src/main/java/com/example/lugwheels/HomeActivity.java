package com.example.lugwheels;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityClienthomeBinding;


public class HomeActivity extends AppCompatActivity {
    private ActivityClienthomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityClienthomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View avancar = findViewById(R.id.avancar);
        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),  RotaActivity.class));
            }
        });

    }

}
