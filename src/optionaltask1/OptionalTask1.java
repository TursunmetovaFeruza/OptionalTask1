
package optionaltask1;
import java.util.Scanner;
import java.util.Random;
public class OptionalTask1 {

  
    public static void main(String[] args) {
      /*Optional task 1.1
          Приветствовать любого пользователя при вводе его имени через командную строку.
        */ 
        Scanner sc=new Scanner(System.in);
        System.out.println("First task");
        System.out.print("Enter your name: ");
        String name= sc.next();
        System.out.println("Hello "+name+"!");
        System.out.println("");
/*Optional task 1.2
         Отобразить в окне консоли аргументы командной строки в обратном порядке.
        */
        System.out.println("Second task");
        System.out.print("Enter string: ");
        String s=sc.next();
        char[] b=s.toCharArray();
        for (int i=b.length-1;i>=0;i--) {
            System.out.print(b[i]); 
        }
        System.out.println("");
/*OptioanalTask3
        Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        */
        System.out.println("Third task");
        Random n=new Random();
        int arr[] = new int [10];
        for (int i = 0; i < 10; i++) {
            arr[i] = n.nextInt(6)+1;
            System.out.println("arr["+i+"]= "+arr[i]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
/*OptionalTask4
          Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) 
          и вывести результат на консоль.
        */
        System.out.println("Fourth task");
        System.out.println("Enter numbers: ");
        int a[]= new int [5];
        int sum=0;
        int com=1;
        for (int i = 0; i <a.length; i++) {
            a[i]=sc.nextInt();
            sum=sum+a[i];
            com=com*a[i];
        }
        System.out.println("Sum = "+sum);
        System.out.println("Com = "+com);
    }
    
}
