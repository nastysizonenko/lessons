public class ClassesAndObjects {
    public static void main(String[] args){
    Person person1 = new Person();
    person1.name = "Boba";
    person1.age = 50;
    person1.speak();
    person1.sayBue();
       // System.out.println("My name "+person1.name+" age: "+person1.age);
    Person person2 = new Person();
    person2.name ="Tolla";
    person2.age = 70;
    person2.speak();//вызов метода
    person2.sayBue();
    }
}

class Person{
    //у класса мoгут быть:данные(поля) и
    // действия, которые он может совершать(методы)
    String name;
    int age;
    void speak(){//методы
        for(int i=0;i<3;i++) {
            System.out.println("My name: " + name + ",age: " + age);
        }
    }
    void sayBue(){
        System.out.println("Bue!"+" "+name);
    }

}
