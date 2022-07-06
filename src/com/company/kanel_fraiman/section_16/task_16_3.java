package com.company.kanel_fraiman.section_16;

public class task_16_3 {
    /*
    Перед вами фрагмент класса:
        for (int i =О; i < 4; i++) {
            int s=O;
            for(int j=O; j<i ; j++)
            s=s + i + j;
                System.out.print (s);
        }
    С помощью таблицы трассировки проследите за выполнением фрагмента и запишите, что будет выведено на экран.
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
                int s = 1;
            for (int j = 0; j < i; j++) {
                s = s + i + j;
                    System.out.println(s);
            }
        }
    }
}
