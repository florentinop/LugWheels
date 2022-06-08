package com.example.lugwheels.ui.seguimento;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lugwheels.ClientHomeActivity;
import com.example.lugwheels.R;
import com.example.lugwheels.databinding.FragmentSeguimentoBinding;

public class SeguimentoFragment extends Fragment {

    private FragmentSeguimentoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SeguimentoViewModel galleryViewModel =
                new ViewModelProvider(this).get(SeguimentoViewModel.class);

        binding = FragmentSeguimentoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View voltar = binding.voltar;
        voltar.setOnClickListener(new View.OnClickListener() {
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