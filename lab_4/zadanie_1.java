package lab_4;

import java.util.Scanner;
public class zadanie_1 {
   public static void main(String[] args){
     int a,b,c,n;
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     if ( n < 0 || n > 2) {
        System.out.print("Решений нет"); 
     }else{
            for(int i = 1;i<100;i++){
                for(int j=1;j<100;j++){
                    for(int k=1;k<100;k++){
                        a =(int) Math.pow(i, n);
                        b =(int) Math.pow(j, n);
                        c =(int) Math.pow(k, n);
                        if (a+b == c){
                            System.out.println(i+"^"+n+"^"+"+"+j+"^"+n+"="+k+"^"+n);
                        }
          
                    }
                }
            }
        }

    sc.close();        
    }
}