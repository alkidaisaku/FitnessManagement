package application;

import java.sql.Date;


public class memberData {

    public Integer id;
    public String memberId;
    public String name;
    public String address;
    public Integer phoneNum;
    public String gender;
    public String schedule;
    public Date startDate;
    public Date endDate;
    public String status;
    public Double price;

    public memberData(Integer id, String memberId, String name, String address,
             Integer phoneNum, String gender, String schedule, Date startDate,
             Date endDate, Double price, String status) {
        this.id = id;
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.gender = gender;
        this.schedule = schedule;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.status = status;
    }

    public Integer getid() {
        return id;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public String getGender() {
        return gender;
    }

    public String getSchedule() {
        return schedule;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

}

