package com.example.viewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    CheckBox mCheckBox;
    RadioButton enable;
    RadioButton disable;
    Switch mSwitch;
    ImageButton mImageButton;
    ImageView mImageView;
    Button mButton;
    int a=0;
    int b=0;
    int ena=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCheckBox=findViewById(R.id.checkBox);
        mSwitch=findViewById(R.id.switch1);
        mButton=findViewById(R.id.button);
        mImageButton=findViewById(R.id.imageButton);
        mImageView=findViewById(R.id.imageView);
        enable=findViewById(R.id.enable);
        disable=findViewById(R.id.disable);

    }
    public void onSwitch(View view){
        a++;
        a=a%2;

    }
    public void onEnable(View view){
        ena=0;


    }

    public void onDisable(View view){
        ena=1;

    }
    public void onCheck(View view){
        b++;
        b=b%2;
    }
    public void onRefresh(View view){

        switch (a){
            case 0:mImageView.setVisibility(View.VISIBLE);
                break;
            case 1:mImageView.setVisibility(View.INVISIBLE);
                break;
        }
        switch (b){
            case 0:mImageButton.setVisibility(View.INVISIBLE);
                break;
            case 1:mImageButton.setVisibility(View.VISIBLE);
                break;
        }
        switch (ena){
            case 0:mImageButton.setClickable(true);
                   break;
            case 1:mImageButton.setClickable(false);
                   break;
        }

    }


}
