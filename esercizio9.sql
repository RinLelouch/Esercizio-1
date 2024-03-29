SELECT * FROM MEAL M
INNER JOIN INGREDIENT I  ON M.MEAL_ID = I.MEAL_ID
WHERE NAME = 'GARLIC'

SELECT * FROM MEAL
INNER JOIN INGREDIENT I  ON M.MEAL_ID = I.MEAL_ID
WHERE IS_VEGETARIAN

SELECT * FROM MEAL
INNER JOIN INGREDIENT I  ON M.MEAL_ID = I.MEAL_ID
WHERE I.IS_GLUTEN_FREE &&  I.IS_VEGAN

SELECT * FROM MEAL
INNER JOIN INGREDIENT I  ON M.MEAL_ID = I.MEAL_ID
WHERE COUNT(I)>3





SELECT * FROM CUSTOMER C
INNER JOIN ORDER O ON C.CUSTOMER_ID=O.CUSTOMER_ID

SELECT * FROM PRODUCT P
INNER JOIN INVENTORY I ON P.PRODUCT_ID=I.PRODUCT_ID