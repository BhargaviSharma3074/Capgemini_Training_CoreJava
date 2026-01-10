import java.util.Scanner;
class Loops
{
public static void main(String[] args)
{

//while
//do while
//for
//for each

Scanner sc = new Scanner(System.in);

/*
String inp;
do
{
System.out.print("Enter a number: ");
int n = sc.nextInt();
int fact = 1;
for(int i=1;i<=n;i++)
{
fact*=i;
}
System.out.println("Factorial of "+n+" is: "+fact);
sc.nextLine();
System.out.print("Do you want to continue? (Y/N): ");
inp = sc.nextLine();
}
while (inp.equalsIgnoreCase("y"));

System.out.println("Exiting...");
*/


/*
String inp;
do
{
System.out.print("Enter the number: ");
int a = sc.nextInt();
System.out.print("Enter the exponent: ");
int b = sc.nextInt();
int ans = 1;
for(int i=1;i<=b;i++)
{
ans *= a;
}
System.out.println(a+" to the power "+b+" = "+ans);
sc.nextLine();
System.out.print("Do you want to continue? (Y/N): ");
inp = sc.nextLine();
}
while (inp.equalsIgnoreCase("y"));

System.out.println("Exiting...");
*/

//WAJP TO KEEP TAKING INPUT FROM USER UNTIL A NEGATIVE NUMBERS IS ENTERED. RETURN THE SUM OF ALL THE POSITIVE NUMBERS


//continue taking input till the sum reaches 100. print the number of inputs required for the sum to reach 100
/*
int sum = 0, count = -1;
int n;
do
{
n = sc.nextInt();
count++;
sum+=n;
}
while(sum<=100);
System.out.print("Total numbers: "+count);
*/

//keep asking for a password until the user enters the correct one with a limit of 3 attempts

/*
String correctpass = "Bhavya";
String pass;
int attempts = 0;

do
{
pass = sc.nextLine();
attempts++;
if(pass.equals(correctpass))
{
System.out.println("Correct!");
break;
}
else
{
System.out.println("Incorrect Password. Chances remaining: "+(3-attempts));
}
}
while(attempts < 3);

if(!pass.equals(correctpass))
{
System.out.println("Sorry, start all over!");
}
*/


//find the sum of digits of a number
/*
System.out.print("Enter a number: ");
int n = sc.nextInt();
int sum = 0;
while(n>1)
{
sum += n%10;
n/=10;
}
System.out.print("Sum of the digits: "+sum);
*/


//find the greatest common divisor of two numbers 
/*
System.out.print("Enter the first number: ");
int n = sc.nextInt();
System.out.print("Enter the second number: ");
int m = sc.nextInt();
int factor = 0;
int x = (n<m) ? n : m;
for (int i=1;i<=x;i++)
{
if(n%i==0 && m%i==0)
{
factor = i;
}
}
System.out.println(factor);
*/


//wap to print and count all the numbers from 1 to 100 which are divisible by 7 or ends with 7

/*
int count = 0;
int i = 1;

while(i<=100)
{
if(i%7==0 || i%10 == 7)
{
System.out.println(i);
count++;
}
i++;
}

System.out.println("Total number: "+count);
*/


//wajp to print all the factors of a number, the number itself excluded

/*
int n = sc.nextInt();
int count = 0;
for(int i=1; i<n; i++)
{
if(n%i==0)
{
count++;
}
}
System.out.println(count);
*/

//wap to print all the terms of fibonacci series up to n

/*
int n = sc.nextInt();
int first = 0;
int second = 1;
int x = n-1;
System.out.print(first+" ");
System.out.print(second+" ");
while(x>0)
{
int next=first+second;
System.out.print(next+" ");
first=second;
second=next;
x--;
}
*/

//wap to print sum of squares of all natural nums up to 100

/*
int sum = 0;
for(int i=1; i<=100; i++)
{
sum+=(i*i);
}
System.out.println("Sum of all naturalm numbers till 100: "+sum);
*/

//wap to print sum of squares of all even natural nums up to 100
int sum = 0;
for(int i=1; i<=100; i++)
{
if(i%2==0)
{
sum+=(i*i);
}
}
System.out.println("Sum of all naturalm numbers till 100: "+sum);






























}
}