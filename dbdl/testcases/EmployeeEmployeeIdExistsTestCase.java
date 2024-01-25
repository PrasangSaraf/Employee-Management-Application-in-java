import com.prasang.hr.dl.exceptions.*;
import com.prasang.hr.dl.interfaces.dto.*;
import com.prasang.hr.dl.interfaces.dao.*;
import com.prasang.hr.dl.dto.*;
import com.prasang.hr.dl.dao.*;
import java.util.*;
import java.text.*;
public class EmployeeEmployeeIdExistsTestCase
{
public static void main(String gg[])
{
String employeeId=gg[0];
try
{
EmployeeDAOInterface employeeDAO = new EmployeeDAO();
System.out.println("Employee Id: "+employeeId+" Exists: "+employeeDAO.employeeIdExists(employeeId));
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}
