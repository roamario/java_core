package lesson6.homework.profi;

public class ProfiTasks {
    public static void main(String[] args) {
        //Продвинутый уровень
        //Задача №1
        //1. Создать следующую структуру из классов и интерфейсов:
        // дерево -> ель (имеет шишки, умеет пахнуть)
        // дерево -> сосна (имеет шишки, умеет пахнуть)
        // растение -> роза (умеет цвести, умеет пахнуть)
        // растение -> папоротник (умеет цвести)
        // Создать у каждого класса по объекту, распределить по массивам интерфейсов
        // И у каждого массива вызвать характерный метод
        //Ожидание:
        // сосна : умеет пахнуть
        // ель : умееть пахнуть
        // роза: умееть пахнуть
        // роза: умеет цвести
        // папоротник: умеет цвести

        Rose rose = new Rose("роза");
        Fern fern = new Fern("папоротник");
        Fir fir = new Fir("ель", true);
        Pine pine = new Pine("сосна", true);

        Bloomable[] bloomables = {rose, fern};
        Smellable[] smellables = {fir, pine, rose};

        for (Smellable smell: smellables) {
            System.out.println(smell.canSmell());
        }

        for (Bloomable bloom: bloomables) {
            System.out.println(bloom.canBloom());
        }

        // Задание №2:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
    }
}