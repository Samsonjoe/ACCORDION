package com.example.accordion.mainActivityWithRecycleView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.accordion.R;

import java.util.HashMap;
import java.util.Map;

public class MainActivityWithRecycleView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_with_recycle_view);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,1));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Map<Integer, String> data = new HashMap<>();
        data.put(0, "Normal\n[ExpandableRelativeLayout]");
        data.put(1, "Normal\n[ExpandableWeightLayout]");
        data.put(2, "Example(RecyclerView)\n[ExpandableRelativeLayout]");
        data.put(3, "Example(Search screen)\n[ExpandableRelativeLayout]");
        data.put(4, "Example(Read more)\n[ExpandableRelativeLayout]");

        recyclerView.setAdapter(new MainRecyclerAdapter(this, data));
    }
}