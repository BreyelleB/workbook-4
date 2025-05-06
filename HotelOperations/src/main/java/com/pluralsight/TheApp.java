package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TheApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of Beds");
        int beds = scanner.nextInt();

        System.out.println("What is the Price: ");
        double price = scanner.nextDouble();

        System.out.println("Is it occupied (true/false):");
        boolean occupied = scanner.nextBoolean();

        System.out.println("Is it Dirty (true/false): ");
        boolean dirty = scanner.nextBoolean();

        Room room = new Room(beds, price, occupied, dirty);
        System.out.println("Number of rooms Avaliable: " + room.isAvaliable());

        scanner.nextLine();

        System.out.println("Room type (king/double): ");
        String roomType = scanner.nextLine();

        System.out.println("How many Nights: ");
        int nights = scanner.nextInt();

        System.out.println("Is it a Weekend (true/false): ");
        boolean weekend = scanner.nextBoolean();

        Reservation reservation = new Reservation(roomType, nights, weekend);
        System.out.println("Total Reservation: $" + reservation.getReservationsTotal());

        scanner.nextLine();

        System.out.println("Employee ID");
        String id = scanner.nextLine();

        System.out.println("Employee Name: ");
        String name = scanner.nextLine();

        System.out.println("Employee job title: ");
        String department = scanner.nextLine();

        System.out.println("What is the 1Pay rate: ");
        double rate = scanner.nextDouble();

        System.out.println("How many Hours worked: ");
        double hours = scanner.nextDouble();

        Employee employee = new Employee(id, name, department, rate, hours);
        System.out.println("Total pay: $" + employee.getTotalPay());

        scanner.close();
    }



    }

