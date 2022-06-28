package com.example.demo.modelBud;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Modelbud {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String passWord;
    public Modelbud()
    {

    }
    public Modelbud(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    
}
