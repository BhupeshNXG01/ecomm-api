set autocommit = 0;
start transaction ;

-- Table structure for table `seller_details`
DROP TABLE IF EXISTS `seller_details`;
CREATE TABLE `seller_details` (
  `seller_id` int NOT NULL AUTO_INCREMENT,
  `company_name` varchar(250) NOT NULL,
  `logo` varchar(300) NOT NULL,
  `seller_email` varchar(250) NOT NULL,
  `seller_mobile` bigint NOT NULL,
  `seller_gst` varchar(50) NOT NULL,
  `seller_pan` varchar(50) NOT NULL,
  `currency` int NOT NULL,
  `url` varchar(120) NOT NULL,
  `plan_id` int NOT NULL,
  `status` int NOT NULL,
  `payment_gateway_id` int NOT NULL,
  `registered_date` datetime NOT NULL,
  `createdate` datetime NOT NULL,
  `updatedate` datetime NOT NULL,
  PRIMARY KEY (`seller_id`)
) ;

-- Table structure for table `add_user`
DROP TABLE IF EXISTS `add_user`;
CREATE TABLE `add_user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `seller_id` int NOT NULL,
  `email` varchar(250) NOT NULL,
  `username` varchar(200) NOT NULL,
  `mobile` int NOT NULL,
  `password` varchar(200) NOT NULL,
  `seller_password` varchar(200) NOT NULL,
  `status` int NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `seller_id` (`seller_id`),
  CONSTRAINT `add_user_ibfk_1` FOREIGN KEY (`seller_id`) REFERENCES `seller_details` (`seller_id`)
) ;

-- Table structure for table `announcement_bar`
DROP TABLE IF EXISTS `announcement_bar`;
CREATE TABLE `announcement_bar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `seller_id` int NOT NULL,
  `announcement` varchar(300) NOT NULL,
  `target_link` varchar(250) NOT NULL,
  `bg_color` varchar(80) NOT NULL,
  `txt_color` varchar(80) NOT NULL,
  `txt_align` varchar(10) NOT NULL,
  `status` int NOT NULL,
  `start_datetime` datetime NOT NULL,
  `end_datetime` datetime NOT NULL,
  `createdate` datetime NOT NULL,
  `updatedate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `seller_id` (`seller_id`),
  CONSTRAINT `announcement_bar_ibfk_1` FOREIGN KEY (`seller_id`) REFERENCES `seller_details` (`seller_id`)
);

-- Table structure for table `discounts`
DROP TABLE IF EXISTS `discounts`;
CREATE TABLE `discounts` (
  `id` int NOT NULL AUTO_INCREMENT,
  `discount_name` varchar(200) NOT NULL,
  `discount_code` varchar(20) NOT NULL,
  `discount_type` int NOT NULL COMMENT '1 as amt and 2 as per',
  `value` varchar(50) NOT NULL,
  `from_date` date NOT NULL,
  `to_date` date NOT NULL,
  `delete_status` int NOT NULL,
  `status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ;

-- Table structure for table `applied_discounts`
DROP TABLE IF EXISTS `applied_discounts`;
CREATE TABLE `applied_discounts` (
  `id` int NOT NULL AUTO_INCREMENT,
  `discount_id` int NOT NULL,
  `check_status` int NOT NULL,
  `status` int NOT NULL,
  `createdate` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `discount_id` (`discount_id`),
  CONSTRAINT `applied_discounts_ibfk_1` FOREIGN KEY (`discount_id`) REFERENCES `discounts` (`id`),
  CONSTRAINT `applied_discounts_ibfk_2` FOREIGN KEY (`discount_id`) REFERENCES `discounts` (`id`)
);

-- Table structure for table `customer_details`
DROP TABLE IF EXISTS `customer_details`;
CREATE TABLE `customer_details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(120) NOT NULL,
  `email` varchar(250) NOT NULL,
  `mobile` bigint NOT NULL,
  `password` varchar(120) NOT NULL,
  `currency_id` int NOT NULL DEFAULT '1',
  `is_guest` int NOT NULL,
  `status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ;

