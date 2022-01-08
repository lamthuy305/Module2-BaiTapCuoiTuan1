package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[10];
        products[0] = new Product(0, "Iphone 13", 35000000, "Đẹp miễn chê");
        products[1] = new Product(1, "Iphone 12", 25000000, "Đẹp tạm tạm");
        products[2] = new Product(2, "Sony", 10000000, "Bình dân rồi");
        products[3] = new Product(3, "Sam Sung", 23000000, "Khá ổn");
        int count = 4;
        int choice = -1;

        while (choice != -0) {
            System.out.println("Menu");
            System.out.println("1. In Product");
            System.out.println("2. Thêm Product và in Product mới");
            System.out.println("3. Tìm kiếm, xóa và in Product mới");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    for (int i = 0; i < count; i++) {
                        System.out.println(products[i]);
                    }
                    break;
                }

                case 2: {
                    count = count + 1;
                    System.out.println("Nhập Product");

                    System.out.print("Id: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Price: ");
                    double price = scanner.nextDouble();

                    scanner.nextLine();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    products[count - 1] = new Product(id,name,price,description);

                    for (int i = 0; i < count; i++) {
                        System.out.println(products[i]);
                    }
                    break;
                }

                case 3: {
                    scanner.nextLine();
                    System.out.print("Nhập name Product cần xóa: ");
                    String text = scanner.nextLine();
                    int index = -1;
                    for (int i = 0; i < count; i++) {
                        if (products[i].getName().equals(text)) {
                            index = i;
                            break;
                        }
                    }

                    // Xóa phần tử

                    if (index == -1) {
                        System.out.println("Product không tồn tại trong mảng !!!");
                    } else {
                        count = count -1;
                        for (int i = index; i<= count; i++) {
                            products[i] = products[i+1];
                        }
                        for (int i = 0; i < count; i++) {
                            System.out.println(products[i]);
                        }
                    }
                    break;
                }
                case 0: {
                    System.out.println("Kết thúc !!!");
                    break;
                }
                default: {
                    System.out.println("Nhập sai !!!");
                    break;
                }
            }
        }
    }
}
