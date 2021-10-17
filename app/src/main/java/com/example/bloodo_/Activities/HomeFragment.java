package com.example.bloodo_.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import com.example.bloodo_.R;

public class HomeFragment extends Fragment {

    private AppCompatButton findDonorBtn;
    private AppCompatButton seeRequestBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        findDonorBtn = view.findViewById(R.id.findDonorBtn);
        seeRequestBtn = view.findViewById(R.id.seeRequestBtn);


        return view;
    }
}
