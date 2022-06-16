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
                View p1 = findViewById(R.id.PostCard1);
                LinearLayout queue = findViewById(R.id.queue);
                View p3 = findViewById(R.id.PostCard3);
                Intent intent = new Intent(getApplicationContext(), PedidoRotaActivity.class);
                intent.putExtra("PARAMS234", "");
                startActivity(intent);
                queue.removeView(p1);
                p3.setVisibility(View.VISIBLE);
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

        View confirm2 = findViewById(R.id.confirm2);
        confirm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View p2 = findViewById(R.id.PostCard2);
                LinearLayout queue = findViewById(R.id.queue);
                View p3 = findViewById(R.id.PostCard3);
                Intent intent = new Intent(getApplicationContext(), PedidoRotaActivity.class);
                intent.putExtra("PARAMS99", "");
                startActivity(intent);
                queue.removeView(p2);
                p3.setVisibility(View.VISIBLE);
            }
        });

        View deny2 = findViewById(R.id.deny2);
        deny2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout queue = findViewById(R.id.queue);
                queue.removeView(findViewById(R.id.PostCard2));
            }
        });

        View confirm3 = findViewById(R.id.confirm3);
        confirm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View p3 = findViewById(R.id.PostCard3);
                LinearLayout queue = findViewById(R.id.queue);
                Intent intent = new Intent(getApplicationContext(), PedidoRotaActivity.class);
                intent.putExtra("PARAMS12", "");
                startActivity(intent);
                queue.removeView(p3);
            }
        });

        View deny3 = findViewById(R.id.deny3);
        deny3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout queue = findViewById(R.id.queue);
                queue.removeView(findViewById(R.id.PostCard3));
            }
        });

    }
}
