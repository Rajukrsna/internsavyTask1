import java.util.*;
class temperatureConverter
{
    
public static void main(String[] args) {
    
 float n1;
    float n2;
    int a;

    float calc=0;
    
    do{
Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Type of Conversion that You want to make");
    System.out.println("Enter 1 for converting Celcius to Farenhiet");
    System.out.println("Enter 2  for conversion of Farenheit to Celcious");
    System.out.println("Enter 3 To Exit");
 System.out.println("Enter Your Choice: -");
    a=sc.nextInt();
    
    if(a==1){//Celcious to farenheit conversion
        System.out.println("enter the Celcuis temperature");
        Scanner sc1=new Scanner(System.in);
        n1=sc1.nextFloat();
        calc=(n1*9/5)+32;
        System.out.println("Farenheit value is:- "+calc);
    }
    else if(a==2){//farenheit to celcuis conversion
        System.out.println("enter the farenheit temperature");
        Scanner s=new Scanner(System.in);
        n2=s.nextFloat();
        calc=(n2-32)*5/9;
        System.out.println("Celcius Value is:- "+calc );
    }
    else if(a==3){
        System.out.println("GOODbye Have a Nice day");
    }
}while(a!=3);
        
}//END OF THE FUNCTION

}





