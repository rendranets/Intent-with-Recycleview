package com.dicoding.medicinal_plants;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.dicoding.medicinal_plants.adapter.ListPlantAdapter;
import com.dicoding.medicinal_plants.model.Plant;
import com.dicoding.medicinal_plants.model.PlantsData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPlants;
    private ArrayList<Plant> list = new ArrayList<>();


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.icAbout:
                Intent intent = new Intent(this, AboutActivity.class);
                this.startActivity(intent);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlants = findViewById(R.id.rv_plants);
        rvPlants.setHasFixedSize(true);

        list.addAll(PlantsData.getListData());
        showRecyclerList();


    }

    private void showRecyclerList(){
        rvPlants.setLayoutManager(new LinearLayoutManager(this));
        ListPlantAdapter listPlantAdapter = new ListPlantAdapter(list);
        rvPlants.setAdapter(listPlantAdapter);

        listPlantAdapter.setOnItemClickCallback(new ListPlantAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Plant data) {
                showSelectedPlant(data);
            }


        });
    }


    private void showSelectedPlant(Plant plant) {
        Toast.makeText(this, "Kamu memilih " + plant.getName(), Toast.LENGTH_SHORT).show();

        Intent descriptionActivity = new Intent(MainActivity.this, DescriptionActivity.class);
        descriptionActivity.putExtra(DescriptionActivity.ExtraName, plant.getName());
        descriptionActivity.putExtra(DescriptionActivity.ExtraLatinName, plant.getLatin_name());
        descriptionActivity.putExtra(DescriptionActivity.ExtraDescription, plant.getDetail());
        descriptionActivity.putExtra(DescriptionActivity.ExtraDescription2, plant.getDetail2());
        descriptionActivity.putExtra(DescriptionActivity.ExtraImage, plant.getPhoto());
        descriptionActivity.putExtra(DescriptionActivity.ExtraLink, plant.getLink());
        startActivity(descriptionActivity);
    }


}
