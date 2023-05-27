package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int total=0;
        int[] numbers=new int[100];

        for (int i=0;i<100;i++) {
            int num=scanner.nextInt();
            if (num==0){
                break;
            }
            numbers[i] = num;
            count++;
            total = total + num;
        }
        int average=total/count;
        System.out.println(average);

    }

}