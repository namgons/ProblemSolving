SELECT b.animal_id, b.name
FROM animal_ins a RIGHT OUTER JOIN animal_outs b ON a.animal_id = b.animal_id
WHERE a.animal_id IS NULL