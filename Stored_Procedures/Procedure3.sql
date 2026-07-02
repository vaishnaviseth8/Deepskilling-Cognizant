CREATE OR REPLACE PROCEDURE TransferFunds(
    p_source_acc IN NUMBER,
    p_dest_acc IN NUMBER,
    p_amount IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    SELECT balance INTO v_balance 
    FROM accounts 
    WHERE account_id = p_source_acc;

    IF v_balance >= p_amount THEN
        UPDATE accounts 
        SET balance = balance - p_amount 
        WHERE account_id = p_source_acc;

        UPDATE accounts 
        SET balance = balance + p_amount 
        WHERE account_id = p_dest_acc;
        
        COMMIT;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance for this transfer.');
    END IF;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        RAISE;
END;
/