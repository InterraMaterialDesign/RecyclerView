package recyclerview.materialdesign.interra.com.recyclerview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.Toast;

import java.util.ArrayList;

import static android.support.v7.widget.RecyclerView.EdgeEffectFactory.DIRECTION_LEFT;

public class ListView extends AppCompatActivity {
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
        countries = new Countries("Burkina Faso", "Ouagadougou","Slightly larger than Colorado, Burkina Faso, formerly known as Upper Volta, is a landlocked country in West Africa.");
        cList.add(countries);
        countries = new Countries("Cambodia", "Phnom Penh","Situated on the Indochinese peninsula, Cambodia is bordered by Thailand and Laos on the north and Vietnam on the east and south");
        cList.add(countries);
        countries = new Countries("Cameroon", "Yaounde","Cameroon is a Central African nation on the Gulf of Guinea, bordered by Nigeria, Chad, the Central African Republic, the Republic of Congo, Equatorial Guinea, and Gabon");
        cList.add(countries);
        countries = new Countries("Canada", "Ottawa","Covering most of the northern part of the North American continent and with an area larger than that of the United States, Canada has an extremely varied topography. In the east, the mountainous maritime provinces have an irregular coastline on the Gulf of St. Lawrence and the Atlantic. The St. Lawrence plain, covering most of southern Quebec and Ontario, and the interior continental plain, covering southern Manitoba and Saskatchewan and most of Alberta, are the principal cultivable areas. They are separated by a forested plateau rising from Lakes Superior and Huron.");
        cList.add(countries);
        countries = new Countries("Central African Republic", "Bangui","Situated about 500 mi (805 km) north of the equator, the Central African Republic is a landlocked nation bordered by Cameroon, Chad, the Sudan, the Democratic Republic of the Congo, and the Republic of Congo.");
        cList.add(countries);
        countries = new Countries("Chile", "Santiago","Situated south of Peru and west of Bolivia and Argentina, Chile fills a narrow 2,880-mi (4,506 km) strip between the Andes and the Pacific. One-third of Chile is covered by the towering ranges of the Andes.");
        cList.add(countries);
        countries = new Countries("China", "Beijing","The greater part of the country is mountainous. Its principal ranges are the Tien Shan, the Kunlun chain, and the Trans-Himalaya.");
        cList.add(countries);
        countries = new Countries("Colombia", "Bogotá","Colombia is bordered on the northwest by Panama, on the east by Venezuela and Brazil, and on the southwest by Peru and Ecuador.");
        cList.add(countries);
        countries = new Countries("Comoros", "Moroni","The Comoros Islands—Grande Comoro (Ngazidja), Anjouan, Mohéli, and Mayotte constitute an archipelago of volcanic origin in the Indian Ocean, 190 mi off the coast of Mozambique.");
        cList.add(countries);
        countries = new Countries("Costa Rica", "San Jose","This Central American country lies between Nicaragua to the north and Panama to the south.");
        cList.add(countries);
        countries = new Countries("Croatia", "Zagreb","Croatia is a former Yugoslav republic on the Adriatic Sea. It is about the size of West Virginia. Part of Croatia is a barren, rocky region lying in the Dinaric Alps.");
        cList.add(countries);
        countries = new Countries("Cuba", "Havana","This Central American country lies between Nicaragua to the north and Panama to the south.");
        cList.add(countries);
        countries = new Countries("Denmark", "Copenhagen", "Smallest of the Scandinavian countries (half the size of Maine), Denmark occupies the Jutland peninsula, a lowland area. The country also consists of several islands in the Baltic Sea");
        cList.add(countries);
        countries = new Countries("Estonia","Tallinn","Estonia is mainly a lowland country that is bordered by the Baltic Sea, Latvia, and Russia.");
        cList.add(countries);
        countries = new Countries("Ethiopia", "Addis Ababa","Ethiopia is in east-central Africa, bordered on the west by the Sudan, the east by Somalia and Djibouti, the south by Kenya, and the northeast by Eritrea.");
        cList.add(countries);
        countries = new Countries("Finland", "Helsinki","Finland is three times the size of Ohio. It is heavily forested and contains thousands of lakes, numerous rivers, and extensive areas of marshland.");
        cList.add(countries);
        countries = new Countries("Gabon", "Libreville","This West African country with the Atlantic as its western border is also bounded by Equatorial Guinea, Cameroon, and the Congo.");
        cList.add(countries);
        countries = new Countries("Gambia", "Banjul","Situated on the Atlantic coast in westernmost Africa and surrounded on three sides by Senegal, Gambia is twice the size of Delaware.");
        cList.add(countries);
        countries = new Countries("Ghana","Accra","A West African country bordering on the Gulf of Guinea, Ghana is bounded by Côte d'Ivoire to the west, Burkina Faso to the north, Togo to the east, and the Atlantic Ocean to the south.");
        cList.add(countries);
        countries = new Countries("Haiti", "Port-au-Prince","Haiti, in the West Indies, occupies the western third of the island of Hispaniola, which it shares with the Dominican Republic. ");
        cList.add(countries);
        countries = new Countries("Iceland", "Reykjavik","Iceland, an island about the size of Kentucky, lies in the north Atlantic Ocean east of Greenland and just touches the Arctic Circle.");
        cList.add(countries);
        countries = new Countries("Jamaica", "Kingston","Jamaica is an island in the West Indies, 90 mi (145 km) south of Cuba and 100 mi (161 km) west of Haiti. By area it is the third largest island in the Caribbean. ");
        cList.add(countries);
        countries = new Countries("Kiribati", "Tarawa","Kiribati, formerly the Gilbert Islands, consists of three widely separated main groups of southwest Pacific islands: the Gilberts on the equator, the Phoenix Islands to the east, and the Line Islands farther east.");
        cList.add(countries);
        countries = new Countries("Lebanon", "Beirut","Lebanon lies at the eastern end of the Mediterranean Sea, north of Israel and west of Syria.");
        cList.add(countries);
        countries = new Countries("Liechtenstein", "Vaduz","Tiny Liechtenstein, not quite as large as Washington, DC, lies on the east bank of the Rhine River, south of Lake Constance, between Austria and Switzerland");
        cList.add(countries);
        countries = new Countries("Madagascar", "Antananarivo","Madagascar lies in the Indian Ocean off the southeast coast of Africa opposite Mozambique.");
        cList.add(countries);
        countries = new Countries("Malawi", "Lilongwe","Malawi is a landlocked country about the size of Pennsylvania. Located in southeast Africa, it is surrounded by Mozambique, Zambia, and Tanzania. Lake Malawi, formerly Lake Nyasa, occupies most of the country's eastern border.");
        cList.add(countries);
        countries = new Countries("Malaysia", "Kuala Lumpur","Malaysia is on the Malay Peninsula in southeast Asia. The nation also includes Sabah and Sarawak on the island of Borneo to the east.");
        cList.add(countries);
        countries = new Countries("Marshall Islands", "Majuro","The Marshall Islands, east of the Carolines, are divided into two chains: the western, or Ralik, group, including the atolls Jaluit, Kwajalein, Wotho, Bikini, and Eniwetok; and the eastern, or Ratak, group, including the atolls Mili, Majuro, Maloelap, Wotje, and Likiep.");
        cList.add(countries);
        countries = new Countries("Moldova", "Chisinau","Moldova (formerly Moldavia) is a landlocked republic of hilly plains lying east of the Carpathian Mountains between the Prut and Dniester (Dnestr) rivers.");
        cList.add(countries);
        countries = new Countries("Montenegro", "Podgorica","Montenegro, a jumbled mass of mountains, with a small coastline along the Adriatic, borders Albania, Bosnia and Herzegovina, and Serbia.");
        cList.add(countries);
        countries = new Countries("Morocco", "Rabat","Morocco lies across the Strait of Gibraltar on the Mediterranean and looks out on the Atlantic from the northwest shoulder of Africa.");
        cList.add(countries);
        countries = new Countries("Nepal", "Kathmandu","A landlocked country the size of Arkansas, lying between India and the Tibetan Autonomous Region of China, Nepal contains Mount Everest (29,035 ft; 8,850 m), the tallest mountain in the world");
        cList.add(countries);
        countries = new Countries("Papua New Guinea", "Port Moresby","Papua New Guinea occupies the eastern half of the island of New Guinea, just north of Australia, and many outlying islands.");
        cList.add(countries);
        countries = new Countries("Philippines", "Manila","The Philippine islands are an archipelago of over 7,000 islands lying about 500 mi (805 km) off the southeast coast of Asia.");
        cList.add(countries);
        countries = new Countries("Romania", "Bucharest","Romania is in southeast Europe and is slightly smaller than Oregon. The Carpathian Mountains divide Romania's upper half from north to south and connect near the center of the country with the Transylvanian Alps, running east and west.");
        cList.add(countries);
        countries = new Countries("Saint Lucia", "Castries","One of the Windward Islands of the eastern Caribbean, St. Lucia lies just south of Martinique. It is of volcanic origin.");
        cList.add(countries);
        countries = new Countries("Slovakia", "Bratislava","Slovakia is located in central Europe. The land has rugged mountains, rich in mineral resources, with vast forests and pastures.");
        cList.add(countries);
        countries = new Countries("Slovenia", "Ljubljana","Slovenia occupies an area about the size of the state of Massachusetts. It is largely a mountainous republic and almost half of the land is forested, with hilly plains spread across the central and eastern regions.");
        cList.add(countries);
        countries = new Countries("Togo", "Lomé","Togo, twice the size of Maryland, is on the south coast of West Africa bordering on Ghana to the west, Burkina Faso to the north, and Benin to the east.");
        cList.add(countries);
        countries = new Countries("Tuvalu", "Funafuti","Tuvalu consists of nine small islands scattered over 500,000 sq mi of the western Pacific, just south of the equator.");
        cList.add(countries);
        countries = new Countries("Uganda", "Kampala","Uganda, twice the size of Pennsylvania, is in East Africa. It is bordered on the west by Congo, on the north by the Sudan, on the east by Kenya, and on the south by Tanzania and Rwanda.");
        cList.add(countries);
        countries = new Countries("Uruguay", "Montevideo","Uruguay, on the east coast of South America south of Brazil and east of Argentina.");
        cList.add(countries);

