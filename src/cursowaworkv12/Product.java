/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursowaworkv12;

/**
 *
 * @author ZEUS
 */
public class Product {
    int number;
    String name;
    String country;
    double price;
    Product(){};
    Product(int number, String name, String country, double price){
    this.number = number;
    this.name = name;
    this.country = country;
    this.price = price;
    };
    int getNumber(){
        return this.number;
    };
    String getName(){
    return this.name;
    };
    String getCountry(){
    return this.country;
    
    
    };
    double getPrice(){ 
    return this.price;
    };
    public static Product Product(Product aProd){
   return new Product(aProd.getNumber(), aProd.getName(), aProd.getCountry(), aProd.getPrice());
    };
    
}

