package com.example.githubtesting2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        // i'm commenting yur Toast and display mine okayy ??
        //Toast.makeText ( this, "Testing 2", Toast.LENGTH_SHORT ).show ();

        //Thia sis my Toast
        Toast.makeText(this, "Tasting 3", Toast.LENGTH_SHORT).show();

    }
}
