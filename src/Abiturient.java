import java.io.*;
import java.lang.*;
import java.util.*;

/**
 *
 creating a class of applicants
 */
public class Abiturient  //клас абітурієнт
{
    private int id;
    private String name;
    private String surname;
    private String middle_name;
    private String adres;
    private String phone;
    private Double avg_mark;

    /**
     *
     * @param id
    to record identification
     * @param name to record name
     * @param surname to record surname
     * @param middle_name to record middle_name
     * @param adres to record adres
     * @param phone to record phone
     * @param avg_mark to record avg
     */
    Abiturient(int id, String name, String surname, String middle_name, String adres, String phone, Double avg_mark) //конструктор
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
        this.adres = adres;
        this.phone = phone;
        this.avg_mark = avg_mark;
    }

    /**
     *
     * @param name
    for each field get and set
     */


    public void setname(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

    public String getsurname() {
        return surname;
    }

    public void setmiddlename(String name) {
        this.middle_name = name;
    }

    public String getmisslename() {
        return middle_name;
    }

    public void setadres(String name) {
        this.adres = name;
    }

    public String getadres() {
        return adres;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getphone() {
        return phone;
    }
    public void setargmark(Double avg_mark) {
        this.avg_mark = avg_mark;
    }
    public Double getavgmark() {
        return avg_mark;
    }

    /**
     * overloaded display operation
     * @return string of concatenated data
     */

//перевантажена операція виводу на екран
    @Override
    public String toString() {
        return this.name+" " +this.surname+" "+this.middle_name+ " "+this.avg_mark;
    }

/**
 * class for sorting applicants by marks
 */
}
// сортування абітурієнтів за середнім балом
class SortAbiturient implements Comparator<Abiturient> {
    public int compare(Abiturient a, Abiturient b)
    {
        return b.getavgmark().compareTo(a.getavgmark());
    }
}