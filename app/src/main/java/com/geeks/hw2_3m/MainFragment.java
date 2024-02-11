package com.geeks.hw2_3m;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {
    private TextView textView;
    private Button addButton;
    private Button subtractButton;
    private int currentValue = 0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        textView = view.findViewById(R.id.textView);
        addButton = view.findViewById(R.id.addButton);
        subtractButton = view.findViewById(R.id.subtractButton);

        updateText();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue++;
                updateText();
            }
        });


        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue--;
                updateText();
            }
        });

        return view;
    }

    private void updateText() {
        if (textView != null) {
            textView.setText(String.valueOf(currentValue));
        }

    }

}