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

public class PagamentoActivity extends AppCompatActivity {
    private ActivityPagamentoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPagamentoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View back = findViewById(R.id.backB);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        View avancar = findViewById(R.id.avancar);
        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PagamentoEfetuado.class);
                intent.putExtra("who","PedidoActivity");
                startActivity(intent);
            }
        });

        ImageView mbway = findViewById(R.id.mbway);
        ImageView multibanco = findViewById(R.id.multibanco);
        ImageView paypal = findViewById(R.id.paypal);

        mbway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                undarkenImage(multibanco);
                undarkenImage(paypal);
                darkenImage(mbway);
            }
        });

        multibanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                undarkenImage(mbway);
                undarkenImage(paypal);
                darkenImage(multibanco);
            }
        });

        paypal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                undarkenImage(multibanco);
                undarkenImage(mbway);
                darkenImage(paypal);
            }
        });

    }

    private void darkenImage(ImageView imageView) {
        imageView.setColorFilter(Color.rgb(200, 200, 200), android.graphics.PorterDuff.Mode.MULTIPLY);
    }

    private void undarkenImage(ImageView imageView) {
        imageView.clearColorFilter();
    }
}
