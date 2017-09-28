package com.example.android.login_signup;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class signup extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);

    EditText username;
    EditText name;
    EditText email;
    EditText pass;
    EditText cpass;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }
    public void onSignupClick(View v) {

        if (v.getId() == R.id.bt_signup) {

        name = (EditText) findViewById(R.id.et_name);
        email = (EditText) findViewById(R.id.et_email);
        username = (EditText) findViewById(R.id.et_username);
        pass = (EditText) findViewById(R.id.p_password);
        cpass = (EditText) findViewById(R.id.p_confirm_password);



            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String usernamestr = username.getText().toString();
            String passstr = pass.getText().toString();
            String cpassstr = cpass.getText().toString();

                /*sign.putExtra("name",namestr);
                sign.putExtra("Email",emailstr);
                sign.putExtra("username",usernamestr);
                sign.putExtra("password",passstr);
                sign.putExtra("confirm password",cpassstr);*/


            if (!passstr.equals(cpassstr))

            {

                Toast pass = Toast.makeText(signup.this, "Password does not Match", Toast.LENGTH_SHORT);
                pass.show();

            } else {

                //add into database

                Contact c = new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUsername(usernamestr);
                c.setPass(passstr);

                helper.insertContact(c);
                Toast.makeText(this, "Data inserted Successfully. please Login to continue", Toast.LENGTH_SHORT).show();
            }

        }


    }
}
