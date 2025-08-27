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
public class AddSidesScreen extends javax.swing.JFrame {

    private String truckName;
    private OrderedLinkedList<String> ingredientsList;
    private OrderedLinkedList<String> addedIngredients;
    private double totalCost;
    
    public AddSidesScreen(String truckName, OrderedLinkedList<String> ingredientsList) {
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemNameField = new javax.swing.JTextField();
        finalPriceField = new javax.swing.JTextField();
        suggestedPriceField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addedIngredientsArea = new javax.swing.JTextArea();
        ingredientComboBox = new javax.swing.JComboBox<>();
        addIngredientButton = new javax.swing.JButton();
        deleteIngredientButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Price");

        itemNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameFieldActionPerformed(evt);
            }
        });

        suggestedPriceField.setEditable(false);

        addedIngredientsArea.setColumns(20);
        addedIngredientsArea.setRows(5);
        jScrollPane1.setViewportView(addedIngredientsArea);

        ingredientComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(finalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ingredientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(itemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(suggestedPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addIngredientButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(deleteIngredientButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveButton)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(finalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingredientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suggestedPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addIngredientButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(deleteIngredientButton)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameFieldActionPerformed

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

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String itemName = itemNameField.getText();
    String finalPrice = finalPriceField.getText();

    if (itemName.isEmpty() || finalPrice.isEmpty() || addedIngredients.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields and add at least one ingredient.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/foodtruckmenusystem/" + truckName + "Sides.txt", true))) {
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
