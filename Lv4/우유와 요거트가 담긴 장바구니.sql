SELECT DISTINCT A.CART_ID
  FROM (SELECT CART_ID
          FROM CART_PRODUCTS
         WHERE NAME = 'YOGURT') A
        INNER JOIN (SELECT CART_ID
                      FROM CART_PRODUCTS
                     WHERE NAME = 'MILK') B ON A.CART_ID = B.CART_ID
 ORDER BY
       A.CART_ID