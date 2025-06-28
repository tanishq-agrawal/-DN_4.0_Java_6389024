SET SERVEROUTPUT ON;

BEGIN
    FOR cust_rec IN (
        SELECT c.CustomerID, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE MONTHS_BETWEEN(SYSDATE, c.DOB) / 12 > 60
    ) LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = cust_rec.LoanID;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('All customers above the age of 60 have been applied with the discount of 1%.');

    COMMIT;
END;

SELECT * FROM Loans;