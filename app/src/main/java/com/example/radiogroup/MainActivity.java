package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.RadioButton;
import android.widget.Toast;


import java.util.Random;


public class MainActivity extends AppCompatActivity {
    RadioButton redBackground;
    RadioButton greenBackground;
    RadioButton yellowBackground;
    RadioButton blueBackground;
    RadioGroup radioGroup;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        redBackground =findViewById(R.id.redBackground);
        radioGroup =findViewById(R.id.radioGroup);
        blueBackground =findViewById(R.id.blueBackground);
        greenBackground =findViewById(R.id.greenBackground);
        yellowBackground =findViewById(R.id.yellowBackground);
        switch1 =findViewById(R.id.switch1);
        if (switch1.isChecked()){
            int CheckedColorId=radioGroup.getCheckedRadioButtonId();
            if (R.id.redBackground==CheckedColorId){
               radioGroup.setBackgroundColor(Color.RED);
            }else if (R.id.blueBackground==CheckedColorId){
                radioGroup.setBackgroundColor(Color.BLUE);
            }else if (R.id.greenBackground==CheckedColorId){
                radioGroup.setBackgroundColor(Color.GREEN);
            }else if (R.id.yellowBackground==CheckedColorId){
                radioGroup.setBackgroundColor(Color.YELLOW);
            }

        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (switch1.isChecked()) {
                    setColorAccordingToSelection(checkedId);
                }
            }
        });
    }



    public void setColorAccordingToSelection(int checkedColorId) {
        if (checkedColorId == R.id.redBackground) {
            radioGroup.setBackgroundColor(Color.RED);
        } else if (checkedColorId == R.id.blueBackground) {
            radioGroup.setBackgroundColor(Color.BLUE);
        } else if (checkedColorId == R.id.greenBackground) {
            radioGroup.setBackgroundColor(Color.GREEN);
        } else if (checkedColorId == R.id.yellowBackground) {
            radioGroup.setBackgroundColor(Color.YELLOW);
        }
    }
    public void changeBackground(View view) {
        if (redBackground.isChecked()){
            radioGroup.setBackgroundColor(Color.RED);
        }else if (blueBackground.isChecked()){
            radioGroup.setBackgroundColor(Color.BLUE);
        }else if  (greenBackground.isChecked()) {
            radioGroup.setBackgroundColor(Color.GREEN);
        }else if (yellowBackground.isChecked()) {
            radioGroup.setBackgroundColor(Color.YELLOW);
        }
    }

}

