package com.example.simpleparadox.listycity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities){
        super(context,0, cities);
        this.cities = cities;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    public int getCount(){
        return cities.size();
    }

    public void addCity(City city){
        cities.add(city);
    }

    /**
     * This method checks if a given city is in the list
     * @param city
     * @return 1 if found, otherwise, returns -1
     */
    public int hasCity (City city){

        if (cities.contains(city)){
            return 1;
        }
        else {
            return -1;
        }

    }

    /**
     * Check if a city is present in the list.
     * If it does then remove it from the list,
     * if not then throw an exception
     * @param city
     */

    public void delete (City city) {
        cities.remove(city);
    }

    /**
     * counts number of cities in the list
     * @return the number of items in the city list
     */
    public int countCities(){
        return cities.size();
    }




}
