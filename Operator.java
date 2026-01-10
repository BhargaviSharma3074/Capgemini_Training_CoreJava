class Operator
{
public static void main(String[] args)
{
int a = 10;
int b = 2;

//ARITHMETIC OPERATOR
System.out.println("===============ARITHMETIC OPERATORS===============");


System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);

//RELATIONAL OPERATOR
System.out.println("===============RELATIONAL OPERATORS===============");


//It is used to perform operations like >,<,>=,<=,==,!=
//The input of relational operators will always be binary
//The output of relational operators will always be a Boolean value.

System.out.println(a>b);
System.out.println(a<b);
System.out.println(a<=b);
System.out.println(a>=b);
System.out.println(a==b);
System.out.println(a!=b);

//LOGICAL OPERATOR

System.out.println("===============LOGICAL OPERATORS===============");

String brand = "Zara";
int price = 1500;
char size = 'M';
String color = "Red";

boolean res = (brand=="Zara" && price <=5000 && size=='M' && color=="Red");
boolean res1 = (brand=="H&M" || price <=2000 || size=='M' || color=="Black");

System.out.println(res);
System.out.println(res1);

//CONDITIONAL OPERATOR
System.out.println("===============CONDITIONAL OPERATOR===============");

//boolean result = (condition) ? (IF TRUE)Statement1 : (IF FALSE)Statement2;

//Program to check if the person is eligible to vote or not
int age = 17;
//boolean result = (age>=18) ? true : false;
String result = (age>=18) ? "Can Vote" : "Can not Vote";
System.out.println(result);


//Program to check if the person is rich or not. If balance > 100000, return rich. 
int balance = 500000;

String res2 = (balance>=100000) ? "You are rich" : "You are not rich";
System.out.println(res2);

//Program to check which number is greater among the two numbers
int num1 = 10;
int num2 = 60;
String res3 = (num1>num2) ? "num1 is greater than num2" : "num2 is greater than num1";
System.out.println(res3);

//Program to check which number is greatest among the three numbers
int x = 10;
int y = 60;
int z = 12;
int greatest = (x>y) ? ((x>z) ? x : z) : ((y>z) ? y : z);
System.out.println(greatest + " is the greatest integer");

//ASSIGNMENT OPERATOR
System.out.println("===============ASSIGNMENT OPERATOR===============");
int bal = 500;
System.out.println(bal);


//COMPOUND ASSIGNMENT OPERATOR
System.out.println("===============COMPOUND ASSIGNMENT OPERATOR===============");
bal = bal+500;
System.out.println(bal);


//byte first = 10;
//byte second = 20;
//Adding the 'final' keyword informs the compiler that the value will remain unchanged and the compiler allows the operation without any error (AS LONG AS THE SUM IS >-128 && <127)
final byte first = 10;
final byte second = 30;
byte sum = first + second;
System.out.println(sum);


//INCREMENT OPERATOR
System.out.println("===============INCREMENT OPERATOR===============");

/*

PRE INCREMENT -> ++var
~ First of all we will increment the value of the variable by 1.
~ THEN we will use the updated value.

POST INCREMENT -> var++
~ First we will use the value.
~ THEN we will increment the value by 1.

*/

int d = 10;
System.out.println("d before increment: "+d);
int e = ++d;
System.out.println("d after increment(++d): "+d);
System.out.println("e: "+e);

int f = 10;
System.out.println("f before increment: "+f);
int g = f++;
System.out.println("f after increment(f++): "+f);
System.out.println("g: "+g);


//DECREMENT OPERATOR
System.out.println("===============DECEREMENT OPERATOR===============");

/*

PRE DECREMENT -> --var
~ First of all we will decrement the value of the variable by 1.
~ THEN we will use the updated value.

POST DECREMENT -> var--
~ First we will use the value.
~ THEN we will decrement the value by 1.

*/

int h = 10;
System.out.println("h before decrement: "+h);
int i = --h;
System.out.println("h after decrement(--h): "+h);
System.out.println("i: "+i);

int j = 10;
System.out.println("j before decrement: "+j);
int k = j--;
System.out.println("j after decrement(j--): "+j);
System.out.println("k: "+k);


}
}