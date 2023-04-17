-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: new_ecom
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `add_user`
--

DROP TABLE IF EXISTS `add_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `add_user`
--

LOCK TABLES `add_user` WRITE;
/*!40000 ALTER TABLE `add_user` DISABLE KEYS */;
INSERT INTO `add_user` VALUES (5,1,'shahanz@1423','shahnazbano',1234,'shahnaz','345',1),(6,1,'shahanzbano@342','shahnaz',1234,'shehggj','shah',1),(7,1,'shahanzbano@342','shahnazbano',12345,'shahnaz','shah',1),(10,1,'shahanz@142','shahnaz',1234,'shahnaz','345',1),(11,1,'shahanz@142','shahnaz',1234,'shahnaz','345',1),(12,1,'shahanz@142','shahnaz',1234,'shahnaz','345',1),(13,1,'shahanz@142','shahnaz',1234,'shahnaz','345',1),(14,1,'shahanz@142','shahnaz',1234,'shahnaz','345',1),(15,1,'shahanz@142','shahnaz',1234,'shahnaz','345',1);
/*!40000 ALTER TABLE `add_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `announcement_bar`
--

DROP TABLE IF EXISTS `announcement_bar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `announcement_bar`
--

LOCK TABLES `announcement_bar` WRITE;
/*!40000 ALTER TABLE `announcement_bar` DISABLE KEYS */;
/*!40000 ALTER TABLE `announcement_bar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `applied_discounts`
--

DROP TABLE IF EXISTS `applied_discounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `applied_discounts`
--

LOCK TABLES `applied_discounts` WRITE;
/*!40000 ALTER TABLE `applied_discounts` DISABLE KEYS */;
/*!40000 ALTER TABLE `applied_discounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `awb`
--

DROP TABLE IF EXISTS `awb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `awb`
--

LOCK TABLES `awb` WRITE;
/*!40000 ALTER TABLE `awb` DISABLE KEYS */;
/*!40000 ALTER TABLE `awb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banners`
--

DROP TABLE IF EXISTS `banners`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banners`
--

