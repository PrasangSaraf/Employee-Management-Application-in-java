import com.prasang.hr.bl.interfaces.managers.*;
import com.prasang.hr.bl.interfaces.pojo.*;
import com.prasang.hr.bl.exceptions.*;
import com.prasang.hr.bl.pojo.*;
import com.prasang.hr.bl.managers.*;
import java.util.*;
class DesignationManagergetDesignationByTitleTestCase
{
public static void main(String gg[])
{
String title=gg[0];
try
{
DesignationManagerInterface designationManager=DesignationManager.getDesignationManager();
DesignationInterface designation = designationManager.getDesignationByTitle(title);
System.out.printf("Code: %d, Title: %s\n",designation.getCode(),designation.getTitle());
}catch(BLException ble)
{
List<String>properties=ble.getProperties();
properties.forEach((property)->{
System.out.println(ble.getException(property));
});
}
}
}
