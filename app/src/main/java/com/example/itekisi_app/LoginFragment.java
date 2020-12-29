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


public class LoginFragment extends Fragment {

    private static final String TAG = "LoginFragment";


    private Button btn_register;
    private Button btn_login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_login, container, false);
        Log.d(TAG, "onCreate: Started.");

        btn_login = view.findViewById(R.id.buttonLogin);
        btn_register = view.findViewById(R.id.buttonswitchRegister);

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
                Toast.makeText(getActivity(),"Register Fragment",Toast.LENGTH_SHORT).show();
                //navigate to Activity

                ((MainActivity)getActivity()).setViewPager(1);
                //Intent intent = new Intent(getActivity(),Main2Activity.class);
            }
        });
        return view;
    }

}
