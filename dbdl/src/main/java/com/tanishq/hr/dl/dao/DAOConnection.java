package com.prasang.hr.dl.dao;
import com.prasang.hr.dl.exceptions.*;
import java.sql.*;
public class DAOConnection
{
private DAOConnection(){}
public static Connection getConnection() throws DAOException
{
Connection connection=null;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","**","**");
}catch(Exception e)
{
throw new DAOException(e.getMessage());
}
return connection;
}
}