-- Table structure for table `contact_us`
DROP TABLE IF EXISTS `contact_us`;
CREATE TABLE `contact_us` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(120) NOT NULL,
  `email` varchar(250) NOT NULL,
  `mobile` bigint NOT NULL,
  `message` varchar(1000) NOT NULL,
  `createdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ;

-- Table structure for table `categories`
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `position` int NOT NULL DEFAULT '0',
  `image` varchar(500) NOT NULL,
  `category_handel` varchar(200) NOT NULL,
  `status` int NOT NULL,
  `delete_status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ;

-- Table structure for table `blogs`
DROP TABLE IF EXISTS `blogs`;
CREATE TABLE `blogs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `category_id` int NOT NULL,
  `category_name` varchar(200) NOT NULL,
  `blog_url` varchar(200) NOT NULL,
  `blog_title` varchar(100) NOT NULL,
  `meta` text NOT NULL,
  `description` longtext NOT NULL,
  `likes` int NOT NULL,
  `comments` text NOT NULL,
  `status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `image` varchar(100) NOT NULL,
  `image_url` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`category_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `blogs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `add_user` (`user_id`),
  CONSTRAINT `id` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
) ;

-- Table structure for table `banners`
DROP TABLE IF EXISTS `banners`;
CREATE TABLE `banners` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `image` text NOT NULL,
  `position` int NOT NULL,
  `target_id` text,
  `image_target` int DEFAULT NULL,
  `link` varchar(500) NOT NULL,
  `status` int NOT NULL,
  `createdate` int NOT NULL,
  PRIMARY KEY (`id`)
) ;

