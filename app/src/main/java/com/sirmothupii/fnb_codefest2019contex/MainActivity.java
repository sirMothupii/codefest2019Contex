package com.sirmothupii.fnb_codefest2019contex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Link to take user to register screen
    public void onClickRegister(View view)
    {
        Intent intent1 = new Intent(this, Insights.class);
        startActivity(intent1);
    }
}
