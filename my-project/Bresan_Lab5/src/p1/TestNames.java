package p1;

import java.util.Scanner;

public class TestNames {

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the first person's first name: ");
        String person1First = scan.next();
        System.out.print("Enter the first person's middle name: ");
        String person1Middle = scan.next();
        System.out.print("Enter the first person's last name: ");
        String person1Last = scan.next();
        System.out.print("Enter the second person's first name: ");
        String person2First = scan.next();
        System.out.print("Enter the second person's middle name: ");
        String person2Middle = scan.next();
        System.out.print("Enter the second person's last name: ");
        String person2Last = scan.next();
        
        Name person1 = new Name(person1First, person1Middle, person1Last);
        Name person2 = new Name(person2First, person2Middle, person2Last);
        
        System.out.println();
        System.out.println("First Person:");
        System.out.println(person1.firstMiddleLast());
        System.out.println(person1.lastFirstMiddle());
        System.out.println(person1.initials());
        System.out.println(person1.length());
        
        System.out.println();
        System.out.println("Second Person:");
        System.out.println(person2.firstMiddleLast());
        System.out.println(person2.lastFirstMiddle());
        System.out.println(person2.initials());
        System.out.println(person2.length());
        
        System.out.println();
        System.out.println("Names are the same: " + person1.equals(person2));
    }

}
