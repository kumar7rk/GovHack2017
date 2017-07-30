package com.geeky7.rohit.govhack2017;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_screen1);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng loc = new LatLng(-26.2060033,134.4391496);
        LatLng WA = new LatLng(-27.638,124.362);
        LatLng NT = new LatLng(-20.420,135.041);
        LatLng QLD = new LatLng(-23.550,143.245);
        LatLng NSW = new LatLng(-32.615,146.994);
        LatLng VIC = new LatLng(-38.611,143.391);
        LatLng SA = new LatLng(-29.510,135.964);
        LatLng TAS = new LatLng(-41.936,145.620);

        mMap.addMarker(new MarkerOptions().position(WA).title("TOTAL REFUGEES 13,346 (9.7%)"));
        mMap.addMarker(new MarkerOptions().position(NT).title("Total Refugees 1,618 (1.2%)"));
        mMap.addMarker(new MarkerOptions().position(QLD).title("Total Refugees 17,441 (12.7%)"));
        mMap.addMarker(new MarkerOptions().position(NSW).title("Total Refugees 49,585 (36%)"));
        mMap.addMarker(new MarkerOptions().position(VIC).title("Total Refugees 42,079 (30.6%)"));
        mMap.addMarker(new MarkerOptions().position(SA).title("Total Refugees 7,500(5.5%)"));
        mMap.addMarker(new MarkerOptions().position(TAS).title("Total Refugees 1,468 (1.3%)"));

        mMap.setContentDescription("Total Refugees");
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(loc));
        mMap.getCameraPosition();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, 3.5f));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(3.5f), 2000, null);
        Toast.makeText(getApplicationContext(),"SomeData "+mMap.getMinZoomLevel(),Toast.LENGTH_SHORT);
    }
}