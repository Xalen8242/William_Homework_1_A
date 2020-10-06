package com.example.homework1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Author: William Cloutier
 * Date: 10/6/20
 * Version: Homework B
 * Only have more citation because I reused the old citations and the new citation was very helpful
 */


/**
 * External Citation
 * Date:   9/9/20
 * Problem:    Forgot how to implement a spinner
 * Resource:
 *     https://developer.android.com/guide/topics/ui/controls/spinner#java
 * Solution: I followed the SDK to learn how to implement a spinner
 */

/**
 * External Citation
 * Date:   9/9/20
 * Problem:    Did not know how radio buttons worked
 * Resource:
 *     https://developer.android.com/guide/topics/ui/controls/radiobutton
 * Solution: I followed the SDK to learn how to implement a radio button and radio group
 */

/**
 * External Citation
 * Date:    10/6/20
 * Problem:     understanding of how to draw on android studio was lacking
 * Resource:
 *      https://github.com/Xalen8242/BirthdayCake-master
 * Solution: I used my lab from another class to guide my actions. This was very useful and it reminded me how to use onDraw
 */


//this will create my spinners, seekbars, buttons, and radio buttons
//it will then use the creations, set them equal to the corresponding item in activity_main, and then put them into Controller.java
//radiobutton has method to see if it is clicked or not
public class MainActivity extends AppCompatActivity {
    Vars radioObject;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        Face object = findViewById(R.id.face);
        radioObject = object.getObject();
        Controller controller = new Controller(object);

        Spinner spinner = (Spinner) findViewById(R.id.hairSpinner);
        spinner.setOnItemSelectedListener(controller);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hairStyles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button rand = findViewById(R.id.randomFace);
        rand.setOnClickListener(controller);

        SeekBar redS = findViewById(R.id.red);
        redS.setOnSeekBarChangeListener(controller);

        SeekBar greenS = findViewById(R.id.green);
        greenS.setOnSeekBarChangeListener(controller);

        SeekBar blueS = findViewById(R.id.blue);
        blueS.setOnSeekBarChangeListener(controller);






    }


    public void onRadioButtonClicked (View view){
        radioObject.newItem = true;
        boolean checked = ((RadioButton) view).isChecked();
        SeekBar redS = findViewById(R.id.red);
        SeekBar greenS = findViewById(R.id.green);
        SeekBar blueS = findViewById(R.id.blue);

        switch(view.getId()) {
            case R.id.radioButtonHair:
                    redS.setProgress(radioObject.redHair);
                    greenS.setProgress(radioObject.greenHair);
                    blueS.setProgress(radioObject.blueHair);

                    radioObject.radioButton01 = true;
                    radioObject.radioButton02 = false;
                    radioObject.radioButton03 = false;

                break;



            case R.id.radioButtonEyes:
                    redS.setProgress(radioObject.redEyes);
                    greenS.setProgress(radioObject.greenEyes);
                    blueS.setProgress(radioObject.blueEyes);

                    radioObject.radioButton01 = false;
                    radioObject.radioButton02 = true;
                    radioObject.radioButton03 = false;
                break;


            case R.id.radioButtonSkin:
                    redS.setProgress(radioObject.redSkin);
                    greenS.setProgress(radioObject.greenSkin);
                    blueS.setProgress(radioObject.blueSkin);

                    radioObject.radioButton01 = false;
                    radioObject.radioButton02 = false;
                    radioObject.radioButton03 = true;
                    break;
                }

            radioObject.newItem = false;
    }

}
