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

5. What are the levels of database normalization?

6. What is data integrity?

7. What are the different ways you can enforce data integrity?

8. What types of RDMS exist?

9. What is the main advantage of MySQL?

10. What is the main disadvantage of Oracle and SQL Server?