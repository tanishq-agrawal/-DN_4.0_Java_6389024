SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR acc_rec IN (
        SELECT AccountID, Balance
        FROM Accounts
        WHERE UPPER(AccountType) = 'SAVINGS'
    ) LOOP
        UPDATE Accounts
        SET Balance = acc_rec.Balance * 1.01
        WHERE AccountID = acc_rec.AccountID;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Monthly interest (1%) has been applied to all savings accounts.');
    COMMIT;
END;
/