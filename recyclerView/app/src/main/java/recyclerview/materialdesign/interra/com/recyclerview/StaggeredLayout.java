package recyclerview.materialdesign.interra.com.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class StaggeredLayout extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.staggered_grid_layout);

        ArrayList<Pixar> pixarList = new ArrayList<>();
        Pixar pix = new Pixar(R.drawable.jack_jack, "The Incredibles");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.anger, "Inside Out");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.bing_bong, "Inside Out");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.buzz_lightyear, "Toy Story");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.carl, "Up");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.dory, "Finding Nemo");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.mater, "Cars");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.hector, "Coco");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.lighting_mcqueen, "Cars");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.merida, "Brave");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.mike, "Monsters, Inc");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.sullivan, "Monsters, Inc");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.woody, "Toy Story");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.wall, "Wall-E");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.triplets_brave, "Brave");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.eve, "Wall-E");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.joy, "Inside Out");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.edna, "The Incredibles");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.django, "Ratatouille");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.russell_up, "Up");
        pixarList.add(pix);
        pix = new Pixar(R.drawable.bruce, "Finding Nemo");
        pixarList.add(pix);


        RecyclerView recyclerViewStaggered = findViewById(R.id.recyclerStaggered);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        recyclerViewStaggered.setItemAnimator(itemAnimator);
        PixarAdapter pixarAdapter = new PixarAdapter(this, pixarList);
        recyclerViewStaggered.setAdapter(pixarAdapter);
    }
}
