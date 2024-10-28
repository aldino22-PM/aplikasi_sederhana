package com.example.aplikasisederhanaaldino;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class home extends Activity {
    Button btnPindah2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnPindah2 = (Button) findViewById(R.id.btnPindah2);
        btnPindah2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });


    }
}

