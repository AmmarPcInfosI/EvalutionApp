package com.example.evalutionapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView questionListView = findViewById(R.id.questionListView);
        QuestionAdapter adapter = new QuestionAdapter(this);
        questionListView.setAdapter(adapter);
    }
}
