package zadanie1;

import java.util.Comparator;

public class Car implements Comparable<Car>{

    private String model;
    private int yearOfProduction;

    public Car(String model, int yearOfProduction){
        this.setModel(model);
        this.setYearOfProduction(yearOfProduction);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Car car) {
        return this.getYearOfProduction();
    }

    public static Comparator<Car> carComparator = (c1, c2) -> {

        Integer car1 = c1.getYearOfProduction();
        Integer car2 = c2.getYearOfProduction();

        return car1.compareTo(car2);
    };

    @Override
    public String toString(){
        return "model: " + this.getModel() + " rok produkcji: " + this.getYearOfProduction();
    }
}


