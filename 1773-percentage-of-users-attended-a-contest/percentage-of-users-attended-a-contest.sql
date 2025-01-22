# Write your MySQL query statement below
select contest_id , ROUND((COUNT(DISTINCT r.user_id) / (SELECT COUNT(*) FROM Users) * 100), 2) as percentage
FROM 
    Register r
GROUP BY 
    r.contest_id
ORDER BY 
    percentage DESC,
    r.contest_id ASC;
