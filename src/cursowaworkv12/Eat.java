/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursowaworkv12;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ZEUS
 */
public class Eat extends Product{
    double fat;
    double white;
    double carbohydrates;
    boolean genMod;
    Date eatTermEnd;
    ArrayList vitaminsMas;
    Eat(){};
    Eat(int number, String name, String country, double price, double fat, double white, double carbohydrates, boolean genMod, Date eatTermEnd, ArrayList vitaminsMas){
    super(number, name, country, price);
    this.fat = fat;
    this.white = white;
    this.carbohydrates = carbohydrates;
    this.genMod = genMod;
    this.eatTermEnd = eatTermEnd;
    this.vitaminsMas = vitaminsMas;
    };
    double getFat(){
    return this.fat;
    };
    double getWhite(){
    return this.white;
    };
    double getCarbohydrates(){
    return this.carbohydrates;
    };
    boolean getGenMod(){
    return this.genMod;
    };
    Date getEatTermEnd(){
    return this.eatTermEnd;
    };
    ArrayList getVitaminsMas(){
    return this.vitaminsMas;
    };
    public static Eat Eat(Eat aEat){
   return new Eat(aEat.getNumber(), aEat.getName(), aEat.getCountry(), aEat.getPrice(),
           aEat.getFat(), aEat.getWhite(), aEat.getCarbohydrates(), aEat.getGenMod(), aEat.getEatTermEnd(), aEat.getVitaminsMas());
    }; 
}
