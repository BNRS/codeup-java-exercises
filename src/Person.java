public class Person {

    //properties
    private String name;

    //constructor
    public Person(String name){
        this.name = name;
    }

    public Person(){}

    //g & s
    // returns the person's name
    public String getName() {
       return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    //methods
    // prints a message to the console using the person's name
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);

    }


    public static void main(String[] args) {

        Person p = new Person();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());


//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1);
//        System.out.println(person1 == person2);
//
//        p.setName("Ben");
//        System.out.println(p.getName());
//
//        person1.setName("James");
//        System.out.println(person1.getName());
//
//        person2.setName("Sally");
//        System.out.println(person2.getName());
//
//        p.sayHello(p.getName());
//        person1.sayHello(person1.getName());
//        person2.sayHello(person2.getName());
    }

}
