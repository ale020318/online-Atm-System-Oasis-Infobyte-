package Atmsystem;
import java.util.Scanner;
class Transaction extends account_det
{
    void ac1trn()
    {
       System.out.println("Your Was Balance is " +b);
       
    }
    void ac2trn()
    {
       System.out.println("Your Was Balance is " +b1);
       
    }
    void ac3trn()
    {
       System.out.println("Your Was Balance is " +b2);
       
    }
    void ac4trn()
    {
       System.out.println("Your Was Balance is " +b3);
       
    }
    void ac5trn()
    {
       System.out.println("Your Was Balance is " +b4);
       
    }
    void ac6trn()
    {
       System.out.println("Your Was Balance is " +b5);
       
    }
}
class account_det
{
    
    double b = 1254000.12f;
           double sub1;
           double di;

    // 2nd one 
    double b1 = 2565000.12f;
    double sub2;
    double di1;

    //3rd one 
    double b2 = 2546000.12f;
        double sub3;
        double di2;

     //4th one
     double b3 = 2569000.12f;
        double sub4;
        double di3;

     //5th one
     double b4 = 1254000.12f;
        double sub5;
        double di4;

    // 6th one 
    double b5= 2365000.12f;
    double sub6;
    double di5;
     
    void acc1_del()
    {    
        Transaction hello1 = new Transaction();  
         Scanner ti1 = new Scanner(System.in);
           System.out.println("Please Enter The Option You Want To Process ");
           System.out.println(" 1. Transaction History ");
           System.out.println(" 2. Withdraw ");
           System.out.println(" 3. Deposit ");
           System.out.println(" 4. Tranfer ");
           System.out.println(" 5. Exit ");
           int cho1;
           
            cho1 = ti1.nextInt();
           
           switch (cho1) 
        {
            case 1:
            {
                hello1.ac1trn();
                break;
                
            }
            case 2:
            { 
                double hy1;
                double i=1254000.12f;
                System.out.println("Your current balance is " + b);
                System.out.println("enter the amount u Withdraw");
                hy1= ti1.nextDouble();
                sub1 = b-hy1;
                System.out.println(" Your current balance is " + sub1);
           

                
                break;
            }
            case 3:
           {
                double hy2;
                double p = 1254000.12f;
               
                  System.out.println("Your Current Balance is " +p);  
                  System.out.println("enter the amount u Deposit");
                  double amo = ti1.nextDouble();
                   di = amo+p;
                  System.out.println("Your current balance is " +di);
                
                
                break;
           }

            case 4:
           {

                double hy3;
                double y = 1245000.12f;
                System.out.println("Your current Balance is " +y );
                System.out.println("Enter the amount you Transfer");
                double trf = ti1.nextDouble();
                di = trf -y;
                
                break;
           }
           
           
            default:
            {
                System.out.println("enter the Right option ");
                break;
            }
        }
    

    }

