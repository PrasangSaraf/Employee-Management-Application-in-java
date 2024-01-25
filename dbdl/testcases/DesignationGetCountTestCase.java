import com.prasang.hr.dl.exceptions.*;
import com.prasang.hr.dl.interfaces.dao.*;
import com.prasang.hr.dl.dao.*;
public class DesignationGetCountTestCase
{
public static void main(String gg[])
{
try
{
DesignationDAOInterface designationDAO = new DesignationDAO();
System.out.println("Designation count: "+designationDAO.getCount());
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}
