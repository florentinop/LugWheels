package com.example.lugwheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityTuturial1Binding;
import com.example.lugwheels.databinding.ActivityTuturial3Binding;

public class TuturialActivity3 extends AppCompatActivity {
    private ActivityTuturial3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTuturial3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),  ClientHomeActivity.class));
            }
        });

        View signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),  ClientHomeActivity.class));
            }
        });


    }

}
