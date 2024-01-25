package com.prasang.hr.dl.dto;
import com.prasang.hr.dl.interfaces.dto.*;
public class DesignationDTO implements DesignationDTOInterface
{
private int code;
private String title;
public DesignationDTO()
{
this.code=0;
this.title="";
}
public void setCode(int code)
{
this.code=code;
}
public int getCode()
{
return this.code;
}
public void setTitle(String title)
{
this.title=title;
}
public String getTitle()
{
return this.title;
}
public boolean equals(Object other)
{
if(!(other instanceof DesignationDTOInterface)) return false;
DesignationDTOInterface designationDTO;
designationDTO=(DesignationDTO)other;
return this.code==designationDTO.getCode();
}
public int compareTo(DesignationDTOInterface designationDTO)
{
return this.code-designationDTO.getCode();
}
public int hashCode()
{
return code;
}

}
