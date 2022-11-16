package lesson2.homework.profi;

public class task3 {
    public static void main(String[] args) {
        // Задание №3:
        // Дано:
        boolean hasFuel = false;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.

        int countProblem = 0; //счетчик проблем
        double check = 0.0; // сумма чека
        double checkMotor = 10_000.0; // сумма за поломку двигателя
        double checkElectrics = 5_000.0; // сумма за поломку электрики
        double checkTransmission = 4_000; // сумма за поломку коробки передач
        double checkWheels = 2_000.0; // сумма за ремонт колес
        double percentTwoDetails = 0.1; // процент за 2 детали
        double percent2 = 0.2; // процент за коробку передач и, за электрику или двигатель
        String str = ""; // строка для вывода стоимости ремонта

        // считаем количество проблем и сумму чека
        if (hasElectricsProblem) {
            countProblem++;
            check += checkElectrics;
        }
        if (hasMotorProblem) {
            countProblem++;
            check += checkMotor;
        }
        if (hasTransmissionProblem) {
            countProblem++;
            check += checkTransmission;
        }
        if (hasWheelsProblem) {
            countProblem++;
            check += checkWheels;
        }

        if (!hasFuel && countProblem >= 1) {
            str = "Нет бензина и есть поломки. Консультация - бесплатно.";
        } else if (hasFuel && countProblem == 0) {
            str = "Есть бензин и нет поломок. Нужно найти поломку.";
        } else {
            if (countProblem == 1) {
                if (hasMotorProblem) {
                    str = "Поломка двигателя. Стоимость ремонта: " + check;
                } else if (hasElectricsProblem) {
                    str = "Поломка электрики. Стоимость ремонта: " + check;
                } else if (hasTransmissionProblem) {
                    str = "Поломка коробки передач. Стоимость ремонта: " + check;
                } else {
                    str = "Проблема с колесами. Стоимость ремонта: " + check;
                }
            } else if (countProblem == 2) {
                if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
                    check -= check * percent2;
                    str = "Проблема с коробкой передач и электрикой. Стоимость ремонта: " + check;
                } else {
                    check -= check * percentTwoDetails;
                    str = "Проблема в 2-х деталях. Стоимость ремонта: " + check;
                }
            } else if (countProblem > 2) {
                str = "Проблема в более 2-х деталях. Стоимость ремонта: " + check;
            }
        }
        System.out.println(str);
    }
}