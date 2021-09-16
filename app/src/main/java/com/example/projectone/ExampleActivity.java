package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// If you wanted to manually create your own activity
// ACTIVITY: Step 1 make your activity class extend the AppCompatActivity class
//  STEP 2: Create a layout file
public class ExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // STEP 3: SET CONTENT VIEW
        setContentView(R.layout.activity_example);
    }
}