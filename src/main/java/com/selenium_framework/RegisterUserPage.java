package com.selenium_framework;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

public class RegisterUserPage extends BasePage{
    UtilitiesPage utility=new UtilitiesPage();
    private By fname=By.id("customer.firstName");
    private By lname=By.id("customer.lastName");
    private By address=By.id("customer.address.street");
    private By city=By.id("customer.address.city");
    private By state=By.id("customer.address.state");
    private By zcode=By.id("customer.address.zipCode");
    private By phone=By.id("customer.phoneNumber");
    private By ssn=By.id("customer.ssn");
    private By username=By.id("customer.username");
    private By pwd=By.id("customer.password");
    private By confirm=By.id("repeatedPassword");
    private By registerButton=By.xpath("//input[@class='button' and @value='Register']");
    
    public RegisterUserPage(WebDriver driver){
        super(driver);
    }
    
    public List<By> elementList(){
        List<By> list=new ArrayList<>();
        list.add(fname);
        list.add(lname);
        list.add(address);
        list.add(city);
        list.add(state);
        list.add(zcode);
        list.add(phone);
        list.add(ssn);
        list.add(username);
        list.add(pwd);
        list.add(confirm);
        list.add(registerButton);
        return list;
    }

    String excelFilePath=UtilitiesPage.getPropertyFileValue("userDataExcel");
    List<By> tempBy=elementList();
    List<String> tempValue=utility.getExcelValues(excelFilePath);
    public void fillRegUserPage(List<By> by, List<String> value){
        for(int i=0; i<by.size(); i++){
            enterText(tempBy.get(i),tempValue.get(i));
        }
    }

    public void clickRegisterButton(By by){
        clickElement(by);
    }
}
