package recyclerview.materialdesign.interra.com.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.button.MaterialButton;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StarWarsAdapter extends RecyclerView.Adapter {

    private ArrayList<StarWars> mList;
    private Context mContext;
    private int totalTypes;

    StarWarsAdapter(Context context, ArrayList<StarWars> list) {
        mList = list;
        mContext = context;
        totalTypes = mList.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case StarWars.SECOND_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.star_wars_characters, parent, false);
                Log.v("create VH1", String.valueOf(view.hashCode()));
                return new StarWarsViewHolder(view);
            case StarWars.FIRST_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder2, parent, false);
                Log.v("create VH2", String.valueOf(view.hashCode()));
                return new ViewHolder2(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
        StarWars character = mList.get(position);

        if (character != null) {
            switch (character.getType()) {
                case StarWars.SECOND_TYPE:

                    Log.v("VH1-bind", String.valueOf(mList.get(position).getmName()));

                    ((StarWarsViewHolder) holder).mName.setText(character.getmName());
                    ((StarWarsViewHolder) holder).mAffiliations.setText(character.getmAffiliations());
                    ((StarWarsViewHolder) holder).mSpecies.setText(character.getmSpecies());
                    ((StarWarsViewHolder) holder).mImage.setImageResource(character.getmImage());
                    ((StarWarsViewHolder) holder).button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            removeItem(((StarWarsViewHolder) holder).getLayoutPosition());
                        }
                    });
                    break;

                case StarWars.FIRST_TYPE:

                    Log.v("VH2-bind", String.valueOf(mList.get(position).getmName()));

                    ((ViewHolder2) holder).cName.setText(character.getmName());
                    ((ViewHolder2) holder).cSpecies.setText(character.getmSpecies());
                    break;
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        switch (mList.get(position).getType()) {
            case 0:
                return StarWars.FIRST_TYPE;
            case 1:
                return StarWars.SECOND_TYPE;
            default:
                return  -1;
        }
    }

    public void removeItem (int position) {
        mList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class StarWarsViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        TextView mAffiliations;
        TextView mSpecies;
        ImageView mImage;
        MaterialButton button;

        StarWarsViewHolder(View itemView) {
            super(itemView);

            mImage = itemView.findViewById(R.id.starWarsImage);
            mName = itemView.findViewById(R.id.name);
            mAffiliations = itemView.findViewById(R.id.affiliations);
            mSpecies = itemView.findViewById(R.id.species);
            button = itemView.findViewById(R.id.button);
        }
    }
    class ViewHolder2 extends RecyclerView.ViewHolder {
        TextView cName;
        TextView cSpecies;

        public ViewHolder2(@NonNull View itemView) {
            super(itemView);
            cName = itemView.findViewById(R.id.text1);
            cSpecies = itemView.findViewById(R.id.text2);
        }
    }

}
