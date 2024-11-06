import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ticket=sc.nextInt();
        System.out.println(arr(ticket));
    }
    public static int arr(int ticket)
    {
        int sum=0;
        Scanner a= new Scanner(System.in);
        for(int i=1;i<=ticket;i++)
        {
          int age= a.nextInt();
          if(age>60)
          {
           sum=sum+30;
          }
          else if(age<12)
          {
            sum=sum+20;
          }
          else{
            sum=sum+50;
          }
        }
        return (sum);
    }
}
