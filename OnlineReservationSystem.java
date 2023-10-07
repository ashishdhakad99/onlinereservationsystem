
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Reservation {
    private String name;
    private int numberOfPeople;
    private String date;

    public Reservation(String name, int numberOfPeople, String date) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getDate() {
        return date;
    }
}

class ReservationSystem {
    private List<Reservation> reservations;

    public ReservationSystem() {
        reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public void displayReservations() {
        for (Reservation reservation : reservations) {
            System.out.println("Name: " + reservation.getName());
            System.out.println("Number of People: " + reservation.getNumberOfPeople());
            System.out.println("Date: " + reservation.getDate());
            System.out.println("------------------------");
        }
    }
}

public class OnlineReservationSystem {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Reservation");
            System.out.println("2. Remove Reservation");
            System.out.println("3. Display Reservations");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter number of people: ");
                    int numberOfPeople = scanner.nextInt();
                    System.out.print("Enter date: ");
                    String date = scanner.next();

                    Reservation reservation = new Reservation(name, numberOfPeople, date);
                    reservationSystem.addReservation(reservation);
                    System.out.println("Reservation added successfully!");
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String removeName = scanner.next();
                    System.out.print("Enter date: ");
                    String removeDate = scanner.next();

                    Reservation removeReservation = null;
                    
                    if (removeReservation != null) {
                        reservationSystem.removeReservation(removeReservation);
                        System.out.println("Reservation removed successfully!");
                    } else {
                        System.out.println("Reservation not found!");
                    }
                    break;
                case 3:
                    reservationSystem.displayReservations();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
