package box;

import java.util.ArrayList;

public class Hero {
    public String name;
    public int age;
    public String specialpower;
    public String weakness;
    public int Id;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String specialpower, String weakness){
        this.name = name;
        this.age = age;
        this.specialpower = specialpower;
        this.weakness = weakness;
        instances.add(this);
        this.Id = instances.size();
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSpecialpower(){
        return this.specialpower;
    }
    public String getWeakness(){
        return this.weakness;
    }
    public static ArrayList<Hero> getAllInstances(){
        return instances;
    }
    public int getId(){
        return this.Id;
    }
    public static Hero findById(int id) {
        return instances.get(id-1);
    }
    public static Hero newHeroSet() {
        return new Hero("Ange",25,"helping","nervous");
    }

}
