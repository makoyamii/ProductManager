import java.util.Scanner;

public class LinkedListDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object
        SinglyLinkedList<Product> list = new SinglyLinkedList<Product>();
        boolean cont = true;

        System.out.println("________________________________");
        while (cont) {

            System.out.println(
                    "Operations on list\n1. Make Empty\n2. Find ID\n3. Insert At Front\n4. Delete From Front\n5. Delete ID\n6. Print All Records\n7. Done");
            System.out.println("Your choice: ");
            int num = scan.nextInt();

            switch (num) {
                case 1: // make empty
                    list.makeEmpty();
                    System.out.println("List emptied\n");
                    break;
                case 2: // find id
                    System.out.println("Enter ID No: ");
                    int id = scan.nextInt();
                    Product temp = list.findID(id);
                    if (temp != null) {
                        temp.printID();
                    } else {
                        System.out.println("ID not found.");
                    }

                    break;
                case 3: // insert at front
                    System.out.println("Inserting new product.\nEnter Product ID: ");
                    int pid = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Product name: ");
                    String pName = scan.nextLine();
                    System.out.println("Enter Supplier name: ");
                    String sName = scan.nextLine();

                    Product product = new Product(pid, pName, sName);
                    if (list.insertAtFront(product)) {
                        System.out.println("Product Added");
                    } else {
                        System.out.println("Product already exists.");
                    }
                    break;

                case 4: // delete from front
                    Product delete = list.deleteFromFront();
                    if (delete != null) {
                        delete.printID();
                        System.out.println("First item deleted");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 5: // delete id
                    System.out.println("Enter ID to delete: ");
                    int del = scan.nextInt();
                    Product deleteID = list.delete(del);
                    if (deleteID != null) {
                        System.out.println("Item deleted.");
                        deleteID.printID();
                    } else {
                        System.out.println("Item not found.");
                    }

                    break;
                case 6: // print all records
                    System.out.println("Records:");
                    list.printAllRecords();
                    break;
                case 7: // done
                    cont = false;
                    System.out.println("Done.");
                    break;

                default:
                    System.out.println("Invalid Number.");
                    break;

            }
            System.out.println("________________________________");
        }

        scan.close();
    }

}
