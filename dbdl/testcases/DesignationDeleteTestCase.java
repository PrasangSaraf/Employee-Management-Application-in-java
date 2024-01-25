import com.prasang.hr.dl.exceptions.*;
import com.prasang.hr.dl.interfaces.dto.*;
import com.prasang.hr.dl.interfaces.dao.*;
import com.prasang.hr.dl.dto.*;
import com.prasang.hr.dl.dao.*;
public class DesignationDeleteTestCase
{
public static void main(String gg[])
{
int code=Integer.parseInt(gg[0]);
try
{
DesignationDAOInterface designationDAO = new DesignationDAO();
designationDAO.delete(code);
System.out.println("Designation Deleted....");
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}
