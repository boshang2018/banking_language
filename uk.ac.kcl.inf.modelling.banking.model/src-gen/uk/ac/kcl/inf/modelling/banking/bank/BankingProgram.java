/**
 */
package uk.ac.kcl.inf.modelling.banking.bank;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.BankingProgram#getBank <em>Bank</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.BankingProgram#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getBankingProgram()
 * @model
 * @generated
 */
public interface BankingProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Bank</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' containment reference.
	 * @see #setBank(Bank)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getBankingProgram_Bank()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Bank getBank();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.BankingProgram#getBank <em>Bank</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' containment reference.
	 * @see #getBank()
	 * @generated
	 */
	void setBank(Bank value);

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.banking.bank.Script}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getBankingProgram_Scripts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Script> getScripts();

} // BankingProgram
