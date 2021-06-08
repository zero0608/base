import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String args[]) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<guest> guests = new ArrayList<guest>();
        do {
            System.out.println("_______________MENU_______________");
            System.out.println("1. Thêm một khach");
            System.out.println("2. Hiển thị danh sách các khach.");
            System.out.println("0. Thoát khỏi ứng dụng.");
            System.out.println("Bạn chọn ? ");
            choice = scanner.nextInt();

            scanner.nextLine();// doc bo dong chua lua chon
            switch (choice) {
                case 0:
                    System.out.println("_____________________________________________");
                    System.out.println("Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi!");
                    break;
                case 1:
                    String fullName, address, phoneNumber;
                    float moneyNumber, discountNumber, taxNumber;
                    System.out.println("Nhập tên khách: ");
                    fullName = scanner.nextLine();
                    System.out.println("Nhập địa chỉ: ");
                    address = scanner.nextLine();
                    System.out.println("Nhập SĐT: ");
                    phoneNumber = scanner.nextLine();
                    System.out.println("Nhập giá tiền: ");
                    moneyNumber = scanner.nextFloat();
                    System.out.println("Nhập triết khấu: ");
                    discountNumber = scanner.nextFloat();
                    System.out.println("Nhập thuế: ");
                    taxNumber = scanner.nextFloat();
                    guest k1 = new guest(fullName, address, phoneNumber, moneyNumber, discountNumber, taxNumber);
                    guests.add(k1);
                    break;
                case 2:
                    for (guest kk : guests) {
                        System.out.println("================");
                        System.out.println(kk.toString());
                        System.out.println("Giá tiền cuối là: " + kk.CalculateTheAmount());
                        System.out.println("================");
                    }
            }

        } while (choice != 0);
    }
}