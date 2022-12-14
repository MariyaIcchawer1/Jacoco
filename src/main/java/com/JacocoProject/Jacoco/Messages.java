package com.JacocoProject.Jacoco;

public class Messages {
    public String getMessages(String name){
        StringBuilder s= new StringBuilder();
        if(name==null || name.trim().length()==0)
        {
                    s=s.append("please provide a name");}
        else {
            s.append("Hello " +name+"!");
        }
        return s.toString();
    }
}
