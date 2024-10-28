package com.example.aplikasisederhanaaldino;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends Activity {
    Button btnPindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editNama = (EditText) findViewById(R.id.editNama);
        final EditText editumur = (EditText) findViewById(R.id.editumur);
        final EditText editAlamat = (EditText) findViewById(R.id.editAlamat);
        final EditText editpenyakit = (EditText) findViewById(R.id.editpenyakit);
        final EditText editNO = (EditText) findViewById(R.id.editNO);


        btnPindah = (Button) findViewById(R.id.btnPindah);
        btnPindah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), home.class);
                startActivity(i);

            }
        });


    }
}
