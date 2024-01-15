import java.util.Scanner;
// truyền lớp Scanner từ thư viện java.ulti của Java vào dự án

// từ khóa public: quy định về khả năng truy cập của lớp trong dự án, học chi tiết ở bài 5
// từ khóa class: đánh dấu đây là 1 lớp trong Java. Các file trong dự án Java đều là 1 lớp
// Demo: tên lớp
public class Demo {
    // phương thức siêu main: public static void main (String[] args) {}
    // phương thức sẽ là phương thức đầu tiên được gọi khi chương trình Java khởi chạy
    // giúp thực thi các phần code có bên trong nó
    // psvm + phím Tab
    // main + phím Tab
    public static void main(String[] args) {
        // chương trình Java sẽ được in ra trong 1 phần gọi là console
        // dựa trên khả năng của lớp System
        // System.in: đầu vào của chương trình, nhận dữ liệu từ console
        // System.out: đầu ra của chương trình, xuất dữ liệu ra console
        // cú pháp System.out: sout + phím Tab
        System.out.println("HelloWorld");

        // clđk
        int a = 10;
        if (a < 5) {
            System.out.println("Lớn hơn");
        } else {
            System.out.println("Nhỏ hơn");
        }

        // Nhập liệu thông qua bàn phím: đầu vào chương trình
        // sử dụng đến System.in
        // Lớp Scanner: dùng để quét qua console của Java, lọc dữ liệu theo yêu cầu
        // và lấy dữ liệu đó để sử dụng
        // tạo đối tượng Scanner thì sẽ sử dụng đến System.in

        // B1: tạo đối tượng Scanner:
        System.out.println("------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        // B2: dùng phương thức để lấy dữ liệu
        // ví dụ nextInt() là lấy ra số nguyên từ bàn phím nhập vào
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập chuỗi: ");
        String str = scanner.next();
        System.out.println(number);
        System.out.println(str);
    }
}
