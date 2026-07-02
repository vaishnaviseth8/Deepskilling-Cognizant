CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_dept_id IN NUMBER,
    p_bonus_percentage IN NUMBER
) IS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * (p_bonus_percentage / 180))
    WHERE department_id = p_dept_id;
    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
END;
/