package com.example.accordion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.accordion.exampleRecycleView.RecyclerViewActivity;
import com.example.accordion.mainActivityWithRecycleView.MainActivityWithRecycleView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainActivityRecycleViewMAIN = findViewById(R.id.mainActivityRecycleViewMAIN);
        mainActivityRecycleViewMAIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityWithRecycleView.class);
                startActivity(intent);
                finish();
            }
        });

        Button expandable = findViewById(R.id.expandableMAIN);
        expandable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ExpandableLayoutActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button readMore = findViewById(R.id.readMoreMAIN);
        readMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ExampleReadMoreActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button recycleView = findViewById(R.id.recyclerViewMAIN);
        recycleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button expandableWeight = findViewById(R.id.expandableWeightMAIN);
        recycleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExpandableWeightActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button exampleSearch = findViewById(R.id.exampleSearchMAIN);
        exampleSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExpandableWeightActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
