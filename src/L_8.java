public class L_8 {
    public static void main(String[] args) {
        People people =  new People("Alisa","Morozova",20);
        people.walk();
        people.run();
        people.voice();
        Student student = new Student("Maksim","Maksimov",18);
        student.walk();
        student.learn();
        Teacher teacher = new Teacher("Artem","Borisov",50);
        teacher.voice();
        teacher.teach();}
}