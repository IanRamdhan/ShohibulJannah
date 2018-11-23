package com.fryanramzkhar.shohibuljannah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleShohib extends AppCompatActivity {
    @BindView(R.id.my_recycle_shohib)
    RecyclerView myRecycleShohib;

    String[] namaShohib,detailShohib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_shohib);
        ButterKnife.bind(this);

        namaShohib = getResources().getStringArray(R.array.nama_sahabat);
        detailShohib = getResources().getStringArray(R.array.detail_shohib);


        Adapter adapter = new Adapter(RecycleShohib.this, namaShohib, detailShohib);
        myRecycleShohib.setHasFixedSize(true);
        myRecycleShohib.setLayoutManager(new LinearLayoutManager(RecycleShohib.this));
        myRecycleShohib.setAdapter(adapter);


    }
}
