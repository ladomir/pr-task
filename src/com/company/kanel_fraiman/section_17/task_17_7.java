package com.company.kanel_fraiman.section_17;

import java.util.Scanner;

public class task_17_7 {
    /*
    Дан метод:
static int secret(int num) {
int temp;
    if(num<50){
    while(num>2)num=num-2;
    }
    else{
    while(num<lOO) num=num+2;
    }
    if(num==211 num=lOO) temp=l;
    else temp= О;
    retumtemp;
    }
            1. Что будет выведено на экран, если вызов метода выглядит следующим образом:
                    System.out.println( secret(lO))?
            Обоснуйте свой ответ.
            2. Что будет выведено на экран, если вызов метода выглядит следующим образом:
                    System.out.println( secret(S))?
            Обоснуйте свой ответ.
            3. Что будет выведено на экран, если вызов метода выглядит следующим образом:
                    System.out.println( secret(88))?
            Обоснуйте свой ответ.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a, b;

        a = scanner.nextInt();

        b = secret(a);
        System.out.println(b);
    }

    static int secret(int num) {
        int temp;
        if(num < 50){
            while(num>2) {
                num = num - 2;
            }
        }
        else {
            while(num < 100) {
                num = num + 2;
            }
        }
        if(num==2 || num==100) {
            temp = 1;
        }
        else {
            temp = 0;
        }
        return temp;
    }
}
