SELECT DISTINCT city FROM station
WHERE NOT (city LIKE '%a' OR city LIKE '%e' OR city LIKE '%i' OR city LIKE '%o' OR city LIKE '%u');