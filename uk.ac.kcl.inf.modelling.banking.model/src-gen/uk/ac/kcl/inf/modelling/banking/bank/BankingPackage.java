/**
 */
package uk.ac.kcl.inf.modelling.banking.bank;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingFactory
 * @model kind="package"
 * @generated
 */
public interface BankingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bank";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bank";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bank";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankingPackage eINSTANCE = uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.BankImpl <em>Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getBank()
	 * @generated
	 */
	int BANK = 0;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ACCOUNTS = 0;

	/**
	 * The feature id for the '<em><b>Managers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__MANAGERS = 1;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__CLIENTS = 2;

	/**
	 * The number of structural features of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.AccountImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ID = 0;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__CREDIT = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.PersonImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.ManagerImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__CLIENTS = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.ClientImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__MANAGER = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ACCOUNTS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.BankingProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingProgramImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getBankingProgram()
	 * @generated
	 */
	int BANKING_PROGRAM = 5;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKING_PROGRAM__BANK = 0;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKING_PROGRAM__SCRIPTS = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKING_PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKING_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.ScriptImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 6;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__CURRENT = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__START = 2;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ScriptStepImpl <em>Script Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.ScriptStepImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getScriptStep()
	 * @generated
	 */
	int SCRIPT_STEP = 7;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_STEP__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_STEP__HAS_RUN = 1;

	/**
	 * The number of structural features of the '<em>Script Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Script Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.TransactionStepImpl <em>Transaction Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.TransactionStepImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getTransactionStep()
	 * @generated
	 */
	int TRANSACTION_STEP = 10;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STEP__NEXT = SCRIPT_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STEP__HAS_RUN = SCRIPT_STEP__HAS_RUN;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STEP__ACCOUNT_ID = SCRIPT_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STEP__AMOUNT = SCRIPT_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transaction Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STEP_FEATURE_COUNT = SCRIPT_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transaction Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_STEP_OPERATION_COUNT = SCRIPT_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.WithdrawalImpl <em>Withdrawal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.WithdrawalImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getWithdrawal()
	 * @generated
	 */
	int WITHDRAWAL = 8;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAWAL__NEXT = TRANSACTION_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAWAL__HAS_RUN = TRANSACTION_STEP__HAS_RUN;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAWAL__ACCOUNT_ID = TRANSACTION_STEP__ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAWAL__AMOUNT = TRANSACTION_STEP__AMOUNT;

	/**
	 * The number of structural features of the '<em>Withdrawal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAWAL_FEATURE_COUNT = TRANSACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Withdrawal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAWAL_OPERATION_COUNT = TRANSACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.DepositImpl <em>Deposit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.DepositImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getDeposit()
	 * @generated
	 */
	int DEPOSIT = 9;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSIT__NEXT = TRANSACTION_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSIT__HAS_RUN = TRANSACTION_STEP__HAS_RUN;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSIT__ACCOUNT_ID = TRANSACTION_STEP__ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSIT__AMOUNT = TRANSACTION_STEP__AMOUNT;

	/**
	 * The number of structural features of the '<em>Deposit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSIT_FEATURE_COUNT = TRANSACTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deposit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOSIT_OPERATION_COUNT = TRANSACTION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.CreateAccountImpl <em>Create Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.CreateAccountImpl
	 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getCreateAccount()
	 * @generated
	 */
	int CREATE_ACCOUNT = 11;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACCOUNT__NEXT = SCRIPT_STEP__NEXT;

	/**
	 * The feature id for the '<em><b>Has Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACCOUNT__HAS_RUN = SCRIPT_STEP__HAS_RUN;

	/**
	 * The feature id for the '<em><b>Client Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACCOUNT__CLIENT_NAME = SCRIPT_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACCOUNT__ACCOUNT_ID = SCRIPT_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACCOUNT_FEATURE_COUNT = SCRIPT_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Create Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACCOUNT_OPERATION_COUNT = SCRIPT_STEP_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Bank
	 * @generated
	 */
	EClass getBank();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.banking.bank.Bank#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Bank#getAccounts()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Accounts();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.banking.bank.Bank#getManagers <em>Managers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managers</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Bank#getManagers()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Managers();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.banking.bank.Bank#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Bank#getClients()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Clients();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.banking.bank.Account#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Account#getId()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Id();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.banking.bank.Account#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Account#getCredit()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Credit();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.banking.bank.Account#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Account#getOwner()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Owner();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.modelling.banking.bank.Manager#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clients</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Manager#getClients()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Clients();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.banking.bank.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.banking.bank.Client#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Client#getManager()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Manager();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.modelling.banking.bank.Client#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accounts</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Client#getAccounts()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Accounts();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.BankingProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingProgram
	 * @generated
	 */
	EClass getBankingProgram();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.modelling.banking.bank.BankingProgram#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bank</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingProgram#getBank()
	 * @see #getBankingProgram()
	 * @generated
	 */
	EReference getBankingProgram_Bank();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.banking.bank.BankingProgram#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripts</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.BankingProgram#getScripts()
	 * @see #getBankingProgram()
	 * @generated
	 */
	EReference getBankingProgram_Scripts();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.modelling.banking.bank.Script#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Script#getSteps()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Steps();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.banking.bank.Script#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Script#getCurrent()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Current();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.banking.bank.Script#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Script#getStart()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Start();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.ScriptStep <em>Script Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Step</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.ScriptStep
	 * @generated
	 */
	EClass getScriptStep();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.modelling.banking.bank.ScriptStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.ScriptStep#getNext()
	 * @see #getScriptStep()
	 * @generated
	 */
	EReference getScriptStep_Next();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.banking.bank.ScriptStep#isHasRun <em>Has Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Run</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.ScriptStep#isHasRun()
	 * @see #getScriptStep()
	 * @generated
	 */
	EAttribute getScriptStep_HasRun();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.Withdrawal <em>Withdrawal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Withdrawal</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Withdrawal
	 * @generated
	 */
	EClass getWithdrawal();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.Deposit <em>Deposit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deposit</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.Deposit
	 * @generated
	 */
	EClass getDeposit();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.TransactionStep <em>Transaction Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Step</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.TransactionStep
	 * @generated
	 */
	EClass getTransactionStep();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.banking.bank.TransactionStep#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.TransactionStep#getAccountID()
	 * @see #getTransactionStep()
	 * @generated
	 */
	EAttribute getTransactionStep_AccountID();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.banking.bank.TransactionStep#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.TransactionStep#getAmount()
	 * @see #getTransactionStep()
	 * @generated
	 */
	EAttribute getTransactionStep_Amount();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.modelling.banking.bank.CreateAccount <em>Create Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Account</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.CreateAccount
	 * @generated
	 */
	EClass getCreateAccount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.banking.bank.CreateAccount#getClientName <em>Client Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Name</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.CreateAccount#getClientName()
	 * @see #getCreateAccount()
	 * @generated
	 */
	EAttribute getCreateAccount_ClientName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.modelling.banking.bank.CreateAccount#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see uk.ac.kcl.inf.modelling.banking.bank.CreateAccount#getAccountID()
	 * @see #getCreateAccount()
	 * @generated
	 */
	EAttribute getCreateAccount_AccountID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BankingFactory getBankingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.BankImpl <em>Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getBank()
		 * @generated
		 */
		EClass BANK = eINSTANCE.getBank();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__ACCOUNTS = eINSTANCE.getBank_Accounts();

		/**
		 * The meta object literal for the '<em><b>Managers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__MANAGERS = eINSTANCE.getBank_Managers();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__CLIENTS = eINSTANCE.getBank_Clients();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.AccountImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__ID = eINSTANCE.getAccount_Id();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__CREDIT = eINSTANCE.getAccount_Credit();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__OWNER = eINSTANCE.getAccount_Owner();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.ManagerImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__CLIENTS = eINSTANCE.getManager_Clients();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.PersonImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.ClientImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__MANAGER = eINSTANCE.getClient_Manager();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__ACCOUNTS = eINSTANCE.getClient_Accounts();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.BankingProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingProgramImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getBankingProgram()
		 * @generated
		 */
		EClass BANKING_PROGRAM = eINSTANCE.getBankingProgram();

		/**
		 * The meta object literal for the '<em><b>Bank</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANKING_PROGRAM__BANK = eINSTANCE.getBankingProgram_Bank();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANKING_PROGRAM__SCRIPTS = eINSTANCE.getBankingProgram_Scripts();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.ScriptImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__STEPS = eINSTANCE.getScript_Steps();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__CURRENT = eINSTANCE.getScript_Current();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__START = eINSTANCE.getScript_Start();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.ScriptStepImpl <em>Script Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.ScriptStepImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getScriptStep()
		 * @generated
		 */
		EClass SCRIPT_STEP = eINSTANCE.getScriptStep();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_STEP__NEXT = eINSTANCE.getScriptStep_Next();

		/**
		 * The meta object literal for the '<em><b>Has Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_STEP__HAS_RUN = eINSTANCE.getScriptStep_HasRun();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.WithdrawalImpl <em>Withdrawal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.WithdrawalImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getWithdrawal()
		 * @generated
		 */
		EClass WITHDRAWAL = eINSTANCE.getWithdrawal();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.DepositImpl <em>Deposit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.DepositImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getDeposit()
		 * @generated
		 */
		EClass DEPOSIT = eINSTANCE.getDeposit();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.TransactionStepImpl <em>Transaction Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.TransactionStepImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getTransactionStep()
		 * @generated
		 */
		EClass TRANSACTION_STEP = eINSTANCE.getTransactionStep();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_STEP__ACCOUNT_ID = eINSTANCE.getTransactionStep_AccountID();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_STEP__AMOUNT = eINSTANCE.getTransactionStep_Amount();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.modelling.banking.bank.impl.CreateAccountImpl <em>Create Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.CreateAccountImpl
		 * @see uk.ac.kcl.inf.modelling.banking.bank.impl.BankingPackageImpl#getCreateAccount()
		 * @generated
		 */
		EClass CREATE_ACCOUNT = eINSTANCE.getCreateAccount();

		/**
		 * The meta object literal for the '<em><b>Client Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ACCOUNT__CLIENT_NAME = eINSTANCE.getCreateAccount_ClientName();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_ACCOUNT__ACCOUNT_ID = eINSTANCE.getCreateAccount_AccountID();

	}

} //BankingPackage
