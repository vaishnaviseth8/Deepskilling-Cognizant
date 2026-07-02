DECLARE
    CURSOR c_upcoming_loans IS
        SELECT l.loan_id, c.customer_name, l.due_date, l.amount_due
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND (SYSDATE + 30);
BEGIN
    FOR r_loan IN c_upcoming_loans LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || r_loan.customer_name || ', your loan ID ' || r_loan.loan_id || ' is due on ' || TO_CHAR(r_loan.due_date, 'YYYY-MM-DD') || '.');
    END LOOP;
EXCEPTION
    WHEN OTHERS THEN
        NULL;
END;
/