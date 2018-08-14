package recyclerview.materialdesign.interra.com.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class GridLayout extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);


        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie = new Movie(R.drawable.the_godfather, "The Godfather", "9.2");
        movieList.add(movie);
        movie = new Movie(R.drawable.the_dark_night, "The Dark Knight", "9.0");
        movieList.add(movie);
        movie = new Movie(R.drawable.angry_men, "12 Angry Men", "8.9");
        movieList.add(movie);
        movie = new Movie(R.drawable.schindler_list, "Schindler's List", "8.9");
        movieList.add(movie);
        movie = new Movie(R.drawable.lord_of_the_rings, "The Lord of the Rings", "8.9");
        movieList.add(movie);
        movie = new Movie(R.drawable.pulp_fiction, "Pulp Fiction", "8.9");
        movieList.add(movie);
        movie = new Movie(R.drawable.good_bad_ugly, "The Good, the Bad and the Ugly", "8.8");
        movieList.add(movie);
        movie = new Movie(R.drawable.leon, "Leon: The Professional", "8.5");
        movieList.add(movie);
        movie = new Movie(R.drawable.american_historyx, "American History X", "8.5");
        movieList.add(movie);
        movie = new Movie(R.drawable.the_intouchables, "The Intouchables", "8.5");
        movieList.add(movie);
        movie = new Movie(R.drawable.cinema_paradiso, "Cinema Paradiso", "8.4");
        movieList.add(movie);
        movie = new Movie(R.drawable.wall_e, "WALL-E", "8.4");
        movieList.add(movie);
        movie = new Movie(R.drawable.american_beauty, "American Beauty", "8.4");
        movieList.add(movie);
        movie = new Movie(R.drawable.breaveheart, "Braveheart", "8.3");
        movieList.add(movie);
        movie = new Movie(R.drawable.requiem_for_dream, "Requiem for a Dream", "8.3");
        movieList.add(movie);
        movie = new Movie(R.drawable.harold_and_maude, "Harold and Maude", "8.0");
        movieList.add(movie);
        movie = new Movie(R.drawable.the_princess_bride, "The Princess Bride", "8.1");
        movieList.add(movie);
        movie = new Movie(R.drawable.wristcutters, "Wristcutters: A Love Story", "7.3");
        movieList.add(movie);

        RecyclerView recyclerMovie = findViewById(R.id.recyclerGrid);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        recyclerMovie.setItemAnimator(itemAnimator);
        MovieAdapter movieAdapter = new MovieAdapter(this, movieList);
        recyclerMovie.setAdapter(movieAdapter);
    }
}
