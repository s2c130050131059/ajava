4.2 Displaying Date in Servlet
------------------------------
![2](https://cloud.githubusercontent.com/assets/16967574/13038900/086ae5b4-d3bf-11e5-83ef-72931207dc8e.PNG)

4.4 A Holistic counter in Servlet
---------------------------------
![4 1](https://cloud.githubusercontent.com/assets/16967574/13038901/0870ee5a-d3bf-11e5-806b-00031ccbb9c4.PNG)
![4 2](https://cloud.githubusercontent.com/assets/16967574/13038899/081ebe82-d3bf-11e5-9685-7c6626292d1d.PNG)

4.8 Dice Roller
---------------
![8](https://cloud.githubusercontent.com/assets/16967574/13038894/081cec56-d3bf-11e5-8000-4820c33e395a.PNG)

4.12 Time Updater in Servlet
----------------------------
![12 1](https://cloud.githubusercontent.com/assets/16967574/13038896/081d49b2-d3bf-11e5-8aee-eed73dcd11bc.PNG)
![12 2](https://cloud.githubusercontent.com/assets/16967574/13038898/081effaa-d3bf-11e5-8bb2-eeca414d97ba.PNG)

4.13 Send Redirect in Servlet
-----------------------------
![14 1](https://cloud.githubusercontent.com/assets/16967574/13038897/081dd22e-d3bf-11e5-9984-f57f601c2ba0.PNG)
![14 2](https://cloud.githubusercontent.com/assets/16967574/13038895/081ce4ea-d3bf-11e5-8c1e-a06203a5e15e.PNG)

4.16 Session Last Accessed Time Example
---------------------------------------
This example illustrates to find current  access time of session  and last access time of session. Sessions are used to maintain state and user identity across multiple page requests. An implementation of HttpSession represents the server's view of the session. The server considers a session to be new until it has been joined by the client. Until the client joins the session, isNew() method returns true.

4.19 Inserting Data In Database table using Statement
-----------------------------------------------------
In this program we are going to insert the data in the database from our java program in the table stored in the database.
To accomplish our goal we first have to make a class named as ServletInsertingData, which must extends the abstract HttpServlet class, the name of the class should be such that other person can understand what this program is going to perform. The logic of the program will be written inside the doGet() method that takes two arguments, first is HttpServletRequest interface and the second one is the HttpServletResponse interface and this method can throw ServletException.
Inside this method call the getWriter() method of the PrintWriter class. We can insert the data in the database only and only if there is a connectivity between our database and the java program. To establish the connection between our database and the java program we first need to call the method forName(), which is static in nature of the class Class. It takes one argument which tells about the database driver we are going to use. Now use the static method getConnection() of the DriverManager class. This method takes three arguments and returns the Connection object. SQL statements are executed and  results are returned within the context of a connection. Now your connection has been established. Now use the method createStatement() of the Connection object which will return the Statement object. This object is used for executing a static SQL statement and obtaining the results produced by it. We have to insert a values into the table so we need to write a query for inserting the values into the table. This query we will write inside the executeUpdate() method of the Statement object. This method returns int value.
If the record will get inserted in the table then output will show "record has been inserted"  otherwise "sorry! Failure".

4.20 Retrieving Data from the table using Statement
---------------------------------------------------
In this program we are going to fetch the data from the database in the table from our java program.
 
To accomplish our goal we first have to make a class named as ServletFetchingData which must extends the abstract HttpServlet class, the name of the class should be such that the other person can understand what this program is going to perform. The logic of the program will be written inside the doGet() method which takes two arguments, first is HttpServletRequest interface and the second one is the HttpServletResponse interface and this method can throw ServletException.
Inside this method call the getWriter() method of the PrintWriter class. We can retrieve the data from the database only and only if there is a connectivity between our database and the java program. To establish the connection between our database and the java program we firstly need to call the method forName() which is static in nature of the class ClassLoader. It takes one argument which tells about the database driver  we are going to use. Now use the static method getConnection() of the DriverManager class. This method takes three arguments and returns the Connection object. SQL statements are executed and  results are returned within the context of a connection. Now your connection has been established. Now use the method createStatement() of the Connection object which will return the Statement object. This object is used for executing a static SQL statement and obtaining the results produced by it. As we need to retrieve the data from the table so we need to write a query to select all the records from the table. This query will be passed in the executeQuery() method of Statement object, which returns the ResultSet object. Now the data will be retrieved by using the getString() method of the ResultSet object.

4.21 Inserting data from the HTML page to the database
------------------------------------------------------
In this program we are going to make program in which we are going to insert the values in the database table from the html form.
To make our program working we need to make one html form in which we will have two fields, one is for the name and the other one  is for entering the password. At last we will have the submit form, clicking on which the values will be passed to the server.
The values which we have entered in the Html form will be retrieved by the server side program which we are going to write. To accomplish our goal we first have to make a class named as ServletInsertingDataUsingHtml which must extends the abstract HttpServlet class, the name of the class should be such that the other person can understand what this program is going to perform. The logic of the program will be written inside the doGet() method which takes two arguments, first is HttpServletRequest interface and the second one is the HttpServletResponse interface and this method can throw ServletException.
Inside this method call the getWriter() method of the PrintWriter class. We can insert the data in the database only and only if there is a connectivity between our database and the java program. To establish the connection between our database and the java program we firstly need to call the method forName() which is static in nature of the class Class. It takes one argument which tells about the database driver  we are going to use. Now use the static method getConnection() of the DriverManager class. This method takes three arguments and returns the Connection object. SQL statements are executed and  results are returned within the context of a connection. Now your connection has been established. Now use the method prepareStatement() of the Connection object which will return the PreparedStatement object and takes one a query which we want to fire as its input. The values which we have got from the html will be set in the database by using the setString() method of the PreparedStatement object.
If the record will get inserted in the table then output will show "record has been inserted"  otherwise "sorry! Failure".

4.22 Retrieving Data from the table using (PreparedStatement)
-------------------------------------------------------------
In this program we are going to fetch the data from the database in the table from our java program using PreparedStatement. 
To accomplish our goal we first have to make a class named as ServletFetchingDataFromDatabase which must extends the abstract HttpServlet class, the name of the class should be such that the other person can understand what this program is going to perform. The logic of the program will be written inside the doGet() method which takes two arguments, first is HttpServletRequest interface and the second one is the HttpServletResponse interface and this method can throw ServletException.
Inside this method call the getWriter() method of the PrintWriter class. We can retrieve the data from the database only and only if there is a connectivity between our database and the java program. To establish the connection between our database and the java program we firstly need to call the method forName() which is static in nature of the class ClassLoader. It takes one argument which tells about the database driver  we are going to use. Now use the static method getConnection() of the DriverManager class. This method takes three arguments and returns the Connection object. SQL statements are executed and  results are returned within the context of a connection. Now your connection has been established. Now use the method prepareStatement() of the Connection object which will return the PreparedStatement object and takes a query as its parameter. In this query we will write the task we want to perform. The Resultset object will be retrieved by using the executeQuery() method of the PreparedStatement object. Now the data will be retrieved by using the getString() method of the ResultSet object.

