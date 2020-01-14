package com.example.barffood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onMenuButtonClicked(View view) {
    }

    public void onIngredientsMenuClicked(View view) {
    }

    public void onBalanceButtonClicked(View view) {
        Intent intent = new Intent(this, DietBalancingActivity.class);
        startActivity(intent);
    }
}
