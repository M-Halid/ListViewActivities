 package com.ewig.highactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.ewig.highactivities.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

 public class MainActivity extends AppCompatActivity {
     private ActivityMainBinding binding;
     ArrayList<LandMark> landMarkArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landMarkArrayList=new ArrayList<LandMark>();

        LandMark pisa=new LandMark("Pisa","Italy","Pisa",R.drawable.b1);
        LandMark eiffel=new LandMark("Paris","France","Eiffel",R.drawable.b2);
        LandMark colosseum=new LandMark("Rome","Italy","Colosseum",R.drawable.b3);
        LandMark london=new LandMark("London","England","Bridge",R.drawable.b5);

        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(colosseum);
        landMarkArrayList.add(london);

        System.out.println(landMarkArrayList.get(0).name);
        ArrayAdapter<Object> arrayAdapter=new ArrayAdapter<Object>(this, android.R.layout.simple_list_item_1,
                landMarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this," pos:"+position,Toast.LENGTH_SHORT).show();
            Intent intent= new Intent(MainActivity.this, Details.class);
            intent.putExtra("landmark",landMarkArrayList.get(position));
            startActivity(intent);

            }
        });
    }

}