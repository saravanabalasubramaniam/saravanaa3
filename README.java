import java.io.*;
import java.util.*;
public class Main
{
public static void main(String[] args)
{
int c=0;
Scanner a=new Scanner(System.in);
int b=a.nextInt();
while(b!=0)
{
b=b/10;
c=c+1;
}
System.out.println(c);
}}
