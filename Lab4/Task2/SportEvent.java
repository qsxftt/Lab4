package Lab4.Task2;

import java.util.Objects;

public class SportEvent extends Event {
    private String sportType;
    private double sectorCoeff;

    public SportEvent(String title, String date, String place, double ticketPrice, String sportType, double sectorCoeff) {
        super(title, date, place, ticketPrice);
        this.sportType = sportType;
        this.sectorCoeff = sectorCoeff;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public double getSectorCoeff() {
        return sectorCoeff;
    }

    public void setSectorCoeff(double sectorCoeff) {
        this.sectorCoeff = sectorCoeff;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", тип: спорт (" + sportType + "), коэффициент сектора: " + sectorCoeff;
    }

    @Override
    public double calculateTotalPrice() {
        return getTicketPrice() * sectorCoeff;
    }

    @Override
    public String toString() {
        return "SportEvent{" +
                "title='" + getTitle() + '\'' +
                ", date='" + getDate() + '\'' +
                ", place='" + getPlace() + '\'' +
                ", ticketPrice=" + getTicketPrice() +
                ", sportType='" + sportType + '\'' +
                ", sectorCoeff=" + sectorCoeff +
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
        SportEvent that = (SportEvent) other;
        return sectorCoeff == that.sectorCoeff && Objects.equals(sportType, that.sportType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sportType, sectorCoeff);
    }
}
