package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class GeographyActivity extends AppCompatActivity {

    private TextView geo_que1;
    private CheckBox geo_checkbox1;
    private CheckBox geo_checkbox2;
    private CheckBox geo_checkbox3;
    private Button   geo_btn_nex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);

        geo_que1 = findViewById(R.id.geo_que1_textveiw);
        geo_checkbox1 = findViewById(R.id.geo_checkbox1);
        geo_checkbox2 = findViewById(R.id.geo_checkbox2);
        geo_checkbox3 = findViewById(R.id.geo_checkbox3);
        geo_btn_nex   =findViewById(R.id.geo_btn_nex);

        geo_btn_nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GeographyActivity.this,"geo_btn_nex", Toast.LENGTH_SHORT).show();

            }
        });



    }
}
