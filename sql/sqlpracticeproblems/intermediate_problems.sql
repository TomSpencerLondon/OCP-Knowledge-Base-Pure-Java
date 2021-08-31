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

SELECT c.country, c.City, COUNT(*) as total_customers
FROM customers c
GROUP BY c.country, c.City
ORDER BY total_customers DESC;


-- 22. Products need reordering
-- What products do we have in our inventory
-- that should be reordered? For now, just use the
-- fields UnitsInStock and ReorderLevel where UnitsInStock
-- is less than or equal to the ReorderLevel, Ignore the
-- fields UnitsOnOrder and Discontinued

SELECT ProductID, ProductName, UnitsInStock, ReorderLevel
from products
where UnitsInStock <= ReorderLevel
order by productID asc;

-- 23. Products that need reordering, continued
-- Now we need to incorporate these fields -- UnitsInSttock, UnitsOnOrder
-- ReorderLevel, Discontinued -- into our calculation. We'll define 'products that
-- need reordering' with the following:
-- UnitsInStock plus UnitsOnOrder are less than or equal to ReorderLevel
-- The Discontinued flag is false (0)

SELECT ProductID as "Product ID", ProductName as "Product Name", UnitsInStock as "Units In Stock", UnitsOnOrder as "Units on Order", ReorderLevel as "Reorder Level", Discontinued
from products
where (UnitsInStock + UnitsOnOrder) <= ReorderLevel
and Discontinued is false;


-- 24. Customer List by region
-- A sales person for Northwind is going on a business trip to visit customers,
-- and would like to see a list of all customers, sorted by region, alphabetically.
-- However, he wants the customers with no region (null in the Region field)
-- to be at the end, instead of at the top where you'd normally find the null
-- values. Within the same region, companies should be sorted by CustomerID.

select CustomerID, CompanyName, Region
from Customers
order by case when Region is null then 1 else 0 end, Region;

