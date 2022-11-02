public class Cat {
    String name;
    String breed;
    int age;
    Cat(String name,String breed,int age){
        this.name = name;
        this.breed = breed;
        this.age = age;

    }


    void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня зовут "+ name  + " ! ");
        System.out.println("Я " + breed + " кот.");
        System.out.println("Мне " + age + " лет.");
    }
}
