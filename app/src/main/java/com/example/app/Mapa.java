package com.example.app;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

/**
 * Created by Jose on 11/02/14.
 */
public class Mapa extends FragmentActivity {


 private  void cambio(){

       /* GoogleMap mapa = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        mapa.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
*/
     Toast toast1 =
             Toast.makeText(getApplicationContext(),
                     "Toast por defecto", Toast.LENGTH_SHORT);

     toast1.show();

    }


}
