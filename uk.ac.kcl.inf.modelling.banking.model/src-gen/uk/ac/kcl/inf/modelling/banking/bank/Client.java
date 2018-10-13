/**
 */
package uk.ac.kcl.inf.modelling.banking.bank;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Client#getManager <em>Manager</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Client#getAccounts <em>Accounts</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends Person {
	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.kcl.inf.modelling.banking.bank.Manager#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Manager)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getClient_Manager()
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Manager#getClients
	 * @model opposite="clients"
	 * @generated
	 */
	Manager getManager();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.Client#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Manager value);

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.banking.bank.Account}.
	 * It is bidirectional and its opposite is '{@link uk.ac.kcl.inf.modelling.banking.bank.Account#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' reference list.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getClient_Accounts()
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Account#getOwner
	 * @model opposite="owner"
	 * @generated
	 */
	EList<Account> getAccounts();

} // Client
