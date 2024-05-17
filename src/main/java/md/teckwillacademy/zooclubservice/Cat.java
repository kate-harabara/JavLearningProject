package md.teckwillacademy.zooclubservice;

public class Cat extends Animal {

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(this.getName() + ": The cat is speaking like: MEAW, Meaw, Meaw!");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + ": The cat is eating fish food");
    }
}

