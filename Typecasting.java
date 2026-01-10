class Typecasting
{
public static void main(String[] args)
{

System.out.println("=========================WIDENING=========================");
byte b = 100;
int i = b;
System.out.println(b);
System.out.println(i);

long l = 2000;
float f = l;
System.out.println(l);
System.out.println(f);

System.out.println("=========================NARROWING=========================");
int ni = 20; //if this value exceeds the range of byte (-128 to 127), it will return garbage value instead of error
byte nb = (byte) ni;
System.out.println(ni);
System.out.println(nb);

short s = (short) ni;
System.out.println(s);


}
}