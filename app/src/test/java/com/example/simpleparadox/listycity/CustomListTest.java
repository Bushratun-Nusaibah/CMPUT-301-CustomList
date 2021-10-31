package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;



    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<>());
    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    void testHasCity(){


        //when the list has the city
        City city =  new City ("Toronto", "Ontario");
        list.addCity(city);


        assertEquals(1, list.hasCity(city));

        //when the list does not have the city
        City city_2 = new City("Montreal", "Quebec");
        assertEquals(-1, list.hasCity(city_2));
    }

    @Test
    void testDelete(){


        //adds two new cities to the list
        City city1 = new City ("Regina", "Saskatchewan");
        list.addCity(city1);


        //deletes the second city
        list.delete(city1);

        //after deleting the size of the list should be 2
        assertEquals(0, list.getCount());

    }

    @Test
    void testCountCities(){

        //adds two new cities to the list
        City city1 = new City ("Regina", "Saskatchewan");
        list.addCity(city1);


        assertEquals(1, list.countCities());
    }



}
