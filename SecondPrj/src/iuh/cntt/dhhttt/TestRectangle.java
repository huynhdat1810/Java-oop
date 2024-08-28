package iuh.cntt.dhhttt;

import java.util.Scanner;

/**
 * Lớp kiểm thử chứa phương thức main để minh họa việc sử dụng lớp Rectangle.
 */
public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị chiều dài và chiều rộng
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // Tạo đối tượng Rectangle
        try {
            Rectangle rectangle = new Rectangle(length, width);

            // In ra thông tin hình chữ nhật
            System.out.println(rectangle.toString());
            System.out.println("Perimeter: " + rectangle.getPerimeter());
            System.out.println("Area: " + rectangle.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

