package HomeWork;

public class DZ2 {
    public static void main(String[] args) {

        int i, j;
        boolean isprime;

        for (i = 2; i < 100; i++) {
            isprime = true;

            for (j = 2; j <= i / j; j++) {
                System.out.println(i + " : " + j); // вывод всего массива значений для расчета простого числа
                if ((i % j) == 0)
                    isprime = false;
            }

            if (isprime) ;
            System.out.println(i + "-простое число"); // выделение простого числа
        }

    }
}


