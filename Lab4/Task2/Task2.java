package Lab4.Task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Описание программы: иерархия мероприятий (Event -> ConferenceEvent, ConcertEvent, SportEvent).");
        System.out.println("Формулы расчёта итоговой стоимости:");
        System.out.println("- ConferenceEvent: цена билета * количество дней + сбор за материалы");
        System.out.println("- ConcertEvent: цена билета * 1.5 (если VIP), иначе базовая цена билета");
        System.out.println("- SportEvent: цена билета * коэффициент сектора");
        System.out.println();

        Event conf = new ConferenceEvent("Java Days", "12.11.2026", "Екатеринбург", 2000, 2, 500);
        Event concert = new ConcertEvent("Рок-фест", "15.11.2026", "Теле-Клуб", 3000, "Звери", true);
        Event sport = new SportEvent("Финал кубка", "20.11.2026", "Екатеринбург Арена", 1500, "Футбол", 1.2);

        Event[] events = {conf, concert, sport};

        for (int i = 0; i < events.length; i++) {
            System.out.println(events[i].getDescription());
            System.out.println("Итоговая цена: " + events[i].calculateTotalPrice());
            System.out.println("toString: " + events[i]);
            System.out.println();
        }
    }
}
