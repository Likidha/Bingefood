package com.thegun.jmd.shoppingcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.thegun.jmd.shoppingcart.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image1 = (ImageView) findViewById(R.id.image1);

        image1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

                // Creating explicit intent
                Intent i1 = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i1);
            }
        });
    }
}
