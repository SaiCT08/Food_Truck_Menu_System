/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package foodtruckmenusystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Matthew
 */
public class OwnerMenuScreen extends javax.swing.JFrame {

    private String truckName;
    private OrderedLinkedList<String> ingredientsList;
    private OrderedLinkedList<String> mainCourseList;
    private OrderedLinkedList<String> sideItemsList;
    
    public OwnerMenuScreen(String truckName) {
        this.truckName = truckName;
        this.ingredientsList = loadListFromFile("src/foodtruckmenusystem/" + truckName + "Ingredients.txt");
        this.mainCourseList = loadListFromFile("src/foodtruckmenusystem/" + truckName + "MainCourse.txt");
        this.sideItemsList = loadListFromFile("src/foodtruckmenusystem/" + truckName + "Sides.txt");
        initComponents();
        
    }

    private OrderedLinkedList<String> loadListFromFile(String filePath) {
    OrderedLinkedList<String> list = new OrderedLinkedList<>();
    try (Scanner scanner = new Scanner(new File(filePath))) {
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
    } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(this, "Error loading file: " + filePath, "Error", JOptionPane.ERROR_MESSAGE);
    }
    return list;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addIngredientsButton = new javax.swing.JButton();
        addMainCourseButton = new javax.swing.JButton();
        addSidesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addIngredientsButton.setText("Add Ingredients");
        addIngredientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngredientsButtonActionPerformed(evt);
            }
        });

        addMainCourseButton.setText("Add Main Course");
        addMainCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMainCourseButtonActionPerformed(evt);
            }
        });

        addSidesButton.setText("Add Sides");
        addSidesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSidesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(addIngredientsButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addMainCourseButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(addSidesButton)))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(addIngredientsButton)
                .addGap(18, 18, 18)
                .addComponent(addMainCourseButton)
                .addGap(18, 18, 18)
                .addComponent(addSidesButton)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addIngredientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIngredientsButtonActionPerformed
        new AddIngredientsScreen(truckName, ingredientsList).setVisible(true);
    }//GEN-LAST:event_addIngredientsButtonActionPerformed

    private void addMainCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMainCourseButtonActionPerformed
        new AddMainCourseScreen(truckName, ingredientsList, mainCourseList).setVisible(true);
    }//GEN-LAST:event_addMainCourseButtonActionPerformed

    private void addSidesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSidesButtonActionPerformed
        new AddSidesScreen(truckName, ingredientsList).setVisible(true);
    }//GEN-LAST:event_addSidesButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addIngredientsButton;
    private javax.swing.JButton addMainCourseButton;
    private javax.swing.JButton addSidesButton;
    // End of variables declaration//GEN-END:variables
}
