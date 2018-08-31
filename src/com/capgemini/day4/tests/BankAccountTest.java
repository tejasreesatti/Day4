package com.capgemini.day4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.BankAccount;

class BankAccountTest {

	BankAccount account;

	@BeforeEach
	void setUp() {
		account = new BankAccount(1234, "John Doe", "SAVING", 50000);
		/*account = new BankAccount();
		account.setAccId(1234);
		account.setAccHolderName("John Doe");
		account.setAccType("SAVING");
	    account.setBalance(50000);		*/
	}

	@Test
	void testWithdraw() {
		assertEquals(45000.0, account.withdraw(5000), 0.02);
		assertEquals(38000.0, account.withdraw(7000), 0.02);
		assertEquals(33432.66, account.withdraw(4567.34), 0.02);
		assertEquals(33432.66, account.withdraw(120000), 0.02);
	}

	@Test
	void testDeposit() {
		assertEquals(55000.0, account.deposit(5000));
		assertEquals(59567.34, account.deposit(4567.34));
	}
	
	@Test
	void testTotalBankAccounts() {
		assertEquals(1, BankAccount.totalBankAccounts());
		BankAccount account1 = new BankAccount(3456, "Jane Doe", "SAVING", 34000);
		assertEquals(2, BankAccount.totalBankAccounts());
		BankAccount account2 = new BankAccount();
		BankAccount account3 = new BankAccount();
		assertEquals(4, BankAccount.totalBankAccounts());
	}

	@AfterEach
	void tearDown() {
		account = null;
	}
}