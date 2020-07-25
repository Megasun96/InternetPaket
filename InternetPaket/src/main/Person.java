/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
/**
 *
 * @author stefa
 */
public class Person
{
    private final StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
    private final StringProperty lastName = new SimpleStringProperty(this, "lastName", "");
    private final StringProperty adresa = new SimpleStringProperty(this, "email", "");
    private final StringProperty brzina = new SimpleStringProperty(this,"brzina","");
    private final StringProperty protok = new SimpleStringProperty(this,"protok","");
    private final StringProperty ugovor = new SimpleStringProperty(this,"ugovor","");
    private final StringProperty idBroj = new SimpleStringProperty(this,"idBroj","");

    public Person()
    {

    }

    public Person(String firstName, String lastName, String adresa, String Brzina, String Protok, String ugovor, String iDBroj)
    {
	this.firstName.set(firstName);
	this.lastName.set(lastName);
	this.adresa.set(adresa);
        this.brzina.set(Brzina);
        this.protok.set(Protok);
        this.ugovor.set(ugovor);
        this.idBroj.set(iDBroj);
    }

    public Person(String firstName)
    {
	this.firstName.set(firstName);
    }

    public Person(String firstName, String lastName)
    {
	this.firstName.set(firstName);
	this.lastName.set(lastName);
    }

    public String getFirstName()
    {
	return firstName.get();
    }

    public void setFirstName(String firstName)
    {
	this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty()
    {
	return firstName;
    }

    public String getLastName()
    {
	return lastName.get();
    }

    public void setLastName(String lastName)
    {
	this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty()
    {
	return lastName;
    }

    public String getAdresa()
    {
	return adresa.get();
    }

    public void setAdresa(String adresa)
    {
	this.adresa.set(adresa);
    }

    public StringProperty adresaProperty()
    {
	return adresa;
    }
    
    public String getBrzina()
    {
	return brzina.get();
    }

    public void setBrzina(String Brzina)
    {
	this.brzina.set(Brzina);
    }

    public StringProperty brzinaProperty()
    {
	return brzina;
    }
    public String getProtok()
    {
	return protok.get();
    }

    public void setProtok(String Protok)
    {
	this.protok.set(Protok);
    }

    public StringProperty protokProperty()
    {
	return protok;
    }
    public String getUgovor()
    {
	return ugovor.get();
    }

    public void setUgovor(String Ugovor)
    {
	this.ugovor.set(Ugovor);
    }

    public StringProperty ugovorProperty()
    {
	return ugovor;
    }
    public String getidBroj()
    {
	return idBroj.get();
    }

    public void setidBroj(String idBroj)
    {
	this.idBroj.set(idBroj);
    }

    public StringProperty idBrojProperty()
    {
	return idBroj;
    }


    private final ObjectProperty<ArrayList<String>> errorList = new SimpleObjectProperty<>(this, "greška", new ArrayList<>());

    public ObjectProperty<ArrayList<String>> errorsProperty()
    {
	return errorList;
    }

    public boolean isValid()
    {
	boolean isValid = true;
	if(firstName.get() != null && firstName.get().equals(""))
	{
	    errorList.getValue().add("Ime ne može da bude prazan!");
	    isValid = false;
	}
	if(lastName.get().equals(""))
	{
	    errorList.getValue().add("Prezime ne može da bude prazan!");
	    isValid = false;
	}
	if(adresa.get().equals(""))
	{
	    errorList.getValue().add("Adresa ne može da bude prazan!");
	    isValid = false;
	}
	return isValid;
    }
}
