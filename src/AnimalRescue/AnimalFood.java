package AnimalRescue;

public class AnimalFood {
    private String nameOfAnimalFood;
    private int priceOfFood;
    private int quantityOfFood;
    private int foodAvailable;


    public String getNameOfAnimalFood() {
        return nameOfAnimalFood;
    }

    public void setNameOfAnimalFood(String nameOfAnimalFood) {
        this.nameOfAnimalFood = nameOfAnimalFood;
    }

    public int getPriceOfFood() {
        return priceOfFood;
    }

    public void setPriceOfFood(int priceOfFood) {
        this.priceOfFood = priceOfFood;
    }

    public int getQuantityOfFood() {
        return quantityOfFood;
    }

    public void setQuantityOfFood(int quantityOfFood) {
        this.quantityOfFood = quantityOfFood;
    }

    public int getFoodAvailable() {
        return foodAvailable;
    }

    public void setFoodAvailable(int foodAvailable) {
        this.foodAvailable = foodAvailable;
    }

    public void foodlike(){
        System.out.println("The animal likes this food");
    }
}



