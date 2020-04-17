package Main;

import Enums.TypeOfCoffee;

public class Coffee {
    private int weight;
    private int space;
    private int cost;
    private float priceToWeight;
    private TypeOfCoffee typeOfCoffee;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getPriceToWeight() {
        return priceToWeight;
    }

    public void setPriceToWeight(float priceToWeight) {
        this.priceToWeight = priceToWeight;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public TypeOfCoffee getTypeOfCoffee() {
        return typeOfCoffee;
    }

    public void setTypeOfCoffee(TypeOfCoffee typeOfCoffee) {
        this.typeOfCoffee = typeOfCoffee;
    }
}
