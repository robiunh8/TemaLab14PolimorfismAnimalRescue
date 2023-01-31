package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

       Dog dog= new Dog();

        dog.setName("dog");
        dog.setAge(1);
        dog.setFavoriteActivity("Running in the park");
        dog.setFavoriteFOOD("bones");
        dog.setHappinessLevel(10);
        dog.setHungerLevel(5);
        dog.setHealthState(10);
        System.out.println("The animal's name is: "+ dog.getName());
        System.out.println("It has "+ dog.getAge() +" year");
        System.out.println("It's health state is "+ dog.getHealthState());
        System.out.println("On a scale from 1 to 10 it's hunger level is: "+ dog.getHungerLevel());
        System.out.println("It's happiness level is: "+ dog.getHappinessLevel());
        System.out.println("It's favorite food is "+ dog.getFavoriteFOOD());
        System.out.println(dog.getFavoriteActivity() +" is it's favorite activity");

        dog.animalSound();


        Fetita gesi= new Fetita();

        gesi.setNameofAdopter("Gesi");
        gesi.setMoneyforanimal(150);
        System.out.println(dog.getName() +" is adopted by "+gesi.getNameofAdopter());
        System.out.println(gesi.getNameofAdopter()+" paid "+gesi.getMoneyforanimal()+"lei for it's vaccination");

        gesi.likes();

        FoodForDog foodForDog= new FoodForDog();

        foodForDog.setFoodAvailable(18);
        foodForDog.setPriceOfFood(10);
        foodForDog.setQuantityOfFood(20);
        foodForDog.setNameOfAnimalFood("kibble");
        System.out.println("It ate a little bowl of "+ foodForDog.getNameOfAnimalFood() +" today");
        System.out.println("The price for a bag of "+ foodForDog.getNameOfAnimalFood() +" is "+ foodForDog.getPriceOfFood() +" lei");
        System.out.println("There are "+ foodForDog.getQuantityOfFood());
        System.out.println("The remainder of "+ foodForDog.getNameOfAnimalFood() +" is "+ foodForDog.getFoodAvailable());
foodForDog.foodlike();

        RecActivityforDog recActForDog= new RecActivityforDog();

        recActForDog.setNameofRecActivity("going for a walk");
        System.out.println("Tomorrow it is "+ recActForDog.getNameofRecActivity());
recActForDog.activityForAnimal();

        Veterinarian vet= new Veterinarian();
        vet.setVetSpecialty("nutrition");
        vet.setNameOfVet("Bob");

        System.out.println("The vet's name is "+ vet.getNameOfVet());
        System.out.println("His specialty is in "+ vet.getVetSpecialty());
        vet.takescare();
    }
}
