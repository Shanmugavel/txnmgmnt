Transaction Management thru Spring 4
====================================
This project explains declarative Transaction Management thru Spring.

**Application.java**       -->This is the main class that boots up the application. It loads all configurations.

**WebConfig.java**         -->This configuration class is used to configure Servlet for h2 database, so that we can connect and view the data in h2 database.

**PersistenceConfig.java** -->This configuration class is used to enable Spring based Transaction support and also used to add Spring's JPA support.

**OrderService.java**      -->This class has two methods under Transaction Management, **findById** has the necessary configuration to just have **readOnly** transaction and no commits are done. **create** method support commit, it does two database operations (updating the **Inventory** table and inserting an entry to **Order** table). The changes are committed only when both the operations are successful, else they are rolled back.

**DBInitializer**          -->This is the actual class that gets triggered during application startup, it loads static data into **Product, User** and **Inventory** table. After loading all the master data, it triggers **create** method in **OrderService**, which does database oerations on two different tables, and then finally the changes are committed by Spring.

Default database url is : **jdbc:h2:mem:testdb**

Execution
---------
After checking out the code, run **Application.java** and watch for the logs in console.

Debug logs of **org.springframework.orm.jpa.JpaTransactionManager** class can be used to see when the transaction got created and when it is getting committed.

Example
-------
Below log statement indicates that a new Transaction scope is being created:

      org.springframework.orm.jpa.JpaTransactionManager - Creating new transaction with name [xyz.shanmugavel.spring.txnmgmnt.service.OrderService.create]: PROPAGATION_REQUIRED,ISOLATION_DEFAULT; ''
      
Below log statement indicates that an existing Transaction scope is being reused:

      org.springframework.orm.jpa.JpaTransactionManager - Participating in existing transaction
      
Below log statement indicates that an existing Transaction is being committed:

      org.springframework.orm.jpa.JpaTransactionManager - Committing JPA transaction on EntityManager [org.hibernate.jpa.internal.EntityManagerImpl@7740b0ab]