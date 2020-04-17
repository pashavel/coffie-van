package Comparators;

import Main.Coffee;

import java.util.Comparator;
public class CompareByPriceToWeight implements Comparator<Coffee> {


    @Override
    public int compare(Coffee coffee1, Coffee coffee2) {
        return (int) (coffee1.getPriceToWeight()-coffee2.getPriceToWeight());
    }
}
