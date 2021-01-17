import java.util.Scanner;
public class Hello {
    public static void main(String[] args){
      System.out.println("Hello world!");
      double studentGPA = 3.45;
      String name = "Lil wayne";
      String Hero = "Spider man";
      System.out.println(name);
      System.out.println(studentGPA);
      //using indexes with strings !
        char lol = name.charAt(0);
        System.out.println(lol);
      //concating strings
        System.out.println("Student name is "+name+" and his hero is "+Hero);
      // input output
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println("Student GPA become : " + studentGPA);
        int i = 0;
        while (i<5){
            System.out.println(i);
            i++;
        }

    }
}
