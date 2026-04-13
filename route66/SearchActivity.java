package com.usc.route66;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void openMapPage(View view) {
        Intent intent = new Intent(SearchActivity.this, MapActivity.class);
        startActivity(intent);
    }

    public void openSearchPage(View view) {
    }
}