package com.vertkle.publico.distanciacoordenadas;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final double LAT1 = -12.08306;
    private static final double LONG1 = -77.03116;

    private static final double LAT2 = -12.08243;
    private static final double LONG2 = -77.02697;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tvDistancia);
        tv.setText("La distancia entre el punto A y el punto B es: \n "+distanceAndroid(LAT1,LONG1,LAT2,LONG2) + " metros");
    }


    private double distanceAndroid(double lat1, double lon1, double lat2, double lon2){
        Location startPoint=new Location("locationA");
        startPoint.setLatitude(lat1);
        startPoint.setLongitude(lon1);

        Location endPoint=new Location("locationA");
        endPoint.setLatitude(lat2);
        endPoint.setLongitude(lon2);

        return startPoint.distanceTo(endPoint);
    }
}