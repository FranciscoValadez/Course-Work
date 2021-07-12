public class tutorys 
{
    public static void main(String[] args)
    {
        String name = "wilbur";
        String color = "black";
        int age = 8;
        Dog dog2 = new Dog(name, color, age);
    }
}

class Dog
{
    String nameDog;
    String colorDog;
    int ageDog;

    public Dog (String name, String color, int age)
    {
        System.out.println("Constructor with parameters");

        nameDog = name;
        colorDog = color;
        ageDog = age;
        System.out.println(nameDog + "\t" + colorDog + "\t" + ageDog);
    }
}