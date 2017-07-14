package com.example.android.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Inklocal on 7/13/2017.
 */
public class FragmentOne extends Fragment{

    EditText etFragmentSatu;
    Button btnFragmentSatu;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        etFragmentSatu = (EditText) view.findViewById(R.id.etFragmentSatu);
        btnFragmentSatu = (Button) view.findViewById(R.id.btnFragmentSatu);
        btnFragmentSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),etFragmentSatu.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}
