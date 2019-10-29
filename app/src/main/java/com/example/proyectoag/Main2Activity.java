package com.example.proyectoag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
        private Button inicio2;
        private Button dash1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initControl ();
    }

    private void initControl() {
        inicio2 = (Button) findViewById(R.id.inicio2);
        dash1 = (Button) findViewById(R.id.dash1);

        inicio2.setOnClickListener(this);
        dash1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.inicio2:
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.dash1:
                Intent intent2 = new Intent(v.getContext(),dashboard.class);
                startActivityForResult(intent2, 0);
                break;
        }

    }
}
