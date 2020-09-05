package com.company.kanel_fraiman.section_5;

public class task_5_4 {
    /*
    Дано логическое выражение:
    (z > x) \\ (x<O)&&(z-y>9)
    Чему равно значение этого выражения для следующих значений переменных:
    int x = -2, y = 5, z = 13;
     */
    public static void main(String[] args) {
        int x = -2, y = 5, z = 13;
        boolean a = (z > x) || (x < 0 ) && (z - y > 9);
            System.out.println(a);
    }
}
