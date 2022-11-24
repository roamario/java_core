package Lesson4.Homework;

import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;

public class ProfiTasks {
    public static void main(String[] args) {
        //Продвинутый
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        int count = 0;

        while(result < 1_000_000){
            if (result < 0) {
                break;
            }
            result += increment;
            count++;
        }
        System.out.printf("%d\n", count);

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый
        // четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        Integer[] array = {1, 1, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if(i % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15

        Integer[] ar1 = {1,2,5,7,10};
        Integer[] ar2 = {2,3,2,17,15};

        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        Integer[] ar3 = new Integer[ar1.length*3];
        for (int i = 0; i < ar1.length; i++) {
            ar3[i] = ar1[i];
            ar3[i+ ar1.length] = ar2[i];
            ar3[i + 2*ar1.length ] = ar1[i] * ar2[i];
        }
        System.out.println(Arrays.toString(ar3));

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов

        String s = "Hello world!";
        String s1 = s.replace("l", "r").toUpperCase();
        System.out.println(s1.substring(0,8));

    }
}
