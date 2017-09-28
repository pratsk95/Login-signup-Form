package com.example.android.login_signup;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by HARSHAL KOTKAR on 9/25/2017.
 */

public class activity extends Activity {


    TextView name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        String username = getIntent().getStringExtra("username");
        String namestr = getIntent().getStringExtra("name");


        name = (TextView) findViewById(R.id.tv_show_name);
        name.setText(namestr);
    }
}
