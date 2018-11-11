/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module18;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private ListView<Contact> contactsListView;
    @FXML 
    private final ObservableList contacts = FXCollections.observableArrayList();
    @FXML
    private TextField formFirstName;
    @FXML
    private TextField formLastName;
    @FXML
    private TextField formEmail;
    @FXML
    private TextField formPhone;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();    
        
        contactsListView
                .getSelectionModel()
                .selectedItemProperty()
                .addListener((observableValue, oldValue, newValue) -> {
                    formFirstName.setText(newValue.getFirstName());
                    formLastName.setText(newValue.getLastName());
                    formEmail.setText(newValue.getEmail());
                    formPhone.setText(newValue.getPhone());
                });
        
    }    
    
    private void loadData() {
        contacts.removeAll(contacts);
        contacts.add(new Contact("Anders", "Andersen", "aa@hotmail.com", "12345678"));
        contacts.add(new Contact("Bent", "Bentsen", "bb@hotmail.com", "12345678"));
        contacts.add(new Contact("Chris", "Christophersen", "cc@hotmail.com", "12345678"));
        contactsListView.getItems().addAll(contacts);
    }
    
}
