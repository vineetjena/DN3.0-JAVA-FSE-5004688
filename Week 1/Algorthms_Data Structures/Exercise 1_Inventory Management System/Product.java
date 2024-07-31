public class Product {
  private String productId;
  private String productName;
  private int quantity;
  private int price;

  public Product(String productId, String productName, int quantity, int price) {
    this.productId = productId;
    this.productName = productName;
    this.quantity = quantity;
    this.price = price;
  }

  // Getters and setters
  public String getProductId() {
    return productId;
  }

  public String getProductName() {
    return productName;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getPrice() {
    return price;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product ID: " + productId + "\nName: " + productName + "\nQuantity: " + quantity + "\nPrice: Rs "
        + price + "\n";
  }
}