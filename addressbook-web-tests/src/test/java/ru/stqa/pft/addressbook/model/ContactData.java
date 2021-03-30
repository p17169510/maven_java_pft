package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String middleName;
  private final String lastName;
  private final String nickName;
  private final String title;
  private final String company;
  private final String address;
  private final String homePhoneNum;
  private final String mobilePhoneNum;
  private final String workPhoneNum;
  private final String faxPhoneNum;
  private final String email;
  private final String email2;
  private final String email3;
  private final String homePage;
  private final String birthDay;
  private final String birthMonth;
  private final String birthYear;
  private final String anniversaryDay;
  private final String anniversaryMonth;
  private final String anniversaryYear;
  private final String group;
  private final String secondaryAddress;
  private final String secondaryHome;
  private final String secondaryNotes;

  public ContactData(String firstname, String middleName, String lastName, String nickName, String title, String company, String address, String homePhoneNum, String mobilePhoneNum, String workPhoneNum, String faxPhoneNum, String email, String email2, String email3, String homePage, String birthDay, String birthMonth, String birthYear, String anniversaryDay, String anniversaryMonth, String anniversaryYear, String group, String secondaryAddress, String secondaryHome, String secondaryNotes) {
    this.firstname = firstname;
    this.middleName = middleName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.title = title;
    this.company = company;
    this.address = address;
    this.homePhoneNum = homePhoneNum;
    this.mobilePhoneNum = mobilePhoneNum;
    this.workPhoneNum = workPhoneNum;
    this.faxPhoneNum = faxPhoneNum;
    this.email = email;
    this.email2 = email2;
    this.email3 = email3;
    this.homePage = homePage;
    this.birthDay = birthDay;
    this.birthMonth = birthMonth;
    this.birthYear = birthYear;
    this.anniversaryDay = anniversaryDay;
    this.anniversaryMonth = anniversaryMonth;
    this.anniversaryYear = anniversaryYear;
    this.group = group;
    this.secondaryAddress = secondaryAddress;
    this.secondaryHome = secondaryHome;
    this.secondaryNotes = secondaryNotes;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickName() {
    return nickName;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHomePhoneNum() {
    return homePhoneNum;
  }

  public String getMobilePhoneNum() {
    return mobilePhoneNum;
  }

  public String getWorkPhoneNum() {
    return workPhoneNum;
  }

  public String getFaxPhoneNum() {
    return faxPhoneNum;
  }

  public String getEmail() {
    return email;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHomePage() {
    return homePage;
  }

  public String getBirthDay() {
    return birthDay;
  }

  public String getBirthMonth() {
    return birthMonth;
  }

  public String getBirthYear() {
    return birthYear;
  }

  public String getAnniversaryDay() {
    return anniversaryDay;
  }

  public String getAnniversaryMonth() {
    return anniversaryMonth;
  }

  public String getAnniversaryYear() {
    return anniversaryYear;
  }

  public String getGroup() {
    return group;
  }

  public String getSecondaryAddress() {
    return secondaryAddress;
  }

  public String getSecondaryHome() {
    return secondaryHome;
  }

  public String getSecondaryNotes() {
    return secondaryNotes;
  }
}
