# Write your MySQL query statement below
select customer_id,count(customer_id) as count_no_trans from
(select visit_id,customer_id from Visits)a left join
(select visit_id,transaction_id from Transactions)b
on a.visit_id=b.visit_id
where transaction_id is null group by a.customer_id;