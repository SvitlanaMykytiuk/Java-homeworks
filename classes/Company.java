package classes;

import java.util.Map;

public class Company implements Comparable<Company> {
    private String name;

    private Map<String, String> holidays;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map getHolidays() {
        return holidays;
    }

    public void setHolidays(Map holidays) {
        this.holidays = holidays;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public int compareTo(Company o) {
        if (name.length() > o.getName().length()) {
            return 1;
        }

        if (name.length() < o.getName().length()) {
            return -1;
        }

        if (name.length() == o.getName().length()) {
            return name.compareTo(o.getName());
        }

        return 0;

//        0 - два объекта равны
//        <0 - наш изначальный объект меньше
        //        >0 - наш изначальный объект больше


    }



}
