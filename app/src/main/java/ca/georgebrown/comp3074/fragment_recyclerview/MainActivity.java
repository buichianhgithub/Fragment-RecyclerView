package ca.georgebrown.comp3074.fragment_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentAbove fragmentAbove = new FragmentAbove();
        getSupportFragmentManager().beginTransaction().add(R.id.containerAbove,fragmentAbove).commit();

    }
}
