package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CommunicationListener {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        launchStudentPersonalDetailFragment();

    }

    private void launchStudentPersonalDetailFragment() {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        StudentPersonalDetailsFragment studentPersonalDetailsFragment=new StudentPersonalDetailsFragment();
        fragmentTransaction.add(R.id.constraint,studentPersonalDetailsFragment,"personal").commit();
    }

    @Override
    public void launchPerformanceFragment(Bundle bundle) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        StudentPerformanceDetailsFragment performanceDetailsFragment=new StudentPerformanceDetailsFragment();
        fragmentTransaction.replace(R.id.constraint,performanceDetailsFragment,"performanceDetailFragment").addToBackStack("").commit();
    }
}



