CREATE TABLE CUSTOMER (
CUSTOMER_ID INT NOT NULL AUTO_INCREMENT,
NAME VARCHAR (255) NOT NULL,
SURNAME VARCHAR(255) NOT NULL,
EMAIL VARCHAR(255) NOT NULL,
PRIMARY KEY (CUSTOMER_ID)
);

INSERT INTO CUSTOMER (NAME,SURNAME.EMAIL)
VALUES('ANDREA','OCCHIELLO','YSQ@HOTMAIL.IT');
INSERT INTO CUSTOMER (NAME,SURNAME.EMAIL)
VALUES('GIOVANNI','OCCHIELLO','FFGQ@LIBERO.IT');
INSERT INTO CUSTOMER (NAME,SURNAME.EMAIL)
VALUES('ANDREA','SPILLACCI','YSSSQ@HOTMAIL.COM');

UPDATE CUSTOMER
SET NAME ='LUCA'
WHERE CUSTOMER_ID=1

DELETE FROM CUSTOMER
WHERE CUSTOMER_ID=2


DELETE FROM CUSTOMER;