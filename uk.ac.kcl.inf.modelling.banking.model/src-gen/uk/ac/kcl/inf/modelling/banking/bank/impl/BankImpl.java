/**
 */
package uk.ac.kcl.inf.modelling.banking.bank.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.modelling.banking.bank.Account;
import uk.ac.kcl.inf.modelling.banking.bank.Bank;
import uk.ac.kcl.inf.modelling.banking.bank.BankingPackage;
import uk.ac.kcl.inf.modelling.banking.bank.Client;
import uk.ac.kcl.inf.modelling.banking.bank.Manager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.BankImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.BankImpl#getManagers <em>Managers</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.BankImpl#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankImpl extends MinimalEObjectImpl.Container implements Bank {
	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accounts;

	/**
	 * The cached value of the '{@link #getManagers() <em>Managers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagers()
	 * @generated
	 * @ordered
	 */
	protected EList<Manager> managers;

	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> clients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingPackage.Literals.BANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Account> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectContainmentEList<Account>(Account.class, this, BankingPackage.BANK__ACCOUNTS);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Manager> getManagers() {
		if (managers == null) {
			managers = new EObjectContainmentEList<Manager>(Manager.class, this, BankingPackage.BANK__MANAGERS);
		}
		return managers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClients() {
		if (clients == null) {
			clients = new EObjectContainmentEList<Client>(Client.class, this, BankingPackage.BANK__CLIENTS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BankingPackage.BANK__ACCOUNTS:
			return ((InternalEList<?>) getAccounts()).basicRemove(otherEnd, msgs);
		case BankingPackage.BANK__MANAGERS:
			return ((InternalEList<?>) getManagers()).basicRemove(otherEnd, msgs);
		case BankingPackage.BANK__CLIENTS:
			return ((InternalEList<?>) getClients()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BankingPackage.BANK__ACCOUNTS:
			return getAccounts();
		case BankingPackage.BANK__MANAGERS:
			return getManagers();
		case BankingPackage.BANK__CLIENTS:
			return getClients();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BankingPackage.BANK__ACCOUNTS:
			getAccounts().clear();
			getAccounts().addAll((Collection<? extends Account>) newValue);
			return;
		case BankingPackage.BANK__MANAGERS:
			getManagers().clear();
			getManagers().addAll((Collection<? extends Manager>) newValue);
			return;
		case BankingPackage.BANK__CLIENTS:
			getClients().clear();
			getClients().addAll((Collection<? extends Client>) newValue);
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
		case BankingPackage.BANK__ACCOUNTS:
			getAccounts().clear();
			return;
		case BankingPackage.BANK__MANAGERS:
			getManagers().clear();
			return;
		case BankingPackage.BANK__CLIENTS:
			getClients().clear();
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
		case BankingPackage.BANK__ACCOUNTS:
			return accounts != null && !accounts.isEmpty();
		case BankingPackage.BANK__MANAGERS:
			return managers != null && !managers.isEmpty();
		case BankingPackage.BANK__CLIENTS:
			return clients != null && !clients.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BankImpl
