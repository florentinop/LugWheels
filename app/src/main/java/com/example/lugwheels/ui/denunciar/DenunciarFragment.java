package com.example.lugwheels.ui.denunciar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lugwheels.ClientHomeActivity;
import com.example.lugwheels.TuturialActivity1;
import com.example.lugwheels.databinding.FragmentDefinicoesBinding;
import com.example.lugwheels.databinding.FragmentDenunciarBinding;


public class DenunciarFragment extends Fragment {

    private FragmentDenunciarBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DenunciarViewModel slideshowViewModel =
                new ViewModelProvider(this).get(DenunciarViewModel.class);

        binding = FragmentDenunciarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View submeter = binding.submeter;
        submeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),  ClientHomeActivity.class));
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}