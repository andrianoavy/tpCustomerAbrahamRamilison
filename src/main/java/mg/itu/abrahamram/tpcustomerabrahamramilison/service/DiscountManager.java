/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.abrahamram.tpcustomerabrahamramilison.service;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import java.util.List;
import mg.itu.abrahamram.tpcustomerabrahamramilison.entity.Discount;

/**
 *
 * @author Aldramech
 */
@Named(value = "discountBean")
@RequestScoped
public class DiscountManager {

	@PersistenceContext(unitName = "customerPU")
	private EntityManager em;

	/**
	* Retourne la liste des réductions dans l'ordre croissant du taux de réduction(utiliser `findAllOrderByRateDESC` pour obtenir l'ordre décroissant)
	* @return Une liste de Discount(order ASC)
	*/
	public List<Discount> getAllDiscounts() {
		Query query = em.createNamedQuery("Discount.findAllOrderByRateASC");
		return query.getResultList();
	}

	public Discount findById(String code) {
		return em.find(Discount.class, code);
	}
	
}
