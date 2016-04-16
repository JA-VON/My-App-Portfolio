package com.javon.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        String message = "This button will launch my ";
        switch (view.getId())
        {
            case R.id.popular_movies:
                message += "Popular Movies App";
                break;
            case R.id.ubiquitous:
                message += "Go Ubiquitous App";
                break;
            case R.id.build_it_bigger:
                message += "Build it bigger App";
                break;
            case R.id.capstone:
                message += "Capstone App";
                break;
            case R.id.material:
                message += "Make It Material App";
                break;
            case R.id.stock_hawk:
                message += "Stock Hawk App";
                break;
        }

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
