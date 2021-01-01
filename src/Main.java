import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ProductManager productManager = new ProductManager();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("menu");
            System.out.println("1. thêm sản phẩm");
            System.out.println("2. hiện thị ");
            System.out.println("3. nhập ID sản phẩm cần sửa");
            System.out.println("4. tìm kiếm sản phẩm theo ID");
            System.out.println("5. sắp xếp tăng dần theo giá");
            System.out.println("0. nhập choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số lượng sản phẩm");
                    int number=Integer.parseInt(scanner.nextLine());
                    for (int i=0; i<number;i++){
                        addProduct();
                    }
                    break;
                case 2:
                    productManager.disPlayAll();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("rời khỏi trương trình");
                    System.exit(0);
                    break;

            }

        } while (choice != 0);


    }

    public static void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập mã sản phẩm ");
        String sourceId = sc.nextLine();
        System.out.println("nhập giá sản phẩm ");
        int price = scanner.nextInt();
        Product product = new Product(name, sourceId, price);
        productManager.addProduct(sourceId,product);


    }
}
