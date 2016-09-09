package com.tes.vi.alterd;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Nullable @BindView(R.id.rc_gate)
    RecyclerView mRcGate;

    @Nullable @BindView(R.id.tv_title)
    TextView mTvTitle;


    RecyclerviewAdapter recyclerviewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        init();
        addData();
    }

    private void init(){
        mTvTitle.setText("Gate");

        GridLayoutManager gridLayoutVertical = new GridLayoutManager(this,2);
        mRcGate.setHasFixedSize(true);
        mRcGate.setLayoutManager(gridLayoutVertical);

        recyclerviewAdapter = new RecyclerviewAdapter(this);
        mRcGate.setAdapter(recyclerviewAdapter);
    }

    private void addData(){

        for(int i=0;i<5;i++){
            recyclerviewAdapter.addItem(recyclerviewAdapter.getItemCount(),"Tes " + String.valueOf(i),
                    null, null);
        }
    }
}
