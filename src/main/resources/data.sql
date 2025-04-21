--we only use this file in development mode to test on a specific data by providing in this file
select * from test.product_table;

insert into test.product_table (product_name, price, quantity , sku)
value
("Laptop", 12000, 5, "Asus123"),
("Table", 5000, 2, "az123"),
("Lamp", 1200, 8, "lmp123"),
("Mouse", 500, 15, "mou123"),
("Chair", 1000, 10, "ch123");