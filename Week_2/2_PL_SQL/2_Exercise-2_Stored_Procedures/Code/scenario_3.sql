CREATE OR REPLACE PROCEDURE TransferFunds (
	src_account IN NUMBER,
	dest_account IN NUMBER,
	funds IN NUMBER
) IS 
	src_balance NUMBER;
BEGIN
	SELECT BALANCE INTO src_balance
	FROM ACCOUNTS
	WHERE ACCOUNTID = src_account
	FOR UPDATE;

	IF src_balance < funds THEN
		RAISE_APPLICATION_ERROR(-20001, 'INSUFFICIENT BALANCE IN THE SOURCE ACCOUNT!');
	END IF;

	UPDATE ACCOUNTS
	SET BALANCE = BALANCE - funds
	WHERE ACCOUNTID = src_account;

	UPDATE ACCOUNTS
	SET BALANCE = BALANCE + funds
	WHERE ACCOUNTID = dest_account;

	COMMIT;
	DBMS_OUTPUT.PUT_LINE('Transfer of ' || funds || ' from account ' || src_account || ' to account ' || dest_account || ' completed.');

EXCEPTION
	WHEN NO_DATA_FOUND THEN
		RAISE_APPLICATION_ERROR(-20001, 'One or both accounts not found.');

	WHEN OTHERS THEN
		ROLLBACK;
		RAISE;

END;
/

BEGIN
    TransferFunds(src_account => 1, dest_account => 2, funds => 500);
END;