/**
 */
package uk.ac.kcl.inf.modelling.banking.bank;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.CreateAccount#getClientName <em>Client Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.CreateAccount#getAccountID <em>Account ID</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getCreateAccount()
 * @model
 * @generated
 */
public interface CreateAccount extends ScriptStep {
	/**
	 * Returns the value of the '<em><b>Client Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Name</em>' attribute.
	 * @see #setClientName(String)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getCreateAccount_ClientName()
	 * @model
	 * @generated
	 */
	String getClientName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.CreateAccount#getClientName <em>Client Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Name</em>' attribute.
	 * @see #getClientName()
	 * @generated
	 */
	void setClientName(String value);

	/**
	 * Returns the value of the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account ID</em>' attribute.
	 * @see #setAccountID(int)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getCreateAccount_AccountID()
	 * @model
	 * @generated
	 */
	int getAccountID();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.CreateAccount#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(int value);

} // CreateAccount