-- Table structure for table `main_collection`
DROP TABLE IF EXISTS `main_collection`;
CREATE TABLE `main_collection` (
  `id` int NOT NULL AUTO_INCREMENT,
  `main_collection_name` varchar(80) NOT NULL,
  `main_collection_handle` varchar(50) NOT NULL,
  `status` int NOT NULL,
  `create_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ;

-- Table structure for table `menu`
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menu_id` int NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(200) NOT NULL,
  `menu_option` varchar(50) NOT NULL,
  `menu_link_cat_id` int NOT NULL,
  `menu_link_cat_handle` varchar(200) NOT NULL,
  `position` int NOT NULL,
  `user_id` int NOT NULL,
  `createdate` datetime NOT NULL,
  `updatedate` datetime NOT NULL,
  PRIMARY KEY (`menu_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `add_user` (`user_id`)
) ;

DROP TABLE IF EXISTS `pages`;
CREATE TABLE `pages` (
  `id` int NOT NULL AUTO_INCREMENT,
  `page_title` text NOT NULL,
  `page_url` text NOT NULL,
  `image_url` text NOT NULL,
  `meta_title` text NOT NULL,
  `meta_desc` text NOT NULL,
  `page_desc` text NOT NULL,
  `is_home` int NOT NULL,
  `is_menu` int NOT NULL,
  `is_quick_link` int NOT NULL,
  `delete_status` int NOT NULL,
  `status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ;

DROP TABLE IF EXISTS `pickup_address`;
CREATE TABLE `pickup_address` (
  `add_id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NOT NULL,
  `company_id` int NOT NULL,
  `pickup_code` text NOT NULL,
  `address` text NOT NULL,
  `address_2` text NOT NULL,
  `city` text NOT NULL,
  `state` text NOT NULL,
  `country` text NOT NULL,
  `pin_code` int NOT NULL,
  `phone` bigint NOT NULL,
  `email` text NOT NULL,
  `is_primary_address` int NOT NULL,
  `created_at` text NOT NULL,
  `updated_at` text NOT NULL,
  PRIMARY KEY (`add_id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `pickup_address_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer_details` (`id`)
) ;

-- Table structure for table `product_variant`
DROP TABLE IF EXISTS `product_variant`;
CREATE TABLE `product_variant` (
  `product_variant_id` int NOT NULL AUTO_INCREMENT,
  `product_id` varchar(200) NOT NULL,
  `variant_option_value_id1` int NOT NULL,
  `variant_option_value_id2` int NOT NULL,
  `variant_combination_name` varchar(120) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `sku` varchar(60) NOT NULL,
  `quantity` int NOT NULL,
  `barcode` varchar(120) NOT NULL,
  `is_default` tinyint(1) NOT NULL,
  `user_id` int NOT NULL,
  `delete_status` int NOT NULL,
  `status` int NOT NULL,
  `createdate` date NOT NULL,
  `updatedate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`product_variant_id`),
  UNIQUE KEY `product_id` (`product_id`,`variant_option_value_id1`,`variant_option_value_id2`),
  KEY `variant_option_value_id1` (`variant_option_value_id1`),
  KEY `variant_option_value_id1_2` (`variant_option_value_id1`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `product_variant_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `add_user` (`user_id`)
) ;

-- Table structure for table `product_variant_image`
DROP TABLE IF EXISTS `product_variant_image`;
CREATE TABLE `product_variant_image` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_variant_id` int NOT NULL,
  `img_url` varchar(500) NOT NULL,
  `is_primary` int NOT NULL,
  `status` int NOT NULL,
  `createdate` datetime NOT NULL,
  `updatedate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `product_variant_id` (`product_variant_id`),
  CONSTRAINT `product_variant_image_ibfk_1` FOREIGN KEY (`product_variant_id`) REFERENCES `product_variant` (`product_variant_id`)
) ;

-- Table structure for table `products`
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
  `product_id` varchar(200) NOT NULL,
  `category_id` int NOT NULL,
  `title` varchar(200) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `c_price` decimal(10,2) NOT NULL,
  `tax_percent` decimal(10,2) NOT NULL,
  `qty` int NOT NULL,
  `size_type` int NOT NULL,
  `description` longtext NOT NULL,
  `sku_code` text NOT NULL,
  `barcode` text NOT NULL,
  `is_variants` int NOT NULL,
  `product_url` text NOT NULL,
  `search_terms` text NOT NULL,
  `seo_title` varchar(250) NOT NULL,
  `meta` varchar(170) NOT NULL,
  `keyword` varchar(200) NOT NULL,
  `status` int NOT NULL,
  `delete_status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`product_id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `category_id` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
) ;

DROP TABLE IF EXISTS `product_images`;
CREATE TABLE `product_images` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_id` varchar(200) NOT NULL,
  `image_name` varchar(200) NOT NULL,
  `url` text NOT NULL,
  `is_primary` int NOT NULL,
  `status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `product_images_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`)
) ;

