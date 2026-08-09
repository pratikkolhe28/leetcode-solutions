# Write your MySQL query statement below

# select * from Customers where Customers.id NOT IN (select customerId from Orders);

SELECT name as Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);