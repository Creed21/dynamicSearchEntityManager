package with.hibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "test_tbl")
public class TestTable {
    @Id
    private Integer id1;
    private Integer id2;
    private Integer id3;
    private Integer id4 ;
    private Integer id5 ;
    private Integer id6 ;
    private Integer id7 ;
    private String note1;
    private String note2 ;
    private String note3 ;
    private String note4 ;
    private String note5 ;
    private String note6 ;
    private String note7 ;
    private Date dt1;
    private Date dt2;
    private Date dt3;
    private Date dt4;
    private Date dt5;
    private Date dt6;
    private Date dt7;

    public TestTable() {
    }

    public TestTable(Integer id1, Integer id2, Integer id3, Integer id4, Integer id5, Integer id6, Integer id7,
                     String note1, String note2, String note3, String note4, String note5, String note6, String note7,
                     Date dt1, Date dt2, Date dt3, Date dt4, Date dt5, Date dt6, Date dt7) {
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
        this.id4 = id4;
        this.id5 = id5;
        this.id6 = id6;
        this.id7 = id7;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.note4 = note4;
        this.note5 = note5;
        this.note6 = note6;
        this.note7 = note7;
        this.dt1 = dt1;
        this.dt2 = dt2;
        this.dt3 = dt3;
        this.dt4 = dt4;
        this.dt5 = dt5;
        this.dt6 = dt6;
        this.dt7 = dt7;
    }

    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public Integer getId3() {
        return id3;
    }

    public void setId3(Integer id3) {
        this.id3 = id3;
    }

    public Integer getId4() {
        return id4;
    }

    public void setId4(Integer id4) {
        this.id4 = id4;
    }

    public Integer getId5() {
        return id5;
    }

    public void setId5(Integer id5) {
        this.id5 = id5;
    }

    public Integer getId6() {
        return id6;
    }

    public void setId6(Integer id6) {
        this.id6 = id6;
    }

    public Integer getId7() {
        return id7;
    }

    public void setId7(Integer id7) {
        this.id7 = id7;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public String getNote4() {
        return note4;
    }

    public void setNote4(String note4) {
        this.note4 = note4;
    }

    public String getNote5() {
        return note5;
    }

    public void setNote5(String note5) {
        this.note5 = note5;
    }

    public String getNote6() {
        return note6;
    }

    public void setNote6(String note6) {
        this.note6 = note6;
    }

    public String getNote7() {
        return note7;
    }

    public void setNote7(String note7) {
        this.note7 = note7;
    }

    public Date getDt1() {
        return dt1;
    }

    public void setDt1(Date dt1) {
        this.dt1 = dt1;
    }

    public Date getDt2() {
        return dt2;
    }

    public void setDt2(Date dt2) {
        this.dt2 = dt2;
    }

    public Date getDt3() {
        return dt3;
    }

    public void setDt3(Date dt3) {
        this.dt3 = dt3;
    }

    public Date getDt4() {
        return dt4;
    }

    public void setDt4(Date dt4) {
        this.dt4 = dt4;
    }

    public Date getDt5() {
        return dt5;
    }

    public void setDt5(Date dt5) {
        this.dt5 = dt5;
    }

    public Date getDt6() {
        return dt6;
    }

    public void setDt6(Date dt6) {
        this.dt6 = dt6;
    }

    public Date getDt7() {
        return dt7;
    }

    public void setDt7(Date dt7) {
        this.dt7 = dt7;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestTable testTable = (TestTable) o;

        return id1.equals(testTable.id1);
    }

    @Override
    public int hashCode() {
        return id1.hashCode();
    }

    @Override
    public String toString() {
        return "TestTable{" +
                "id1=" + id1 +
                ", id2=" + id2 +
                ", id3=" + id3 +
                ", id4=" + id4 +
                ", id5=" + id5 +
                ", id6=" + id6 +
                ", id7=" + id7 +
                ", note1='" + note1 + '\'' +
                ", note2='" + note2 + '\'' +
                ", note3='" + note3 + '\'' +
                ", note4='" + note4 + '\'' +
                ", note5='" + note5 + '\'' +
                ", note6='" + note6 + '\'' +
                ", note7='" + note7 + '\'' +
                ", dt1=" + dt1 +
                ", dt2=" + dt2 +
                ", dt3=" + dt3 +
                ", dt4=" + dt4 +
                ", dt5=" + dt5 +
                ", dt6=" + dt6 +
                ", dt7=" + dt7 +
                '}';
    }
}
