package com.example.basicapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomeFragment<TextView> extends Fragment {
    Button switchButton;
    TextView platformText,LanguageText;







    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        switchButton=view.findViewById(R.id.switchButton);
        platformText=view.findViewById(R.id.platformText);
        LanguageText=view.findViewById(R.id.languageText);


      //  switchButton.setOnClickListener(new View.OnClickListener(){


        //    @Override
          //  public void onClick(View v) {
            //    platformText.setVisibility(View.GONE);
              //  LanguageText.setVisibility(View.VISIBLE);
            //}
        //}


    }
);
        }