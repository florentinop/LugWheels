package com.example.lugwheels.ui.seguimento;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SeguimentoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SeguimentoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}