package com.example.mvvmretrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmretrofit.databinding.SinglerowdesignBinding;

import java.util.List;

public class MyAdapter  extends  RecyclerView.Adapter<MyAdapter.myViewhoder>{

    List<Student> slist;

    public MyAdapter(List<Student> slist) {
        this.slist = slist;
    }

    @NonNull
    @Override
    public myViewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        SinglerowdesignBinding binding = SinglerowdesignBinding.inflate(inflater,parent,false);
        return new myViewhoder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewhoder holder, int position) {

        Student scurrent=slist.get(position);
        holder.singlerowdesignBinding.setStudentobject(scurrent);

    }

    @Override
    public int getItemCount() {
        return slist.size();
    }

    static class myViewhoder extends RecyclerView.ViewHolder{

        SinglerowdesignBinding singlerowdesignBinding;

        public myViewhoder(@NonNull SinglerowdesignBinding singlerowdesignBinding) {
            super(singlerowdesignBinding.getRoot());
            this.singlerowdesignBinding=singlerowdesignBinding;
        }
    }
}
