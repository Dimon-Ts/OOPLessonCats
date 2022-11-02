public class Cat {
    String name;
    int age;
    Cat(String name,int age){
        this.name = name;
        this.age = age;
    }

    void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня зовут "+ name + " ! ");
        System.out.println("Мне " + age + " лет.");
    }
}
