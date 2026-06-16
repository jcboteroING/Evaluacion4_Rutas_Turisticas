SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'public'
ORDER BY table_name;

SELECT 
    table_name,
    column_name,
    data_type,
    is_nullable
FROM information_schema.columns
WHERE table_schema = 'public'
ORDER BY table_name, ordinal_position;

SELECT * FROM tipo ORDER BY id;

SELECT * FROM pais ORDER BY id;

SELECT * FROM ciudad ORDER BY id;

SELECT * FROM ruta ORDER BY id;

SELECT * FROM parada ORDER BY id;

SELECT 
    c.id,
    c.nombre AS ciudad,
    p.nombre AS pais,
    c.latitud,
    c.longitud
FROM ciudad c
JOIN pais p ON p.id = c.idpais
ORDER BY p.nombre, c.nombre;


SELECT datname
FROM pg_database
ORDER BY datname;