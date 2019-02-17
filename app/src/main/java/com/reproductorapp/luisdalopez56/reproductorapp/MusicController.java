package com.reproductorapp.luisdalopez56.reproductorapp;

import android.content.Context;
import android.widget.MediaController;

public class MusicController extends MediaController {

    public MusicController(Context c){
        super(c);

    }

    public void hide(){}

    public boolean canPause() {
        return true;
    }




}
