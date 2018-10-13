/**
 */
package uk.ac.kcl.inf.modelling.banking.bank.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.modelling.banking.bank.BankingPackage;
import uk.ac.kcl.inf.modelling.banking.bank.CreateAccount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.CreateAccountImpl#getClientName <em>Client Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.CreateAccountImpl#getAccountID <em>Account ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateAccountImpl extends ScriptStepImpl implements CreateAccount {
	/**
	 * The default value of the '{@link #getClientName() <em>Client Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientName() <em>Client Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientName()
	 * @generated
	 * @ordered
	 */
	protected String clientName = CLIENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected static final int ACCOUNT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected int accountID = ACCOUNT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingPackage.Literals.CREATE_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientName(String newClientName) {
		String oldClientName = clientName;
		clientName = newClientName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingPackage.CREATE_ACCOUNT__CLIENT_NAME,
					oldClientName, clientName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAccountID() {
		return accountID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountID(int newAccountID) {
		int oldAccountID = accountID;
		accountID = newAccountID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingPackage.CREATE_ACCOUNT__ACCOUNT_ID,
					oldAccountID, accountID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BankingPackage.CREATE_ACCOUNT__CLIENT_NAME:
			return getClientName();
		case BankingPackage.CREATE_ACCOUNT__ACCOUNT_ID:
			return getAccountID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BankingPackage.CREATE_ACCOUNT__CLIENT_NAME:
			setClientName((String) newValue);
			return;
		case BankingPackage.CREATE_ACCOUNT__ACCOUNT_ID:
			setAccountID((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BankingPackage.CREATE_ACCOUNT__CLIENT_NAME:
			setClientName(CLIENT_NAME_EDEFAULT);
			return;
		case BankingPackage.CREATE_ACCOUNT__ACCOUNT_ID:
			setAccountID(ACCOUNT_ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BankingPackage.CREATE_ACCOUNT__CLIENT_NAME:
			return CLIENT_NAME_EDEFAULT == null ? clientName != null : !CLIENT_NAME_EDEFAULT.equals(clientName);
		case BankingPackage.CREATE_ACCOUNT__ACCOUNT_ID:
			return accountID != ACCOUNT_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (clientName: ");
		result.append(clientName);
		result.append(", accountID: ");
		result.append(accountID);
		result.append(')');
		return result.toString();
	}

} //CreateAccountImpl
