package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City newCity = new City("Estevan", "SK");
        list.addCity(newCity);
        assertTrue(list.hasCity(newCity));
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        City newCity = new City("Calgary", "AB");
        list.addCity(newCity);
        assertTrue(list.hasCity(newCity));
        list.deleteCity(newCity);
        assertEquals(list.getCount(), listSize);
    }

    @Test
    public void countCitiesTest(){
        list = MockCityList();
        assertEquals(0, list.countCities());
        City city1 = new City("Brampton", "ON");
        City city2 = new City("Surrey", "BC");
        list.addCity(city1);
        assertEquals(1, list.countCities());
        list.addCity(city2);
        assertEquals(2, list.countCities());

    }

}
