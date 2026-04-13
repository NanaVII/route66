package com.usc.route66;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void openMapPage(View view) {
    }

    public void openSearchPage(View view) {
        Intent intent = new Intent(MapActivity.this, SearchActivity.class);
        startActivity(intent);
    }
}