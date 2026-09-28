package ra.entity;


import java.util.Scanner;

public class Product {
    private static int autoID = 1;
    private int productID;
    private String productName;
    private float price;
    private String category;
    private int quantity;

    public Product() {
        this.productID = autoID++;
    }

    public Product(String productName, float price, String category, int quantity) {
        this.productID = autoID++;
        setProductName(productName);
        setPrice(price);
        setCategory(category);
        setQuantity(quantity);
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (Validate.validateName(productName)) {
            this.productName = productName.trim();
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (Validate.validatePrice(price)) {
            this.price = price;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (Validate.validateCategory(category)) {
            this.category = category.trim();
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (Validate.validateQuantity(quantity)) {
            this.quantity = quantity;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productID +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public void inputData(Scanner scanner) {
        while (true) {
            System.out.println("Nhập tên sản phẩm từ 10-50 ký tự, và không trùng: ");
            String inputName = scanner.nextLine();
            if (Validate.validateName(inputName)) {
                this.productName = inputName.trim();
                break;
            }
        }
        while(true){
            try{
                System.out.println("Nhập giá sản phẩm (>0): ");
                float priceInput = Float.parseFloat(scanner.nextLine());
                if(Validate.validatePrice(priceInput)){
                    this.price = priceInput;
                    break;
                }
            }catch(Exception e){
                System.out.println("Giá sản phẩm phải là số thực");
            }
        }
        while(true){
                System.out.println("Nhập loại sản phẩm (tối đa 200 ký tự): ");
                String cateInput = scanner.nextLine();
                if (Validate.validateCategory(cateInput)) {

                    this.category = cateInput.trim();
                    break;
                }
            }
        while(true){
            try{
                System.out.println("Nhập số lượng tồn kho (>=0): ");
                int quantityInput = Integer.parseInt(scanner.nextLine());
                if(Validate.validateQuantity(quantityInput)){
                    this.quantity = quantityInput;
                    break;
                }
            }catch(Exception e){
                System.out.println("Số lượng phải là số nguyên!");
            }
        }
    }
}
