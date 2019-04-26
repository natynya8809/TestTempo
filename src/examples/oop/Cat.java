package examples.oop;

public class Cat {
    String name;
    String color;

   private int age;

   static int someValue = 444;

   public int getAge() {
       return age;
   }
   public void setAge (int age) {

    }

public Cat (String name, String color, int age) {
    this.name = name;
    this.color= color;
    if (age<0) {
        this.age= 0;
    } else {
    }
    this.age = age;
}
public Cat () {}
    String meow() {
        return (" MEOW! I am " + name + " with " + color + " color. And I am " + age + " years old ");
    }

    void eat(String food, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("I'm eating " + food + "...");
        }

    }
}
