package com.landtanin.oxfordhackkkkk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
//    private Button btn;
    private TextView mTextView;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<ItemDTO> mArrayList = new ArrayList<>();
    private RecyclerAdapter mAdapter;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        progressBar = findViewById(R.id.progressBar);
//        btn = findViewById(R.id.button2);
        mTextView = findViewById(R.id.textView_main);
        int progressBarValue = 30;

        progressBar.setMax(100);
        progressBar.setMin(0);
        progressBar.setProgress(progressBarValue);

        String statusTxt = progressBarValue + "%";

        mTextView.setText(statusTxt);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mAdapter = new RecyclerAdapter(mArrayList);
        mRecyclerView.setAdapter(mAdapter);

//        String token = FirebaseInstanceId.getInstance().getToken();
//
//        String token1 = GiveMeWhatEver.TOKEN;
//        Log.w("afha;oifha;weo", "onCreate: " + token);



    }
}
