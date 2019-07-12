package com.morteza.kordi.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Year;

public class MainActivity extends AppCompatActivity {

    public void buttonIsClicked(View button1) {
        Log.i("OPERATION1", 5 * 7 + "");
        Log.i("USERNAME123", ((TextView) findViewById(R.id.editText)).getText().toString());
        Log.i("PHONENUMBER123", ((TextView) findViewById(R.id.editText3)).getText().toString());

        String username = "The username is :" + ((TextView) findViewById(R.id.editText)).getText().toString();
        String password = "The password is :" + ((TextView) findViewById(R.id.editText3)).getText().toString();
        Toast.makeText(MainActivity.this, username + "\n" + password, Toast.LENGTH_SHORT).show();

        ((ImageView) findViewById(R.id.elephant)).setImageResource(R.drawable.grass);
    }

    public void calculateAge(View calculateAge) {
        String dob = ((EditText) findViewById(R.id.dob)).getText().toString();
        Log.i("DOB123", dob);
        int age = Integer.parseInt(Year.now().toString()) - Integer.parseInt(dob);
        TextView t = findViewById(R.id.age);
        t.setText(String.valueOf(age));
        Toast.makeText(MainActivity.this, "Age is :" + age, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pet);
    }
}
