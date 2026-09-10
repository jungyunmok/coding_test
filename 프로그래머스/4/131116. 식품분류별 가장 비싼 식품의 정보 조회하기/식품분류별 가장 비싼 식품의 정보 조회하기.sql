SELECT a.category, a.price as MAX_PRICE, a.product_name
FROM food_product a
JOIN (SELECT MAX(price) as price, category
    FROM food_product
    GROUP BY category) b
ON a.category = b.category
AND a.price = b.price
WHERE a.category IN ('과자', '국', '김치', '식용유')
ORDER BY a.price DESC;