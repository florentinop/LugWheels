package com.example.lugwheels.ui.pedido;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lugwheels.RotaActivity;
import com.example.lugwheels.databinding.FragmentNovopedidoBinding;

public class NovoPedidoFragment extends Fragment {

    private FragmentNovopedidoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NovoPedidoViewModel homeViewModel =
                new ViewModelProvider(this).get(NovoPedidoViewModel.class);

        binding = FragmentNovopedidoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View avancar = binding.avancar;
        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),  RotaActivity.class));
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