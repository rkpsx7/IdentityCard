package com.example.identitycard;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.identitycard.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;
    private ArrayList<Model> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        buildData();
        setDataToRecycler();
    }

    private void setDataToRecycler() {
        Adapter adapter = new Adapter(dataList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mainBinding.recyclerView.setLayoutManager(layoutManager);
        mainBinding.recyclerView.setAdapter(adapter);
    }

    private void buildData() {
        for (int i = 0; i < 4; i++) {
            Model model1 = new Model(R.drawable.prateek, "Masai School", "31", "Business");
            dataList.add(model1);
            Model model2 = new Model(R.drawable.elon, "Space X", "42", "Business");
            dataList.add(model2);
            Model model3 = new Model(R.drawable.jackma, "Alibaba", "51", "Business");
            dataList.add(model3);
            Model model4 = new Model(R.drawable.jeff, "Amazon", "65", "Business");
            dataList.add(model4);
            Model model5 = new Model(R.drawable.billgates, "Microsoft", "68", "Business");
            dataList.add(model5);
        }

    }
}