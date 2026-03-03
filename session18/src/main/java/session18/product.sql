CREATE TABLE product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    title VARCHAR(200) NOT NULL,
    created DATE NOT NULL,
    catalog VARCHAR(100) NOT NULL,
    status SMALLINT DEFAULT 1
);

CREATE OR REPLACE FUNCTION list_product()
RETURNS TABLE (
    id INTEGER,
    name VARCHAR(100),
    price DECIMAL(10, 2),
    title VARCHAR(200),
    created DATE,
    catalog VARCHAR(100),
    status SMALLINT
) AS $$
BEGIN
    RETURN QUERY SELECT p.id, p.name, p.price, p.title, p.created, p.catalog, p.status
                 FROM product p;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION insert_product(
    p_name VARCHAR(100),
    p_price DECIMAL(10, 2),
    p_title VARCHAR(200),
    p_created DATE,
    p_catalog VARCHAR(100),
    p_status SMALLINT
) RETURNS VOID AS $$
BEGIN
    INSERT INTO product (name, price, title, created, catalog, status)
    VALUES (p_name, p_price, p_title, p_created, p_catalog, p_status);
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION update_product(
    p_id INTEGER,
    p_name VARCHAR(100),
    p_price DECIMAL(10, 2),
    p_title VARCHAR(200),
    p_created DATE,
    p_catalog VARCHAR(100),
    p_status SMALLINT
) RETURNS VOID AS $$
BEGIN
    UPDATE product
    SET name = p_name,
        price = p_price,
        title = p_title,
        created = p_created,
        catalog = p_catalog,
        status = p_status
    WHERE id = p_id;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION delete_product(p_id INTEGER) RETURNS VOID AS $$
BEGIN
    DELETE FROM product WHERE id = p_id;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_product_by_id(p_id INTEGER)
RETURNS TABLE (
    id INTEGER,
    name VARCHAR(100),
    price DECIMAL(10, 2),
    title VARCHAR(200),
    created DATE,
    catalog VARCHAR(100),
    status SMALLINT
) AS $$
BEGIN
    RETURN QUERY SELECT p.id, p.name, p.price, p.title, p.created, p.catalog, p.status
                 FROM product p
                 WHERE p.id = p_id;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION search_product_by_name(p_name VARCHAR(100))
RETURNS TABLE (
    id INTEGER,
    name VARCHAR(100),
    price DECIMAL(10, 2),
    title VARCHAR(200),
    created DATE,
    catalog VARCHAR(100),
    status SMALLINT
) AS $$
BEGIN
    RETURN QUERY SELECT p.id, p.name, p.price, p.title, p.created, p.catalog, p.status
                 FROM product p
                 WHERE p.name ILIKE '%' || p_name || '%';
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION catalog_statistic()
RETURNS TABLE (
    catalog VARCHAR(100),
    product_count INTEGER
) AS $$
BEGIN
    RETURN QUERY SELECT catalog, COUNT(*) AS product_count
                 FROM product
                 GROUP BY catalog;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION sort_product_by_price(p_asc BOOLEAN)
RETURNS TABLE (
    id INTEGER,
    name VARCHAR(100),
    price DECIMAL(10, 2),
    title VARCHAR(200),
    created DATE,
    catalog VARCHAR(100),
    status SMALLINT
) AS $$
BEGIN
    IF p_asc THEN
        RETURN QUERY SELECT p.id, p.name, p.price, p.title, p.created, p.catalog, p.status
                     FROM product p
                     ORDER BY p.price ASC;
    ELSE
        RETURN QUERY SELECT p.id, p.name, p.price, p.title, p.created, p.catalog, p.status
                     FROM product p
                     ORDER BY p.price DESC;
    END IF;
END;
$$ LANGUAGE plpgsql;

-- Sample data inserts: 30 products
-- You can run these statements after creating the table or call insert_product function.

INSERT INTO product (name, price, title, created, catalog, status) VALUES
('Laptop A', 1200.00, 'High performance laptop', '2024-01-10', 'Electronics', 1),
('Smartphone X', 799.99, 'Latest smartphone model', '2024-02-15', 'Electronics', 1),
('Headphones Pro', 199.50, 'Noise cancelling headphones', '2024-03-05', 'Audio', 1),
('Gaming Mouse', 49.99, 'Ergonomic gaming mouse', '2024-01-20', 'Accessories', 1),
('Mechanical Keyboard', 89.99, 'RGB mechanical keyboard', '2024-01-25', 'Accessories', 1),
('4K Monitor', 329.99, 'Ultra HD monitor', '2024-02-01', 'Electronics', 1),
('Wireless Charger', 29.99, 'Fast wireless charger', '2024-02-10', 'Accessories', 1),
('Bluetooth Speaker', 59.99, 'Portable Bluetooth speaker', '2024-02-18', 'Audio', 1),
('External SSD', 149.99, '1TB external SSD', '2024-02-22', 'Storage', 1),
('USB-C Hub', 34.99, 'Multiport USB-C hub', '2024-03-01', 'Accessories', 1),
('Office Chair', 199.00, 'Comfortable ergonomic chair', '2024-01-15', 'Furniture', 1),
('Desk Lamp', 39.99, 'LED desk lamp', '2024-01-17', 'Furniture', 1),
('Webcam HD', 69.99, '1080p webcam', '2024-01-30', 'Accessories', 1),
('Graphics Tablet', 249.99, 'Digital drawing tablet', '2024-02-05', 'Accessories', 1),
('Smartwatch Z', 249.00, 'Fitness tracking smartwatch', '2024-02-12', 'Wearables', 1),
('VR Headset', 399.00, 'Virtual reality headset', '2024-02-20', 'Electronics', 1),
('Drone Pro', 599.99, 'Camera drone with 4K', '2024-02-28', 'Electronics', 1),
('Action Camera', 299.99, 'Waterproof action camera', '2024-03-03', 'Photography', 1),
('Smart Light Bulb', 24.99, 'Wi-Fi enabled LED bulb', '2024-01-11', 'Home', 1),
('Air Purifier', 129.99, 'HEPA air purifier', '2024-01-13', 'Home', 1),
('Coffee Maker', 89.99, 'Automatic coffee machine', '2024-01-19', 'Kitchen', 1),
('Blender', 59.99, 'High-speed blender', '2024-01-21', 'Kitchen', 1),
('Electric Kettle', 29.99, 'Stainless steel kettle', '2024-01-23', 'Kitchen', 1),
('Fitness Band', 49.99, 'Activity tracking band', '2024-02-02', 'Wearables', 1),
('Portable Projector', 219.99, 'Mini portable projector', '2024-02-08', 'Electronics', 1),
('Digital Camera', 549.99, 'Mirrorless digital camera', '2024-02-16', 'Photography', 1),
('Wireless Earbuds', 99.99, 'True wireless earbuds', '2024-02-24', 'Audio', 1),
('Smart Thermostat', 199.99, 'Wi-Fi thermostat', '2024-03-02', 'Home', 1),
('Robot Vacuum', 299.00, 'Automatic cleaning robot', '2024-03-04', 'Home', 1),
('Streaming Stick', 49.99, '4K streaming device', '2024-03-06', 'Electronics', 1);


