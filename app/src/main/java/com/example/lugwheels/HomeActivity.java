package com.example.lugwheels;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityClienthomeBinding;


public class HomeActivity extends AppCompatActivity {
    private ActivityClienthomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityClienthomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }

}
