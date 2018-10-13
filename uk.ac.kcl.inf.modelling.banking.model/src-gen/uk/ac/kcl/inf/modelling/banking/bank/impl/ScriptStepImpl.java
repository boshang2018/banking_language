/**
 */
package uk.ac.kcl.inf.modelling.banking.bank.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.modelling.banking.bank.BankingPackage;
import uk.ac.kcl.inf.modelling.banking.bank.ScriptStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ScriptStepImpl#getNext <em>Next</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ScriptStepImpl#isHasRun <em>Has Run</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScriptStepImpl extends MinimalEObjectImpl.Container implements ScriptStep {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected ScriptStep next;

	/**
	 * The default value of the '{@link #isHasRun() <em>Has Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_RUN_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHasRun() <em>Has Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRun()
	 * @generated
	 * @ordered
	 */
	protected boolean hasRun = HAS_RUN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingPackage.Literals.SCRIPT_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptStep getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject) next;
			next = (ScriptStep) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingPackage.SCRIPT_STEP__NEXT, oldNext,
							next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptStep basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(ScriptStep newNext) {
		ScriptStep oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingPackage.SCRIPT_STEP__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasRun() {
		return hasRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRun(boolean newHasRun) {
		boolean oldHasRun = hasRun;
		hasRun = newHasRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingPackage.SCRIPT_STEP__HAS_RUN, oldHasRun,
					hasRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BankingPackage.SCRIPT_STEP__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case BankingPackage.SCRIPT_STEP__HAS_RUN:
			return isHasRun();
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
		case BankingPackage.SCRIPT_STEP__NEXT:
			setNext((ScriptStep) newValue);
			return;
		case BankingPackage.SCRIPT_STEP__HAS_RUN:
			setHasRun((Boolean) newValue);
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
		case BankingPackage.SCRIPT_STEP__NEXT:
			setNext((ScriptStep) null);
			return;
		case BankingPackage.SCRIPT_STEP__HAS_RUN:
			setHasRun(HAS_RUN_EDEFAULT);
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
		case BankingPackage.SCRIPT_STEP__NEXT:
			return next != null;
		case BankingPackage.SCRIPT_STEP__HAS_RUN:
			return hasRun != HAS_RUN_EDEFAULT;
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
		result.append(" (hasRun: ");
		result.append(hasRun);
		result.append(')');
		return result.toString();
	}

} //ScriptStepImpl
