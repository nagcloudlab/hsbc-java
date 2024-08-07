---

## project : money-transfer-system

1. datasource -> persist data
2. application -> process data

datasource :

    1. SQL : mysql, postgresql, oracle, sqlserver
    2. NoSQL : mongodb, cassandra, couchbase, redis

application

    1. standalone
    2. web-application

---

## datasource : mysql

- relational database
- open source

e.g money-transfer-system

tables :

    - customers
    - accounts
    - transactions

- a customer can have multiple accounts
- a account belongs to a customer
- an account can have multiple transactions
- a transaction belongs to a account

---

- ACCOUNTS
  - account_number
  - balance

---

```sql
  create database money_transfer_system;
  use money_transfer_system;

  create table accounts (
    account_number int primary key,
    balance double
  );

  insert into accounts values (1, 1000);
  insert into accounts values (2, 2000);


create table transactions (
  transaction_id int primary key,
  account_number int,
  amount double,
  transaction_type varchar(10),
  transaction_date timestamp,
  foreign key (account_number) references accounts(account_number)
);


```

---

## standalone application in java

steps:

1. know your appln data model

   - account
   - transaction
   - customer

2. layer(s)

   - data/repository layer -> data persistence code
   - service/business layer -> business logic
   - security layer -> authentication, authorization

---

java's data access technologies on SQL databases:

1. jdbc
2. jpa

---

steps to use jdbc api:

step 1: load the jdbc-driver (mysql-connector-java-8.0.23.jar)
step 2: get a connection with URL, username, password

step 3: create a statement with SQL
step 4: execute the statement
step 5: process the result
step 6: close the connection
