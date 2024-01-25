import com.prasang.hr.bl.managers.*;
import com.prasang.enums.*;
import com.prasang.hr.bl.interfaces.managers.*;
import com.prasang.hr.bl.interfaces.pojo.*;
import com.prasang.hr.bl.pojo.*;
import com.prasang.hr.bl.exceptions.*;
import java.util.*;
import java.text.*;
import java.math.*;
class EmployeeManagerPANNumberExistsTestCase
{
public static void main(String gg[])
{
try
{
String panNumber="A12345";
EmployeeManagerInterface employeeManager=EmployeeManager.getEmployeeManager();
EmployeeInterface employee=new Employee();
System.out.println("PAN Number: "+panNumber+"\nExists: "+employeeManager.employeePANNumberExists(panNumber));
}catch(BLException ble)
{
if(ble.hasGenericException())System.out.println(ble.getGenericException());
List<String>properties=ble.getProperties();
for(String property:properties)
{
System.out.println(ble.getException(property));
}
}
}
}
