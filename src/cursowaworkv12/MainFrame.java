/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursowaworkv12;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ZEUS
 */
public class MainFrame extends javax.swing.JFrame {
    //addProduct addprd = null;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserProduct = new javax.swing.JFileChooser();
        jMenuItem8 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jFileChooserProduct.setDialogTitle("Вибір файлу");

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterTyped(evt);
            }
        });

        jLabel1.setText("Код");

        jLabel2.setText("Назва");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameEnterTyped(evt);
            }
        });

        jLabel3.setText("Вага");

        jTextField3.setEditable(false);
        jTextField3.setDoubleBuffered(true);
        jTextField3.setEnabled(false);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jLabel4.setText("Корисні речовини");

        jLabel5.setText("Жири");

        jLabel6.setText("Білки");

        jLabel7.setText("Вуглеводи");

        jTextField5.setEnabled(false);

        jTextField6.setEnabled(false);

        jTextField7.setEnabled(false);

        jButton1.setText("Пошук");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("не генно-модифіковані");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Товари");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Техніка");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Продукти");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 45, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(4, 4, 4))
        );

        jMenu3.setText("Файли");

        jMenuItem1.setText("Завантажити товари");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Завантажити техніку");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Заватнажити продукти");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Ввід даних");

        jMenuItem4.setText("Додати товар");
        jMenuItem4.setEnabled(false);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setText("Додати техніку");
        jMenuItem6.setEnabled(false);
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Додати продукт");
        jMenuItem7.setEnabled(false);
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
         String[] columnNames = {"Код", "Назва", "Країна-виробник", "Ціна"};
        
        int returnVal = jFileChooserProduct.showOpenDialog(this);
    if (returnVal == jFileChooserProduct.APPROVE_OPTION) {
        CursowaWorkV12.fileProduct = jFileChooserProduct.getSelectedFile();
             try {
                 CursowaWorkV12.productsArray =  new ArrayList(CursowaWorkV12.readProducts(CursowaWorkV12.fileProduct));
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(this, "Файл пошкоджений або містить помилку!");   
             }
        Object[][] data = new String[CursowaWorkV12.productsArray.size()+1][4];
       Product temp;
       for(int i = 0; i < CursowaWorkV12.productsArray.size(); i++){
       temp = (Product) CursowaWorkV12.productsArray.get(i);
      data[i][0] = String.valueOf(temp.number);
       data[i][1] = temp.name;
       data[i][2] = temp.country;
       data[i][3] = String.valueOf(temp.price);
       }
 jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
 jTextField3.setText("");
 jTextField5.setText("");
 jTextField6.setText("");
 jTextField7.setText("");
 jMenuItem4.setEnabled(true);
       jTextField3.setEditable(false);
       jTextField5.setEnabled(false);
    jTextField6.setEnabled(false);
    jTextField7.setEnabled(false);
    jButton1.setEnabled(false);
      jButton2.setEnabled(false);
      jButton3.setEnabled(true);
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed
   }
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
         String[] columnNames = {"Код", "Назва", "Країна-виробник", "Ціна", "Гарантія", "Габарити", "Вага", "масив комплектації"};
        
        int returnVal = jFileChooserProduct.showOpenDialog(this);
    if (returnVal == jFileChooserProduct.APPROVE_OPTION) {
        CursowaWorkV12.fileElectronic = jFileChooserProduct.getSelectedFile();
             try {
                 CursowaWorkV12.electronicsArray =  new ArrayList(CursowaWorkV12.readElectronics(CursowaWorkV12.fileElectronic));
             } catch (Exception ex) { 
                 JOptionPane.showMessageDialog(this, "Файл пошкоджений або містить помилку!");
            }
        Object[][] data = new String[CursowaWorkV12.electronicsArray.size()+1][8];
       Electronic temp;
       for(int i = 0; i < CursowaWorkV12.electronicsArray.size(); i++){
       temp = (Electronic) CursowaWorkV12.electronicsArray.get(i);
      data[i][0] = String.valueOf(temp.number);
       data[i][1] = temp.name;
       data[i][2] = temp.country;
       data[i][3] = String.valueOf(temp.price);
       data[i][4] = ft.format(temp.getSimpleDateFormat());
       data[i][5] = String.valueOf(temp.gabarits[0])+"x"+String.valueOf(temp.gabarits[1])+"x"+String.valueOf(temp.gabarits[2]);
       data[i][6] = String.valueOf(temp.masa);
       StringBuilder stb = new StringBuilder();
        for(int x = 0; x < temp.complectMas.size(); x++){
            stb.append(temp.complectMas.get(x)+" ");
       }
        data[i][7] =  stb.toString();
  
    }                          
        
   jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));  
   
   jTextField3.setEnabled(true);
   jTextField3.setEditable(true);
    jTextField5.setEnabled(false);
    jTextField6.setEnabled(false);
    jTextField7.setEnabled(false);
    jButton1.setEnabled(false);
    jButton2.setEnabled(false);
    jButton4.setEnabled(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    }
    private void EnterTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterTyped
      
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
           int col = 0;
           int x = 0;
           try {
           col = Integer.parseInt(jTextField1.getText());
           } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "Невірний формат числа!");
           return;
           }
               try {
                   x = CursowaWorkV12.findByNumber(col, jTable1);
               } catch (Exception ex) {
                   Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
                if(x == 0){
         JOptionPane.showMessageDialog(this, "Запис не знайдено!");
         }
            
         
          
       }
        
    }//GEN-LAST:event_EnterTyped

    private void nameEnterTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameEnterTyped
        int x = 0;
        String col = null;
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
           col = jTextField2.getText();
           
            try {
                x = CursowaWorkV12.findByName(col, jTable1);
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(this, "Невірний формат стрічки!");
            }
           if(x == 0){
            JOptionPane.showMessageDialog(this, "Запис не знайдено!");
           }
        }
        
        
    }//GEN-LAST:event_nameEnterTyped

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        String[] columnNames = {"Код", "Назва", "Країна-виробник", "Ціна", "жири", "білки", "вуглеводи", "генна модифікація", "термін споживання" , "масив вітамінів"};
      int returnVal = jFileChooserProduct.showOpenDialog(this);
      if (returnVal == jFileChooserProduct.APPROVE_OPTION) {
        CursowaWorkV12.fileEat = jFileChooserProduct.getSelectedFile();
           //  try {
                 CursowaWorkV12.eatArray =  new ArrayList(CursowaWorkV12.readEats(CursowaWorkV12.fileEat));
           //  } catch (Exception ex) { 
             //    JOptionPane.showMessageDialog(this, "Файл пошкоджений або містить помилку!");
           // }
        Object[][] data = new String[CursowaWorkV12.eatArray.size()+1][10];
       Eat temp;
       for(int i = 0; i < CursowaWorkV12.eatArray.size(); i++){
       temp = (Eat) CursowaWorkV12.eatArray.get(i);
      data[i][0] = String.valueOf(temp.number);
       data[i][1] = temp.name;
       data[i][2] = temp.country;
       data[i][3] = String.valueOf(temp.price);
       data[i][4] = String.valueOf(temp.fat);
       data[i][5] = String.valueOf(temp.white);
       data[i][6] = String.valueOf(temp.carbohydrates);
       data[i][7] = String.valueOf(temp.genMod);
       data[i][8] = ft.format(temp.getEatTermEnd());
       
       StringBuilder stb = new StringBuilder();
        for(int x = 0; x < temp.vitaminsMas.size(); x++){
            stb.append(temp.vitaminsMas.get(x)+" ");
       }
        data[i][9] =  stb.toString();
    }                          
   jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));  
    jTextField3.setEditable(false);
    jTextField5.setEnabled(true);
    jTextField6.setEnabled(true);
    jTextField7.setEnabled(true);
    jButton1.setEnabled(true);
    jButton2.setEnabled(true);
    jButton5.setEnabled(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    }
    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
      if (evt.getKeyCode()== KeyEvent.VK_ENTER){
           double col = 0;
           int x = 0;
           try {
           col = Double.parseDouble(jTextField3.getText());
           } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "Невірний формат числа!");
           return;
           }
              try {
                  x = CursowaWorkV12.findByMas(col, jTable1);
              } catch (Exception ex) {
                   Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
                if(x == 0){
         JOptionPane.showMessageDialog(this, "Запис не знайдено!");
         }
            
         
          
       }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            double tFat = -1;
            double tWhite = -1;
            double tCarbohydrates = -1;
           int x = 0;
           try {
           tFat = Double.parseDouble(jTextField5.getText());
           } catch (NumberFormatException e) {
               if(jTextField5.getText().length() > 0){
           JOptionPane.showMessageDialog(this, "Невірний формат числа жирів!");
           return;
               }
           }
             try {
           tWhite = Double.parseDouble(jTextField6.getText());
           } catch (NumberFormatException e) {
                if(jTextField6.getText().length() > 0){
           JOptionPane.showMessageDialog(this, "Невірний формат числа білків!");
           return;
                }
           }
               try {
           tCarbohydrates = Double.parseDouble(jTextField7.getText());
           } catch (NumberFormatException e) {
                if(jTextField7.getText().length() > 0){
           JOptionPane.showMessageDialog(this, "Невірний формат числа вуглеводів!");
           return;
                }
           }
               if(tFat > 0 && tWhite > 0  && tCarbohydrates > 0 ){
              try {
                  x = CursowaWorkV12.findBySubstance(tFat, tWhite, tCarbohydrates, jTable1);
                   if(x == 0){
         JOptionPane.showMessageDialog(this, "Запис не знайдено!");
         }
                   return;
              } catch (Exception ex) {
                   Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
               }
                if(tWhite > 0  && tCarbohydrates > 0 ){
                try {
                  x = CursowaWorkV12.findBySubstance(tWhite, tCarbohydrates, jTable1);
                   if(x == 0){
         JOptionPane.showMessageDialog(this, "Запис не знайдено!");
         }
                   return;
              } catch (Exception ex) {
                   Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
                }
               if(tFat > 0 && tCarbohydrates > 0 ){
               try {
                  x = CursowaWorkV12.findBySubstance(tFat, jTable1, tCarbohydrates);
                   if(x == 0){
         JOptionPane.showMessageDialog(this, "Запис не знайдено!");
         }
                   return;
              } catch (Exception ex) {
                   Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
               }
               if(tFat > 0 && tWhite > 0){
                try {
                  x = CursowaWorkV12.findBySubstance(jTable1, tFat, tWhite);
                   if(x == 0){
         JOptionPane.showMessageDialog(this, "Запис не знайдено!");
         }
                   return;
              } catch (Exception ex) {
                   Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
               }
               if(tFat > 0){
                 try {
                  x = CursowaWorkV12.findBySubstance(tFat, jTable1);
                   if(x == 0){
         JOptionPane.showMessageDialog(this, "Запис не знайдено!");
         }
                   return;
              } catch (Exception ex) {
                   Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
               }
                if(tWhite > 0){
                try {
                  x = CursowaWorkV12.findBySubstance(jTable1, tWhite);
                   if(x == 0){
         JOptionPane.showMessageDialog(this, "Запис не знайдено!");
         }
                   return;
              } catch (Exception ex) {
                   Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
                }
                if(tCarbohydrates > 0){
                 try {
                  x = CursowaWorkV12.findBySubstance(tCarbohydrates, jTable1, true);
                   if(x == 0){
         JOptionPane.showMessageDialog(this, "Запис не знайдено!");
         }
                   return;
              } catch (Exception ex) {
                   Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
                }
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double Fat = Double.parseDouble(jTextField5.getText());
        double White = Double.parseDouble(jTextField6.getText());
        double Carbohydrates = Double.parseDouble(jTextField7.getText());
        try {
            CursowaWorkV12.showBySubstance(Fat, White, Carbohydrates, jTable1);            
            
               
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    //addprd = new createProduct();
   // addprd.setVisible(true);
   // addprd.pack();
////        AddProduct addProdu=  new AddProduct();
////                addProdu.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String[] columnNames = {"Код", "Назва", "Країна-виробник", "Ціна"};
        Object[][] data = new String[CursowaWorkV12.productsArray.size()+1][4];
        Product temp;
        for(int i = 0; i < CursowaWorkV12.productsArray.size(); i++){
            temp = (Product) CursowaWorkV12.productsArray.get(i);
            data[i][0] = String.valueOf(temp.number);
            data[i][1] = temp.name;
            data[i][2] = temp.country;
            data[i][3] = String.valueOf(temp.price);
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
        jTextField3.setText("");
 jTextField5.setText("");
 jTextField6.setText("");
 jTextField7.setText("");
        jTextField3.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField6.setEnabled(false);
        jTextField7.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
         String[] columnNames = {"Код", "Назва", "Країна-виробник", "Ціна", "Гарантія", "Габарити", "Вага", "масив комплектації"};
         Object[][] data = new String[CursowaWorkV12.electronicsArray.size()+1][8];
       Electronic temp;
       for(int i = 0; i < CursowaWorkV12.electronicsArray.size(); i++){
       temp = (Electronic) CursowaWorkV12.electronicsArray.get(i);
      data[i][0] = String.valueOf(temp.number);
       data[i][1] = temp.name;
       data[i][2] = temp.country;
       data[i][3] = String.valueOf(temp.price);
       data[i][4] = ft.format(temp.getSimpleDateFormat());
       data[i][5] = String.valueOf(temp.gabarits[0])+"x"+String.valueOf(temp.gabarits[1])+"x"+String.valueOf(temp.gabarits[2]);
       data[i][6] = String.valueOf(temp.masa);
       StringBuilder stb = new StringBuilder();
        for(int x = 0; x < temp.complectMas.size(); x++){
            stb.append(temp.complectMas.get(x)+" ");
       }
        data[i][7] =  stb.toString();
  
    }                          
        
   jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
     jTextField3.setText("");
 jTextField5.setText("");
 jTextField6.setText("");
 jTextField7.setText("");
    jTextField3.setEnabled(true);
   jTextField3.setEditable(true);
    jTextField5.setEnabled(false);
    jTextField6.setEnabled(false);
    jTextField7.setEnabled(false);
    jButton1.setEnabled(false);
    jButton2.setEnabled(false);
    jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        String[] columnNames = {"Код", "Назва", "Країна-виробник", "Ціна", "жири", "білки", "вуглеводи", "генна модифікація", "термін споживання" , "масив вітамінів"};
         Object[][] data = new String[CursowaWorkV12.eatArray.size()+1][10];
       Eat temp;
       for(int i = 0; i < CursowaWorkV12.eatArray.size(); i++){
       temp = (Eat) CursowaWorkV12.eatArray.get(i);
      data[i][0] = String.valueOf(temp.number);
       data[i][1] = temp.name;
       data[i][2] = temp.country;
       data[i][3] = String.valueOf(temp.price);
       data[i][4] = String.valueOf(temp.fat);
       data[i][5] = String.valueOf(temp.white);
       data[i][6] = String.valueOf(temp.carbohydrates);
       data[i][7] = String.valueOf(temp.genMod);
       data[i][8] = ft.format(temp.getEatTermEnd());
       
       StringBuilder stb = new StringBuilder();
        for(int x = 0; x < temp.vitaminsMas.size(); x++){
            stb.append(temp.vitaminsMas.get(x)+" ");
       }
        data[i][9] =  stb.toString();
    }                          
   jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
     jTextField3.setText("");
 jTextField5.setText("");
 jTextField6.setText("");
 jTextField7.setText("");
    jTextField3.setEditable(false);
    jTextField5.setEnabled(true);
    jTextField6.setEnabled(true);
    jTextField7.setEnabled(true);
    jButton1.setEnabled(true);
    jButton2.setEnabled(true);
    jButton5.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFileChooser jFileChooserProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
