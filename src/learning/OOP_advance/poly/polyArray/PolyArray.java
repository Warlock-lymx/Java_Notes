package learning.OOP_advance.poly.polyArray;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",18);
        persons[1] = new Student("mike",20,100);
        persons[2] = new Student("smith",22,90);
        persons[3] = new Teacher("scott",28,20000);
        persons[4] = new Teacher("king",30,25000);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if(persons[i] instanceof Student){
                ((Student) persons[i]).study();
            }
            else if(persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            }
        }
    }
}
