import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());

    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(list.getCount(),listSize+1);

    }

    @Test
    public void deleteCityTest(){
        City city = new City("Vancouver","BC");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));

    }
    @Test
    public void countCities(){
        list.addCity(new City("Halifax","NS"));
        list.addCity(new City("Vancouver","BC"));
        list.addCity(new City("Edmonton","AB"));
        assertEquals(list.countCity(),3);
    }
}
