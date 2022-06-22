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