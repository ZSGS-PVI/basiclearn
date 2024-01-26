package Treeset;

import java.util.TreeSet;

public class Main {

        public void main(String[] args) {
         System.out.println("hello");
            TreeSet<Student> studentSet = new TreeSet<>();

        
            studentSet.add(new Student("kirthi", 85));
            studentSet.add(new Student("hari", 72));
            studentSet.add(new Student("kalpana", 90));
            studentSet.add(new Student("abi", 65));

       
            for (Student student : studentSet) {
                System.out.println(student);
            }
        }
}
