import com.prasang.hr.bl.managers.*;
import com.prasang.enums.*;
import com.prasang.hr.bl.interfaces.managers.*;
import com.prasang.hr.bl.interfaces.pojo.*;
import com.prasang.hr.bl.pojo.*;
import com.prasang.hr.bl.exceptions.*;
import java.util.*;
import java.text.*;
import java.math.*;
class EmployeeManagerGetEmployeeCountTestCase
{
public static void main(String gg[])
{
try
{
EmployeeManagerInterface employeeManager=EmployeeManager.getEmployeeManager();
EmployeeInterface employee=new Employee();
int count=employeeManager.getEmployeeCount();
System.out.println("Employee Count: "+count);
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
