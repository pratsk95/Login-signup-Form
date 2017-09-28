package com.example.android.login_signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);


    EditText uname;
    EditText pass;
    Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.bt_login) {

        uname = (EditText) findViewById(R.id.et_username);
            String str = uname.getText().toString();
        pass = (EditText) findViewById(R.id.et_password);
            String pass1 = pass.getText().toString();

            String pass = helper.searchPass(str);

            if (pass1.equals(pass)) {
            Intent intent = new Intent(MainActivity.this, activity.class);
            startActivity(intent);

        } else {
            Toast temp = Toast.makeText(MainActivity.this, "Username or password is incorrect", Toast.LENGTH_SHORT);
            temp.show();


        }



    }

        signup = (Button) findViewById(R.id.bt_signup_main);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign = new Intent(MainActivity.this, signup.class);
                startActivity(sign);
            }
        });


    }


}
