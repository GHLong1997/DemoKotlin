package com.example.framgiahangoclong.basickotlin.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.framgiahangoclong.basickotlin.R;

public class Main2Activity extends AppCompatActivity {

    private static void onClick(View v) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.haha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this, "Button clicked", Toast.LENGTH_LONG).show();
            }
        });


        findViewById(R.id.haha).setOnClickListener(view -> {

        });

        findViewById(R.id.haha).setOnClickListener(view -> Toast.makeText(Main2Activity.this, "Button clicked", Toast.LENGTH_LONG).show());

        findViewById(R.id.haha).setOnClickListener(Main2Activity::onClick);
    }
}
