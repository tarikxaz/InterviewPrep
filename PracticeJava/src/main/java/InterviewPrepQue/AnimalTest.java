package InterviewPrepQue;

public class AnimalTest{
    public static void main(String[] args) {
        Animal[] animals= new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Cat();
        animals[2] = new Dog();

        for (int i=0; i<animals.length; i++)
            animals[i].speak();
    }
}
