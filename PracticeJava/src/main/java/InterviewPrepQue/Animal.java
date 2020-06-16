package InterviewPrepQue;

public class Animal {
    void speak(){
        System.out.println("speak");
    }
}
class Dog extends Animal { void speak(){
    System.out.println("woof!");
}}

class Cat extends Animal {void speak(){
    System.out.println("meow!");
}}

