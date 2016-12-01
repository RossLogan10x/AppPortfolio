package com.example.android.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        Button popularMoviesBtn = (Button) findViewById(R.id.popular_movies_btn);
        popularMoviesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.popular_movies_toast)
                        , Toast.LENGTH_SHORT).show();
            }
        });

        Button stockHawkBtn = (Button) findViewById(R.id.stock_hawk_btn);
        stockHawkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.stock_hawk_toast)
                        , Toast.LENGTH_SHORT).show();
            }
        });

        Button buildItBiggerBtn = (Button) findViewById(R.id.built_it_bigger_btn);
        buildItBiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.build_it_bigger_toast)
                        , Toast.LENGTH_SHORT).show();
            }
        });

        Button makeAppMaterialBtn = (Button) findViewById(R.id.make_your_app_material_btn);
        makeAppMaterialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.make_your_app_material_toast)
                        , Toast.LENGTH_SHORT).show();
            }
        });

        Button goUbiquitousBtn = (Button) findViewById(R.id.go_ubiquitous_btn);
        goUbiquitousBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.go_ubiquitous_toast)
                        , Toast.LENGTH_SHORT).show();
            }
        });

        Button capstoneProjectBtn = (Button) findViewById(R.id.capstone_project_btn);
        capstoneProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getString(R.string.capstone_project_toast)
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
