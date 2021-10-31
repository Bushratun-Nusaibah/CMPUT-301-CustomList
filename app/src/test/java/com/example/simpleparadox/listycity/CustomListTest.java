package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


}
