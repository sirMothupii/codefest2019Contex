package com.sirmothupii.codefest2019contex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Maps extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        //search for restaurants nearby
        Uri locationIntentUri = Uri.parse("geo:0,0?q=My current Location");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, locationIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
