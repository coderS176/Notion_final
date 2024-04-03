package com.example.notion_final;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutManitFragment extends Fragment {

    String data = "";

    public AboutManitFragment() {
        // Required empty public constructor
        data = "MANIT was founded in 1960 as Maulana Azad College of Technology (MACT). It is one of the first eight Regional Engineering Colleges (RECs) established during India's second five-year plan (1956-1960). \n" +
                "MANIT offers undergraduate, postgraduate, and PhD programs. The institute has 14 departments and a few centers of excellence. The departments associated with undergraduate programs include:\n" +
                "Architecture and Planning\n" +
                "Biological Sciences and Engineering\n" +
                "Chemical Engineering\n" +
                "Civil Engineering\n" +
                "Computer Science and Engineering\n" +
                "Electrical Engineering\n" +
                "Electronics and Communication Engineering \n" +
                "MANIT has signed MoUs with various national and international organizations such as DAUTO, Texas Instruments, Ericsson India Pvt. to promote research in the Engineering domain";

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_manit, container, false);
        TextView textView = view.findViewById(R.id.manitTextView);

        textView.setText(data);

        return view;
    }
}