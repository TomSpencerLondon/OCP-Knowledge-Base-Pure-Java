-- 20. Categories and total products in each category
-- For this problem we'd like to see the total number of products in each category.
-- Sort the results by the total number of products, in descending order.

SELECT c.CategoryName as "Category", COUNT(distinct(p.ProductID)) count
from Products p
inner join Categories c USING(CategoryID)
GROUP BY p.CategoryID
ORDER BY count DESC;

-- 21. Total customers per country/city
-- In the Customers table, show the number of customers per Country and City.

SELECT c.country, c.City,
    (select count(*) from customers cust where cust.country = c.country) as total_customers
FROM customers c
GROUP BY c.City, c.country
ORDER BY total_customers DESC;

