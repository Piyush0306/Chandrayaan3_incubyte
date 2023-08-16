package com.incubyte.chandrayaan;

class LunarSpacecraft {
    private int[] currentPosition;
    private String currentDirection;

    public LunarSpacecraft(int[] initialPosition, String initialDirection) {
        currentPosition = initialPosition.clone();
        currentDirection = initialDirection;
    }

    private void adjustPosition(int xChange, int yChange, int zChange) {
        currentPosition[0] += xChange;
        currentPosition[1] += yChange;
        currentPosition[2] += zChange;
    }

    public void moveForward() {
        switch (currentDirection) {
            case "N":
                adjustPosition(0, 1, 0);
                break;
            case "S":
                adjustPosition(0, -1, 0);
                break;
            case "E":
                adjustPosition(1, 0, 0);
                break;
            case "W":
                adjustPosition(-1, 0, 0);
                break;
        }
    }

    public void moveBackward() {
        switch (currentDirection) {
            case "N":
                adjustPosition(0, -1, 0);
                break;
            case "S":
                adjustPosition(0, 1, 0);
                break;
            case "E":
                adjustPosition(-1, 0, 0);
                break;
            case "W":
                adjustPosition(1, 0, 0);
                break;
        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case "N":
                currentDirection = "W";
                break;
            case "W":
                currentDirection = "S";
                break;
            case "S":
                currentDirection = "E";
                break;
            case "E":
                currentDirection = "N";
                break;
        }
    }

    public void turnRight() {
        switch (currentDirection) {
            case "N":
                currentDirection = "E";
                break;
            case "E":
                currentDirection = "S";
                break;
            case "S":
                currentDirection = "W";
                break;
            case "W":
                currentDirection = "N";
                break;
        }
    }

    public void turnUp() {
        if (currentDirection.equals("N")) {
            currentDirection = "Up";
            currentPosition[2]++;
        } else if (currentDirection.equals("S")) {
            currentDirection = "Down";
            currentPosition[2]--;
        }
    }

    public void turnDown() {
        if (currentDirection.equals("Up")) {
            currentDirection = "N";
            currentPosition[2]--;
        } else if (currentDirection.equals("Down")) {
            currentDirection = "S";
            currentPosition[2]++;
        }
    }

    public int[] getCurrentPosition() {
        return currentPosition;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }
}
