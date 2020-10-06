package com.example.homework1;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;


//this class consists of methods that will change variables from Vars.java and tell the program to redraw itself with these new variables
public class Controller extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener, SeekBar.OnSeekBarChangeListener {
    private Face faceObject;
    private Vars conVarObject;

    //constructor to set instance vars
    public Controller(Face object){
        this.faceObject = object;
        conVarObject = this.faceObject.getObject();
    }

    //button listener
    @Override
    public void onClick(View view) {
        conVarObject.random = true;
        faceObject.invalidate();
    }

    //spinner listener
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        conVarObject.style = i;
        faceObject.invalidate();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    //seekbar listener
    //checks what seekbar is changed and then sets the corresponding var to equal i
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if(!conVarObject.newItem){

      if(conVarObject.radioButton01){
          if(seekBar == seekBar.findViewById(R.id.red))  {
              conVarObject.redHair = i;
              seekBar.setProgress(conVarObject.redHair);
          }

          if(seekBar == seekBar.findViewById(R.id.green))  {
              conVarObject.greenHair = i;
              seekBar.setProgress(conVarObject.greenHair);
          }

          if(seekBar == seekBar.findViewById(R.id.blue)) {
              conVarObject.blueHair = i;
              seekBar.setProgress(conVarObject.blueHair);
          }

          faceObject.invalidate();

      }
      else if(conVarObject.radioButton02){
          if(seekBar == seekBar.findViewById(R.id.red)) {
              conVarObject.redEyes = i;
              seekBar.setProgress(conVarObject.redEyes);
          }

          if(seekBar == seekBar.findViewById(R.id.green)) {
              conVarObject.greenEyes = i;
              seekBar.setProgress(conVarObject.greenEyes);
          }

          if(seekBar == seekBar.findViewById(R.id.blue)) {
              conVarObject.blueEyes = i;
              seekBar.setProgress(conVarObject.blueEyes);
          }

          faceObject.invalidate();

      }
      else if(conVarObject.radioButton03) {
          if (seekBar == seekBar.findViewById(R.id.red)) {
              conVarObject.redSkin = i;
              seekBar.setProgress(conVarObject.redSkin);

          }

          if (seekBar == seekBar.findViewById(R.id.green)) {
              conVarObject.greenSkin = i;
              seekBar.setProgress(conVarObject.greenSkin);
          }

          if (seekBar == seekBar.findViewById(R.id.blue)) {
              conVarObject.blueSkin = i;
              seekBar.setProgress(conVarObject.blueSkin);
          }

          faceObject.invalidate();
      }

      }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }



    }





