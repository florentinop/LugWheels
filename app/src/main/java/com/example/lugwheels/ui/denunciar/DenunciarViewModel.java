package com.example.lugwheels.ui.denunciar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DenunciarViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DenunciarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}