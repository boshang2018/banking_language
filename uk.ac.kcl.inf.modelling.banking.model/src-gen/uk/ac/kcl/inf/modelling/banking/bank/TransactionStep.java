/**
 */
package uk.ac.kcl.inf.modelling.banking.bank;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.TransactionStep#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.TransactionStep#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getTransactionStep()
 * @model abstract="true"
 * @generated
 */
public interface TransactionStep extends ScriptStep {
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
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getTransactionStep_AccountID()
	 * @model
	 * @generated
	 */
	int getAccountID();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.TransactionStep#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(int value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getTransactionStep_Amount()
	 * @model
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.TransactionStep#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

} // TransactionStep
