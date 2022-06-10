package com.example.lugwheels.ui.definicoes;

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
import com.example.lugwheels.TuturialActivity1;
import com.example.lugwheels.databinding.FragmentDefinicoesBinding;


public class SlideshowFragment extends Fragment {

    private FragmentDefinicoesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentDefinicoesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View signout = binding.signout;
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),  TuturialActivity1.class));
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