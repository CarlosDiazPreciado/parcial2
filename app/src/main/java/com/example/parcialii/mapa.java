package com.example.parcialii;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public abstract class mapa extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtlatitud, txtlongitud;
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        txtlatitud = findViewById(R.id.txtlatitud);
        txtlongitud = findViewById(R.id.txtlongitud);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync((com.google.android.gms.maps.OnMapReadyCallback) this);
    }


    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng colombia = new LatLng(4.6509289,-74.1477101);
        mMap.addMarker(new MarkerOptions().position(colombia).title("Uniagustiniana"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(colombia));
    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {
        txtlatitud.setText(""+latLng.latitude);
        txtlongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        txtlatitud.setText(""+latLng.latitude);
        txtlongitud.setText(""+latLng.longitude);
    }
}
