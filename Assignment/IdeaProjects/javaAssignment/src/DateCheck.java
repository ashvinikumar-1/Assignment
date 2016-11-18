/**
 * Created by ashvinikumar on 16/11/16.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

class DateValidator {
    public boolean check(String s) {
        int date1[]=new int[3];
        int i=0;
        System.out.println(s);
        StringTokenizer st = new StringTokenizer(s,"/");
          while(st.hasMoreTokens()) {
              date1[i]=Integer.parseInt(st.nextToken());
              i++;
          }
          if(date1[1]>=1 && date1[1]<=12) {

              if ((date1[2] % 4) == 0 && date1[2] % 100 != 0 || date1[2] % 400 == 0) {
                  if (date1[1] == 1 || date1[1] == 3 || date1[1] == 5 || date1[1] == 7 || date1[1] == 8 || date1[1] == 10 || date1[1] == 12) {
                      if (date1[0] >= 1 && date1[0] <= 31)
                          return true;
                      else
                          return false;
                  }
                  if (date1[1] == 2) {

                      if (date1[0] >= 1 && date1[0] <= 29)
                          return true;
                      else
                          return false;
                  } else {

                      if (date1[0] >= 1 && date1[0] <= 30)
                          return true;
                      else
                          return false;
                  }
              }
              else
              {
                  if (date1[1] == 1 || date1[1] == 3 || date1[1] == 5 || date1[1] == 7 || date1[1] == 8 || date1[1] == 10 || date1[1] == 12) {
                      if (date1[0] >= 1 && date1[0] <= 31)
                          return true;
                      else
                          return false;
                  }
                  if (date1[1] == 2) {

                      if (date1[0] >= 1 && date1[0] <= 28)
                          return true;
                      else
                          return false;
                  } else {

                      if (date1[0] >= 1 && date1[0] <= 30)
                          return true;
                      else
                          return false;
                  }
              }
          }
          else
              return false;

    }
    public void addDaysToDate(String date, int daysToAdd)  {
        try {
            Date todayDate = new Date();
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String strDate = sdf.format(todayDate);
            Date parsedDate = sdf.parse(date);
            System.out.println(strDate);
            System.out.println(parsedDate);

            Calendar now = Calendar.getInstance();
            now.setTime(parsedDate);
            now.add(Calendar.DAY_OF_MONTH, daysToAdd);
            System.out.println(now.getTime());
        }
        catch (java.lang.Exception e)
        {
            e.printStackTrace();
        }
    }

}
class Employee {
    int empNo;
    String empName;
    String empDate;
    Employee(int empNo,String empName,String empDate ) {
        this.empNo=empNo;
        this.empName=empName;
        this.empDate=empDate;

    }



}

public class DateCheck {
    public static void main(String args[]){
        Employee e[]=new Employee[5];
        Scanner sc=new Scanner(System.in);
        DateValidator d[]=new DateValidator[5];
        boolean b[]=new boolean[5];
        for (int i=0;i<2;i++)
        {
            System.out.println("enter empno, empname,DOJ");
            int a=sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            e[i]=new Employee(a,s1,s2);

            d[i]=new DateValidator();
            b[i]=d[i].check(s2);
        }
        for (int i=0;i<2;i++)
        {
            System.out.println("Employe empno= "+e[i].empNo);
            System.out.println("Employe name= "+e[i].empName);
            System.out.println("Employe Doj= "+e[i].empDate);
            System.out.println("is  Doj valid? "+b[i]);

        }
        System.out.println("enter a date");
        String ss=sc.next();
        if(new DateValidator().check(ss)==true) {
            System.out.println("enter no of days to add");
            int a = sc.nextInt();
            new DateValidator().addDaysToDate(ss, a);
        }
        else
            System.out.println("entered date is invalid");

    }
}

