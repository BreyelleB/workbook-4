package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TheApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of Beds you need");
        int beds = scanner.nextInt();

        System.out.println("What is the Price: ");
        double price = scanner.nextDouble();

        System.out.println("Is it occupied (true/false):");
        boolean occupied = scanner.nextBoolean();

        System.out.println("Is it Dirty (true/false): ");
        boolean dirty = scanner.nextBoolean();

        Room room = new Room(beds, price, occupied, dirty);
        System.out.println("Number of rooms Avaliable: " + room.isAvailable());

        System.out.println("\nChecking guest in........");
        if (room.checkIn()) {
            System.out.println("Guest was chceked in successfully");
        } else {
            System.out.println("Room is not available for check-in.");
        }

        System.out.println("\nChecking guest out.......");
        if (room.checkOut()) {
            System.out.println("Guest checked out.");
        }else {
            System.out.println("Room was not occupied");
        }
        System.out.println("\nCleaning the room.........");
        if (room.cleanRoom()) {
            System.out.println("Room cleaned and reaady.");
        }else {
            System.out.println("Room cannot be cleaned right now");
        }

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

        System.out.println("What is the Pay rate: ");
        double rate = scanner.nextDouble();

        System.out.println("How many Hours worked: ");
        double hours = scanner.nextDouble();

        Employee employee = new Employee(id, name, department, rate, hours);
        System.out.println("Total pay: $" + employee.getTotalPay());

        scanner.close();
    }



    }

