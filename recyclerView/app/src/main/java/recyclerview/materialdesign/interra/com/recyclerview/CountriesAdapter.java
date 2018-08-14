package recyclerview.materialdesign.interra.com.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder> {

    private ArrayList<Countries> countryList;
    private Context context;

    CountriesAdapter(Context context, ArrayList<Countries> countryList) {
        this.context = context;
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.countries_list, parent, false);
        return new CountriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        Countries countries = countryList.get(position);
        holder.mCountry.setText(countries.getmCountry());
        holder.mCapital.setText(countries.getmCapital());
        holder.mDescription.setText(countries.getmDescription());
    }

    public void removeItem (int position) {
        countryList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    class CountriesViewHolder extends RecyclerView.ViewHolder {
        TextView mCountry;
        TextView mCapital;
        TextView mDescription;

        CountriesViewHolder(View itemView) {
            super(itemView);

            mCountry = itemView.findViewById(R.id.country);
            mCapital = itemView.findViewById(R.id.capital);
            mDescription = itemView.findViewById(R.id.description);
        }
    }
}
