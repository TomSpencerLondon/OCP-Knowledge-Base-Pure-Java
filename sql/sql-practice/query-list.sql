
-- 1. Group By
SELECT u.fname as "Name", COUNT(u.fname) as "Count"
from users as u
inner join patients as p
on p.pid = u.uid
GROUP BY u.ufname;

-- 2. First 5 names
-- of which there are more than five instances in the patient database
SELECT u.ufname as "Name", COUNT (u.ufname) as "Count"
from users as u
inner join patients as p
on p.pid = u.uid
GROUP BY u.ufname
HAVING COUNT(u.ufname) > 10;

-- 3. Group by, count having example
SELECT u.upcity as "City", COUNT(u.upcity) as "Count"
from users as u
inner join doctors as d on u.uid = d.doctorID
GROUP BY u.upcity
HAVING COUNT(u.upcity) = 1;

-- 4. double inner join example
SELECT u.ufname, u.ulname, p.employername, p.doctorId, d.PrintName, d.speciality
from users as u
inner join patients as p
on p.pid = u.uid
inner join doctors as d
on p.doctorId = d.doctorId;

-- 5.
SELECT first_name, last_name, SUM(amount) as take_home
from employees
INNER JOIN payslip USING(employee_id)
INNER JOIN payslip_item USING(payslip_id)
GROUP BY first_name, last_name;

-- 6.
SELECT first_name, last_name, SUM(amount) as total_pension_contributions
FROM employee
INNER JOIN payslip USING(employee_id)
INNER JOIN payslip_item USING(payslip_id)
WHERE payslip_item.item_description like '%Pension%'
GROUP BY first_name, last_name;

-- 7.
SELECT(SUM(amount) / COUNT(distinct(employee_id))) as "Average Take Home Pay for All Employees in July"
FROM employee
INNER JOIN payslip USING(employee_id)
LEFT OUTER JOIN payslip_item USING(payslip_id)
WHERE pay_date like '2021-07-%';





















