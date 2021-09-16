package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String MY_FIRST_LOG = "my_first_log";

    // let's go ahead and identify the view elements we'll going to be using
    // in the code
    // Global variable outside the activity, but inside the class, we'll declare some global
    // view variables

    TextView mHelloTextView;
    Button mButtonExample;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TAKES THE LAYOUT FOR THIS ACTIVITY
        // YOU CAN PICK ANOTHER XML FILE from activity_main layout XML
        setContentView(R.layout.activity_main);

        // now initialize the variables
        mHelloTextView = findViewById(R.id.hello_tv);
        mButtonExample = findViewById(R.id.example_button);


        // Log level can be found in the Logcat window
        // takes two parameters: name/tag & message
        Log.d(MY_FIRST_LOG, "My app just started");

        //Adding programmatically items to buttons

        EditText editText = new EditText(this);
        editText.setWidth(ConstraintLayout.LayoutParams.WRAP_CONTENT);
        editText.setHeight(ConstraintLayout.LayoutParams.MATCH_PARENT);
        editText.setHint("type here");

        // Make our elements interactive
        // First way andoid clickable set it to true on XML
        // and focusable are true by default you cand o trought the code

        // Android on click specify the main method to use and you call it with strings
        // create a method with the button click and its going to take a view parameter

        // before this you relate this method to the button on the XML file
        public void buttonClicked(View view){
            mHelloTextView.setText("Hello world");

            Toast.makeText(this, "tHIS IS JUST A TOAS", Toast.LENGTH_LONG).show();
        }


        // Secod method and recommended way to manually make it an editText

    }
}