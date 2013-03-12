package spring.mvc.analytics.util;

import java.util.UUID;

public class IDGenerator {
    
    public String generateDepartmentNo(){
         String id = UUID.randomUUID().toString().substring(0, 8);
         return "d" + id;
    }

}
