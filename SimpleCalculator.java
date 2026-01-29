1  import java.util.Scanner;
2
3  public class SimpleCalculator {
4      public static void main(String[] args) {
5          Scanner sc = new Scanner(System.in);
6
7          System.out.println("----- Simple Calculator -----");
8          System.out.print("Enter first number: ");
9          double num1 = sc.nextDouble();
10
11         System.out.print("Enter operator (+, -, *, /): ");
12         char operator = sc.next().charAt(0);
13
14         System.out.print("Enter second number: ");
15         double num2 = sc.nextDouble();
16
17         double result;
18
19         switch (operator) {
20             case '+':
21                 result = num1 + num2;
22                 System.out.println("Result: " + result);
23                 break;
24             case '-':
25                 result = num1 - num2;
26                 System.out.println("Result: " + result);
27                 break;
28             case '*':
29                 result = num1 * num2;
30                 System.out.println("Result: " + result);
31                 break;
32             case '/':
33                 if (num2 != 0) {
34                     result = num1 / num2;
35                     System.out.println("Result: " + result);
36                 } else {
37                     System.out.println("Error: Division by zero is not allowed.");
38                 }
39                 break;
40             default:
41                 System.out.println("Invalid operator! Please use +, -, * or /.");
42         }
43
44         sc.close();
45     }
46 }
