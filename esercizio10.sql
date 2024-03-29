create table Clienti (
ID_Cliente Int not NULL auto_increment,
NOME_CLIENTE VARCHAR (45),
COGNOME_CLIENTE VARCHAR (45),
INDIRIZZO_CLIENTE VARCHAR (45),
primary key (ID_Cliente)
);

create table ORDINI (
ID_ORDINE INT not null auto_increment,
ID_CLIENTE INT,
DATA_ORDINE DATE,
PREZZO_ORDINE Decimal (10,2),
primary key (ID_ORDINE)
);

create table PRODOTTI(
ID_PRODOTTO INT not null auto_increment,
NOME_PRODOTTO VARCHAR (45),
PREZZO_PRODOTTO DECIMAL (10,2),
primary key (ID_PRODOTTO)
);

create table DETTAGLI_ORDINI(
ID_DETTAGLIO INT not null auto_increment,
ID_ORDINE INT,
ID_PRODOTTO INT,
QUANTITA INT,
primary key (ID_DETTAGLIO),
foreign key(ID_ORDINE) references ORDINI(ID_ORDINE),
foreign key(ID_PRODOTTO) references PRODOTTI(ID_PRODOTTO)
);

CREATE TABLE Categorie (
 ID_categoria INT AUTO_INCREMENT,
  Nome_categoria VARCHAR(50),
  primary key (ID_categoria)
);

#inner join
SELECT *
FROM Ordini
JOIN Dettagli_ordini ON Ordini.ID_ordine = Dettagli_ordini.ID_ordine;

SELECT Clienti.,ordini
FROM Clienti
JOIN Ordini ON Clienti.ID_cliente = Ordini.ID_cliente;
#right join
SELECT
FROM Ordini
RIGHT JOIN Dettagli_ordini ON Ordini.ID_ordine = Dettagli_ordini.ID_ordine;
#left join
SELECT *
FROM Clienti
LEFT JOIN Ordini ON Clienti.ID_cliente = Ordini.ID_cliente;

#cross join
SELECT *
FROM Clienti
CROSS JOIN Prodotti;