package com.example.sportcardviewrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    RecyclerView recyclerView;
    ArrayList<Sport> sportList;
    private MyCustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sportList = new ArrayList<>();

        sportList.add(new Sport(R.drawable.basketball, "BasketBall"));
        sportList.add(new Sport(R.drawable.football,"Football"));
        sportList.add(new Sport(R.drawable.ping,"Ping"));
        sportList.add(new Sport(R.drawable.tennis,"Tennis"));
        sportList.add(new Sport(R.drawable.volley,"VolleyBall"));

        myAdapter = new MyCustomAdapter(sportList);
        recyclerView.setAdapter(myAdapter);

        myAdapter.setItemClickListener(this);
    }

    @Override
    public void onCLick(View v, int i) {
        Toast.makeText(this,
                "You shall play: "+sportList.get(i).getSportTitle(),
                Toast.LENGTH_SHORT).show();
    }
}