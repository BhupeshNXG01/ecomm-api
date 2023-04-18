INSERT INTO `seller_details` (`company_name`, `logo`, `seller_email`, `seller_mobile`, `seller_gst`, `seller_pan`, `currency`, `url`, `plan_id`, `status`, `payment_gateway_id`, `registered_date`, `createdate`, `updatedate`) VALUES ('NXG Solutions', 'null', 'nxg@gmail.com', '789456123', 'cg04qatre', 'fpr345c', '1', 'abc', '1', '1', '1', '2023-04-18 00:00:00', '2023-04-18 00:00:00', '2023-04-18 00:00:00');

INSERT INTO `add_user` (`seller_id`, `email`, `username`, `mobile`, `password`, `seller_password`, `status`) VALUES ('1', 'lucky@gmail.com', 'kucky', '741852963', 'lucky123', 's123', '1');

INSERT INTO `customer_details` (`name`, `email`, `mobile`, `password`, `currency_id`, `is_guest`, `status`) VALUES ('sehnaz', 'sehnaz@gmail.com', '852963741', 'seh123', '1', '0', '1');

INSERT INTO `categories` (`name`, `position`, `image`, `category_handel`, `status`, `delete_status`) VALUES ('clothes', '1', 'abc', 'dmart', '1', '0');
INSERT INTO `categories` (`name`, `position`, `image`, `category_handel`, `status`, `delete_status`) VALUES ('shoes', '1', 'def', 'nike', '1', '0');

INSERT INTO `shipping_address` (`user_id`, `cart_session`, `name`, `email`, `mobile`, `city`, `state`, `country`, `pincode`, `address_line_1`, `address_line_2`, `land_mark`, `address_type`, `is_default`, `is_billing`, `title`, `status`, `delete_status`, `update_date`) VALUES ('1', 'ordered', 'sehnaz', 'sehnaz@gmail.com', '789456123', 'bhilai', 'cg', 'india', '490023', 'Farid nagar', 'supela bhilai', 'tamil church', 'permanent', '1', '1', 'student', '1', '0', '2023-04-18 00:00:00');

INSERT INTO `discounts` (`discount_name`, `discount_code`, `discount_type`, `value`, `from_date`, `to_date`, `delete_status`, `status`) VALUES ('sale ', 'd01', '1', '20', '2023-04-18', '2023-04-25', '0', '1');

INSERT INTO `products` (`product_id`, `category_id`, `title`, `price`, `c_price`, `tax_percent`, `qty`, `size_type`, `description`, `sku_code`, `barcode`, `is_variants`, `product_url`, `search_terms`, `seo_title`, `meta`, `keyword`, `status`, `delete_status`) VALUES ('1', '2', 'shoe', '3600', '3200', '20', '1', '8', 'nike ', 'nishoe', 'nikebarcode', '1', 'xyz', 'xyz', 'nike', 'nike', 'nike', '1', '0');