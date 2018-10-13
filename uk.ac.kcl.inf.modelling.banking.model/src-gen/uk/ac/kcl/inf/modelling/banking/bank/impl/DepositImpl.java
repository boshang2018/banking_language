/**
 */
package uk.ac.kcl.inf.modelling.banking.bank.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.kcl.inf.modelling.banking.bank.BankingPackage;
import uk.ac.kcl.inf.modelling.banking.bank.Deposit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deposit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DepositImpl extends TransactionStepImpl implements Deposit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepositImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingPackage.Literals.DEPOSIT;
	}

} //DepositImpl
