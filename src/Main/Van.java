package Main;

import Comparators.CompareByPriceToWeight;
import Enums.TypeOfCoffee;
import Enums.TypeOfSearch;

import java.util.ArrayList;

public class Van {
    private ArrayList<Coffee> coffees = new ArrayList<Coffee>();
    private int totalSpace=0;
    private int totalCost=0;

    public void addCoffee(int cost, int weight, int space, TypeOfCoffee type) {
        Coffee coffee = new Coffee();
        coffee.setCost(cost);
        coffee.setSpace(space);
        coffee.setTypeOfCoffee(type);
        coffee.setWeight(weight);
        coffee.setPriceToWeight((float) cost / weight);
        totalCost += cost;
        totalSpace += space;
    }

    public void sortByPriceToWeight() {
        coffees.sort(new CompareByPriceToWeight());
    }
    public void printList()
    {
        for (Coffee coffee:coffees) {
            System.out.print(coffee.getCost());
            System.out.print(coffee.getWeight());
            System.out.print(coffee.getPriceToWeight());
            System.out.print(coffee.getSpace());
            System.out.print(coffee.getTypeOfCoffee());
        }
    }

    public Coffee searchByParameter(TypeOfSearch typeOfSearch,TypeOfCoffee type) {
        Coffee temp = null;
        for (Coffee coffee : coffees) {
            if (coffee.getTypeOfCoffee() == type) temp = coffee;
        }
        return temp;
    }
    public Coffee searchByParameter(TypeOfSearch typeOfSearch,float leftRange,float rightRange)
    {
        Coffee temp = null;
        switch (typeOfSearch)
        {
            case COST:
                for (Coffee coffee : coffees) {
                    if (coffee.getCost()>=leftRange && coffee.getCost()<=rightRange) temp = coffee;
                }
                break;
            case WEIGHT:
                for (Coffee coffee : coffees) {
                    if (coffee.getWeight()>=leftRange && coffee.getWeight()<=rightRange) temp = coffee;
                }
                break;
            case SPACE:
                for (Coffee coffee : coffees) {
                    if (coffee.getSpace()>=leftRange && coffee.getSpace()<=rightRange) temp = coffee;
                }
                break;
            case PRICETOWEIGHT:
                for (Coffee coffee : coffees) {
                    if (coffee.getPriceToWeight()>=leftRange && coffee.getPriceToWeight()<=rightRange) temp = coffee;
                }
                break;
            default:
                break;
        }
        return temp;
    }
}
