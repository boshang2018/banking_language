/**
 */
package uk.ac.kcl.inf.modelling.banking.bank.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.modelling.banking.bank.Account;
import uk.ac.kcl.inf.modelling.banking.bank.BankingPackage;
import uk.ac.kcl.inf.modelling.banking.bank.Client;
import uk.ac.kcl.inf.modelling.banking.bank.Manager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ClientImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ClientImpl#getAccounts <em>Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends PersonImpl implements Client {
	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Manager manager;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingPackage.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject) manager;
			manager = (Manager) eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingPackage.CLIENT__MANAGER,
							oldManager, manager));
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(Manager newManager, NotificationChain msgs) {
		Manager oldManager = manager;
		manager = newManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BankingPackage.CLIENT__MANAGER, oldManager, newManager);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Manager newManager) {
		if (newManager != manager) {
			NotificationChain msgs = null;
			if (manager != null)
				msgs = ((InternalEObject) manager).eInverseRemove(this, BankingPackage.MANAGER__CLIENTS, Manager.class,
						msgs);
			if (newManager != null)
				msgs = ((InternalEObject) newManager).eInverseAdd(this, BankingPackage.MANAGER__CLIENTS, Manager.class,
						msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingPackage.CLIENT__MANAGER, newManager,
					newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Account> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectWithInverseResolvingEList<Account>(Account.class, this,
					BankingPackage.CLIENT__ACCOUNTS, BankingPackage.ACCOUNT__OWNER);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BankingPackage.CLIENT__MANAGER:
			if (manager != null)
				msgs = ((InternalEObject) manager).eInverseRemove(this, BankingPackage.MANAGER__CLIENTS, Manager.class,
						msgs);
			return basicSetManager((Manager) otherEnd, msgs);
		case BankingPackage.CLIENT__ACCOUNTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAccounts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BankingPackage.CLIENT__MANAGER:
			return basicSetManager(null, msgs);
		case BankingPackage.CLIENT__ACCOUNTS:
			return ((InternalEList<?>) getAccounts()).basicRemove(otherEnd, msgs);
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
		case BankingPackage.CLIENT__MANAGER:
			if (resolve)
				return getManager();
			return basicGetManager();
		case BankingPackage.CLIENT__ACCOUNTS:
			return getAccounts();
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
		case BankingPackage.CLIENT__MANAGER:
			setManager((Manager) newValue);
			return;
		case BankingPackage.CLIENT__ACCOUNTS:
			getAccounts().clear();
			getAccounts().addAll((Collection<? extends Account>) newValue);
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
		case BankingPackage.CLIENT__MANAGER:
			setManager((Manager) null);
			return;
		case BankingPackage.CLIENT__ACCOUNTS:
			getAccounts().clear();
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
		case BankingPackage.CLIENT__MANAGER:
			return manager != null;
		case BankingPackage.CLIENT__ACCOUNTS:
			return accounts != null && !accounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClientImpl
