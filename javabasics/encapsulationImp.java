public class encapsulationImp
{
    private String name;
    private int age;


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }


    public static void main(String []args)
    {
        encapsulationImp enc= new encapsulationImp();
        enc.setAge(22);
        enc.setName("raj");
        System.out.println(enc.getAge()+" "+ enc.getName());
        System.out.println("Hello");
    }
}