/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.abrahamram.tpcustomerabrahamramilison.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;
import mg.itu.abrahamram.tpcustomerabrahamramilison.entity.Customer;
import mg.itu.abrahamram.tpcustomerabrahamramilison.service.CustomerManager;

/**
 * Backing bean de la page customerList.xhtml.
 * @author Aldramech
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
	private List<Customer> customerList;

	@Inject
	private CustomerManager customerManager;
	/**
	 * Creates a new instance of CustomerBean
	 */
	public CustomerBean() {
	}

	/**
	 * Retourne la liste des clients pour afficage dans une DataTable 
	 */
	public List<Customer> getCustomers() {
		if(customerList == null) {
			customerList = customerManager.getAllCustomers();
		}
		return customerList;
	}
	
}
