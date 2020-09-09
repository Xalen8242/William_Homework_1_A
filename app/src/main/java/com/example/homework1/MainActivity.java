package com.example.homework1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Author: William Cloutier
 * Date: 9/20/20
 * Version: Homework A
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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    //onCreate is making a spinner that will use the hairSpinner id and contain the hairStyles text array
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.hairSpinner);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.hairStyles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
        //radio button method what checks to see if a button is checked and executes something when it is selected
        public void onRadioButtonCLicked(View view){
            boolean checked = ((RadioButton) view).isChecked();

            switch(view.getId()){
                case R.id.radioButtonHair:
                    if(checked)
                        //hello
                        break;
                case R.id.radioButtonEyes:
                    if(checked)
                        //hi
                        break;
                case R.id.radioButtonSkin:
                    if(checked)
                        //enter
                        break;
            }
        }
}
