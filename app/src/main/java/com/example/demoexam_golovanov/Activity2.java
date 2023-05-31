package com.example.demoexam_golovanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
//    public void onClickText(View v){
//        Intent intent = new Intent(Activity2.this, Activity5.class);
//        startActivity(intent);
//    }

    public void onClickLayout(View v){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}

