package com.example.lugwheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityAdditemBinding;
import com.example.lugwheels.databinding.ActivityDriverHomeBinding;

public class DriverHomeActivity extends AppCompatActivity {
    private ActivityDriverHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDriverHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View sair = findViewById(R.id.sair);
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        View confirm1 = findViewById(R.id.confirm1);
        confirm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),  PedidoRotaActivity.class));
            }
        });

        View deny1 = findViewById(R.id.deny1);
        deny1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout queue = findViewById(R.id.queue);
                queue.removeView(findViewById(R.id.PostCard1));
            }
        });

    }
}
