package main;

import classes.Company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MainCompanies {
    public static void main(String[] args) {
        Company microsoft = new Company("Microsoft");
        Company google = new Company("Google");
        Company cdek = new Company("Cdek");
        Company sap = new Company("Sap");
        Company apple = new Company("Apple");
        Company first = new Company("001");
        Company sevenup = new Company("7UP");

        Set<Company> set = new TreeSet<>();
        set.add(microsoft);
        set.add(cdek);
        set.add(sap);
        set.add(apple);
        set.add(first);
        set.add(sevenup);
        set.add(google);

        System.out.println(set);


        Map<String, String> microsoftHolidays = new HashMap<>();
        microsoftHolidays.put("Новый год", "31 декабря");
        microsoftHolidays.put("Пасха", "1 апреля");
        microsoftHolidays.put("День основания компании", "4 апреля 1975");

        microsoft.setHolidays(microsoftHolidays);

        Map<String, String> appleHolidays = new HashMap<>();
        microsoftHolidays.put("Новый год", "31 декабря");
        microsoftHolidays.put("Пасха", "1 апреля");
        microsoftHolidays.put("День основания компании", "1 апреля 1976");

        apple.setHolidays(appleHolidays);
    }
}
