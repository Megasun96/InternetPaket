/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
/**
 *
 * @author stefa
 */
public class PersonController
{
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField adresa;
    @FXML
    private TextField protok;
    @FXML
    private TextField brzina;
    @FXML
    private TextField ugovor;
    @FXML
    private TextField idBroj;

    @FXML
    private Button saveBtn;
    @FXML
    private Button clearBtn;
    @FXML
    private Button closeBtn;
    @FXML
    private Button deleteBtn;

    @FXML
    private URL location;
    @FXML
    private ResourceBundle resources;

    ObservableList<Person> persons = FXCollections.<Person>observableArrayList();
    
    
    Person person;

    @FXML//
    TableView<Person> tabela = new TableView<>();//

    public PersonController()
    {
    }

    @FXML
    private void initialize()
    {
	person = new Person();

	firstName.textProperty().bindBidirectional(person.firstNameProperty());
	lastName.textProperty().bindBidirectional(person.lastNameProperty());
	adresa.textProperty().bindBidirectional(person.adresaProperty());
        brzina.textProperty().bindBidirectional(person.brzinaProperty());
        protok.textProperty().bindBidirectional(person.protokProperty());
        ugovor.textProperty().bindBidirectional(person.ugovorProperty());
        idBroj.textProperty().bindBidirectional(person.idBrojProperty());

    }

    @FXML
    private void savePerson()
    {
	if(person.isValid())
	{
	  
	    persons = tabela.getItems();
	    persons.add(new Person(firstName.getText(), lastName.getText(), adresa.getText(), brzina.getText(),protok.getText(),ugovor.getText(),idBroj.getText()));
	    tabela.setItems(persons);
	}
    }

    @FXML
    private void closeForm()
    {
	Platform.exit();
    }

    @FXML
    private void clearPerson()
    {
	person.firstNameProperty().set("");
	person.lastNameProperty().set("");
	person.adresaProperty().set("");

    }

   
    @FXML
    private void deletePerson()
    {
	persons = tabela.getItems();
	int index = tabela.selectionModelProperty().getValue().getSelectedIndex();
	persons.remove(index);
	tabela.setItems(persons);
    }
  
 
}
