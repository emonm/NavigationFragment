package com.depth.quran.navigationfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Belal on 18/09/16.
 */


public class Menu2 extends Fragment {
    TextView name,pass;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_menu_2, container, false);
        Bundle bundle=getArguments();
        String userName=bundle.getString("name");
        String userPass=bundle.getString("pass");
        name=(TextView)view.findViewById(R.id.username);
        pass=(TextView)view.findViewById(R.id.pass);
        name.setText(userName);
        pass.setText(userPass);
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Menu 2");
    }
}