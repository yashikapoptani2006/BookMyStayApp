import java.util.*;

class Booking {
    int roomNumber;
    String customerName;

    Booking(int roomNumber, String customerName) {
        this.roomNumber = roomNumber;
        this.customerName = customerName;
    }
}

public class BookMyStayApp {

    static Set<Integer> bookedRooms = new HashSet<>();
    static List<Booking> bookings = new ArrayList<>();

    public static void bookRoom(int roomNumber, String name) {
        if (bookedRooms.contains(roomNumber)) {
            System.out.println("Room already booked!");
        } else {
            bookedRooms.add(roomNumber);
            bookings.add(new Booking(roomNumber, name));
            System.out.println("Room " + roomNumber + " booked for " + name);
        }
    }

    public static void showBookings() {
        for (Booking b : bookings) {
            System.out.println("Room: " + b.roomNumber + ", Name: " + b.customerName);
        }
    }

    public static void main(String[] args) {
        bookRoom(101, "Yashika");
        bookRoom(102, "Rahul");
        bookRoom(101, "Ankit"); // duplicate booking test

        System.out.println("\nAll Bookings:");
        showBookings();
    }
}