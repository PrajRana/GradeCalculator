import java.util.Scanner;

public class GradeCalc {
    public static String LetterGrade(int score){
        if(score>=90)
        {
            return "A";
        }
        else if(score<90 && score>=80 )
        {
            return "B";
        }
        else if(score<80 && score>=70)
        {
            return "C";
        }
        else if(score<70 && score>=60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

    public void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your exam score: ");
        int n= Integer.parseInt(sc.nextLine());

        while(n>100 && n<=0){
            System.out.println("invalid input, enter again: ");
            n= Integer.parseInt(sc.nextLine());
        }
        System.out.println(LetterGrade(n));
    }

}
