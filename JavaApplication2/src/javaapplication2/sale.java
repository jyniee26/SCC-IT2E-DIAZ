package javaapplication2;

import java.util.Scanner;

public class sale {
    public void get_sales(){
        Scanner input = new Scanner(System.in);
        
        sales sell = new sales();
        
        String name, product_name;
        double qty, price, cash, total;
        
        System.out.print("Enter Customer Name: ");
        name = input.nextLine();
        System.out.print("Enter Product Name: ");
        product_name = input.nextLine();
        System.out.print("Enter Quantity: ");
        qty = input.nextFloat();
        System.out.print("Enter Price: ");
        price = input.nextFloat();
                
        total = price * qty;
        
        do{
            System.out.print("Enter Cash: ");
            cash = input.nextFloat();
            if(cash < total){
                System.out.println("Cash Insufficient.");
            }
        }while(cash < total);
        
        sell.addSale(name, product_name, qty, price, cash, total);
        sell.viewReceipt();
        
    }
}