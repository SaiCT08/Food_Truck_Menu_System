package foodtruckmenusystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sai
 */
public class AddMainCourseScreen extends javax.swing.JFrame {

    private String truckName;
    private OrderedLinkedList<String> ingredientsList;
    private OrderedLinkedList<String> addedIngredients;
    private double totalCost;

    
    public AddMainCourseScreen(String truckName, OrderedLinkedList<String> ingredientsList, OrderedLinkedList<String> mainCourseList) {
        this.ingredientsList = ingredientsList;
        this.addedIngredients = new OrderedLinkedList<>(); // Empty list for added ingredients
        this.truckName = truckName;
        this.totalCost = 0.0;
        
        initComponents();
        loadIngredientsIntoComboBox();
        
        
   }
    private void loadIngredientsIntoComboBox() {
        // Clear any existing items in the combo box
    ingredientComboBox.removeAllItems();
    try (BufferedReader reader = new BufferedReader(new FileReader("src/foodtruckmenusystem/" + truckName + "Ingredients.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line into name and price
            String[] parts = line.split("\\|");
            if (parts.length == 2) {
                String name = parts[0].trim();    // Ingredient name
                String price = parts[1].trim();  // Ingredient price

                // Format for combo box (e.g., "American Cheese - $0.75")
                String displayText = name + " - $" + price;

                // Add to the Ordered Linked List
                ingredientsList.add(displayText);

                // Add to the combo box
                ingredientComboBox.addItem(displayText);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading ingredients: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addedIngredientsArea = new javax.swing.JTextArea();
        finalPriceField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ingredientComboBox = new javax.swing.JComboBox<>();
        suggestedPriceField = new javax.swing.JTextField();
        addIngredientButton = new javax.swing.JButton();
        deleteIngredientButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addedIngredientsArea.setEditable(false);
        addedIngredientsArea.setColumns(20);
        addedIngredientsArea.setRows(5);
        jScrollPane1.setViewportView(addedIngredientsArea);

        jLabel1.setText("Name");

        jLabel2.setText("Price");

        ingredientComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        suggestedPriceField.setEditable(false);

        addIngredientButton.setText("Add Ingredient");
        addIngredientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngredientButtonActionPerformed(evt);
            }
        });

        deleteIngredientButton.setText("Delete Ingredient");
        deleteIngredientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteIngredientButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(suggestedPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteIngredientButton)
                                    .addComponent(addIngredientButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(saveButton))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingredientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(itemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(finalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(suggestedPriceField))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(ingredientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(addIngredientButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(deleteIngredientButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButton)))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addIngredientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIngredientButtonActionPerformed
        String selectedIngredient = (String) ingredientComboBox.getSelectedItem();
    if (selectedIngredient == null || addedIngredients.contains(selectedIngredient)) {
        JOptionPane.showMessageDialog(this, "Ingredient already added or invalid.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Extract ingredient price from the selected item
    String[] parts = selectedIngredient.split(" - \\$");
    double price = Double.parseDouble(parts[1]);

    // Add to the list and update UI
    addedIngredients.add(selectedIngredient);
    addedIngredientsArea.append(selectedIngredient + "\n");
    totalCost += price;

    // Update suggested price
    double suggestedPrice = totalCost * 0.85;
    suggestedPriceField.setText(String.format("%.2f", suggestedPrice));
    }//GEN-LAST:event_addIngredientButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String itemName = itemNameField.getText();
    String finalPrice = finalPriceField.getText();

    if (itemName.isEmpty() || finalPrice.isEmpty() || addedIngredients.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields and add at least one ingredient.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/foodtruckmenusystem/" + truckName + "MainCourse.txt", true))) {
        // Write the item name and price
        writer.write("*" + itemName + " " + finalPrice);
        writer.newLine();

        // Write the full names of the ingredients
        for (String ingredient : addedIngredients) {
            String[] parts = ingredient.split(" - \\$"); // Split into name and price
            writer.write(parts[0]); // Write the full ingredient name
            writer.newLine();
        }

        JOptionPane.showMessageDialog(this, "Main course item saved successfully!");
        this.dispose();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error saving item: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteIngredientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteIngredientButtonActionPerformed
        String selectedIngredient = (String) ingredientComboBox.getSelectedItem();
    if (selectedIngredient == null || !addedIngredients.contains(selectedIngredient)) {
        JOptionPane.showMessageDialog(this, "Ingredient not found in the list.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Extract the ingredient price from the selected item
    String[] parts = selectedIngredient.split(" - \\$");
    if (parts.length == 2) {
        double price = Double.parseDouble(parts[1]); // Parse the price after removing the "$"

        // Remove from the list and update UI
        addedIngredients.remove(selectedIngredient);
        totalCost -= price;

        // Refresh the text area
        addedIngredientsArea.setText("");
        for (String ingredient : addedIngredients) {
            addedIngredientsArea.append(ingredient + "\n");
        }

        // Update suggested price
        double suggestedPrice = totalCost * 0.85;
        suggestedPriceField.setText(String.format("%.2f", suggestedPrice));
    } else {
        JOptionPane.showMessageDialog(this, "Invalid ingredient format.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_deleteIngredientButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addIngredientButton;
    private javax.swing.JTextArea addedIngredientsArea;
    private javax.swing.JButton deleteIngredientButton;
    private javax.swing.JTextField finalPriceField;
    private javax.swing.JComboBox<String> ingredientComboBox;
    private javax.swing.JTextField itemNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField suggestedPriceField;
    // End of variables declaration//GEN-END:variables
}
