package com.example.homework1;
import androidx.appcompat.app.AppCompatActivity;
public class Face  extends AppCompatActivity {

    /**
     * Author: William Cloutier
     * Date: 9/20/20
     * Version: Homework A
     */


     //public class that has 4 private int vars
     private int skinColor;
     private int eyeColor;
     private int hairColor;
     private int hairStyle;

     //constructor that calls on the randomize methods
    public Face(){
        randomize();

    }

    //void method that sets random values to the private vars. The firs three values go to 255
    //They go to 255 because of rgb and the last one only goes to 3 total values, since there are 3 hairstyles
    public void randomize()
    {
        int randomSC = (int)Math.random()*255;
        int randomEC = (int)Math.random()*255;
        int randomHC = (int)Math.random()*255;
        int randomHS = (int)Math.random()*3;

        this.skinColor = randomSC;
        this.eyeColor = randomEC;
        this.hairColor = randomHC;
        this.hairStyle = randomHS;


    }


}

