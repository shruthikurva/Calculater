import java.util.Scanner; 
public class calculater {
    public static void main(String[] args) {
    int num1,num2;
    Scanner scanner =new Scanner(System.in); 
    System.out.println("enter the number") ;
    num1 = scanner.nextInt();
    num2 = scanner.nextInt();
    
    System.out.println("enter the operator(+,-,*,/);");
    char op=scanner.next().charAt(0);
    int a=0;
    switch (op){ 
   
    case '+':
       a=num1+num2;
       break;

    case '-':
       a=num1-num2;
       break;
    case '*':
       a=num1*num2;
       break;
   
    case '/' :
       a=num1/num2;
       break;
    default:
     System.out.println("you enter wronge input");
     
  } 
    System.out.println("The final result:");
    System.out.println();
    System.out.println(num1+""+op+""+num2
                    +"="+a);
                    scanner.close();

  }
}
    

