package application;

public class coachData {
    public int id;
    public String coachId;
    public String name;
    public String address;
    public String gender;
    public int phoneNum;
    public String status;

    public coachData(int id, String coachId, String name, String address, String gender, int phoneNum, String status) {
        this.id = id;
        this.coachId = coachId;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.status = status;
    }

    // Getter methods for each property
    public int getId() {
        return id;
    }

    public String getCoachId() {
        return coachId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public String getStatus() {
        return status;
    }
}
