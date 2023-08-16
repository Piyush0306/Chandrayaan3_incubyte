package com.incubyte.chandrayaan;

import java.util.Scanner;


public class Chandrayaan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial x coordinate: ");
        int initialX = scanner.nextInt();
        System.out.print("Enter initial y coordinate: ");
        int initialY = scanner.nextInt();
        System.out.print("Enter initial z coordinate: ");
        int initialZ = scanner.nextInt();
        int[] initialPosition = {initialX, initialY, initialZ};

        System.out.print("Enter initial direction (N/S/E/W/Up/Down): ");
        String initialDirection = scanner.next().toUpperCase();

        System.out.print("Enter commands (e.g., F, B, L, R, U, D): ");
        String commandsInput = scanner.next().toUpperCase();

        String[] commands = commandsInput.split("");

        LunarSpacecraft spacecraft = new LunarSpacecraft(initialPosition, initialDirection);
        for (String command : commands) {
            switch (command) {
                case "F":
                    spacecraft.moveForward();
                    break;
                case "B":
                    spacecraft.moveBackward();
                    break;
                case "L":
                    spacecraft.turnLeft();
                    break;
                case "R":
                    spacecraft.turnRight();
                    break;
                case "U":
                    spacecraft.turnUp();
                    break;
                case "D":
                    spacecraft.turnDown();
                    break;
            }
        }

        int[] finalPosition = spacecraft.getCurrentPosition();
        String finalDirection = spacecraft.getCurrentDirection();

        System.out.println("Final Position: (" + finalPosition[0] + ", " + finalPosition[1] + ", " + finalPosition[2] + ")");
        System.out.println("Final Direction: " + finalDirection);
    }
}
