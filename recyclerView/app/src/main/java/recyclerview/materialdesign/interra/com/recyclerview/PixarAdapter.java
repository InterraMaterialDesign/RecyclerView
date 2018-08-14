package recyclerview.materialdesign.interra.com.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PixarAdapter extends RecyclerView.Adapter<PixarAdapter.PixarViewHolder> {
    private ArrayList<Pixar> myList;
    private Context context;

    PixarAdapter(Context context, ArrayList<Pixar> myList) {
        this.context = context;
        this.myList = myList;
    }

    @NonNull
    @Override
    public PixarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.staggered_pixar, parent, false);
        return new PixarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PixarViewHolder holder, int position) {
        Pixar pixar = myList.get(position);
        holder.mPixarImage.setImageResource(pixar.getPixarImage());
        holder.mPixarName.setText(pixar.getPixarName());
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class PixarViewHolder extends RecyclerView.ViewHolder {
        ImageView mPixarImage;
        TextView mPixarName;

        PixarViewHolder(View itemView) {
            super(itemView);
            mPixarImage = itemView.findViewById(R.id.imagePixar);
            mPixarName = itemView.findViewById(R.id.namePixar);
        }
    }
}
