/**
 */
package uk.ac.kcl.inf.modelling.banking.bank;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Bank#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Bank#getManagers <em>Managers</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Bank#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getBank()
 * @model
 * @generated
 */
public interface Bank extends EObject {
	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.banking.bank.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getBank_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getAccounts();

	/**
	 * Returns the value of the '<em><b>Managers</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.banking.bank.Manager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managers</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getBank_Managers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Manager> getManagers();

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.banking.bank.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getBank_Clients()
	 * @model containment="true"
	 * @generated
	 */
	EList<Client> getClients();

} // Bank
