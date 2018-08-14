package recyclerview.materialdesign.interra.com.recyclerview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ListViewSecond extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_countries);

        final ArrayList<Countries> cList = new ArrayList<>();
        Countries countries = new Countries("Afghanistan", "Kabul", "Afghanistan is bordered on the north by Turkmenistan, Uzbekistan, and Tajikistan, on the extreme northeast by China, on the east and south by Pakistan, and by Iran on the west");
        cList.add(countries);
        countries = new Countries("Albania", "Tirana","Albania is situated on the eastern shore of the Adriatic Sea, with Montenegro and Serbia to the north, Macedonia to the east, and Greece to the south.");
        cList.add(countries);
        countries = new Countries("Algeria", "Algiers","Nearly four times the size of Texas and the largest country on the continent, Algeria is bordered on the west by Morocco and Western Sahara and on the east by Tunisia and Libya. The Mediterranean Sea is to the north, and to the south are Mauritania, Mali, and Niger. The Saharan region, which is 85% of the country, is almost completely uninhabited.");
        cList.add(countries);
        countries = new Countries("Andorra", "Andorra La Vella","Andorra is nestled high in the Pyrénées Mountains on the French-Spanish border.");
        cList.add(countries);
        countries = new Countries("Angola", "Luanda","The Democratic Republic of the Congo and the Republic of Congo are to the north and east, Zambia is to the east, and Namibia is to the south.");
        cList.add(countries);
        countries = new Countries("Argentina","Buenos Aires","Second in South America only to Brazil in size and population, Argentina is a plain, rising from the Atlantic to the Chilean border and the towering Andes peaks.");
        cList.add(countries);
        countries = new Countries("Armenia", "Yerevan","It is bounded by Georgia on the north, Azerbaijan on the east, Iran on the south, and Turkey on the west.");
        cList.add(countries);
        countries = new Countries("Australia", "Canberra","The continent of Australia, with the island state of Tasmania, is approximately equal in area to the United States.");
        cList.add(countries);
        countries = new Countries("Austria", "Vienna","Austria includes much of the mountainous territory of the eastern Alps (about 75% of the area).");
        cList.add(countries);
        countries = new Countries("Azerbaijan", "Baku","Azerbaijan is located on the western shore of the Caspian Sea at the southeast extremity of the Caucasus.");
        cList.add(countries);
        countries = new Countries("Bahrain", "Manama","Bahrain, which means “two seas,” is an archipelago in the Persian Gulf off the coast of Saudi Arabia.");
        cList.add(countries);
        countries = new Countries("Bangladesh", "Dhaka","The country is low-lying riverine land traversed by the many branches and tributaries of the Ganges and Brahmaputra rivers.");
        cList.add(countries);
        countries = new Countries("Barbados", "Bridgetown","An island in the Atlantic about 300 mi (483 km) north of Venezuela, Barbados is only 21 mi long (34 km) and 14 mi across (23 km) at its widest point. ");
        cList.add(countries);
        countries = new Countries("Belarus", "Minsk","Belarus is a hilly lowland with forests, swamps, and numerous rivers and lakes. There are wide rivers emptying into the Baltic and Black seas.");
        cList.add(countries);
        countries = new Countries("Belgium", "Brussels","Located in western Europe, Belgium has about 40 mi of seacoast on the North Sea, at the Strait of Dover, and is approximately the size of Maryland.");
        cList.add(countries);
        countries = new Countries("Bosnia and Herzegovina", "Sarajevo","The Bosnian region in the north is mountainous and covered with thick forests.");
        cList.add(countries);
        countries = new Countries("Botswana", "Gaborone","Twice the size of Arizona, Botswana is in south-central Africa, bounded by Namibia, Zambia, Zimbabwe, and South Africa.");
        cList.add(countries);
        countries = new Countries("Brazil", "Brasilia","Brazil covers nearly half of South America and is the continent's largest nation.");
        cList.add(countries);


        RecyclerView recyclerView = findViewById(R.id.recyclerList);
        final CountriesAdapter adapter = new CountriesAdapter(this, cList);
        recyclerView.setAdapter(adapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        SwipeHelper swipeHelper = new SwipeHelper(this, recyclerView) {
            @Override
            public void instantiateUnderlayButton(final RecyclerView.ViewHolder viewHolder, List<UnderlayButton> underlayButtons) {
                underlayButtons.add(new SwipeHelper.UnderlayButton(
                        "DELETE",
                        0,
                        Color.parseColor("#FF3C30"),
                        new SwipeHelper.UnderlayButtonClickListener() {
                            @Override
                            public void onClick(int pos) {;
                                adapter.removeItem(pos);
                            }
                        }
                ));

                underlayButtons.add(new SwipeHelper.UnderlayButton(
                        "TOAST",
                        0,
                        Color.parseColor("#FF9502"),
                        new SwipeHelper.UnderlayButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(getApplicationContext(), "Toast", Toast.LENGTH_SHORT).show();
                            }
                        }
                ));

            }
        };
    }
}
