package com.hafizh.bios;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment implements View.OnClickListener{
    ImageView feedback, kebprivasi;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container,false);
        feedback = (ImageView) view.findViewById(R.id.imageView2);
        feedback.setOnClickListener(this);
        kebprivasi = (ImageView) view.findViewById(R.id.imageView9);
        kebprivasi.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.imageView2:
                Intent intent1 = new Intent(getActivity(), Feedback.class);
                startActivity(intent1);
                break;
            case R.id.imageView9:
                Intent intent2 = new Intent(getActivity(), KebijakanPrivasi.class);
                startActivity(intent2);
                break;
        }
    }
}