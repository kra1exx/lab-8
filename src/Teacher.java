public class Teacher extends People{
    Teacher(String nameP, String lastnameP, int ageP){
        super(nameP,lastnameP,ageP);}
    @Override
    void voice(){
        System.out.println("Teacher " + name + " tells a lecture");}
    void teach(){
        System.out.println("Your " + name + " teach a lesson");}
}