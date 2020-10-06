package com.example.homework1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Face  extends SurfaceView {
    private Vars varObject;

    /**
     * Author: William Cloutier
     * Date: 10/6/20
     * Version: Homework B
     */


     //Paints for drawing
     Paint skin = new Paint();
     Paint eyes = new Paint();
     Paint hair = new Paint();

     //constructor that calls on the randomize methods
    public Face(Context context, AttributeSet attrs){
        super(context, attrs);
        varObject = new Vars();


        setWillNotDraw(false);


            random();
            skin.setColor(Color.rgb(varObject.redSkin, varObject.greenSkin, varObject.blueSkin));
            skin.setStyle(Paint.Style.FILL);

            random();
            eyes.setColor(Color.rgb(varObject.redEyes, varObject.greenEyes, varObject.blueEyes));
            eyes.setStyle(Paint.Style.FILL);

            random();
            hair.setColor(Color.rgb(varObject.redHair, varObject.greenHair, varObject.blueHair));
            hair.setStyle(Paint.Style.FILL);



        setBackgroundColor(Color.WHITE);  //better than black default
    }

    //method to return the Var object
    public Vars getObject(){
        return varObject;
    }

    @Override
    //first checks if random button is pressed
    //then it sets the paint to the correct color values
    //it will then draw the face, eyes, and hair
    protected void onDraw(Canvas canvas){

            //checking to see if random button is pressed
            if(varObject.random){
                randomButton();
            }

        skin.setColor(Color.rgb(varObject.redSkin, varObject.greenSkin, varObject.blueSkin));
        skin.setStyle(Paint.Style.FILL);

        eyes.setColor(Color.rgb(varObject.redEyes, varObject.greenEyes, varObject.blueEyes));
        eyes.setStyle(Paint.Style.FILL);

        hair.setColor(Color.rgb(varObject.redHair, varObject.greenHair, varObject.blueHair));
        hair.setStyle(Paint.Style.FILL);


            //draw face
            canvas.drawCircle(1000.0f, 700.0f, 500.0f, skin);


            //draw eyes
            canvas.drawCircle(800.0f, 600.0f, 50.0f, eyes);
            canvas.drawCircle(1200.0f, 600.0f, 50.0f, eyes);

            //checking for what hair style is selected, then draw hair style
            //long hair
            if (varObject.style == 2) {
                canvas.drawRect(550.0f, 200.0f, 1450.0f, 400.0f, hair);
                canvas.drawRect(500.0f, 200.0f, 700.0f, 1000.0f, hair);
                canvas.drawRect(1300.0f, 200.0f, 1500.0f, 1000.0f, hair);
            }
            //short hair
            else if (varObject.style == 1) {
                canvas.drawRect(550.0f, 200.0f, 1450.0f, 400.0f, hair);
            }
            //no hair
            else  {
                //nothing happens because bald is an option
            }



    }
    //randomises all vars
    public void random(){
        Random rand = new Random();
        varObject.redHair = rand.nextInt(256);
        varObject.greenHair = rand.nextInt(256);
        varObject.blueHair = rand.nextInt(256);

        varObject.redEyes= rand.nextInt(256);
        varObject.greenEyes = rand.nextInt(256);
        varObject.blueEyes = rand.nextInt(256);

        varObject.redSkin = rand.nextInt(256);
        varObject.greenSkin = rand.nextInt(256);
        varObject.blueSkin = rand.nextInt(256);

        varObject.style = rand.nextInt(3);
    }


    //randomises all the vars that will be used in making the face when random button is pressed
    public void randomButton(){
        random();
        skin.setColor(Color.rgb(varObject.redSkin, varObject.greenSkin, varObject.blueSkin));
        skin.setStyle(Paint.Style.FILL);

        random();
        eyes.setColor(Color.rgb(varObject.redEyes, varObject.greenEyes, varObject.blueEyes));
        eyes.setStyle(Paint.Style.FILL);

        random();
        hair.setColor(Color.rgb(varObject.redHair, varObject.greenHair, varObject.blueHair));
        hair.setStyle(Paint.Style.FILL);

        varObject.random = false;
    }



}

