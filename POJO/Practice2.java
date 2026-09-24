package POJO;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int objectCount=scan.nextInt();
        scan.nextLine();
        Product[] prdAr=new Product[objectCount];
        System.out.println("Enter the product Details!!!!");
        for(int i=0;i< prdAr.length;i++){
            prdAr[i]=new Product();
            String data=scan.nextLine();
            String[] prdData=data.split(" ");
            prdAr[i].setProductId(Integer.parseInt(prdData[0]));
            prdAr[i].setProductName(prdData[1]);
            prdAr[i].setProductPrice(Double.parseDouble(prdData[2]));
            prdAr[i].setProductQuality(Float.parseFloat(prdData[3]));
        }
        System.out.println("Product Details!!!!");
        for(int i=0;i< prdAr.length;i++){
            System.out.println((i+1)+"st Product Id :"+prdAr[i].getProductId());
            System.out.println((i+1)+"st Product Name :"+prdAr[i].getProductName());
            System.out.println((i+1)+"st Product Price :"+prdAr[i].getProductPrice());
            System.out.println((i+1)+"st Product Quality :"+prdAr[i].getProductQuality());
        }
    }
}
class Product{
    private int productId;
    private  String productName;
    private  double productPrice;
    private  float productQuality;
    // Zero Parameterized Constructor
    public Product() {
    }
    //  Parameterized Constructor
    public Product(int productId,String productName,double productPrice,float productQuality) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuality= productQuality;
    }
    // Setter
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public void setProductQuality(float productQuality) {
        this.productQuality = productQuality;
    }

// Getter
    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public float getProductQuality() {
        return productQuality;
    }












}
