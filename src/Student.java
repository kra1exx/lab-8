public class Student extends People{
    Student(String nameP, String lastnameP, int ageP){
        super(nameP,lastnameP,ageP);}
    @Override
    void walk(){
        System.out.println("Student " + name + " does not go to school");}
    void learn(){
        System.out.println("Your " + name + " studying!");}
}