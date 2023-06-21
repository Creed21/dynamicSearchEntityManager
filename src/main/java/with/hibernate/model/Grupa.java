package with.hibernate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "grupa")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Grupa {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "naziv")
    private String naziv;
    @Column(name = "dtpoc")
    private Date dtpoc;
    @Column(name = "usc")
    private String usc;
    @Column(name = "dtc")
    private Date dtc;
    @Column(name = "usm")
    private String usm;
    @Column(name = "dtm")
    private Date dtm;

    public Grupa() {    }

    public Grupa(Integer id, String naziv, Date dtpoc, String usc, Date dtc, String usm, Date dtm) {
        this.id = id;
        this.naziv = naziv;
        this.dtpoc = dtpoc;
        this.usc = usc;
        this.dtc = dtc;
        this.usm = usm;
        this.dtm = dtm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDtpoc() {
        return dtpoc;
    }

    public void setDtpoc(Date dtpoc) {
        this.dtpoc = dtpoc;
    }

    public String getUsc() {
        return usc;
    }

    public void setUsc(String usc) {
        this.usc = usc;
    }

    public Date getDtc() {
        return dtc;
    }

    public void setDtc(Date dtc) {
        this.dtc = dtc;
    }

    public String getUsm() {
        return usm;
    }

    public void setUsm(String usm) {
        this.usm = usm;
    }

    public Date getDtm() {
        return dtm;
    }

    public void setDtm(Date dtm) {
        this.dtm = dtm;
    }

    @Override
    public String toString() {
        return "Grupa{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", dtpoc=" + dtpoc +
                ", usc='" + usc + '\'' +
                ", dtc=" + dtc +
                ", usm='" + usm + '\'' +
                ", dtm=" + dtm +
                '}';
    }
}