        final ArrayList<Countries> backUpList = new ArrayList<>();

        RecyclerView recyclerList = findViewById(R.id.recyclerList);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerList.addItemDecoration(itemDecoration);



        RecyclerView.ItemAnimator animator = new DefaultItemAnimator();
        recyclerList.setItemAnimator(animator);

        final CountriesAdapter countriesAdapter = new CountriesAdapter(this, cList);
        recyclerList.setAdapter(countriesAdapter);


        final ItemTouchHelper.Callback callback = new ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP | ItemTouchHelper.DOWN, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                final int position = viewHolder.getAdapterPosition();
                if (direction == ItemTouchHelper.LEFT) {
                    backUpList.add(0, cList.get(position));
                    cList.remove(position);
                    countriesAdapter.notifyItemRemoved(position);
                    Snackbar snackbar = Snackbar.make(getWindow().getDecorView().getRootView(), "Removed from list!", Snackbar.LENGTH_LONG);
                    snackbar.setAction("UNDO", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            cList.add(position, backUpList.get(0));
                            countriesAdapter.notifyItemInserted(position);
                            backUpList.remove(0);
                        }
                    });
                    Toast.makeText(getApplicationContext(), "Swipe Left", Toast.LENGTH_SHORT).show();
                    snackbar.setActionTextColor(Color.YELLOW);
                    snackbar.show();
                }else if (direction == ItemTouchHelper.RIGHT) {
                    backUpList.add(cList.get(position));
                    cList.remove(position);
                    countriesAdapter.notifyItemRemoved(position);
                    Toast.makeText(getApplicationContext(), "Swipe Right", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
                Bitmap icon;
                if (actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {
                    View view = viewHolder.itemView;
                    Paint paint = new Paint();
                    float height = view.getBottom() - view.getTop();
                    float width = height/3;

                    //right
                    if (dX < 0) {
                        paint.setColor(getResources().getColor(R.color.red));
                        RectF background = new RectF((float) view.getRight() + dX,  (float)view.getTop(), (float) view.getRight(), (float) view.getBottom());
                        c.drawRect(background, paint);
                        icon = BitmapFactory.decodeResource(getResources(), R.mipmap.archive_foreground);
                        RectF icon_dest = new RectF((float)view.getRight() - 2*width, (float) view.getTop() + width, (float)view.getRight() - width, (float) view.getBottom() - width);
                        c.drawBitmap(icon, null, icon_dest, paint);
                    }
                    //left
                    else {
                        paint.setColor(getResources().getColor(R.color.green));
                        RectF background = new RectF((float) view.getLeft(), (float)view.getTop(), dX, view.getBottom());
                        c.drawRect(background, paint);
                        icon = BitmapFactory.decodeResource(getResources(), R.mipmap.delete_image_foreground);
                        RectF icon_dest = new RectF((float) view.getLeft() + width, (float) view.getTop() + width, (float) view.getLeft() + 2*width, (float) view.getBottom() - width);
                        c.drawBitmap(icon, null, icon_dest, paint);
                    }

                    final float alpha = 1.0f - Math.abs(dX) / (float) viewHolder.itemView.getWidth();
                    viewHolder.itemView.setAlpha(alpha);
                    viewHolder.itemView.setTranslationX(dX);
                }
                else {
                    super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
                }
            }
            private int convertDpToPx(int dp) {
                return Math.round(dp * (getResources().getDisplayMetrics().xdpi / DisplayMetrics.DENSITY_DEFAULT));
            }
        };


        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(recyclerList);


    }


}

