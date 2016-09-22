/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursowaworkv12;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.TableModel;

/**
 *
 * @author ZEUS
 */
public class CursowaWorkV12 extends JApplet {
    
   
public static File fileProduct;
public static File fileElectronic;
public static File fileEat;
public static ArrayList productsArray;
public static ArrayList electronicsArray;
public static ArrayList eatArray;
 public static HashMap countryNumber = new HashMap() {{
                   
                   put("Ukraine", 470);
                  // put("");
               }};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            // Set cross-platform Java L&F (also called "Metal")
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException e) {
       // handle exception
    }
    catch (ClassNotFoundException e) {
       // handle exception
    }
    catch (InstantiationException e) {
       // handle exception
    }
    catch (IllegalAccessException e) {
       // handle exception
    }
                MainFrame frame = new MainFrame();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
    }  
  public static ArrayList readProducts(File productsFile) throws Exception{
      ArrayList products = new ArrayList();
      String sbNumber;
      String sbName;
      String sbCountry;
      String sbPrice;
      int lNumber;
      double lPrice;
        StringTokenizer strTok;
        BufferedReader in = new BufferedReader(new FileReader(productsFile.getAbsoluteFile()));
        String temp;
        while((temp = in.readLine()) != null){
            strTok =  new StringTokenizer(temp, " \t\n\r,.");
        sbNumber = strTok.nextToken();
        sbName = strTok.nextToken();
        sbCountry = strTok.nextToken();
        sbPrice = strTok.nextToken();
        lNumber = Integer.parseInt(sbNumber);
        lPrice = Double.parseDouble(sbPrice);
        products.add(new Product(lNumber, sbName, sbCountry, lPrice));
        }
  return products;
  };
   public static ArrayList readElectronics(File electronicFile) throws Exception{
      ArrayList electronics = new ArrayList();
      String sbNumber;
      String sbName;
      String sbCountry;
      String sbPrice;
      String sbMasa;
      ArrayList complectMas = new ArrayList();
      int lNumber;
      double lPrice;
      Date lDate;
      double[] lGabarits = new double[3];
        StringTokenizer strTok = null;  
        BufferedReader in = null;
    try {
        in = new BufferedReader(new FileReader(electronicFile.getAbsoluteFile()));
    } catch (FileNotFoundException ex) {
        Logger.getLogger(CursowaWorkV12.class.getName()).log(Level.SEVERE, null, ex);
    }
        String temp;
    try {
        while((temp = in.readLine()) != null){
            strTok =  new StringTokenizer(temp, " \t\n\r,.");
            sbNumber = strTok.nextToken();
            sbName = strTok.nextToken();
            sbCountry = strTok.nextToken();
            sbPrice = strTok.nextToken();
            lGabarits[0] =  Integer.parseInt(strTok.nextToken());
            lGabarits[1] =  Integer.parseInt(strTok.nextToken());
            lGabarits[2] =  Integer.parseInt(strTok.nextToken());
            lDate = new Date(Integer.parseInt(strTok.nextToken())-1900, Integer.parseInt(strTok.nextToken()), Integer.parseInt(strTok.nextToken()));
            sbMasa = strTok.nextToken();
            while(strTok.hasMoreTokens()){
                 complectMas.add(strTok.nextToken());
            }
            lNumber = Integer.parseInt(sbNumber);
            lPrice = Double.parseDouble(sbPrice);
            electronics.add(new Electronic(lNumber, sbName, sbCountry, lPrice, lGabarits, lDate, Double.parseDouble(sbMasa), complectMas));
        }
    } catch (IOException ex) {
        Logger.getLogger(CursowaWorkV12.class.getName()).log(Level.SEVERE, null, ex);
    }
  return electronics;
  };
   public static ArrayList readEats(File eatFile) {
    ArrayList eats = new ArrayList();
      String sbNumber;
      String sbName;
      String sbCountry;
      String sbPrice;
      String sbFat;
      String sbWhite;
      String sbCarbohydrates;
      String sbGenMod;
    ArrayList vitaminsMas = new ArrayList();
      int lNumber;
      double lPrice;
       double lFat;
    double lWhite;
    double lCarbohydrates;
    boolean lGenMod;
      Date lDate;
        StringTokenizer strTok = null;  
        BufferedReader in = null;
    try {
        in = new BufferedReader(new FileReader(eatFile.getAbsoluteFile()));
    } catch (FileNotFoundException ex) {
        Logger.getLogger(CursowaWorkV12.class.getName()).log(Level.SEVERE, null, ex);
    }
        String temp;
    try {
        while((temp = in.readLine()) != null){
            strTok =  new StringTokenizer(temp, " \t\n\r,.");
            sbNumber = strTok.nextToken();
            sbName = strTok.nextToken();
            sbCountry = strTok.nextToken();
            sbPrice = strTok.nextToken();
            sbFat = strTok.nextToken();
            sbWhite = strTok.nextToken();
            sbCarbohydrates = strTok.nextToken();
            sbGenMod = strTok.nextToken();
            lDate = new Date(Integer.parseInt(strTok.nextToken())-1900, Integer.parseInt(strTok.nextToken()), Integer.parseInt(strTok.nextToken()));
            while(strTok.hasMoreTokens()){
                 vitaminsMas.add(strTok.nextToken());
            }
            lNumber = Integer.parseInt(sbNumber);
            lPrice = Double.parseDouble(sbPrice);
            lFat = Double.parseDouble(sbFat);
            lWhite = Double.parseDouble(sbWhite);
            lCarbohydrates = Double.parseDouble(sbCarbohydrates);
            lGenMod = Boolean.parseBoolean(sbGenMod);
            eats.add(new Eat(lNumber, sbName, sbCountry, lPrice, lFat, lWhite, lCarbohydrates, lGenMod, lDate, vitaminsMas));
        }
    } catch (IOException ex) {
        Logger.getLogger(CursowaWorkV12.class.getName()).log(Level.SEVERE, null, ex);
    }
  return eats;
   }
    public static int findByNumber(int number, JTable table) throws Exception{
        table.clearSelection();
         TableModel k = table.getModel();
        int iter = 0;
        int col = -1;
        int res = 0;
        while(iter < k.getRowCount()-1){   
            try{
        col = Integer.parseInt(String.valueOf(k.getValueAt(iter, 0)));
            }catch(Exception ex){
            }
        if(number == col){
         table.addRowSelectionInterval(iter, iter);
          res++;
        }
         iter++; 
        }
        return res;
    };
      public static int findByMas(double mas, JTable table) throws Exception{
        table.clearSelection();
         TableModel k = table.getModel();
        int iter = 0;
        double col = -1;
        int res = 0;
        while(iter < k.getRowCount()-1){   
            try{
        col = Double.parseDouble(String.valueOf(k.getValueAt(iter, 6)));
            }catch(Exception ex){
            }
        if(mas == col){
         table.addRowSelectionInterval(iter, iter);
          res++;
        }
         iter++; 
        };
        return res;
    };
    public static int findByName(String name, JTable table) throws Exception{
          table.clearSelection();
    TableModel k = table.getModel();
    int iter = 0;
    String col = null;
    int res = 0;
     while(iter < k.getRowCount()-1){
          col = String.valueOf(k.getValueAt(iter, 1));
          if(name.equals(col)){
          table.addRowSelectionInterval(iter, iter);
          res++;
          }
           iter++;     
        }
       return res;
    };
     public static int findBySubstance(double fat, double white, double carbohydrates, JTable table) throws Exception{
          table.clearSelection();
    TableModel k = table.getModel();
    int iter = 0;
    double iFat, iWhite, iCarbohydrates;
    int res = 0;
     while(iter < k.getRowCount()-1){
         iFat = Double.parseDouble(String.valueOf(k.getValueAt(iter, 4)));
        iWhite = Double.parseDouble(String.valueOf(k.getValueAt(iter, 5)));
        iCarbohydrates = Double.parseDouble(String.valueOf(k.getValueAt(iter, 6)));
          if(fat == iFat && white == iWhite && carbohydrates == iCarbohydrates){
          table.addRowSelectionInterval(iter, iter);
          res++;
          }
           iter++;     
        }
       return res;
    };
      public static int findBySubstance(double white, double carbohydrates, JTable table) throws Exception{
          table.clearSelection();
    TableModel k = table.getModel();
    int iter = 0;
    double  iWhite, iCarbohydrates;
    int res = 0;
     while(iter < k.getRowCount()-1){
        iWhite = Double.parseDouble(String.valueOf(k.getValueAt(iter, 5)));
        iCarbohydrates = Double.parseDouble(String.valueOf(k.getValueAt(iter, 6)));
          if(white == iWhite && carbohydrates == iCarbohydrates){
          table.addRowSelectionInterval(iter, iter);
          res++;
          }
           iter++;     
        }
       return res;
    };
    public static int findBySubstance(double fat, JTable table, double carbohydrates) throws Exception{
          table.clearSelection();
    TableModel k = table.getModel();
    int iter = 0;
    double iFat, iCarbohydrates;
    int res = 0;
     while(iter < k.getRowCount()-1){
         iFat = Double.parseDouble(String.valueOf(k.getValueAt(iter, 4)));
        iCarbohydrates = Double.parseDouble(String.valueOf(k.getValueAt(iter, 6)));
          if(fat == iFat && carbohydrates == iCarbohydrates){
          table.addRowSelectionInterval(iter, iter);
          res++;
          }
           iter++;     
        }
       return res;
    };
      public static int findBySubstance(JTable table, double fat, double white) throws Exception{
          table.clearSelection();
    TableModel k = table.getModel();
    int iter = 0;
    double iFat, iWhite;
    int res = 0;
     while(iter < k.getRowCount()-1){
         iFat = Double.parseDouble(String.valueOf(k.getValueAt(iter, 4)));
        iWhite = Double.parseDouble(String.valueOf(k.getValueAt(iter, 5)));
          if(fat == iFat && white == iWhite){
          table.addRowSelectionInterval(iter, iter);
          res++;
          }
           iter++;     
        }
       return res;
    };
        public static int findBySubstance(double fat, JTable table) throws Exception{
          table.clearSelection();
    TableModel k = table.getModel();
    int iter = 0;
    double iFat;
    int res = 0;
     while(iter < k.getRowCount()-1){
         iFat = Double.parseDouble(String.valueOf(k.getValueAt(iter, 4)));
          if(fat == iFat){
          table.addRowSelectionInterval(iter, iter);
          res++;
          }
           iter++;     
        }
       return res;
    };
         public static int findBySubstance(JTable table, double white) throws Exception{
          table.clearSelection();
    TableModel k = table.getModel();
    int iter = 0;
    double iWhite;
    int res = 0;
     while(iter < k.getRowCount()-1){
        iWhite = Double.parseDouble(String.valueOf(k.getValueAt(iter, 5)));
          if(white == iWhite){
          table.addRowSelectionInterval(iter, iter);
          res++;
          }
           iter++;     
        }
       return res;
    };
          public static int findBySubstance(double carbohydrates, JTable table, boolean g) throws Exception{
          table.clearSelection();
    TableModel k = table.getModel();
    int iter = 0;
    double  iCarbohydrates;
    int res = 0;
     while(iter < k.getRowCount()-1){
        iCarbohydrates = Double.parseDouble(String.valueOf(k.getValueAt(iter, 6)));
          if(carbohydrates == iCarbohydrates){
          table.addRowSelectionInterval(iter, iter);
          res++;
          }
           iter++;     
        }
       return res;
    };
           public static int findByCountryNumInv(JTable table) throws Exception{
              
        table.clearSelection();
         TableModel k = table.getModel();
        int iter = 0;
        int col = -1;
        int res = 0;
        while(iter < k.getRowCount()-1){   
            try{
        col = Integer.parseInt(String.valueOf(k.getValueAt(iter, 0)));
            }catch(Exception ex){
            }
//        if(){
//         table.addRowSelectionInterval(iter, iter);
//          res++;
//        }
         iter++; 
        }
        return res;
    };
          public static int showBySubstance(double fat, double white, double carbohydrates, JTable table) throws Exception{
              
    TableModel k = table.getModel();
     String[] columnNames = {"Код", "Назва", "Країна-виробник", "Ціна", "жири", "білки", "вуглеводи", "генна модифікація", "термін споживання" , "масив вітамінів"};
     int iter = 0;
    double iFat, iWhite, iCarbohydrates;
    boolean iGenMod;
    int res = 0;
     while(iter < k.getRowCount()-1){
         iFat = Double.parseDouble(String.valueOf(k.getValueAt(iter, 4)));
        iWhite = Double.parseDouble(String.valueOf(k.getValueAt(iter, 5)));
        iCarbohydrates = Double.parseDouble(String.valueOf(k.getValueAt(iter, 6)));
        iGenMod = Boolean.parseBoolean(String.valueOf(k.getValueAt(iter, 7)));
          if(fat == iFat && white == iWhite && carbohydrates == iCarbohydrates && iGenMod == false){
          res++;
          }
           iter++;     
        }
     String[][] data = new String[res][10];
     res = 0;
     iter = 0;
     while(iter < k.getRowCount()-1){
         iFat = Double.parseDouble(String.valueOf(k.getValueAt(iter, 4)));
        iWhite = Double.parseDouble(String.valueOf(k.getValueAt(iter, 5)));
        iCarbohydrates = Double.parseDouble(String.valueOf(k.getValueAt(iter, 6)));
        iGenMod = Boolean.parseBoolean(String.valueOf(k.getValueAt(iter, 7)));
          if(fat == iFat && white == iWhite && carbohydrates == iCarbohydrates && iGenMod == false){
              data[res][0] = String.valueOf(k.getValueAt(res, 0));
              data[res][1] = String.valueOf(k.getValueAt(res, 1));
              data[res][2] = String.valueOf(k.getValueAt(res, 2));
              data[res][3] = String.valueOf(k.getValueAt(res, 3));
              data[res][4] = String.valueOf(k.getValueAt(res, 4));
              data[res][5] = String.valueOf(k.getValueAt(res, 5));
              data[res][6] = String.valueOf(k.getValueAt(res, 6));
              data[res][7] = String.valueOf(k.getValueAt(res, 7));
              data[res][8] = String.valueOf(k.getValueAt(res, 8));
              data[res][9] = String.valueOf(k.getValueAt(res, 9));
          res++;
          }
           iter++;     
        }
      table.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
       return res;
    };
}
