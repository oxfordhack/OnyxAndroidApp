package com.landtanin.oxfordhackkkkk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        progressBar = findViewById(R.id.progressBar);
        btn = findViewById(R.id.button2);

        progressBar.setMax(100);
        progressBar.setMin(0);
        progressBar.setProgress(60);

//        String token = FirebaseInstanceId.getInstance().getToken();
//
//        String token1 = GiveMeWhatEver.TOKEN;
//        Log.w("afha;oifha;weo", "onCreate: " + token);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String token = FirebaseInstanceId.getInstance().getToken();
                Toast.makeText(MainActivity.this, token, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
