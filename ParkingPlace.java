public class ParkingPlace {
    int number;
    String isOccupied;

    public String toString() {
        return "ParkingPlace{" +
                "number = " + number +
                ", isOccupied ='" + isOccupied + '\'' +
                '}';
    }
    ParkingPlace(int number , String isOccupied){
        this.number = number;
        this.isOccupied = isOccupied;
    }
}
