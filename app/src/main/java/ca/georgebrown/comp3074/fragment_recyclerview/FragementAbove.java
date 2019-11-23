package ca.georgebrown.comp3074.fragment_recyclerview;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragementAbove extends Fragment {


    List<Person> personList = new ArrayList<>();
    public FragementAbove() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragement_above, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        MyRvAdapter myRvAdapter = new MyRvAdapter(personList);
        recyclerView.setAdapter(myRvAdapter);
        return view;

    }

}