    void acc2_del()
{     
    Transaction hello2 = new Transaction();
     Scanner ti2 = new Scanner(System.in);
           System.out.println("Please Enter The Option You Want To Process ");
           System.out.println(" 1. Transaction History ");
           System.out.println(" 2. Withdraw ");
           System.out.println(" 3. Deposit ");
           System.out.println(" 4. Tranfer ");
           System.out.println(" 5. Exit ");
           int cho2;
           cho2 = ti2.nextInt();
           switch (cho2) 
        {
            case 1:
            {
                hello2.ac2trn();
                break;
                
            }
            case 2:
            { 
                double hy1;
                double i=2565000.12f;
                System.out.println("Your current balance is " + b1);
                System.out.println("enter the amount u Withdraw");
                hy1= ti2.nextDouble();
                sub2 = b1-hy1;
                System.out.println(" Your current balance is " + sub2);
           

                
                break;
            }
            case 3:
           {
                double hy2;
                double p = 2565000.12f;
               
                  System.out.println("Your Current Balance is " +p);  
                  System.out.println("enter the amount u Deposit");
                  double amo = ti2.nextDouble();
                   di1 = amo+p;
                  System.out.println("Your current balance is " +di);
                
                
                break;
           }

            case 4:
           {

                double hy3;
                double y = 2565000.12f;
                System.out.println("Your current Balance is " +y );
                System.out.println("Enter the amount you Transfer");
                double trf = ti2.nextDouble();
                di1 = trf -y;
                
                break;
           }
           
           
            default:
            {
                System.out.println("enter the Right option ");
                break;
            }
        }
         
    }
    void acc3_del()
    {     
        Transaction hello3 = new Transaction();
         Scanner ti3 = new Scanner(System.in);
           System.out.println("Please Enter The Option You Want To Process ");
           System.out.println(" 1. Transaction History ");
           System.out.println(" 2. Withdraw ");
           System.out.println(" 3. Deposit ");
           System.out.println(" 4. Tranfer ");
           System.out.println(" 5. Exit ");
           int cho3;
           cho3 = ti3.nextInt();
           switch (cho3) 
           {
               case 1:
               {
                   hello3.ac3trn();
                   break;
                   
               }
               case 2:
               { 
                   double hy1;
                   double i=2546000.12f;
                   System.out.println("Your current balance is " + b);
                   System.out.println("enter the amount u Withdraw");
                   hy1= ti3.nextDouble();
                   sub3 = b3-hy1;
                   System.out.println(" Your current balance is " + sub3);
              
   
                   
                   break;
               }
               case 3:
              {
                   double hy2;
                   double p = 2546000.12f;
                  
                     System.out.println("Your Current Balance is " +p);  
                     System.out.println("enter the amount u Deposit");
                     double amo = ti3.nextDouble();
                      di3 = amo-p;
                     System.out.println("Your current balance is " +di);
                   
                   
                   break;
              }
   
               case 4:
              {
   
                   double hy3;
                   double y = 2546000.12f;
                   System.out.println("Your current Balance is " +y );
                   System.out.println("Enter the amount you Transfer");
                   double trf = ti3.nextDouble();
                   di3= trf +y;
                   
                   break;
              }
              
              
               default:
               {
                   System.out.println("enter the Right option ");
                   break;
               }
           }
    }
    void acc4_del()
    {    
        Transaction hello4 = new Transaction();
          Scanner ti4 = new Scanner(System.in);
           System.out.println("Please Enter The Option You Want To Process ");
           System.out.println(" 1. Transaction History ");
           System.out.println(" 2. Withdraw ");
           System.out.println(" 3. Deposit ");
           System.out.println(" 4. Tranfer ");
           System.out.println(" 5. Exit ");
           int cho4;
           cho4 = ti4.nextInt();
           switch (cho4) 
           {
               case 1:
               {
                   hello4.ac4trn();
                   break;
                   
               }
               case 2:
               { 
                   double hy1;
                   double i=2569000.12f;
                   System.out.println("Your current balance is " + b);
                   System.out.println("enter the amount u Withdraw");
                   hy1= ti4.nextDouble();
                   sub4 = b3-hy1;
                   System.out.println(" Your current balance is " + sub4);
              
   
                   
                   break;
               }
               case 3:
              {
                   double hy2;
                   double p = 2569000.12f;
                  
                     System.out.println("Your Current Balance is " +p);  
                     System.out.println("enter the amount u Deposit");
                     double amo = ti4.nextDouble();
                      di3 = amo+p;
                     System.out.println("Your current balance is " +di);
                   
                   
                   break;
              }
   
               case 4:
              {
   
                   double hy3;
                   double y = 2569000.12f;
                   System.out.println("Your current Balance is " +y );
                   System.out.println("Enter the amount you Transfer");
                   double trf = ti4.nextDouble();
                   di3= trf -y;
                   
                   break;
              }
              
              
               default:
               {
                   System.out.println("enter the Right option ");
                   break;
               }
           }
    }
    void acc5_del()
    {     
        Transaction hello5 = new Transaction();
          Scanner ti5 = new Scanner(System.in);
           System.out.println("Please Enter The Option You Want To Process ");
           System.out.println(" 1. Transaction History ");
           System.out.println(" 2. Withdraw ");
           System.out.println(" 3. Deposit ");
           System.out.println(" 4. Tranfer ");
           System.out.println(" 5. Exit ");
           int cho5;
           cho5 = ti5.nextInt();
           switch (cho5) 
           {
               case 1:
               {
                   hello5.ac5trn();
                   break;
                   
               }
               case 2:
               { 
                   double hy1;
                   double i=1254000.12f;
                   System.out.println("Your current balance is " + b);
                   System.out.println("enter the amount u Withdraw");
                   hy1= ti5.nextDouble();
                   sub5 = b4-hy1;
                   System.out.println(" Your current balance is " + sub5);
              
   
                   
                   break;
               }
               case 3:
              {
                   double hy2;
                   double p = 1254000.12f;
                  
                     System.out.println("Your Current Balance is " +p);  
                     System.out.println("enter the amount u Deposit");
                     double amo = ti5.nextDouble();
                      di4= amo+p;
                     System.out.println("Your current balance is " +di);
                   
                   
                   break;
              }
   
               case 4:
              {
   
                   double hy3;
                   double y = 1254000.12f;
                   System.out.println("Your current Balance is " +y );
                   System.out.println("Enter the amount you Transfer");
                   double trf = ti5.nextDouble();
                   di4= trf -y;
                   
                   break;
              }
              
              
               default:
               {
                   System.out.println("enter the Right option ");
                   break;
               }
           }
    }
    void acc6_del()
    {      
        Transaction hello6 = new Transaction();
         Scanner ti6 = new Scanner(System.in);
           System.out.println("Please Enter The Option You Want To Process ");
           System.out.println(" 1. Transaction History ");
           System.out.println(" 2. Withdraw ");
           System.out.println(" 3. Deposit ");
           System.out.println(" 4. Tranfer ");
           System.out.println(" 5. Exit ");
           int cho6;
           cho6 = ti6.nextInt();
           switch (cho6) 
           {
               case 1:
               {
                   hello6.ac6trn();
                   break;
                   
               }
               case 2:
               { 
                   double hy1;
                   double i=2365000.12f;
                   System.out.println("Your current balance is " + b);
                   System.out.println("enter the amount u Withdraw");
                   hy1= ti6.nextDouble();
                   sub6 = b5-hy1;
                   System.out.println(" Your current balance is " + sub6);
              
   
                   
                   break;
               }
               case 3:
              {
                   double hy2;
                   double p = 2365000.12f;
                  
                     System.out.println("Your Current Balance is " +p);  
                     System.out.println("enter the amount u Deposit");
                     double amo = ti6.nextDouble();
                      di5 = amo+p;
                     System.out.println("Your current balance is " +di);
                   
                   
                   break;
              }
   
               case 4:
              {
   
                   double hy3;
                   double y = 2365000.12f;
                   System.out.println("Your current Balance is " +y );
                   System.out.println("Enter the amount you Transfer");
                   double trf = ti6.nextDouble();
                   di5 = trf +y;
                   
                   break;
              }
              
              
               default:
               {
                   System.out.println("enter the Right option ");
                   break;
               }
           }
    }
}

