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

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private ArrayList<Movie> movieArrayList;
    private Context context;

    MovieAdapter(Context context, ArrayList<Movie> movieArrayList) {
        this.context = context;
        this.movieArrayList = movieArrayList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movies = movieArrayList.get(position);
        holder.movieName.setText(movies.getMovieName());
        holder.movieRate.setText(movies.getMovieRate());
        holder.movieImageView.setImageResource(movies.getMovieImage());
    }

    @Override
    public int getItemCount() {
        return movieArrayList.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView movieName;
        ImageView movieImageView;
        TextView movieRate;

        MovieViewHolder(View itemView){
            super(itemView);

            movieImageView = itemView.findViewById(R.id.movieImage);
            movieName = itemView.findViewById(R.id.movieName);
            movieRate = itemView.findViewById(R.id.movieRate);
        }
    }
}
