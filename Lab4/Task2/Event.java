package Lab4.Task2;

import java.util.Objects;

public class Event {
    private String title;
    private String date;
    private String place;
    private double ticketPrice;

    public Event(String title, String date, String place, double ticketPrice) {
        this.title = title;
        this.date = date;
        this.place = place;
        this.ticketPrice = ticketPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getDescription() {
        return "Событие: " + title + ", дата: " + date + ", место: " + place;
    }

    public double calculateTotalPrice() {
        return ticketPrice;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", place='" + place + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Event event = (Event) other;
        return ticketPrice == event.ticketPrice
                && Objects.equals(title, event.title)
                && Objects.equals(date, event.date)
                && Objects.equals(place, event.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, place, ticketPrice);
    }
}
