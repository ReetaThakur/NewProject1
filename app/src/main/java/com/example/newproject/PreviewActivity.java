package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {
    private TextView mEtName;
    private TextView mEtAge;
    private TextView mEtGrade;
    private TextView mEtPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initView();
        getDataFromIntent();
    }

    private void getDataFromIntent() {
        Model model=(Model) getIntent().getSerializableExtra("model");
        mEtName.setText(model.getName());
        mEtAge.setText(model.getAge()+"");
        mEtGrade.setText(model.getGrade());
        mEtPercentage.setText(model.getPercentage());
    }

    private void initView() {
        mEtName=findViewById(R.id.tvStudentName);
        mEtAge=findViewById(R.id.tvStudentAge);
        mEtGrade=findViewById(R.id.tvStudentGrade);
        mEtPercentage=findViewById(R.id.tvStudentPercentage);
    }
}