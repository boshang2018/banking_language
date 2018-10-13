/**
 */
package uk.ac.kcl.inf.modelling.banking.bank;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Script#getSteps <em>Steps</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Script#getCurrent <em>Current</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.Script#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.modelling.banking.bank.ScriptStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getScript_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScriptStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(ScriptStep)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getScript_Current()
	 * @model
	 * @generated
	 */
	ScriptStep getCurrent();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.Script#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(ScriptStep value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ScriptStep)
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingPackage#getScript_Start()
	 * @model
	 * @generated
	 */
	ScriptStep getStart();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.modelling.banking.bank.Script#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ScriptStep value);

} // Script
