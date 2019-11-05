package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chiều cao: ");
        int height = scanner.nextInt();
        System.out.print("Nhập vào chiều rộng: ");
        int width = scanner.nextInt();

        Rectangle rect = new Rectangle(width, height);
        System.out.println(rect.display());
        System.out.printf("Diện tích hình chữ nhật là %d", rect.getArea());
        System.out.printf("\nChu vi hình chữ nhật là %d", rect.getPerimeter());
    }
}
