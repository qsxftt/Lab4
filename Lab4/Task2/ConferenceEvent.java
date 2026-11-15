package Lab4.Task2;

import java.util.Objects;

public class ConferenceEvent extends Event {
    private int days;
    private double materialsFee;

    public ConferenceEvent(String title, String date, String place, double ticketPrice, int days, double materialsFee) {
        super(title, date, place, ticketPrice);
        this.days = days;
        this.materialsFee = materialsFee;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getMaterialsFee() {
        return materialsFee;
    }

    public void setMaterialsFee(double materialsFee) {
        this.materialsFee = materialsFee;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", тип: конференция, дней: " + days + ", доплата за материалы: " + materialsFee;
    }

    @Override
    public double calculateTotalPrice() {
        return getTicketPrice() * days + materialsFee;
    }

    @Override
    public String toString() {
        return "ConferenceEvent{" +
                "title='" + getTitle() + '\'' +
                ", date='" + getDate() + '\'' +
                ", place='" + getPlace() + '\'' +
                ", ticketPrice=" + getTicketPrice() +
                ", days=" + days +
                ", materialsFee=" + materialsFee +
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
        if (!super.equals(other)) {
            return false;
        }
        ConferenceEvent that = (ConferenceEvent) other;
        return days == that.days && materialsFee == that.materialsFee;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), days, materialsFee);
    }
}
