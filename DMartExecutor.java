package com.xworkz.dmartApp;

import com.xworkz.dmartApp.dmart.DMart;
import com.xworkz.dmartApp.product.Product;
import lombok.Setter;

import java.util.Arrays;
import java.util.Scanner;


public class DMartExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the No of Products to be created");
        int size = scanner.nextInt();
        DMart dMart = new DMart(size);
        for (int index = 0; index < size; index++) {
            Product product = new Product();
            System.out.println("Enter the product name");
            product.setProductName(scanner.next());
            System.out.println("Enter the Quantity of the product");
            product.setQuantity(scanner.nextInt());
            System.out.println("Enter the Manufacture By");
            product.setMfgBy(scanner.next());
            System.out.println("Enter The Batch No");
            product.setBatchNo(scanner.next());
            System.out.println("Enter the Manufacturing Date");
            product.setMfgDate(scanner.next());
            System.out.println("Enter the Expiry Date");
            product.setExpDate(scanner.next());
            System.out.println("Enter the TollFree Number");
            product.setTollFreeNo(scanner.nextInt());
            System.out.println("Enter the Email");
            product.setEmail(scanner.next());
            System.out.println("Enter the price");
            product.setPrice(scanner.nextDouble());
            dMart.addProduct(product);
        }
        dMart.getAllProducts();
        String input = null;
        do{
            System.out.println("Press 1 : To get all Products");
            System.out.println("Press 2 : To get product by name");
            System.out.println("Press 3 : To get product by id");
            System.out.println("Press 4 : To get Product Name by id");
            System.out.println("Press 5 : To get Product id by name");
            System.out.println("Press 6 : To get Product price by name");
            System.out.println("Press 7 : To get Product manufactured date by name");
            System.out.println("Press 8 : To get Product expiry date by name");

            int options = scanner.nextInt();
            switch (options){
                case 1 :   dMart.getAllProducts();
                           break;
                case 2 :   Product product = dMart.getProductByName(scanner.next());
                    System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getQuantity()+" "+product.getTollFreeNo()+" "+product.getBatchNo()+" "+product.getEmail()+" "+product.getMfgDate()+" "+product.getExpDate()+" "+product.getPrice());
                    break;
                case 3 : Product product1 = dMart.getProductById(scanner.nextInt());
                    System.out.println(product1.getProductId()+" "+product1.getProductName()+" "+product1.getQuantity()+" "+product1.getTollFreeNo()+" "+product1.getBatchNo()+" "+product1.getEmail()+" "+product1.getMfgDate()+" "+product1.getExpDate()+" "+product1.getPrice());
                    break;
                case 4 :  String productName = dMart.getProductNameById(scanner.nextInt());
                    System.out.println(productName);
                    break;
                case 5 :  int productId = dMart.getProductIdByName(scanner.next());
                    System.out.println(productId);
                    break;
                case 6 :  double productPrice = dMart.getProductPriceByName(scanner.next());
                    System.out.println(productPrice);
                    break;
                case 7 :  String productManufacturingDate = dMart.getProductMfgDateByName(scanner.next());
                    System.out.println(productManufacturingDate);
                    break;
                case 8 :  String productExpiryDate = dMart.getProductExpDateByName(scanner.next());
                    System.out.println(productExpiryDate);
                    break;
                default:
                    System.out.println("Check the above cases");

            }
            System.out.println("Do you want to continue y/n");
            input = scanner.next();
        }while (input.equals("y"));
        System.out.println("Thank you for using our Application");
    }

}
