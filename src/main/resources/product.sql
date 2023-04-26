create table stock(
stock_id int not null primary key auto_increment,
product_id int not null,
product_variant_id int default null,
sku text not null,
quantity int not null,
status varchar(8) default "active",
created_by varchar(120) default null,
created_date timestamp not null default current_timestamp(),
modified_by int default null,
modified_date timestamp null default null on Update current_timestamp(),
foreign key (product_id) references products(product_id)
);

create table price(
price_id int not null primary key auto_increment,
product_id bigint(11) not null,
product_variant_id int default null,
sell_price decimal(10,2) not null,
list_price decimal(10,2) not null,
status varchar(120) default "active",
created_by varchar(120) default null,
created_date timestamp not null default current_timestamp(),
modified_by int default null,
modified_date timestamp null default null on Update current_timestamp(),
foreign key (product_id) references products(product_id)
);

create table tax(
tax_id int not null primary key auto_increment,
tax_name varchar(120) not null,
tax_rate decimal(10,2) not null,
status varchar(120) default "active",
created_by varchar(120) default null,
created_date timestamp not null default current_timestamp(),
modified_by int default null,
modified_date timestamp null default null on Update current_timestamp()
);

ALTER TABLE products
    DROP COLUMN price,
    DROP COLUMN c_price,
    DROP COLUMN tax_percent,
    DROP COLUMN sku_code,
    DROP COLUMN qty;
    
ALTER TABLE product_variant
    DROP COLUMN price,
    DROP COLUMN sku_code,
    DROP COLUMN quantity;    

ALTER TABLE products ADD column tax_id int not null after category_id;

ALTER TABLE `product_variant_image` CHANGE `id` `variant_image_id` INT(11) NOT NULL AUTO_INCREMENT;