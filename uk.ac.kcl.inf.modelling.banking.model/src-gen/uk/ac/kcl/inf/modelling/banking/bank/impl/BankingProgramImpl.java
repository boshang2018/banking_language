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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.modelling.banking.bank.Bank;
import uk.ac.kcl.inf.modelling.banking.bank.BankingPackage;
import uk.ac.kcl.inf.modelling.banking.bank.BankingProgram;
import uk.ac.kcl.inf.modelling.banking.bank.Script;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.BankingProgramImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.BankingProgramImpl#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankingProgramImpl extends MinimalEObjectImpl.Container implements BankingProgram {
	/**
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected Bank bank;

	/**
	 * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripts()
	 * @generated
	 * @ordered
	 */
	protected EList<Script> scripts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankingProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingPackage.Literals.BANKING_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank getBank() {
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBank(Bank newBank, NotificationChain msgs) {
		Bank oldBank = bank;
		bank = newBank;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BankingPackage.BANKING_PROGRAM__BANK, oldBank, newBank);
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
	public void setBank(Bank newBank) {
		if (newBank != bank) {
			NotificationChain msgs = null;
			if (bank != null)
				msgs = ((InternalEObject) bank).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BankingPackage.BANKING_PROGRAM__BANK, null, msgs);
			if (newBank != null)
				msgs = ((InternalEObject) newBank).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BankingPackage.BANKING_PROGRAM__BANK, null, msgs);
			msgs = basicSetBank(newBank, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingPackage.BANKING_PROGRAM__BANK, newBank,
					newBank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Script> getScripts() {
		if (scripts == null) {
			scripts = new EObjectContainmentEList<Script>(Script.class, this, BankingPackage.BANKING_PROGRAM__SCRIPTS);
		}
		return scripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BankingPackage.BANKING_PROGRAM__BANK:
			return basicSetBank(null, msgs);
		case BankingPackage.BANKING_PROGRAM__SCRIPTS:
			return ((InternalEList<?>) getScripts()).basicRemove(otherEnd, msgs);
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
		case BankingPackage.BANKING_PROGRAM__BANK:
			return getBank();
		case BankingPackage.BANKING_PROGRAM__SCRIPTS:
			return getScripts();
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
		case BankingPackage.BANKING_PROGRAM__BANK:
			setBank((Bank) newValue);
			return;
		case BankingPackage.BANKING_PROGRAM__SCRIPTS:
			getScripts().clear();
			getScripts().addAll((Collection<? extends Script>) newValue);
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
		case BankingPackage.BANKING_PROGRAM__BANK:
			setBank((Bank) null);
			return;
		case BankingPackage.BANKING_PROGRAM__SCRIPTS:
			getScripts().clear();
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
		case BankingPackage.BANKING_PROGRAM__BANK:
			return bank != null;
		case BankingPackage.BANKING_PROGRAM__SCRIPTS:
			return scripts != null && !scripts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BankingProgramImpl