/*
ItemTouchHelper.Callback simpleCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT |ItemTouchHelper.LEFT) {
            private boolean swipeBack = false;
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                int position = viewHolder.getAdapterPosition();
                countriesArrayList.remove(position);
                adapter.notifyItemRemoved(position);
            }
            @Override
            public int convertToAbsoluteDirection(int flags, int layoutDirection) {
                if (swipeBack) {
                    swipeBack = false;
                    return 0;
                }
                return super.convertToAbsoluteDirection(flags, layoutDirection);
            }

            @Override
            public void onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {

                if (actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {
                    Paint p = new Paint();
                    Bitmap icon;
                    View view = viewHolder.itemView;
                    float height = view.getBottom() - view.getTop();
                    float width = height/3;
                    if (dX < 0) {
                        p.setColor(getResources().getColor(R.color.red));
                        RectF background = new RectF((float) view.getRight() + dX, (float)view.getTop(), (float) view.getRight(), (float) view.getBottom());
                        c.drawRect(background, p);
                        icon = BitmapFactory.decodeResource(getResources(), R.mipmap.delete_image_foreground);
                        RectF icon_dest = new RectF((float)view.getRight() - 2*width, (float) view.getTop() + width, (float)view.getRight() - width, (float) view.getBottom() - width);
                        c.drawBitmap(icon, null, icon_dest, p);
                        p.setTextSize(23);
                        String text = "DELETE";
                        p.setColor(Color.WHITE);
                        c.drawText(text, view.getRight() - 225, view.getTop() + view.getHeight() / 2 + 10, p);
                    }
                    else {
                        p.setColor(getResources().getColor(R.color.green));
                        RectF background = new RectF((float) view.getLeft(), (float)view.getTop(), dX, (float) view.getBottom());
                        c.drawRect(background, p);
                        icon = BitmapFactory.decodeResource(getResources(), R.mipmap.archive_foreground);
                        RectF icon_dest = new RectF((float) view.getLeft() + width, (float) view.getTop() + width, (float) view.getLeft() + 2*width, (float) view.getBottom() - width);
                        c.drawBitmap(icon, null, icon_dest, p);
                        p.setTextSize(23);
                        String text = "ARCHIVE";
                        p.setColor(Color.WHITE);
                        c.drawText(text, view.getLeft() + 150, view.getTop() + view.getHeight() / 2 + 10, p);
                    }
                    final float alpha = 1.0f - Math.abs(dX) / (float) viewHolder.itemView.getWidth();
                    viewHolder.itemView.setAlpha(alpha);
                    viewHolder.itemView.setTranslationX(dX);
                } else {
                    super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
                }
            }
        };
        ItemTouchHelper touchHelper = new ItemTouchHelper(simpleCallback);
        touchHelper.attachToRecyclerView(recoView);
*/