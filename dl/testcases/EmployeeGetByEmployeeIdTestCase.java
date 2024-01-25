import com.prasang.hr.dl.exceptions.*;
import com.prasang.hr.dl.interfaces.dto.*;
import com.prasang.hr.dl.interfaces.dao.*;
import com.prasang.hr.dl.dto.*;
import com.prasang.hr.dl.dao.*;
import java.util.*;
import java.text.*;
public class EmployeeGetByEmployeeIdTestCase
{
public static void main(String gg[])
{
String employeeId=gg[0];
try
{
EmployeeDAOInterface employeeDAO = new EmployeeDAO();
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
EmployeeDTOInterface employeeDTO = employeeDAO.getByEmployeeId(employeeId);
System.out.println("Employee Id: "+employeeDTO.getEmployeeId());
System.out.println("Name: "+employeeDTO.getName());
System.out.println("Designation Code: "+employeeDTO.getDesignationCode());
System.out.println("Date Of Birth: "+sdf.format(employeeDTO.getDateOfBirth()));
System.out.println("Gender: "+employeeDTO.getGender());
System.out.println("Is Indian: "+employeeDTO.getIsIndian());
System.out.println("Basic Salary: "+employeeDTO.getBasicSalary().toPlainString());
System.out.println("PAN Number: "+employeeDTO.getPANNumber());
System.out.println("Aadhar Card Number: "+employeeDTO.getAadharCardNumber());
System.out.println("\n");
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}
