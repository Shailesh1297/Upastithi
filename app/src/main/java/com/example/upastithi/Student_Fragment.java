package com.example.upastithi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Student_Fragment extends Fragment {

    public Student_Fragment()
    {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_student__login, container, false);
    }
}
