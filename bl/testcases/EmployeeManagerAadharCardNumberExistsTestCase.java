import com.prasang.hr.bl.managers.*;
import com.prasang.enums.*;
import com.prasang.hr.bl.interfaces.managers.*;
import com.prasang.hr.bl.interfaces.pojo.*;
import com.prasang.hr.bl.pojo.*;
import com.prasang.hr.bl.exceptions.*;
import java.util.*;
import java.text.*;
import java.math.*;
class EmployeeManagerAadharCardNumberExistsTestCase
{
public static void main(String gg[])
{
try
{
String aadharCardNumber="U82345";
EmployeeManagerInterface employeeManager=EmployeeManager.getEmployeeManager();
EmployeeInterface employee=new Employee();
System.out.println("PAN Number: "+aadharCardNumber+"\nExists: "+employeeManager.employeeAadharCardNumberExists(aadharCardNumber));
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
