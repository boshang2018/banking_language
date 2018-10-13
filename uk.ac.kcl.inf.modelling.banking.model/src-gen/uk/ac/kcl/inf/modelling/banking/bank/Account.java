/**
 */
package uk.ac.kcl.inf.modelling.banking.bank;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Account#getId <em>Id</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Account#getCredit <em>Credit</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Account#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getAccount_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.Account#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(double)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getAccount_Credit()
	 * @model default="0.0"
	 * @generated
	 */
	double getCredit();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.Account#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(double value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.kcl.inf.modelling.banking.bank.Client#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Client)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getAccount_Owner()
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Client#getAccounts
	 * @model opposite="accounts"
	 * @generated
	 */
	Client getOwner();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.Account#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Client value);

} // Account
