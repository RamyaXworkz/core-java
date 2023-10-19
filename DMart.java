package com.xworkz.dmartApp.dmart;

import com.xworkz.dmartApp.product.Product;
import lombok.Setter;

import java.util.Arrays;
@Setter

public class DMart {
    Product[] product ;
    int index;
    public DMart(int size){
        product = new Product[size];
    }

    int id;
    public boolean addProduct(Product product){
        System.out.println("Invoke addProduct");
        boolean isAdded = false;
        if(product != null){
            this.setId(id++);
            this.product[index++]=product;
            isAdded = true;
        }
        return  isAdded;
    }

    public void getAllProducts(){
        System.out.println("Get all the Products");
        for (int index = 0; index < product.length; index++) {
            System.out.println(product[index].getProductId()+" "+product[index].getProductName()+" "+product[index].getQuantity()+" "+product[index].getTollFreeNo()+" "+product[index].getBatchNo()+" "+product[index].getEmail()+" "+product[index].getMfgDate()+" "+product[index].getExpDate()+" "+product[index].getPrice());
        }
    }
    public Product getProductByName(String productName){
        Product product1 = null;
        for (int index = 0; index < this.product.length; index++) {
            if (product[index].getProductName().equals(productName) ){
                product1 = product[index];
            }
        }
        return product1;
    }
    public Product getProductById(int productId){
        Product product2 = null;
        for (int index = 0; index < this.product.length; index++) {
            if ( product[index].getProductId() == productId ){
                product2 = product[index];
            }
        }
        return product2;
    }
    public String getProductNameById(int productId){
        String productName = null;
        for (int index = 0; index < this.product.length; index++)
        {
            if ( product[index].getProductId() == productId ) {
                productName = product[index].getProductName();

            }
        }
        return productName;
    }
    public  int getProductIdByName(String productName){
        int productId = 0;
        for (int index = 0; index < this.product.length; index++) {
            if (product[index].getProductName().equals(productName) ){
                productId = product[index].getProductId();

            }
        }
        return productId;
    }

    public  double getProductPriceByName(String productName){
        double productPrice = 0.0;
        for (int index = 0; index < this.product.length; index++) {
            if (product[index].getProductName().equals(productName) ){
                productPrice = product[index].getPrice();
            }
        }
        return productPrice;
    }
    public  String getProductMfgDateByName(String productName){
        String productMfgDate = null;
        for (int index = 0; index < this.product.length; index++) {
            if (product[index].getProductName().equals(productName) ){
                productMfgDate = product[index].getMfgDate();

            }
        }
        return productMfgDate;
    }
    public  String getProductExpDateByName(String productName){
        String productExpDate = null;
        for (int index = 0; index < this.product.length; index++) {
            if (product[index].getProductName().equals(productName) ){
                productExpDate = product[index].getMfgDate();
            }
        }
        return productExpDate;
    }
    public boolean updateQuanityProductName(int updatedQuantity , String exisistingProductName){
        boolean isQuantityUpdated = false ;
        for (int index = 0; index < this.product.length; index++) {
            if(product[index].getProductName().equals(exisistingProductName)){
                product[index].setQuantity(updatedQuantity);
                isQuantityUpdated = true;
            }
        }
        return isQuantityUpdated;
    }
    public void deleteProductByProductName(String productName) {
        System.out.println("invoked deleteProductByProductName");
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.product.length; index++) {
            if (product[index].getProductName() != productName) {
                product[newIndex++] = product[index];
            }
            else {
                System.out.println("Given Product Name is been deleted from the SoftwareHub");
            }
        }
        product = Arrays.copyOf(product, newIndex);
        getAllNewProduct(product);
    }
    public void getAllNewProduct(Product product[]){
        System.out.println("Get all new Product");
        for (int index = 0; index < product.length; index++) {
            System.out.println(product[index].getProductId()+" "+product[index].getProductName()+" "+product[index].getQuantity()+" "+product[index].getTollFreeNo()+" "+product[index].getBatchNo()+" "+product[index].getEmail()+" "+product[index].getMfgDate()+" "+product[index].getExpDate()+" "+product[index].getPrice());
        }
    }
}
