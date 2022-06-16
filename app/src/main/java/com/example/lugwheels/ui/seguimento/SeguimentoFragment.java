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

import com.example.lugwheels.AddItemActivity;
import com.example.lugwheels.AvaliarActivity;
import com.example.lugwheels.ClientHomeActivity;
import com.example.lugwheels.EdicaoImpossivel;
import com.example.lugwheels.PedidoActivity;
import com.example.lugwheels.R;
import com.example.lugwheels.databinding.FragmentSeguimentoBinding;
import com.example.lugwheels.ui.pedido.NovoPedidoFragment;

public class SeguimentoFragment extends Fragment {

    private FragmentSeguimentoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SeguimentoViewModel galleryViewModel =
                new ViewModelProvider(this).get(SeguimentoViewModel.class);

        binding = FragmentSeguimentoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View avaliar = binding.avaliar;
        avaliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), AvaliarActivity.class));
            }
        });

        View alterar = binding.alterar;
        alterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), EdicaoImpossivel.class));
            }
        });

        View cancelar = binding.cancelar;
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), EdicaoImpossivel.class));
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