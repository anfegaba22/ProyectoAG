package com.example.proyectoag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity implements View.OnClickListener{

    private Button inicio1;
    private Button main2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initControl();
    }

    private void initControl() {
        inicio1 = (Button) findViewById(R.id.inicio1);
        main2 = (Button) findViewById(R.id.main2);

        inicio1.setOnClickListener(this);
        main2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.inicio1:
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.main2:
                Intent intent2 = new Intent(v.getContext(),Main2Activity.class);
                startActivityForResult(intent2, 0);
                break;
        }
    }
}
