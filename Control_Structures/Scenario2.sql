DECLARE
    CURSOR c_vip_candidates IS
        SELECT customer_id, balance, is_vip 
        FROM customers
        WHERE balance > 10000
        FOR UPDATE OF is_vip;
BEGIN
    FOR r_cust IN c_vip_candidates LOOP
        UPDATE customers
        SET is_vip = 'TRUE'
        WHERE CURRENT OF c_vip_candidates;
    END LOOP;
    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
END;
/