import com.prasang.hr.bl.managers.*;
import com.prasang.hr.bl.interfaces.managers.*;
import com.prasang.hr.bl.interfaces.pojo.*;
import com.prasang.hr.bl.pojo.*;
import com.prasang.hr.bl.exceptions.*;
import java.util.*;
class DesignationManagerDeleteTestCase
{
public static void main(String gg[])
{
int code=Integer.parseInt(gg[0]);
try
{
DesignationManagerInterface designationManager;
designationManager=DesignationManager.getDesignationManager();
designationManager.removeDesignation(code);
System.out.println("Designation Deleted...");
}catch(BLException ble)
{
if(ble.hasGenericException()) System.out.println(ble.getGenericException());
List<String> properties=ble.getProperties();
for(String property:properties) System.out.println(ble.getException(property));
}
}
}
