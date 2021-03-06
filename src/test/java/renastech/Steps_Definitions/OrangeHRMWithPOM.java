package renastech.Steps_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import renastech.pages.Admin;
import renastech.pages.Home_Page;
import renastech.pages.Login_Page;
import renastech.utils.CommonUtils;
import renastech.utils.ExcelUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OrangeHRMWithPOM {

    Home_Page home = new Home_Page();
    Admin admin = new Admin();

    private static final Logger logger = Logger.getLogger(OrangeHRMWithPOM.class);

    @Given("The user wants login as admin")
    public void the_user_wants_login_as_admin() {
        logger.info("The user wants login as admin");
        Login_Page login_page = new Login_Page();

        login_page.setUsername();
        login_page.setPassword();
        login_page.setLoginButton();
        logger.debug("The User is login the application");
    }
    @Then("The user wants to verify dashboard")
    public void the_user_wants_to_verify_dashboard() {

        CommonUtils.hardWait(3000);
        Assert.assertTrue(home.getDashboard().isDisplayed());
        logger.info("The dashboard is verified");

    }
    @When("The user wants to go to admin")
    public void the_user_wants_to_go_to_admin() {
        home.setAdmin();
    }
    @Then("The user wants to go to Nationalities")
    public void the_user_wants_to_go_to_nationalities() {
        admin.setNationality();
    }
    @Then("The user wants to add new Nationalities")
    public void the_user_wants_to_add_new_nationalities() {
        admin.setAddButton();
    }
    @Then("The user wants to add Nationalities as {string}")
    public void the_user_wants_to_add_nationalities_as(String name) {
        admin.setNationalityName(name);
        admin.setSaveButton();
    }
    @And("The user should be able to see {string} in Nationality page")
    public void the_user_should_be_able_to_see_in_nationality_page(String string) {
        admin.verifyNationality(string);
    }

    @Then("The user wants to click all checkboxes")
    public void the_user_wants_to_click_all_checkboxes() {
        admin.clickAllCheckBoxes();
    }


    @Given("the user wants to login with excel")
    public void the_user_wants_to_login_with_excel() throws IOException {

//        String filePath="C:\\Users\\Erkan\\IdeaProjects\\SeleniumCucumberTesting\\src\\test\\resources\\New Microsoft Excel Worksheet.xlsx";
//        FileInputStream fileInputStream = new FileInputStream(filePath);
//        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//        XSSFSheet sheet = workbook.getSheet("sheet1");
//
//        int rows = sheet.getLastRowNum();
//        int cols = sheet.getRow(0).getLastCellNum();
//
//        XSSFRow row = sheet.getRow(2);
//
//        System.out.println(row.getCell(0));
//        System.out.println(row.getCell(1));
//
////        System.out.println("The row number  "+rows);
////        System.out.println("The columns number  "+cols);

        ExcelUtils excelUtils = new ExcelUtils();
        excelUtils.getCellData();





    }






}
