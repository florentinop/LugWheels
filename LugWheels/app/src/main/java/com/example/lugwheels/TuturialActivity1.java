package com.example.lugwheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityRotaBinding;
import com.example.lugwheels.databinding.ActivityTuturial1Binding;

public class TuturialActivity1 extends AppCompatActivity {
    private ActivityTuturial1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTuturial1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),  TuturialActivity2.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);
            }
        });

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
