package AnimalRescue;

public class Animal {

    private String name;
    private int age;
    private int healthState;
    private int hungerLevel;
    private int happinessLevel;
    private String favoriteFOOD;
    private String favoriteActivity;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthState() {
        return healthState;
    }
    public void setHealthState(int healthState) {
        this.healthState = healthState;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }
    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public String getFavoriteFOOD() {
        return favoriteFOOD;
    }
    public void setFavoriteFOOD(String favoriteFOOD) {
        this.favoriteFOOD = favoriteFOOD;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }
    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }


    public void animalSound() {
        System.out.println("The animal makes a sound");
    }





}











