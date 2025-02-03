public abstract class Animal
{
    public abstract void eat();

    public void sleep()
    {
            System.out.println("Animal is sleeping");
    }

}

class Dog extends Animal
{
    public void eat()
    {
        System.out.println("Dog is eating");
    }
    
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.eat();
    }
}