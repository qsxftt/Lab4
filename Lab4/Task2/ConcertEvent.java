package Lab4.Task2;

import java.util.Objects;

public class ConcertEvent extends Event {
    private String artist;
    private boolean vip;

    public ConcertEvent(String title, String date, String place, double ticketPrice, String artist, boolean vip) {
        super(title, date, place, ticketPrice);
        this.artist = artist;
        this.vip = vip;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String getDescription() {
        String vipText;
        if (vip) {
            vipText = "да";
        } else {
            vipText = "нет";
        }
        return super.getDescription() + ", тип: концерт, исполнитель: " + artist + ", VIP: " + vipText;
    }

    @Override
    public double calculateTotalPrice() {
        if (vip) {
            return getTicketPrice() * 1.5;
        }
        return getTicketPrice();
    }

    @Override
    public String toString() {
        return "ConcertEvent{" +
                "title='" + getTitle() + '\'' +
                ", date='" + getDate() + '\'' +
                ", place='" + getPlace() + '\'' +
                ", ticketPrice=" + getTicketPrice() +
                ", artist='" + artist + '\'' +
                ", vip=" + vip +
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
        ConcertEvent that = (ConcertEvent) other;
        return vip == that.vip && Objects.equals(artist, that.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), artist, vip);
    }
}
