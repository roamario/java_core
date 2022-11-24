package lesson2.homework.profi;

public class Task1 {
    public static void main(String[] args) {
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String str1 = "234";
        String str2 = "some_text";
        int a = Integer.parseInt(str1); // 234 - тип int
        a += str2.length(); // 234 + 9 = 243
        System.out.println(a);
    }
}
