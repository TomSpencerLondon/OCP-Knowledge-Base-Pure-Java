## Learn SQL Database Programming
## Query and Manipulate databases from popular relational database servers using SQL
## Josephine Bush

### Introduction To Relational Database Management Systems

Questions

1. What is SQL?

Structured Query Language or SQL is the language that is used for querying
and maniulating data and defining structures in databases. SQL is powerful and
simple. With SQL you can execute queries, retrieve, insert, update, and delete
data, create databases and tables.

2. What are the different subdivisions of SQL?
The subdivisions of SQL are Data Definition Language (DDL), Data Manipulation Language (DML),
and Data Control Language (DCL).

- We use DDL commands to specify database schema:
    - CREATE: This is used to create a database or objects in the database.
    - ALTER: This is used to alter a database or objects in a database.
    - DROP: This is used to delete a database or objects in a database.
    - TRUNCATE: This is used to remove all data from a table instantaneously.
- We use DML commands to query and modify data:
    - SELECT: This is used to retrieve data from a database.
    - INSERT: This is used to insert data into a database.
    - UPDATE: This is used to update data in a database.
    - DELETE: This is used to remove data from a database.
- We use DCL commands to control permissions and translations:
    - GRANT: This is used to give access to a user.
    - REVOKE: This is used to take access away from a user.
    - COMMIT: This is used to save changes in a transaction.
    - ROLLBACK: This is used to remove the saved changes in a transaction.

3. What are the elements of a SQL statement?
- Queries that retrieve data based on specific criteria.
- Clauses that are components of statements or queries.
- Predicates that are logical conditions that evaluate to true or false.
These help you narrow down the results of your queries.
- Expressions that produce either scalar values or tables of columns and rows.
Expressions are part of predicates.
- Statements that are run against a database, comprised of clauses and, optionally,
expressions and predicates.
- White space that is generally ignored in SQL statements and queries, making it
easier to format for readability because you don't have to worry so much about
particular spacing for the SQL to run correctly.

![Screenshot 2021-07-18 at 10 09 45](https://user-images.githubusercontent.com/27693622/126061883-74b4df12-8576-4728-9dba-889932858ce5.png)

4. What are the reasons to normalize a database?
We should normalize our databases in order to avoid redundant data, optimize database performance,
and ensure data integrity.
Without database normalization it is possible to have data redundancy and it can also
be difficult to update and maintain the database without data loss.

5. What are the levels of database normalization?
There are three levels of database normalization:
- First normal form (1NF)
    - define data, columns, data types and put data into columns
    - eliminate repeating grouops of data:
        - no repeating columns (e.g. Year1, Year2) instead have year
        - not multiple values in same field - eg 1985, 1987 - place year in a row
        - No exact duplicate rows
- Second normal form (2NF)
    - Meet the requirements of 1NF
    - Remove partial dependencies - narrow tables to single purpose
- Third normal form (3NF)
    - Meet the requirements of 2NF
    - No attributes depend on other non-key attributes 

6. What is data integrity?
Data integrity refers to the consistency and accuracy of data. There are three
types of data integrity: entity integrity, referential integrity and domain
integrity. Entity integrity ensures rows in a table are identifiably unique.
Referential integrity ensures that tables can be linked together. You achieve
referential integrity by having a primary key on the parent table and a foreign
key on the child table.

7. What are the different ways you can enforce data integrity?
For entity integrity we can use unique constraints, not null constraints and primary keys.
Unique constraints ensure that values in a column or columns are different from each other.
If we create a unique constraint on one column, it forces the table to have unique values in
that specific column. If they are not unique, then the row will not be able to be inserted or
updated. This avoids duplicate data. 
Not null constraints ensure that all values in a column are not null.
Primary keys are used to ensure that all values in a column are not null and unique.

Referential integrity refers to the consistency and accuracy between tables that can
be linked together. Primary key on the parent table and foreign keys on the child
table ensure referential integrity. The foreign key can maintain three types of table
relationships:
- one to one - one table has one corresponding row on another table - eg employees and computers
- one to many - one table has none, one or many corresponding rows on another table. Adults and children.
- many to many - Many rows in one table correspond to many rows in another table. customers and products.

Domain integrity refers to the defined rules for formatting, range, and value
using check and default constraints. Check constraints can check that values in a column are in a range of
values such as "Y" and "N" for instance. Default constraints ensure a default 
value for a field such as "false".

8. What types of RDMS exist?
There are four main types of RDMS, Oracle, MySQL, SQL Server and PostgreSQL.
Oracle - has a lot of functionality for database administrators.
MySQL - free easy to implement - support is not free.
SQL Server - offers replication and high availabity and partitioning
PostgreSQL - high availability and partitioning - scalable and can handle
terabytes of data.

9. What is the main advantage of MySQL?
It is free, open source and easy to implement.

10. What is the main disadvantage of Oracle and SQL Server?
They are expensive.