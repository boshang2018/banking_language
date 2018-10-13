/**
 */
package uk.ac.kcl.inf.modelling.banking.bank.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.kcl.inf.modelling.banking.bank.BankingPackage;
import uk.ac.kcl.inf.modelling.banking.bank.Withdrawal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Withdrawal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WithdrawalImpl extends TransactionStepImpl implements Withdrawal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WithdrawalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingPackage.Literals.WITHDRAWAL;
	}

} //WithdrawalImpl