LOCK TABLES `banners` WRITE;
/*!40000 ALTER TABLE `banners` DISABLE KEYS */;
/*!40000 ALTER TABLE `banners` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blogs`
--

DROP TABLE IF EXISTS `blogs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blogs`
--

LOCK TABLES `blogs` WRITE;
/*!40000 ALTER TABLE `blogs` DISABLE KEYS */;
/*!40000 ALTER TABLE `blogs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'jeans',1,'xyz','xyy',1,1,'2023-03-24 08:54:53');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact_us`
--

DROP TABLE IF EXISTS `contact_us`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contact_us` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(120) NOT NULL,
  `email` varchar(250) NOT NULL,
  `mobile` bigint NOT NULL,
  `message` varchar(1000) NOT NULL,
  `createdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact_us`
--

LOCK TABLES `contact_us` WRITE;
/*!40000 ALTER TABLE `contact_us` DISABLE KEYS */;
/*!40000 ALTER TABLE `contact_us` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_details`
--

DROP TABLE IF EXISTS `customer_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_details`
--

LOCK TABLES `customer_details` WRITE;
/*!40000 ALTER TABLE `customer_details` DISABLE KEYS */;
INSERT INTO `customer_details` VALUES (1,'shahnaz','kshahnaz@123',12345,'123',1,1,1,'2023-03-16 07:09:34');
/*!40000 ALTER TABLE `customer_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discount_products`
--

DROP TABLE IF EXISTS `discount_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discount_products`
--

LOCK TABLES `discount_products` WRITE;
/*!40000 ALTER TABLE `discount_products` DISABLE KEYS */;
/*!40000 ALTER TABLE `discount_products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discounts`
--

DROP TABLE IF EXISTS `discounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discounts`
--

LOCK TABLES `discounts` WRITE;
/*!40000 ALTER TABLE `discounts` DISABLE KEYS */;
INSERT INTO `discounts` VALUES (1,'abc','cba',1,'hh','2023-03-16','2023-03-18',1,1,'2023-03-16 07:09:34');
/*!40000 ALTER TABLE `discounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `main_collection`
--

DROP TABLE IF EXISTS `main_collection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `main_collection` (
  `id` int NOT NULL AUTO_INCREMENT,
  `main_collection_name` varchar(80) NOT NULL,
  `main_collection_handle` varchar(50) NOT NULL,
  `status` int NOT NULL,
  `create_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `main_collection`
--

LOCK TABLES `main_collection` WRITE;
/*!40000 ALTER TABLE `main_collection` DISABLE KEYS */;
/*!40000 ALTER TABLE `main_collection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_products`
--

DROP TABLE IF EXISTS `order_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
  PRIMARY KEY (`order_product_id`),
  KEY `product_id` (`product_id`),
  KEY `order_id` (`order_id`),
  CONSTRAINT `order_products_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`),
  CONSTRAINT `order_products_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_products`
--

LOCK TABLES `order_products` WRITE;
/*!40000 ALTER TABLE `order_products` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
  `paid_date` date DEFAULT NULL,
  `fulfilled_at` date DEFAULT NULL,
  `pickup_address_id` int NOT NULL,
  `status` int NOT NULL,
  `is_delivered` int DEFAULT '0' COMMENT '0 as created, 1 as Dispatched , 2 as Delivered',
  `createdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `cancel_status` int NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `discount_id` (`discount_id`),
  KEY `customer_id` (`customer_id`),
  KEY `shipment_id` (`shipment_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`discount_id`) REFERENCES `discounts` (`id`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customer_details` (`id`),
  CONSTRAINT `orders_ibfk_3` FOREIGN KEY (`shipment_id`) REFERENCES `shipping_address` (`shipment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `package_dimentions`
--

DROP TABLE IF EXISTS `package_dimentions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `package_dimentions`
--

LOCK TABLES `package_dimentions` WRITE;
/*!40000 ALTER TABLE `package_dimentions` DISABLE KEYS */;
/*!40000 ALTER TABLE `package_dimentions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pages`
--

DROP TABLE IF EXISTS `pages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pages`
--

LOCK TABLES `pages` WRITE;
/*!40000 ALTER TABLE `pages` DISABLE KEYS */;
/*!40000 ALTER TABLE `pages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pickup_address`
--

DROP TABLE IF EXISTS `pickup_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pickup_address`
--

LOCK TABLES `pickup_address` WRITE;
/*!40000 ALTER TABLE `pickup_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `pickup_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_images`
--

DROP TABLE IF EXISTS `product_images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_images`
--

LOCK TABLES `product_images` WRITE;
/*!40000 ALTER TABLE `product_images` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_reviews`
--

DROP TABLE IF EXISTS `product_reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_reviews`
--

LOCK TABLES `product_reviews` WRITE;
/*!40000 ALTER TABLE `product_reviews` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_reviews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_variant`
--

DROP TABLE IF EXISTS `product_variant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_variant`
--

LOCK TABLES `product_variant` WRITE;
/*!40000 ALTER TABLE `product_variant` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_variant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_variant_image`
--

DROP TABLE IF EXISTS `product_variant_image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_variant_image`
--

LOCK TABLES `product_variant_image` WRITE;
/*!40000 ALTER TABLE `product_variant_image` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_variant_image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES ('1',1,'jeans',120.00,120.00,12.00,1,1,'abc','abc','abc',1,'xyz','xyy','xyzz','abcc','abc',1,1,'2023-03-24 08:56:12');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `section_featured_category`
--

DROP TABLE IF EXISTS `section_featured_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `section_featured_category`
--

LOCK TABLES `section_featured_category` WRITE;
/*!40000 ALTER TABLE `section_featured_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `section_featured_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seller_details`
--

DROP TABLE IF EXISTS `seller_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seller_details`
--

LOCK TABLES `seller_details` WRITE;
/*!40000 ALTER TABLE `seller_details` DISABLE KEYS */;
INSERT INTO `seller_details` VALUES (1,'nxg','nxg','nxg@123',1234,'123','123',12,'1',12,123,1,'2000-01-23 00:00:00','2000-01-23 00:00:00','2000-01-23 00:00:00'),(2,'nxg','nxg','nxg@1234',1234,'123','123',12,'1',12,123,1,'2000-01-23 00:00:00','2000-01-23 00:00:00','2000-01-23 00:00:00');
/*!40000 ALTER TABLE `seller_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipping_address`
--

DROP TABLE IF EXISTS `shipping_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipping_address`
--

LOCK TABLES `shipping_address` WRITE;
/*!40000 ALTER TABLE `shipping_address` DISABLE KEYS */;
INSERT INTO `shipping_address` VALUES (1,5,'abc','abc','abvc',987654321,'durg','cg','india',491001,'durg','durg','durg','dueg',1,1,'abc',1,0,'2023-03-16 07:09:34','2023-03-16 12:39:34'),(2,6,'def','def','def',789456123,'bhilai','cg','india',491002,'oo','bhilai','bhilai','bhilai',1,1,'def',1,0,'2023-03-16 07:09:34','2023-03-16 12:39:34');
/*!40000 ALTER TABLE `shipping_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shipping_charges`
--

DROP TABLE IF EXISTS `shipping_charges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shipping_charges`
--

LOCK TABLES `shipping_charges` WRITE;
/*!40000 ALTER TABLE `shipping_charges` DISABLE KEYS */;
/*!40000 ALTER TABLE `shipping_charges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiprocket_api_user`
--

DROP TABLE IF EXISTS `shiprocket_api_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiprocket_api_user`
--

LOCK TABLES `shiprocket_api_user` WRITE;
/*!40000 ALTER TABLE `shiprocket_api_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `shiprocket_api_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiprocket_token`
--

DROP TABLE IF EXISTS `shiprocket_token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiprocket_token`
--

LOCK TABLES `shiprocket_token` WRITE;
/*!40000 ALTER TABLE `shiprocket_token` DISABLE KEYS */;
/*!40000 ALTER TABLE `shiprocket_token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `states`
--

DROP TABLE IF EXISTS `states`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `states` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `country_id` int NOT NULL,
  `status` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `states`
--

LOCK TABLES `states` WRITE;
/*!40000 ALTER TABLE `states` DISABLE KEYS */;
/*!40000 ALTER TABLE `states` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `submenu`
--

DROP TABLE IF EXISTS `submenu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `submenu`
--

LOCK TABLES `submenu` WRITE;
/*!40000 ALTER TABLE `submenu` DISABLE KEYS */;
/*!40000 ALTER TABLE `submenu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `theme_setting`
--

DROP TABLE IF EXISTS `theme_setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theme_setting`
--

LOCK TABLES `theme_setting` WRITE;
/*!40000 ALTER TABLE `theme_setting` DISABLE KEYS */;
/*!40000 ALTER TABLE `theme_setting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tracking_details`
--

DROP TABLE IF EXISTS `tracking_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tracking_details`
--

LOCK TABLES `tracking_details` WRITE;
/*!40000 ALTER TABLE `tracking_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `tracking_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `variant_option`
--

DROP TABLE IF EXISTS `variant_option`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `variant_option`
--

LOCK TABLES `variant_option` WRITE;
/*!40000 ALTER TABLE `variant_option` DISABLE KEYS */;
/*!40000 ALTER TABLE `variant_option` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `variant_option_value`
--

DROP TABLE IF EXISTS `variant_option_value`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `variant_option_value`
--

LOCK TABLES `variant_option_value` WRITE;
/*!40000 ALTER TABLE `variant_option_value` DISABLE KEYS */;
/*!40000 ALTER TABLE `variant_option_value` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-17 14:29:14
