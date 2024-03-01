public class Product implements IDedObject {
    int productID;
    String productName;
    String supplierName;

    // constructor
    public Product() {
        productID = 0;
        productName = "";
        supplierName = "";
    }

    // constructor
    public Product(int id, String pname, String sname) {
        productID = id;
        productName = pname;
        supplierName = sname;
    }

    // access methods
    public int getID() {
        return productID;
    }

    public String getPName() {
        return productName;
    }

    public String getSName() {
        return supplierName;
    }

    // set methods
    public void setID(int id) {
        productID = id;
    }

    public void setPName(String name) {
        productName = name;
    }

    public void setSName(String name) {
        supplierName = name;
    }

    // print
    public void printID() {
        System.out.println(productID + "\n" + productName + "\n" + supplierName + "\n");
    }

}
