SELECT COUNT(MEAL_NAME) FROM MEAL_ORDER_WITH_DETAILS
GROUP BY MEAL_NAME

SELECT  MEAL_NAME , COUNT(*) AS TIME_MEAL_ORDERED FROM
MEAL_ORDER_WITH_DETAILS,
SUM(PRICE) AS TOTAL_REVENUE
WHERE PRICE > 15

SELECT COUNT(*) FROM MEAL
GROUP BY CALORIES
WHERE CALORIES > 500

SELECT * FROM MEAL
WHERE NAME LIKE '%S%'