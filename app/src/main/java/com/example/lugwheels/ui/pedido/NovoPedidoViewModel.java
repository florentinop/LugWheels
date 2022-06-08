package com.example.lugwheels.ui.pedido;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NovoPedidoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NovoPedidoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}