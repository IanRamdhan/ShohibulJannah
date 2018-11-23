package com.fryanramzkhar.shohibuljannah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailShohib extends AppCompatActivity {

    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_shohib);
        ButterKnife.bind(this);

        txtTitle.setText(getIntent().getStringExtra("ns"));
        txtDetail.setText(getIntent().getStringExtra("ds"));
    }
}
