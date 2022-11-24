package lesson2.homework.expert;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        String str1 = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        String str2 = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        String str3 = "<client>(Какие то данные)<data></data></client>";
        String[] strArray;
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> -
        // "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> -
        // "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
        strArray = findStr(str1);
        System.out.println(Arrays.toString(strArray));
        String[] strReplace = new String[3];
        strReplace[0] = strArray[0].replaceFirst("^([0-9]{4})[0-9]{3}([0-9]{4})", "$1***$2");

        strReplace[1] = strArray[1].replaceFirst("^(\\w+([.-]?\\w+)*)(@)(\\w+)([.-]?\\w+)*(\\.\\w{2,4})", "$1$3***$6");
        System.out.println(strReplace[0]);
        System.out.println(strReplace[1]);
        //System.out.println(Arrays.toString(str));
}
    public static String[] findStr(String str) {
        String tel = "", mail = "", fio = "";
        String[] strArray = new String[3];
        Pattern p = Pattern.compile("[0-9]{11}");
        Matcher m = p.matcher(str);
        while (m.find()){
            //System.out.println(m.group());
            tel = m.group();
        }
        p = Pattern.compile("\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*\\.\\w{2,4}");
        m = p.matcher(str);
        while (m.find()){
            //System.out.println(m.group());
            mail = m.group();
        }
        String buf = "";
        String[] subStr = str.split("<data>");
        for (String sub: subStr) {
            if (!sub.contains("<client>")) {
                //System.out.println(sub);
                buf = sub;
            }
        }

      //  System.out.println(Arrays.toString(subStr));

        p = Pattern.compile("[а-яёА-ЯЁ]+\\s[а-яёА-ЯЁ]+(?:[-' ][а-яёА-ЯЁ]+)*");
        m = p.matcher(buf);
        while (m.find()){
            //System.out.println(m.group());
            fio = m.group();
        }
        strArray[0] = tel;
        strArray[1] = mail;
        strArray[2] = fio;

        return strArray;
    }
}
