import com.prasang.hr.bl.interfaces.managers.*;
import com.prasang.hr.bl.interfaces.pojo.*;
import com.prasang.hr.bl.exceptions.*;
import com.prasang.hr.bl.pojo.*;
import com.prasang.hr.bl.managers.*;
import java.util.*;
class DesignationManagerGetDesignationsTestCase
{
public static void main(String gg[])
{
try
{
DesignationManagerInterface designationManager=DesignationManager.getDesignationManager();
Set<DesignationInterface>designations=designationManager.getDesignations();
designations.forEach((designation)->{
System.out.printf("Code: %d, Title: %s\n",designation.getCode(),designation.getTitle());
});
}catch(BLException ble)
{
List<String>properties=ble.getProperties();
properties.forEach((property)->{
System.out.println(ble.getException(property));
});
}
}
}
