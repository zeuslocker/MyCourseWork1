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
public class Electronic extends Product{
    Date grantyTermEnd;
    double masa;
    double[] gabarits;
    ArrayList complectMas;
    Electronic(){};
    Electronic(int number, String name, String country, double price, double[] gabarits, Date grantyTermEnd, double masa, ArrayList complectMas){
    super(number, name, country, price);
    this.grantyTermEnd = grantyTermEnd;
    this.masa = masa;
    this.gabarits = gabarits;
    this.complectMas = complectMas;
    };
    Date getSimpleDateFormat(){
    return this.grantyTermEnd;
    };
    double[] getGabarits(){
        return this.gabarits;
    }
    double getMasa(){
    return this.masa;
    };
    ArrayList getcomplectMas(){
      return complectMas;  
    };
    
    public static Electronic Electronic(Electronic aElect){
       // new Electronic
   return new Electronic(aElect.getNumber(), aElect.getName(), aElect.getCountry(), aElect.getPrice(), aElect.getGabarits(), aElect.getSimpleDateFormat(), aElect.getMasa(), aElect.getcomplectMas());
    };
     
}
