# Write your MySQL query statement below
select p.project_id,IFNULL(ROUND(SUM(e.experience_years)/Count(e.employee_id),2),0.00) AS average_years
from Project p
join Employee e on p.employee_id=e.employee_id
group by project_id ;