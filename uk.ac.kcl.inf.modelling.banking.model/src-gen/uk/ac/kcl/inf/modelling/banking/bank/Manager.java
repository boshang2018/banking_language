/**
 */
package uk.ac.kcl.inf.modelling.banking.bank;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Manager#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends Person {
	/**
	 * Returns the value of the '<em><b>Clients</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.banking.bank.Client}.
	 * It is bidirectional and its opposite is '{@link uk.ac.kcl.inf.modelling.banking.bank.Client#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' reference list.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getManager_Clients()
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Client#getManager
	 * @model opposite="manager"
	 * @generated
	 */
	EList<Client> getClients();

} // Manager
