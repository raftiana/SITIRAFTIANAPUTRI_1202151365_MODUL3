package com.example.raftiana.sitiraftianaputri_1202151365_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.Toast;

/**
 * Created by Raftiana on 23/02/2018.
 */

public class LoginActivity extends AppCompatActivity {

    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void proses(View v) {
        //deklarasi variabel berdasaarkan ID
        EditText username, password;
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        //mengambil nilai dari yang user inputkan
        this.username = username.getText().toString();
        this.password = password.getText().toString();

        //kondisi mengenai otorisasi user
        if (this.username.equals("EAD") && this.password.equals("MOBILE")) {
            Toast.makeText(this, "Anda berhasil login", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Username/Password anda masih salah", Toast.LENGTH_LONG).show();
        }

    }
}
