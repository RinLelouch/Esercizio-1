CREATE TABLE MEAL(
  NAME VARCHAR(255),
  PRICE DOUBLE,
  CALORIES INT
  );
  INSERT INTO MEAL (NAME,PRICE,CALORIES)
  VALUES('SPAGHETTI', 15.0, 500);
  INSERT INTO MEAL (NAME,PRICE,CALORIES)
  VALUES('RISOTTO', 10.0, 600) ;
  INSERT INTO MEAL (NAME,PRICE,CALORIES)
  VALUES('PARMIGIANA', 9.0, 600);
  INSERT INTO MEAL (NAME,PRICE,CALORIES)
  VALUES('RAVIOLI', 8.0, 450);
  INSERT INTO MEAL (NAME,PRICE,CALORIES)
  VALUES('PIZZA', 12, 800);


CREATE TABLE INGREDIENT (
  NAME VARCHAR (255),
  CONTAINS_LACTOSE BOOLEAN,
  VEGETARIAN BOOLEAN,
  GLUTEN_FREE BOOLEAN,
  VEGAN BOOLEAN
  );
  INSERT INTO INGREDIENT (NAME,CONTAINS_LACTOSE,VEGETARIAN,GLUTEN_FREE,VEGAN)
  VALUES ('EGGS', FALSE,TRUE,TRUE,FALSE);
  INSERT INTO INGREDIENT (NAME,CONTAINS_LACTOSE,VEGETARIAN,GLUTEN_FREE,VEGAN)
  VALUES ('BREAD', FALSE,TRUE,FALSE,TRUE);
  INSERT INTO INGREDIENT (NAME,CONTAINS_LACTOSE,VEGETARIAN,GLUTEN_FREE,VEGAN)
  VALUES ('BEEF PATTY', FALSE,FALSE,TRUE,FALSE);
  INSERT INTO INGREDIENT (NAME,CONTAINS_LACTOSE,VEGETARIAN,GLUTEN_FREE,VEGAN)
  VALUES ('LETTUCE', FALSE,TRUE,TRUE,TRUE);
  INSERT INTO INGREDIENT (NAME,CONTAINS_LACTOSE,VEGETARIAN,GLUTEN_FREE,VEGAN)
  VALUES ('YOGHURT', TRUE,TRUE,TRUE,FALSE);