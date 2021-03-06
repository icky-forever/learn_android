package com.gyt.helloworld;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyPlantsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyPlantsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MyPlantsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyPlantsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MyPlantsFragment newInstance(String param1, String param2) {
        MyPlantsFragment fragment = new MyPlantsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onStop() {
        super.onStop();
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
        View rootView = inflater.inflate(R.layout.fragment_my_plants, container, false);

        //
        ArrayList<Plants> plants = new ArrayList<Plants>();
        for (int i = 0;i < 10000; ++i)
        {
            plants.add(new Plants("plants "+i, "this is: ", R.drawable.tree1));
        }

        PlantsAdapter plant_list = new PlantsAdapter(plants, getActivity());
        ListView listView = (ListView) rootView.findViewById(R.id.my_plants_list);
        listView.setAdapter(plant_list);

        // Inflate the layout for this fragment
        return rootView;
    }
}