package md.teckwillacademy.zooclubservice;

public class Dog extends Animal{

    public Dog(String dogName){
        super(dogName);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating bones");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog is making BRRR! HRRR! HRR!! Wuf Wuf!");
    }
}
