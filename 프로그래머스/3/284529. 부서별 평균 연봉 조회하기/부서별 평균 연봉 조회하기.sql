SELECT d.dept_id, d.dept_name_en, ROUND(avg(e.sal)) as AVG_SAL
FROM hr_department d
JOIN hr_employees e ON d.dept_id = e.dept_id
GROUP BY e.dept_id, d.dept_name_en
ORDER BY AVG_SAL DESC;