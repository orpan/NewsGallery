package com.helloworld.tarjinder.newsgallery;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
//Declaration
    Toolbar toolbar;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawerLayout;
    ListView lvlanguagedrawer,lvnewspaperdrawer;
    int position;
    String[] language,newspaper;
    TextView tvnewspaperlist;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        //ListView
        lvlanguagedrawer = (ListView) findViewById(R.id.navlist);
        //Text View
        tvnewspaperlist =(TextView)findViewById(R.id.tvnewspaperlist);
        //Get Array Items
        language= getResources().getStringArray(R.array.language);
        newspaper=getResources().getStringArray(R.array.newspaper);

        lvlanguagedrawer.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        //lvnewspaperdrawer.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        //Array adapter
        ArrayAdapter<String> adapterlanguage = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,language); // AcTIVATED_1 retains selection
        //ArrayAdapter<String> adapternewspaper = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_2,newspaper); // AcTIVATED_1 retains selection
        lvlanguagedrawer.setAdapter(adapterlanguage);
        //lvnewspaperdrawer.setAdapter(adapternewspaper);
        lvlanguagedrawer.setOnItemClickListener(this);
        //lvnewspaperdrawer.setOnItemClickListener(this);
       // toolbar.setNavigationIcon(R.drawable.drwer);
       // toolbar.setNavigationContentDescription("Navigation icon");



        //Drawer
         drawerLayout= (DrawerLayout) findViewById(R.id.drawerlayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.opendrawer,R.string.closedrawer);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);


    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id)
        {
            case R.id.action_settings:

                Toast.makeText(this, "Settings clicked ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_search:
                Toast.makeText(this, "Search clicked " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_account:
                Toast.makeText(this, "Account clicked " , Toast.LENGTH_SHORT).show();
                break;

        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }else if(id==android.R.id.home)
            if(drawerLayout.isDrawerOpen(lvlanguagedrawer)){
                drawerLayout.closeDrawer(lvlanguagedrawer);
            }else
                drawerLayout.openDrawer(lvlanguagedrawer);

        return super.onOptionsItemSelected(item);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i) {
            case 0:

                toolbar.setTitle( language[i]+ " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);
                tvnewspaperlist.setText("Newspapers");
                Toast.makeText(this,newspaper[i],Toast.LENGTH_SHORT).show();

                break;
            case 1:

                toolbar.setTitle(language[i]+" newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 2:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 3:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 4:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 5:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 6:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 7:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 8:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 9:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 10:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 11:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
            case 12:

                toolbar.setTitle(language[i] + " newspapers");
                drawerLayout.closeDrawer(lvlanguagedrawer);

                break;
        }
    }
}
