package Module18;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
                .addListener(new ChangeListener() {
                    @Override
                    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                        if (newValue instanceof Contact) {
                            Contact contact = (Contact) newValue;
                            
                            formFirstName.setText(contact.getFirstName());
                            formLastName.setText(contact.getLastName());
                            formEmail.setText(contact.getEmail());
                            formPhone.setText(contact.getPhone());
                        }

                    }
                });
    }

    private void loadData() {
        contacts.removeAll(contacts);
        contacts.add(new Contact("Anders", "Agerlund", "aa@hotmail.com", "66 11 66 22"));
        contacts.add(new Contact("Benny", "Bentsen", "bb@hotmail.com", "555 112 52"));
        contacts.add(new Contact("Chris", "Christophersen", "cc@hotmail.com", "65 66 21 20"));
        contacts.add(new Contact("Dan", "Dahlberg", "dd@hotmail.com", "24 20 53 12"));
        contacts.add(new Contact("Erik", "Enevold", "ee@hotmail.com", "62 12 35 29"));
        contactsListView.getItems().addAll(contacts);
    }

}
