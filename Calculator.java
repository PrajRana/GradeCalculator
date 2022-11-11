import java.util.Scanner;

public class Calculator {

        public static String LetterGrade(int score){
            if(score>=90)
            {
                return "A";
            }
            if(score<90 && score>=80 )
            {
                return "B";
            }
            if(score<80 && score>=70)
            {
                return "C";
            }
            if(score<70 && score>=60)
            {
                return "D";
            }
            if(score<60)
            {
                return "F";
            }
            return null;
        }

        public static void main(String[] Args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your exam score: ");
            int n= Integer.parseInt(sc.nextLine());

            while(n>100 || n<=0){
                System.out.println("invalid input, enter again: ");
                n= Integer.parseInt(sc.nextLine());
            }
            System.out.println(LetterGrade(n));
        }

}


