package Lab4.Task4;

import Lab4.Task2.ConferenceEvent;
import Lab4.Task2.ConcertEvent;
import Lab4.Task2.Event;
import Lab4.Task2.SportEvent;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Описание расчёта: программа складывает итоговую стоимость (calculateTotalPrice) всех мероприятий в массиве");

        Event[] events = new Event[6];
        events[0] = new ConferenceEvent("Java Day", "10.11.2026", "Технопарк", 2000, 2, 500);
        events[1] = new ConferenceEvent("AI Forum", "15.11.2026", "Конгресс-холл", 3000, 3, 1000);
        events[2] = new ConcertEvent("Рок-вечер", "20.11.2026", "Клуб Арена", 1500, "КиноТрибьют", false);
        events[3] = new ConcertEvent("Симфония", "25.11.2026", "Филармония", 2500, "Оркестр", true);
        events[4] = new SportEvent("Футбол", "01.12.2026", "Стадион", 1000, "Футбол", 1.2);
        events[5] = new SportEvent("Хоккей", "05.12.2026", "Ледовый дворец", 1200, "Хоккей", 1.5);

        double totalSum = 0;

        for (int i = 0; i < events.length; i++) {
            System.out.println("--- Мероприятие " + (i + 1) + " ---");
            System.out.println("Объект (toString): " + events[i]);
            System.out.println("Описание: " + events[i].getDescription());
            double price = events[i].calculateTotalPrice();
            System.out.println("Итоговая цена: " + price);
            totalSum = totalSum + price;
        }

        System.out.println("================================");
        System.out.println("Общая стоимость всех мероприятий: " + totalSum);
    }
}
