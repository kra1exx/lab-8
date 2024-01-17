public class People {
    protected String name;
    protected String lastname;
    protected int age;
    People(){
        name = "Alisa";
        lastname = "Alisa";
        age = 20;}
    People(String nameP, String lastnameP, int ageP){
        name = nameP;
        lastname = lastnameP;
        age = ageP;}
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';}
    void walk(){
        System.out.println(name + " is walks");}
    void voice(){
        System.out.println(name + " is sings");}
    void run(){
        System.out.println(name + " is running");}
}