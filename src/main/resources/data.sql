--we only use this file in development mode to test on a specific data by providing in this file
select * from test.product_table;

insert into test.product_table (product_name, price, quantity , sku)
value
("Laptop", 12000, 5, "Asus123"),
("Table", 5000, 2, "az123"),
("Lamp", 1200, 8, "lmp123"),
("Mouse", 500, 15, "mou123"),
("Chair", 1000, 10, "ch123"),
("Monitor", 7000, 3, "mon456"),
("Keyboard", 800, 12, "kbd789"),
("Headphones", 1500, 9, "hdp321"),
("Pen Drive", 600, 20, "pd678"),
("Notebook", 50, 100, "nbk987"),
("Router", 2500, 6, "rtr654"),
("Webcam", 2200, 4, "wbc321"),
("Speaker", 1800, 7, "spk246"),
("Microphone", 2700, 5, "mic135"),
("Desk Mat", 350, 30, "dmt864"),
("Printer", 8500, 2, "prt753"),
("Scanner", 6500, 3, "scn159"),
("Smartphone", 15000, 4, "smp951"),
("Tablet", 11000, 6, "tbl123"),
("TV", 25000, 1, "tv852");
