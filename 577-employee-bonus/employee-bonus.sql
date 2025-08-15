select emp.name, bo.bonus
from Employee as emp
left join  Bonus as bo
on emp.empId=bo.empId
where bonus <1000 or bonus is null;