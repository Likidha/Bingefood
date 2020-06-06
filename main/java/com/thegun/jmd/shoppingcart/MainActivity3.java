package com.thegun.jmd.shoppingcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView imageButton5 = (ImageView) findViewById(R.id.imageButton5);

        imageButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                // Creating explicit intent
                Intent i1 = new Intent(MainActivity3.this, MenuActivity1.class);
                startActivity(i1);
            }
        });
    }
}
