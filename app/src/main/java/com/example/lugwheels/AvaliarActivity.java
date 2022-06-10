package com.example.lugwheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityAdditemBinding;
import com.example.lugwheels.databinding.ActivityAvaliarBinding;

public class AvaliarActivity extends AppCompatActivity {
    private ActivityAvaliarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAvaliarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View back = findViewById(R.id.backB);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        View avaliar = findViewById(R.id.avaliar);
        avaliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
