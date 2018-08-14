package recyclerview.materialdesign.interra.com.recyclerview;

import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        MaterialButton linearLayout = findViewById(R.id.linearLayout);
        MaterialButton gridLayout = findViewById(R.id.gridLayout);
        MaterialButton staggeredLayout = findViewById(R.id.staggeredGridLayout);
        MaterialButton listView = findViewById(R.id.listView);
        MaterialButton listViewSecond = findViewById(R.id.listViewSecond);

        listViewSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ListViewSecond.class);
                startActivity(intent);
            }
        });

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LinearLayout.class);
                startActivity(intent);
            }
        });

        gridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), GridLayout.class);
                startActivity(intent);
            }
        });

        staggeredLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), StaggeredLayout.class);
                startActivity(intent);
            }
        });

        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ListView.class);
                startActivity(intent);
            }
        });
    }
}