-- Table structure for table `section_featured_category`
DROP TABLE IF EXISTS `section_featured_category`;
CREATE TABLE `section_featured_category` (
  `section_featured_category_id` varchar(50) NOT NULL,
  `seller_id` int NOT NULL,
  `category_id` int NOT NULL,
  `no_of_column_desk` int NOT NULL,
  `no_of_column_mob` int NOT NULL,
  `no_of_product` int NOT NULL,
  `heading` varchar(150) NOT NULL,
  `heading_size` int NOT NULL,
  `description` varchar(300) NOT NULL,
  `description_style` int NOT NULL,
  `position` int NOT NULL,
  `section_type` tinyint(1) NOT NULL,
  `image_url` text NOT NULL,
  `image_url_mobile` text NOT NULL,
  `status` int NOT NULL,
  `user_id` int NOT NULL,
  `createdate` datetime NOT NULL,
  `updatedate` datetime NOT NULL,
  `image_target` varchar(20) NOT NULL,
  `target_link` varchar(200) NOT NULL,
  KEY `section_featured_category_id` (`category_id`),
  KEY `section_featured_category_seller_id` (`seller_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `section_featured_category_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `add_user` (`user_id`),
  CONSTRAINT `section_featured_category_id` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`),
  CONSTRAINT `section_featured_category_seller_id` FOREIGN KEY (`seller_id`) REFERENCES `seller_details` (`seller_id`)
) ;

-- Table structure for table `shipping_address`
DROP TABLE IF EXISTS `shipping_address`;
CREATE TABLE `shipping_address` (
  `shipment_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `cart_session` varchar(200) NOT NULL,
  `name` varchar(120) NOT NULL,
  `email` varchar(200) NOT NULL,
  `mobile` bigint NOT NULL,
  `city` varchar(120) NOT NULL,
  `state` varchar(50) NOT NULL,
  `country` varchar(100) NOT NULL,
  `pincode` bigint NOT NULL,
  `address_line_1` varchar(250) NOT NULL,
  `address_line_2` text NOT NULL,
  `land_mark` text NOT NULL,
  `address_type` varchar(200) NOT NULL,
  `is_default` int NOT NULL,
  `is_billing` int NOT NULL,
  `title` varchar(50) NOT NULL,
  `status` int NOT NULL,
  `delete_status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`shipment_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `shipping_address_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `add_user` (`user_id`)
) ;

-- Table structure for table `shipping_charges`
DROP TABLE IF EXISTS `shipping_charges`;
CREATE TABLE `shipping_charges` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pincode` int DEFAULT NULL,
  `charge` decimal(10,2) NOT NULL,
  `min_order_amt` decimal(10,2) NOT NULL,
  `max_order_amt` decimal(10,2) NOT NULL,
  `country_code` varchar(50) DEFAULT NULL,
  `createdate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

-- Table structure for table `shiprocket_api_user`
DROP TABLE IF EXISTS `shiprocket_api_user`;
CREATE TABLE `shiprocket_api_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  `status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `shiprocket_api_user_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer_details` (`id`)
) ;

-- Table structure for table `shiprocket_token`
DROP TABLE IF EXISTS `shiprocket_token`;
CREATE TABLE `shiprocket_token` (
  `p_id` int NOT NULL AUTO_INCREMENT,
  `id` int NOT NULL,
  `customer_id` int NOT NULL,
  `first_name` text NOT NULL,
  `last_name` text NOT NULL,
  `email` text NOT NULL,
  `company_id` text NOT NULL,
  `created_at` text NOT NULL,
  `token` text NOT NULL,
  `status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`p_id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `shiprocket_token_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer_details` (`id`)
) ;

-- Table structure for table `states`
DROP TABLE IF EXISTS `states`;
CREATE TABLE `states` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `country_id` int NOT NULL,
  `status` int NOT NULL,
  PRIMARY KEY (`id`)
) ;

-- Table structure for table `submenu`
DROP TABLE IF EXISTS `submenu`;
CREATE TABLE `submenu` (
  `submenu_id` int NOT NULL AUTO_INCREMENT,
  `menu_id` int NOT NULL,
  `category_id` int NOT NULL,
  `category_handel` varchar(200) NOT NULL,
  `position` int NOT NULL,
  `user_id` int NOT NULL,
  `createdate` datetime NOT NULL,
  `updatedate` datetime NOT NULL,
  PRIMARY KEY (`submenu_id`),
  KEY `submenu_id` (`category_id`),
  KEY `user_id` (`user_id`),
  KEY `menu_id` (`menu_id`),
  CONSTRAINT `submenu_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `add_user` (`user_id`),
  CONSTRAINT `submenu_ibfk_2` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`),
  CONSTRAINT `submenu_id` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
) ;

-- Table structure for table `theme_setting`
DROP TABLE IF EXISTS `theme_setting`;
CREATE TABLE `theme_setting` (
  `id` int NOT NULL AUTO_INCREMENT,
  `seller_id` int NOT NULL,
  `header_background_color` varchar(100) NOT NULL,
  `header_text_color` varchar(100) NOT NULL,
  `footer_background_color` varchar(100) NOT NULL,
  `footer_text_color` varchar(100) NOT NULL,
  `is_menu` int DEFAULT NULL,
  `button_background_color` varchar(100) NOT NULL,
  `button_text_color` varchar(100) NOT NULL,
  `font_family` varchar(150) NOT NULL,
  `status` int NOT NULL,
  `createdate` datetime NOT NULL,
  `updatedate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `seller_id` (`seller_id`),
  CONSTRAINT `theme_setting_ibfk_1` FOREIGN KEY (`seller_id`) REFERENCES `seller_details` (`seller_id`)
) ;

-- Table structure for table `variant_option`
DROP TABLE IF EXISTS `variant_option`;
CREATE TABLE `variant_option` (
  `variant_option_id` int NOT NULL AUTO_INCREMENT,
  `option_name` varchar(48) NOT NULL,
  `user_id` int NOT NULL,
  `status` int NOT NULL,
  `createdate` date NOT NULL,
  `updatedate` date NOT NULL,
  PRIMARY KEY (`variant_option_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `variant_option_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `add_user` (`user_id`)
) ;

-- Table structure for table `variant_option_value`
DROP TABLE IF EXISTS `variant_option_value`;
CREATE TABLE `variant_option_value` (
  `variant_option_value_id` int NOT NULL AUTO_INCREMENT,
  `variant_option_id` int NOT NULL,
  `option_value` varchar(25) NOT NULL,
  `status` int NOT NULL,
  `createdate` datetime NOT NULL,
  `updatedate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`variant_option_value_id`),
  KEY `variant_option_id` (`variant_option_id`),
  CONSTRAINT `variant_option_value_ibfk_1` FOREIGN KEY (`variant_option_id`) REFERENCES `variant_option` (`variant_option_id`)
);

-- Table structure for table `orders`
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `shipment_id` int NOT NULL,
  `shiprocket_order_id` bigint NOT NULL,
  `payment_status` int NOT NULL COMMENT '1 for paid, 2 for cod',
  `payment_mode` text NOT NULL,
  `payment_id` text,
  `fulfilment_status` int NOT NULL COMMENT '1 for fulfilled, 0 for unfulfilled',
  `shiping_mode` int NOT NULL,
  `shipping_add_id` int NOT NULL,
  `billing_add_id` int DEFAULT NULL,
  `order_total` decimal(10,2) NOT NULL,
  `discount_amount` decimal(10,2) NOT NULL,
  `discount_type` int NOT NULL,
  `item_total` decimal(10,2) NOT NULL,
  `tax_percent` decimal(5,2) NOT NULL,
  `tax_price` decimal(10,2) NOT NULL,
  `shiping_price` decimal(10,2) NOT NULL,
  `total_amount` decimal(10,2) NOT NULL,
  `customer_id` int NOT NULL,
  `discount_id` int NOT NULL,
  `cart_session` varchar(200) NOT NULL,
  `paid_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fulfilled_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pickup_address_id` int NOT NULL,
  `status` int NOT NULL,
  `is_delivered` int DEFAULT '0' COMMENT '0 as created, 1 as Dispatched , 2 as Delivered',
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cancel_status` int NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `discount_id` (`discount_id`),
  KEY `customer_id` (`customer_id`),
  KEY `shipment_id` (`shipment_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`discount_id`) REFERENCES `discounts` (`id`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customer_details` (`id`),
  CONSTRAINT `orders_ibfk_3` FOREIGN KEY (`shipment_id`) REFERENCES `shipping_address` (`shipment_id`)
) ;

-- Table structure for table `transactions`
DROP TABLE IF EXISTS `transactions`;
CREATE TABLE `transactions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `transaction_id` varchar(100) NOT NULL,
  `order_id` int NOT NULL,
  `customer_id` int NOT NULL,
  `amount` int NOT NULL,
  `transaction_status` text NOT NULL,
  `payment_id` text NOT NULL,
  `status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `customer_id` (`customer_id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer_details` (`id`),
  CONSTRAINT `transactions_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`)
) ;

DROP TABLE IF EXISTS `product_reviews`;
CREATE TABLE `product_reviews` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_id` int NOT NULL,
  `product_id` varchar(200) NOT NULL,
  `variant_combine_id` int NOT NULL,
  `rating` int NOT NULL,
  `feedback` varchar(1000) NOT NULL,
  `customer_id` int NOT NULL,
  `customer_name` varchar(150) NOT NULL,
  `ip_address` varchar(100) NOT NULL,
  `status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `product_id_idx` (`product_id`),
  KEY `customer_id` (`customer_id`),
  KEY `order_id` (`order_id`),
  KEY `variant_combine_id` (`variant_combine_id`),
  CONSTRAINT `product_reviews_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer_details` (`id`),
  CONSTRAINT `product_reviews_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  CONSTRAINT `product_reviews_ibfk_3` FOREIGN KEY (`variant_combine_id`) REFERENCES `variant_option_value` (`variant_option_id`)
) ;

-- Table structure for table `package_dimentions`
DROP TABLE IF EXISTS `package_dimentions`;
CREATE TABLE `package_dimentions` (
  `package_dimention_id` int NOT NULL AUTO_INCREMENT,
  `order_id` int NOT NULL,
  `height` decimal(5,2) NOT NULL,
  `weight` decimal(5,2) NOT NULL,
  `width` decimal(5,2) NOT NULL,
  `length` decimal(5,2) NOT NULL,
  `is_default` int DEFAULT '0',
  `status` int DEFAULT '0',
  `createdate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`package_dimention_id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `package_dimentions_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`)
) ;

-- Table structure for table `discount_products`
DROP TABLE IF EXISTS `discount_products`;
CREATE TABLE `discount_products` (
  `id` int NOT NULL AUTO_INCREMENT,
  `discount_id` int NOT NULL,
  `product_id` varchar(200) NOT NULL,
  `order_id` int NOT NULL,
  `status` int NOT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`),
  KEY `discount_id` (`discount_id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `discount_products_ibfk_1` FOREIGN KEY (`discount_id`) REFERENCES `discounts` (`id`),
  CONSTRAINT `discount_products_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  CONSTRAINT `product_id` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`)
) ;

-- Table structure for table `order_products`
DROP TABLE IF EXISTS `order_products`;
CREATE TABLE `order_products` (
  `order_product_id` int NOT NULL AUTO_INCREMENT,
  `order_id` int NOT NULL,
  `product_id` varchar(200) NOT NULL,
  `row_id` text,
  `qty` int NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  `delete_status` int DEFAULT NULL,
  `feedback_status` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `createdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `order_products_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`),
  CONSTRAINT `order_products_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`)
) ;

-- Table structure for table `tracking_details`
DROP TABLE IF EXISTS `tracking_details`;
CREATE TABLE `tracking_details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_id` int NOT NULL,
  `courier` int NOT NULL,
  `tracking_no` text NOT NULL,
  `tracking_link` text NOT NULL,
  `status` int NOT NULL,
  `createdate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `tracking_details_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`)
) ;

-- Table structure for table `awb`
DROP TABLE IF EXISTS `awb`;
CREATE TABLE `awb` (
  `id` int NOT NULL AUTO_INCREMENT,
  `courier_company_id` int NOT NULL,
  `awb_code` text NOT NULL,
  `cod` int NOT NULL,
  `order_id` int NOT NULL,
  `shipment_id` int NOT NULL,
  `assigned_date_time` text NOT NULL,
  `courier_name` text NOT NULL,
  `status` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `order_id` (`order_id`),
  KEY `shipment_id` (`shipment_id`),
  CONSTRAINT `awb_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  CONSTRAINT `awb_ibfk_2` FOREIGN KEY (`shipment_id`) REFERENCES `shipping_address` (`shipment_id`)
) ;

commit ;