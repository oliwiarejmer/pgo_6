package zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarTest {
    public static void main(String [] args){

        Car [] car =  {
           new Car("Mercedes",2020),    //1
           new Car("Audi",1990),        //2
           new Car("BMW",2001),         //3
           new Car("Ford",2019),        //4
           new Car("Tesla",1823),       //5
           new Car("Lambo",1990),       //6
           new Car("Ferrari",1999),     //7
           new Car("Opel",2019),        //8
           new Car("Mazda",2018),       //9
           new Car("Toyota",2000)       //10
        };

        List<Car> cars = new ArrayList<>(Arrays.asList(car));
        cars.sort(Car.carComparator);

        for(Car c: cars){
            System.out.println(c);
        }

    }

}
