package com.example.githubtesting2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Toast.makeText ( this, "Testing 2", Toast.LENGTH_SHORT ).show ();

        Toast.makeText ( this, "Testing yhy", Toast.LENGTH_SHORT ).show ();
        Toast.makeText ( this, "Testing y", Toast.LENGTH_SHORT ).show ();
        Toast.makeText ( this, "Testing 1", Toast.LENGTH_SHORT ).show ();
        Toast.makeText ( this, "Testing 2", Toast.LENGTH_SHORT ).show ();

    }
}
