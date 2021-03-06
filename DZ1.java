//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

package HomeWork;

public class DZ1 {
    public static void main(String[] args) {


        //   int n = 10;                                      //1 Вариант
        //   double[] array = new double[n];
        //  for (int i = 0; i < array.length; i++) {
        //      array[i] = Math.random();

        double[] array = new double[10];                    //2 вариант
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();

            System.out.println(array[i]);                   // Вывод элементов массива - справочно
        }


        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }

        System.out.println("максимальное значение = " + max);           //вывод значений
        System.out.println("минимальное значение = " + min);
        System.out.println("среднее значение = " + avg);

    }
}

// А вот как это на Python - Преподаватель, простите меня !

//  import random as rnd
//  lst = [rnd.random() for _ in range(10)]
//  print(F'Минимальное значение {min(lst)}, максимальное значение {max(lst)}, среднее значение {sum(lst)/len(lst)}')
