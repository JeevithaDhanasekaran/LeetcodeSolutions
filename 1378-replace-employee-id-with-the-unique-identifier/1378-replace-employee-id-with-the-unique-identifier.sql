# Write your MySQL query statement below
select b.unique_id ,a.name from
(select id,name from Employees)a 
left join
(select id,unique_id from EmployeeUNI)b on a.id=b.id;