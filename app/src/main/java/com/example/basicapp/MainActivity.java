package com.example.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eUsername;
    private EditText eUpassword;
    private Button eLogin;
    private TextView eattempts;

    String inputName = "";
    String inputPassword = "";


    // any password combination will work


    String Username = "";
    String Password = "";


    boolean isValid = false;
    private int counter = 5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        eUsername = findViewById(R.id.etUsername);
        eUpassword = findViewById(R.id.etUpassword);
        eLogin = findViewById(R.id.etLogin);
        eattempts = findViewById(R.id.etattempts);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                /* Obtain user inputs */
                String inputName = eUsername.getText().toString();
                String inputPassword = eUpassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {

                    Toast.makeText(MainActivity.this, "Please Enter All The Details Correctly", Toast.LENGTH_SHORT).show();

                }else{

                    isValid = validate(inputName, inputPassword);

                    if(!isValid){

                        counter--;

                        //Toast.makeText(MainActivity.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();

                        eattempts.setText("No. of attempts left: "  + counter);

                        // code for attempt counter to be added here

                        if(counter == 0){
                            eLogin.setEnabled(false); }





                 else{

                     Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

                            //Code to go to the next page

                      startActivity(new Intent(MainActivity.this, Homepage.class));


                         }

                     }

                 }
                }


        });



    }

    boolean validate(String inputName, String  inputPassword){

    if(inputName.equalsIgnoreCase(Username) &&  inputPassword.equals(Password))

    {
        return true;


    }
      return false;
    }
}

//comments