class personl_info
{
    double bn;
    String nam;
    double acc1 = 125487;
    double acc2 = 123456;
    double acc3 = 456789;
    double acc4 = 789456;
    double acc5 = 123568;
    double acc6 = 456127;
    void pername()
    {   System.out.println("--------Welcome to State Bank Of Indina--------");
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter the the name");
        nam = sc.nextLine();
        System.out.println("Enter the bank Account Nunmber ");
        bn = sc.nextDouble();

    }
    void check_name()
    {
        account_det fi = new account_det();
        if(bn==acc1)
        {
           System.out.println("Welcome " +nam+ "To State Bank Of Indina");
           System.out.println("Your Account Number is " +bn);
           fi.acc1_del();

        }
        if(bn==acc2)
        {
           System.out.println("Welcome " +nam+ "To State Bank Of Indina");
           System.out.println("Your Account Number is " +bn);
           fi.acc2_del();

        }
        if(bn==acc3)
        {
           System.out.println("Welcome " +nam+ "To State Bank Of Indina");
           System.out.println("Your Account Number is " +bn);
           fi.acc3_del();

        }
        if(bn==acc4)
        {
           System.out.println("Welcome " +nam+ "To State Bank Of Indina");
           System.out.println("Your Account Number is " +bn);
           fi.acc4_del();

        }
        if(bn==acc5)
        {
           System.out.println("Welcome " +nam+ "To State Bank Of Indina");
           System.out.println("Your Account Number is " +bn);
           fi.acc5_del();

        }
        if(bn==acc6)
        {
           System.out.println("Welcome " +nam+ "To State Bank Of Indina");
           System.out.println("Your Account Number is " +bn);
           fi.acc6_del();

        }
    }
}

public class atm {
    public static void main(String[] args) {
        personl_info yri = new personl_info();
        yri.pername();
        yri.check_name();

    }
    
}
