package Revisao;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class revisaoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ex1
        for(int a = 1; a < 20; a++){
            System.out.println(a);
        }
        //ex2
        for(int b = 10; b > 1; b--){
            System.out.println(b);
        }
        //ex3
        for(int a = 0; a >= 50; a++){
            if(a % 2 == 0){
                System.out.println(a);
            }
        }
        //ex4
        System.out.println("informe a tabuada que vc quiser ");
        int f = sc.nextInt();
        for(int r = 1; r < 10; r++){
            System.out.println(f * r);
        }
        System.out.println("me informe um numero inteiro positivo");
        int number = sc.nextInt();
        for(int b = 0; b < number; b++){
            System.out.println(b + b);
        }
    }
}
