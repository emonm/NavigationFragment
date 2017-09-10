package com.depth.quran.navigationfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Belal on 18/09/16.
 */


public class Menu1 extends Fragment {
    EditText nameEditText,passwordEditText;
    Button submitButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view=inflater.inflate(R.layout.fragment_menu_1, container, false);

        nameEditText=(EditText)view.findViewById(R.id.user_name);
        passwordEditText=(EditText)view.findViewById(R.id.user_pass);
        submitButton=(Button)view.findViewById(R.id.loginButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=nameEditText.getText().toString();
                String userpassword=passwordEditText.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("name",username);
                bundle.putString("pass",userpassword);
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Menu2 menu2=new Menu2();
                menu2.setArguments(bundle);
                fragmentTransaction.replace(R.id.content_frame,menu2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Menu 1");
    }
}