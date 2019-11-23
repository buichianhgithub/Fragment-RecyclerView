package ca.georgebrown.comp3074.fragment_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.MyViewHolder> {
    List<Person> personList;

    public MyRvAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public MyRvAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_look,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRvAdapter.MyViewHolder holder, int position) {
        holder.nameTv.setText(personList.get(position).getName());
        holder.hobbyTv.setText(personList.get(position).getHobby());
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nameTv;
        TextView hobbyTv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTv = itemView.findViewById(R.id.nameView);
            hobbyTv = itemView.findViewById(R.id.hobbyView);
        }
    }
}
