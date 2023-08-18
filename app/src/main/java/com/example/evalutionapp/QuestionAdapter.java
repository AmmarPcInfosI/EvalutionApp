package com.example.evalutionapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class QuestionAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;

    public QuestionAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = inflater.inflate(R.layout.list_item_question, parent, false);


        TextView questionText = itemView.findViewById(R.id.questionText);
        RatingBar ratingBar = itemView.findViewById(R.id.ratingBar);
        Spinner spinner = itemView.findViewById(R.id.spinner);
        Button submitBtn = itemView.findViewById(R.id.submitBtn);


        switch (position) {
            case 0:
                questionText.setText("Question 1: Rate your experience with our app");
                spinner.setVisibility(View.GONE);
                ratingBar.setVisibility(View.VISIBLE);
                break;
            case 1:
                questionText.setText("Question 2: Rate the features that the app offers");
                spinner.setVisibility(View.GONE);
                ratingBar.setVisibility(View.VISIBLE);
                break;
            case 2:
                questionText.setText("Question 3: Rate the ease of use of our app");
                spinner.setVisibility(View.GONE);
                ratingBar.setVisibility(View.VISIBLE);
            case 3:
                questionText.setText("Question 4: Select your preferred programming language");
                spinner.setVisibility(View.VISIBLE);
                ratingBar.setVisibility(View.GONE);
                ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(
                        context,
                        R.array.spinner_options_array,
                        android.R.layout.simple_spinner_item
                );
                spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(spinnerAdapter);
                break;
        }

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                String selectedOption = parent.getItemAtPosition(pos).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return itemView;
    }
}