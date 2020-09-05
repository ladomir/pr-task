package com.company.kanel_fraiman.section_5;

public class task_5_3 {
    /*
    В приведенной ниже таблице сделайте для каждого выражения,
    команды и блока (группы команд) словесные описания.

        int x = 10, t = 10;
        boolean Equal = (x==t);

        boolean proverka = (a==b && t==z);

        boolean prover = true;
            System.out.println("Результат=" + prover);
        prover =! prover;
            System.out.println("Peзyльтaт=" + prover);
        prover =! prover;
            System.out. println("Peзyльтaт=" + prover);

        boolean check = num1 > num2;

        boolean result = ((a+b) > 100);

        boolean оk = ((a + b * 10 - 100) != 0);
     */
    public static void main(String[] args) {
        int x = 10, t = 10;
        boolean Equal = (x==t);
            System.out.println(Equal);
        // переменные x и t равны между собой

        int a = 55, b = 55, z = 10;
        boolean proverka = (a==b && t==z);
            System.out.println(proverka);
        // переменные a и b, а также переменные t и z равны между собой

        boolean prover = true; // переменная prover равно true
            System.out.println("Результат = " + prover);
        prover =! prover; // значение prover не равно значению prover
            System.out.println("Peзyльтaт = " + prover);
        prover =! prover; // значение prover не равно значению prover
            System.out. println("Peзyльтaт = " + prover);

        int num1 = 11, num2 = 10;
        boolean check = num1 > num2;
            System.out.println(check);
        // значение переменной num1 больше num1

        boolean result = ((a + b) > 100);
            System.out.println(result);
        // сумма значений a и b больше 100

        boolean ok = ((a + b * 10 - 100) != 0);
            System.out.println(ok);
        // выражение ((a + b * 10 - 100) не равно 0
    }
}
