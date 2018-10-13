/**
 */
package uk.ac.kcl.inf.modelling.banking.bank;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.ScriptStep#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getScriptStep()
 * @model
 * @generated
 */
public interface ScriptStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(ScriptStep)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getScriptStep_Next()
	 * @model
	 * @generated
	 */
	ScriptStep getNext();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.ScriptStep#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ScriptStep value);

} // ScriptStep
