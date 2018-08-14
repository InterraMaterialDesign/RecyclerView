package recyclerview.materialdesign.interra.com.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class LinearLayout extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<StarWars> mList = new ArrayList<>();
        StarWars character = new StarWars("Anakin Skywalker", "Jedi Order", "Human", R.drawable.anakin_skywalker, 0);
        mList.add(character);
        character = new StarWars("Alcida-Auka", "Caretakers", "Lanai", R.drawable.alcida_auka, 0);
        mList.add(character);
        character = new StarWars("C-3PO", "Rebel Alliance", "Droid",R.drawable.c3po, 0);
        mList.add(character);
        character = new StarWars("Chewbacca", "Rebel Alliance", "Wookiee", R.drawable.chewbacca, 0);
        mList.add(character);
        character = new StarWars("Count Dooku", "Sith", "Human", R.drawable.count_dooku,1);
        mList.add(character);
        character = new StarWars("Dart Vader", "Sith", "Human", R.drawable.darth_vader, 0);
        mList.add(character);
        character = new StarWars("Han Solo", "Rebel Alliance", "Human",R.drawable.han_solo, 1);
        mList.add(character);
        character = new StarWars("Jar Jar Binks", "Galactic Republic", "Gungan", R.drawable.jarjarbinks, 0);
        mList.add(character);
        character = new StarWars("Leia Organa", "Rebel Alliance", "Human", R.drawable.leia_organa, 0);
        mList.add(character);
        character = new StarWars("Luke Skywalker", "Jedi Order", "Human", R.drawable.luke_skywalker, 0);
        mList.add(character);
        character = new StarWars("Mace Windu", "Jedi Order", "Human", R.drawable.mace_windu, 0);
        mList.add(character);
        character = new StarWars("Obi-Wan Kenobi", "Jedi Order", "Human", R.drawable.obi_wan_kenobi, 0);
        mList.add(character);
        character = new StarWars("Padme Amidala", "Galactic Republic", "Human", R.drawable.padme_amidala, 0);
        mList.add(character);
        character = new StarWars("R2-D2", "Rebel Alliance", "Droid", R.drawable.r2d2, 0);
        mList.add(character);
        character = new StarWars("San Hill", "Confederacy of Indp. Systems", "Muun", R.drawable.san_hill, 0);
        mList.add(character);
        character = new StarWars("Supreme Leader Snoke", "The First Order", "Mysterious", R.drawable.supreme_leader_snoke, 0);
        mList.add(character);
        character = new StarWars("Wicket W. Warrick", "Rebel Alliance", "Ewok", R.drawable.wickettw_warrick, 0);
        mList.add(character);
        character = new StarWars("Yoda", "Jedi Order", "Unknown", R.drawable.yoda, 0);
        mList.add(character);
        character = new StarWars("Jabba The Hutt", "Jabba the Hutt's Palace", "Hutt",R.drawable.jabba_the_hutt, 0);
        mList.add(character);
        character = new StarWars("Qui-Gon Jinn", "Jedi Order", "Human", R.drawable.qui_gon_jinn, 0);
        mList.add(character);
        character = new StarWars("Emperor Palpatine", "Sith", "Human", R.drawable.emperor_palpatine, 1);
        mList.add(character);
        character = new StarWars("Wald", "None", "Rodian", R.drawable.wald, 0);
        mList.add(character);
        character = new StarWars("Watto", "None", "Toydarian",R.drawable.watto, 0);
        mList.add(character);
        character = new StarWars("Taun We", "Galactic Republic", "Kaminoan", R.drawable.taun_we, 0);
        mList.add(character);


        final RecyclerView recyclerView = findViewById(R.id.recycler);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        recyclerView.setItemAnimator(itemAnimator);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        final StarWarsAdapter starWarsAdapter = new StarWarsAdapter(this, mList);
        recyclerView.setAdapter(starWarsAdapter);


        recyclerView.getRecycledViewPool().setMaxRecycledViews(0, 50);

        final ArrayList<StarWars> newList = new ArrayList<>();

        Button button = findViewById(R.id.materialButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mList.size() != 0) {
                    newList.add(mList.get(0));
                    mList.remove(0);
                    starWarsAdapter.notifyItemRemoved(0);
                }
            }
        });

        Button buttonAdd = findViewById(R.id.materialButtonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(newList.size() != 0) {
                    mList.add(0, newList.get(newList.size()-1));
                    newList.remove(newList.size()-1);
                    starWarsAdapter.notifyItemInserted(0);
                    recyclerView.smoothScrollToPosition(0);
                }
            }
        });
    }
}
