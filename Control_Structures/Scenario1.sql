DECLARE
    CURSOR c_senior_customers IS
        SELECT customer_id, interest_rate 
        FROM customers
        WHERE age > 60
        FOR UPDATE OF interest_rate;
BEGIN
    FOR r_cust IN c_senior_customers LOOP
        UPDATE customers
        SET interest_rate = interest_rate - 1
        WHERE CURRENT OF c_senior_customers;
    END LOOP;
    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
END;
/