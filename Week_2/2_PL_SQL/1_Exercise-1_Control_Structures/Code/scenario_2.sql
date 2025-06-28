ALTER TABLE Customers ADD IsVIP CHAR(1);

SET SERVEROUTPUT ON;

BEGIN
    FOR cust_rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cust_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = cust_rec.CustomerID;
        ELSE
            UPDATE Customers
            SET IsVIP = 'N'
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('VIP status has been assigned to customers with balance over $10,000.');

    COMMIT;
END;
/

SELECT CustomerID, Name, Balance, IsVIP FROM Customers;