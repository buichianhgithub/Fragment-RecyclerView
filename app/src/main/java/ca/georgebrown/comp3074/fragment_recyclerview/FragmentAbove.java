package ca.georgebrown.comp3074.fragment_recyclerview;


import android.database.Cursor;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
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
public class FragmentAbove extends Fragment {
    final DatabaseHelper databaseHelper = new DatabaseHelper(getContext(),DatabaseHelper.DATABASE_NAME,null,DatabaseHelper.DATABASE_VERSION);
    List<Person> personList = new ArrayList<>();
    public FragmentAbove() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_above, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        databaseHelper.insert("Chris","Playing Soccer");
        databaseHelper.insert("Chris2","Playing Tennis");
        databaseHelper.insert("Chris3","Playing Guitar");

        Cursor c = databaseHelper.getAll();
        while (c.moveToNext()){
            personList.add(new Person(c.getString(1),c.getString(2)));
        }
        MyRvAdapter myRvAdapter = new MyRvAdapter(personList);
        recyclerView.setAdapter(myRvAdapter);
        return view;

    }

}
