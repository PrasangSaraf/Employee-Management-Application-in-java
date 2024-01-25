import com.prasang.hr.bl.interfaces.managers.*;
import com.prasang.hr.bl.interfaces.pojo.*;
import com.prasang.hr.bl.exceptions.*;
import com.prasang.hr.bl.pojo.*;
import com.prasang.hr.bl.managers.*;
import java.util.*;
class DesignationManagerCodeExistsTestCase
{
public static void main(String gg[])
{
int code=Integer.parseInt(gg[0]);
try
{
DesignationManagerInterface designationManager=DesignationManager.getDesignationManager();
System.out.println(code+" Exists: "+designationManager.designationCodeExists(code));
}catch(BLException ble)
{
List<String>properties=ble.getProperties();
properties.forEach((property)->{
System.out.println(ble.getException(property));
});
}
}
}
