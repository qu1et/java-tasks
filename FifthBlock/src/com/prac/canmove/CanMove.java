package com.prac.canmove;

import java.util.Scanner;

public class CanMove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the chess piece");
        String chessPiece = scanner.nextLine();

        System.out.println("Enter current position");
        String start = scanner.nextLine();

        System.out.println("Enter destination position");
        String destination = scanner.nextLine();

        System.out.println(canMove(chessPiece, start, destination));
    }

    public static boolean canMove(String shape, String start, String dest) {
        int stNum = Character.getNumericValue(start.charAt(1));
        int destNum = Character.getNumericValue(dest.charAt(1));
        char stCol = start.charAt(0);
        char destCol = dest.charAt(0);
        boolean res;

        if (stNum > 8 || stNum < 1 || destNum > 8 || destNum < 1) {
            return false;
        } else if (stCol < 65 || stCol > 72 || destCol < 65 || destCol > 72) {
            return false;
        }

        switch (shape) {
            case "Pawn", "Пешка" -> res = stCol == destCol && Math.abs(stNum - destNum) == 1;
            case "Knight", "Конь" -> res = Math.abs(stCol - destCol) == 1 && Math.abs(stNum - destNum) == 2;
            case "Bishop", "Слон" -> res = Math.abs(stCol - destCol) == Math.abs(stNum - destNum);
            case "Rook", "Ладья" -> res = stCol == destCol || stNum == destNum;
            case "Queen", "Ферзь" -> {
                int dx = Math.abs(stNum - destNum);
                int dy = Math.abs(stCol - destCol);
                res = (dx == dy || dx == 0 || dy == 0);
            }
            case "King", "Король" -> {
                int ddx = Math.abs(stNum - destNum);
                int ddy = Math.abs(stCol - destCol);
                res = (Math.abs(ddx - ddy) <= 1);
            }
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        }

        return res;
    }
}
