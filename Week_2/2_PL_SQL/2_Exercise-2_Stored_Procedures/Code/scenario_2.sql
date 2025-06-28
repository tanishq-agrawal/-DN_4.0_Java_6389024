CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
	dept_name IN VARCHAR2,
	bonus_percent IN NUMBER
) IS
BEGIN
	FOR RECORD IN (
		SELECT EMPLOYEEID FROM EMPLOYEES
		WHERE DEPARTMENT = dept_name
		FOR UPDATE
	) LOOP
		UPDATE EMPLOYEES
		SET SALARY = SALARY + SALARY * (bonus_percent/100)
		WHERE EMPLOYEEID = RECORD.EMPLOYEEID;
	END LOOP;

	DBMS_OUTPUT.PUT_LINE('Bonus added to ' || dept_name || ' Employees!');
END;
/

BEGIN
	UpdateEmployeeBonus(dept_name => 'IT', bonus_percent => 5);
END;