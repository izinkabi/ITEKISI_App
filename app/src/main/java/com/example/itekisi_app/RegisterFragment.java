package com.example.itekisi_app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;


public class RegisterFragment extends Fragment {

    private static final String TAG = "RegisterFragment";

    private Button btn_register;
    private Button btn_login;
    private Button btn_activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        Log.d(TAG, "onCreate: Started.");

        btn_login = (Button)view.findViewById(R.id.button);
        btn_register = (Button) view.findViewById(R.id.button2);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"going to Login Fragment",Toast.LENGTH_SHORT).show();
                //navigate to Fragment
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"going Register Fragment",Toast.LENGTH_SHORT).show();
                //navigate to Activity

                //((MainActivity)getActivity()).setViewPager(0);
                Intent intent = new Intent(getActivity(),Main2Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
