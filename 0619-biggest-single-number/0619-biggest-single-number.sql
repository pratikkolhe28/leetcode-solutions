# Write your MySQL query statement below
SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    Group BY num
    HAVING COUNT(num) = 1
) AS unique_numbers;
