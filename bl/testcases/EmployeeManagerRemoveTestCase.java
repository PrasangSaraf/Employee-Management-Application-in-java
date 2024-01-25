import com.prasang.hr.bl.managers.*;
import com.prasang.enums.*;
import com.prasang.hr.bl.interfaces.managers.*;
import com.prasang.hr.bl.interfaces.pojo.*;
import com.prasang.hr.bl.pojo.*;
import com.prasang.hr.bl.exceptions.*;
import java.util.*;
import java.text.*;
import java.math.*;
class EmployeeManagerRemoveTestCase
{
public static void main(String gg[])
{
try
{
EmployeeInterface employee=new Employee();
String employeeId="A10000003";
EmployeeManagerInterface employeeManager=EmployeeManager.getEmployeeManager();
employeeManager.removeEmployee(employeeId);
System.out.printf("Employee Removed......");
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
