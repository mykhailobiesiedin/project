public class Main {
    public static void main(String[] args) {

       ParkingPlace ParkingPlace = new ParkingPlace(1 , " not occupied");
//       ParkingPlace.isOccupied = " not occupied";

        ParkingPlace ParkingPlace2 = new ParkingPlace(2, " is occupied");
//        ParkingPlace2.isOccupied = " is occupied";

        ParkingPlace ParkingPlace3 = new ParkingPlace(3, " is occupied");
//        ParkingPlace3.isOccupied = " not occupied";

        System.out.println(ParkingPlace);
        System.out.println(ParkingPlace2);
        System.out.println(ParkingPlace3);
    }
}