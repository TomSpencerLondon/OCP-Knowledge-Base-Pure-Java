## Learn SQL Database Programming
## Query and Manipulate databases from popular relational database servers using SQL
## Josephine Bush

### Introduction To Relational Database Management Systems


1. Which data types are available for you to use when dealing with string data types?
In MySQL we have CHAR[(size)], VARCHAR(size), BINARY[(size)], VARBINARY(size), BLOB(size),
MEDIUMBLOB, LONGBLOB, TEXT(size), TINYTEXT, MEDIUMTEXT, LONGTEXT, ENUM(val1, val2...), SET(val1, val2...) 

2. Why would you not want to use blob or text data types?
BLOB datatypes can make the database much larger and hurt database query performance. Instead store BLOB
information on a file on disk.
TEXT database can go up to LONGTEXT with 4, 294, 967, 295 bytes so it can be useful to stick with CHAR or
VARCHAR if possible.

3. What types of data types are available for you to use when dealing with mumeric data types?
Numeric data types include: TINYINT, SMALLINT, MEDIUMINT, INT, BIGINT for the INT data type. 
Again it is important to select the smallest size INT value that will accommodate the data to reduce
storage space.

Other numeric data types include: FLOAT, DOUBLE, DECIMAL and BIT. 


4. Why would you want to use an unsigned versus a signed int?
Unsigned INT values store only positive numbers and signed INT numeric types can store both positive and negative
numbers.

5. What types of data types are available for you to use when dealing with date
and time data types?
Date and time data types in MySQL include:
- DATE which holds date in the format YYYY-MM-DD. The range is from '1000-01-01' to '9999-12-31'. December 15, 1997
would be stored as 1997-12-15.
- TIME: This data type holds time values in the format of hh:mm:ss. The range is from '-838:59:59' to '838:59:59'.
- DATETIME: this data type can hold a combination of date and time in the format of YYYY-MM-DD hh:mm:ss. The range
is from '1000-01-01 00:00:00' to '9999-12-31 23:59:59'. For example, January 19, 2003, at 3:30pm would be stored as
'2003-01-19 15:30:00'.
- TIMESTAMP: This data type can hold values that contain both date and time parts. This has a range of '1970-01-01 00:00:00'  
UTC to '2038-01-19'
There is also YEAR data type.

6. What types of RDMS support time zone awareness when storing datetime values?
Oracle, PostgresSQL and SQL Server support time zone awareness. MySQL does have TIMESTAMP which also supports
UTC and converts to the current time zone when the query returns the results.

7. What types of other data types are available in MySQL?
Other MySQL data types include JSON and spatial data types. To use XML with MySQL you can use BLOB data type.

8. Why do you need to be careful when choosing data types?
- If you choose a large data type, it can cause extra stress for the database because it will use additional
storage. The less storage you use, the more data you have in memory (RAM). This can improve database performance.
- Data types that are too small for your data can cause data truncation and failures in data insertion and this can 
mean that important data is lost.

9. What data type would you use to store zip codes?
UK Zip codes such as SW19 3QP could be held in CHAR(8) data types as they would mainly be the same size. 

10. What data type can you use to store social security numbers?
National Insurance Numbers such as KM332132D could be stored with varchar(9) as these would be a combination of numbers
and characters. 

