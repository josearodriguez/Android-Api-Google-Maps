package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoogleMap map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);



    }


  public void onClicK_normal(View view){
        GoogleMap map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);


    }
    public void onClicK_satelite(View view){
        GoogleMap map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);


    }



}



