import java.util.Scanner;

public class PemilihanHariDenganIf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayType;
        int dayNumber;

        System.out.println("__Day_Number_Menu__\n1. Monday\n2. Tuesday\n3. Wednesday\n4. Thursday\n5. Friday\n6. Saturday\n7. Sunday");
        System.out.print("input day number: ");
        dayNumber = sc.nextInt();
        
        if (dayNumber >=1 && dayNumber <=5)
        {
            dayType = "weekday";
        }else if(dayNumber == 6 || dayNumber == 7)
        {
            dayType = "weekend";
        }else{
            dayType = "invalid number";
        }
        System.out.println("is a " + dayType);
    }
}
