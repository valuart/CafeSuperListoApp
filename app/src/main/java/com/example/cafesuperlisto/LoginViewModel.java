package com.example.cafesuperlisto;

import android.app.Application;
import android.content.Context;


import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;


public class LoginViewModel extends AndroidViewModel {
    private MutableLiveData<Integer> visible;
    private MutableLiveData<String> error;
    private Context context;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }


    public MutableLiveData<Integer> getVisible() {
        if(visible == null){
            visible = new MutableLiveData<>();
        }
        return visible;
    }

    public MutableLiveData<String> getError() {
        if (error == null) {
            error = new MutableLiveData<>();
        }
        return error;
    }

    public void inicioSesion(String e, String c){


    }
}
