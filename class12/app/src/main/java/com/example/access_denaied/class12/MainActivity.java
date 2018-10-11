package com.example.access_denaied.class12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

  GridView gridViewGV;
  String[] name ;
  int[] image = {
          R.drawable.archive,
          R.drawable.business,
          R.drawable.chat,
          R.drawable.id,
          R.drawable.interview,
          R.drawable.team,
          R.drawable.strategy,
          R.drawable.puzzle,
          R.drawable.conference,
          R.drawable.work,
  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridViewGV = findViewById(R.id.girdview);

        String[] name = getResources().getStringArray(R.array.titles);

        CustomAdapter adapter = new CustomAdapter(name,image, this);
        gridViewGV.setAdapter(adapter);

    }
}
