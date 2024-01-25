package com.example.mvvmretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mvvmretrofit.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recView.setLayoutManager(new LinearLayoutManager(this));
        binding.recView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        MyAdapter myAdapter = new MyAdapter(getStudents());
        binding.recView.setAdapter(myAdapter);

    }

    public List<Student> getStudents()
    {
        List<Student> slist= new ArrayList<>();
        slist.add(new Student("Jainil Mayani","Android"));
        slist.add(new Student("Kunal","Android"));
        slist.add(new Student("Abc","Hardware"));
        slist.add(new Student("Xyz","Hardware"));
        slist.add(new Student("Xyz","Hardware"));
        slist.add(new Student("Xyz","Hardware"));
        slist.add(new Student("Xyz","Hardware"));
        slist.add(new Student("Xyz","Hardware"));
        slist.add(new Student("Xyz","Hardware"));
        slist.add(new Student("Xyz","Hardware"));

        return  slist;
    }
}