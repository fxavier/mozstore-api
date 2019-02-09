ALTER TABLE product_detail
ADD COLUMN product_id BIGINT,
ADD CONSTRAINT fk_product_detail_product
   FOREIGN KEY(product_id) REFERENCES product(product_id);