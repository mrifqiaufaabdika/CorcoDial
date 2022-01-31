package com.corcodial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AllCallActivity extends AppCompatActivity {

    RecyclerView rv_dial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_call);

        //recyclerview harga
        rv_dial =  findViewById(R.id.rv_dial);
        rv_dial.setHasFixedSize(true);
        rv_dial.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        DialAdapter sampelDataAdapterGrid = new DialAdapter(10);
        rv_dial.setAdapter(sampelDataAdapterGrid);
    }
}