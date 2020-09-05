package com.company.kanel_fraiman.section_5;

public class task_5_2 {
    /*
    Напишите соответствующие выражения на языке Java для словесных описаний,
    приведенных в таблице (имена для переменных выберите самостоятельно):

    a Значение переменной больше 90
    b Оценка - не меньше 75
    c Разница между значениями отлична от 0
    d Значение не превышает 200
    e Значение хотя бы не больше 120
    f Значение одной переменной равно сумме значений двух других переменных
     */
    public static void main(String[] args) {
        int x = 100, y = 85, z = 15;
        boolean a = x > 90;
            System.out.println(a);
        boolean b = x >= 75;
            System.out.println(b);
        boolean c = x - y != 0;
            System.out.println(c);
        boolean d = x <= 200;
            System.out.println(d);
        boolean e = x <= 120;
            System.out.println(e);
        boolean f = x == y + z;
            System.out.println(f);
    }
}
