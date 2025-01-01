package org.step1;

import java.util.List;
import java.util.Map;

import org.global.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pom.Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OrganeHrmStepClass extends BaseClass {

	public static Pom page;

	@Given("User should enter url")
	public void userShouldEnterUrl() {
		try {

			getDriver("chrome");

			getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

			System.out.println("it should  print the chrome and url launched succesful");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User should enter the {string} and {string}")
	public void userShouldEnterTheAnd(String username, String password) {
		try {

			page = new Pom();

			threadsleep(2000);

			WebElement getusername = page.getusername();
			getusername.sendKeys(username);

			threadsleep(2000);

			WebElement getpassword = page.getpassword();
			getpassword.sendKeys(password);

			threadsleep(1000);

			WebElement getlogin = page.getlogin();
			getlogin.click();

			System.out.println("it should print the username and password loginbutton lanuched ");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@When("user name should enter the Personal Details,fristname,lastname,nickname")
	public void userNameShouldEnterThePersonalDetailsFristnameLastnameNickname(
			io.cucumber.datatable.DataTable dataTable) {
		try {

			List<String> asList = dataTable.asList();
			String fristname = asList.get(0);
			String lastname = asList.get(1);
			String nickname = asList.get(2);

			threadsleep(2000);

			WebElement getpersonaldetails = page.getpersonaldetails();
			getpersonaldetails.click();

			threadsleep(2000);

			WebElement getfristname = page.getfristname();

			getfristname.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
			getfristname.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE);
			getfristname.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
			getfristname.sendKeys(fristname);

			WebElement getlastname = page.getlastname();
			threadsleep(5000);
			getlastname.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
			getlastname.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE);

			getlastname.sendKeys(lastname);

			WebElement getnickname = page.getnickname();

			getnickname.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
			;

			getnickname.sendKeys(nickname);

			WebElement getmale = page.getmale();
			getmale.click();

			WebElement getsave1 = page.getsave1();
			getsave1.click();

			WebElement getsave2 = page.getsave2();
			getsave2.click();

			System.out.println("it print the personal details lanuched ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("user name should enter the admin infor")
	public void userNameShouldEnterTheAdminInfor() {
		try {

			threadsleep(6000);

			WebElement getadmin = page.getadmin();
			getadmin.click();

			threadsleep(2000);
			WebElement getjob = page.getjob();
			getjob.click();

			threadsleep(2000);

			WebElement getjobtitles = page.getjobtitles();
			getjobtitles.click();

			threadsleep(2000);

			WebElement getjobadd = page.getjobadd();
			getjobadd.click();

			System.out.println("user name should enter the admin infor");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("user should enter the Job Title and Job Description,save")
	public void userShouldEnterTheJobTitleAndJobDescriptionSave(io.cucumber.datatable.DataTable dataTable) {
		try {

			threadsleep(2000);

			List<String> asList = dataTable.asList();
			String tile = asList.get(0);
			String des = asList.get(1);

			threadsleep(2000);

			WebElement getjobtitletext = page.getjobtitletext();
			getjobtitletext.sendKeys(tile);

			threadsleep(2000);

			WebElement getjobdescription = page.getjobdescription();
			getjobdescription.sendKeys(des);

			threadsleep(2000);

			WebElement getjobtitlesave = page.getjobtitlesave();
			getjobtitlesave.click();

			System.out.println("it is don job title  ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User should enter the organization,generalinformation,organizationedit,organzationname")
	public void userShouldEnterTheOrganizationGeneralinformationOrganizationeditOrganzationname(
			io.cucumber.datatable.DataTable dataTable) {
		try {
			threadsleep(5000);

			List<String> asList = dataTable.asList();
			String name = asList.get(0);
			String regsiter = asList.get(1);

			threadsleep(5000);

			WebElement getorganization = page.getorganization();
			getorganization.click();

			threadsleep(5000);

			WebElement getgeneralinformation = page.getgeneralinformation();
			getgeneralinformation.click();

			threadsleep(5000);

			WebElement organizationedit = page.getOrganizationedit();
			organizationedit.click();

			threadsleep(5000);

			WebElement getorganzationname = page.getorganzationname();

			getorganzationname.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);

			getorganzationname.sendKeys(name);

			threadsleep(5000);

			WebElement registrationNumber = page.getRegistrationNumber();
			registrationNumber.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);

			registrationNumber.sendKeys(regsiter);

			threadsleep(5000);

			WebElement getorganizationsave = page.getorganizationsave();
			getorganizationsave.click();

			System.out.println("it is print done organization ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User should enter the Qualifications,Education,Educationadd,addEducationtext,addEducationsave")
	public void userShouldEnterTheQualificationsEducationEducationaddAddEducationtextAddEducationsave(
			io.cucumber.datatable.DataTable dataTable) {
		try {

			threadsleep(5000);

			List<String> asList = dataTable.asList();
			String education = asList.get(0);

			threadsleep(5000);

			WebElement getqualifications = page.getqualifications();
			getqualifications.click();

			threadsleep(5000);

			WebElement getqulificationEducation = page.getqulificationEducation();
			getqulificationEducation.click();

			threadsleep(5000);

			WebElement getqulificationEducationadd = page.getqulificationEducationadd();
			getqulificationEducationadd.click();

			threadsleep(5000);

			WebElement getqulificationaddEducationtext = page.getqulificationaddEducationtext();
			getqulificationaddEducationtext.sendKeys(education);

			threadsleep(5000);

			WebElement getqulificationaddEducationsave = page.getqulificationaddEducationsave();
			getqulificationaddEducationsave.click();

			System.out.println("it print qualication ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User should enter the Nationalities,Nationalitiesadd,Nationalitiestext,Nationalitiessave")
	public void userShouldEnterTheNationalitiesNationalitiesaddNationalitiestextNationalitiessave(
			io.cucumber.datatable.DataTable dataTable) {
		try {

			threadsleep(5000);

			List<String> asList = dataTable.asList();
			String nation = asList.get(0);

			threadsleep(5000);

			WebElement getnationlities = page.getnationlities();
			getnationlities.click();

			threadsleep(5000);

			WebElement getnationlitiesadd = page.getnationlitiesadd();
			getnationlitiesadd.click();

			threadsleep(5000);

			WebElement getnationlitiestext = page.getnationlitiestext();
			getnationlitiestext.sendKeys(nation);

			threadsleep(5000);

			WebElement getnationlitiesave = page.getnationlitiesave();
			getnationlitiesave.click();

			System.out.println("it print the nationalzation");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User should enter the PIM ,pimaddemployee,pimfirstname,pimlastname,pimsave")
	public void userShouldEnterThePIMPimaddemployeePimfirstnamePimlastnamePimsave(
			io.cucumber.datatable.DataTable dataTable) {
		try {

			threadsleep(5000);

			List<String> asList = dataTable.asList();
			String fristname = asList.get(0);
			String lastname = asList.get(1);

			threadsleep(5000);

			WebElement getpim = page.getpim();
			getpim.click();

			threadsleep(5000);

			WebElement getpimaddemployee = page.getpimaddemployee();
			getpimaddemployee.click();

			threadsleep(5000);

			WebElement getpimfristname = page.getpimfristname();
			getpimfristname.sendKeys(fristname);

			threadsleep(5000);

			WebElement getpimlastname = page.getpimlastname();
			getpimlastname.sendKeys(lastname);

			threadsleep(5000);

			WebElement getpimsave = page.getpimsave();
			getpimsave.click();

			System.out.println("it print the pim ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User should enter the leave ,leaveconfigute,leavetypes,leaveadd,leaveaddleavetype,leavesave")
	public void userShouldEnterTheLeaveLeaveconfiguteLeavetypesLeaveaddLeaveaddleavetypeLeavesave(
			io.cucumber.datatable.DataTable dataTable) {
		try {
			threadsleep(5000);

			List<String> asList = dataTable.asList();
			String leave = asList.get(0);

			threadsleep(5000);
			WebElement getleave = page.getleave();
			getleave.click();

			threadsleep(5000);

			WebElement getleaveconfigure = page.getleaveconfigure();
			getleaveconfigure.click();

			threadsleep(5000);

			WebElement getleavleavetypes = page.getleavleavetypes();
			getleavleavetypes.click();

			threadsleep(5000);

			WebElement getleaveadd = page.getleaveadd();
			getleaveadd.click();

			threadsleep(5000);

			WebElement getleaveAddLeaveType = page.getleaveAddLeaveType();
			getleaveAddLeaveType.sendKeys(leave);

			threadsleep(5000);

			WebElement getleavesave = page.getleavesave();
			getleavesave.click();

			System.out.println("it print the leave ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User should enter the time ,timeprojectinfo,timecustomers,timeadd,timeaddcustomername,timeaddcustomerdescription,timesave")
	public void userShouldEnterTheTimeTimeprojectinfoTimecustomersTimeaddTimeaddcustomernameTimeaddcustomerdescriptionTimesave(
			io.cucumber.datatable.DataTable dataTable) {
		try {

			threadsleep(5000);

			List<String> asList = dataTable.asList();
			String name = asList.get(0);
			String reson = asList.get(1);

			threadsleep(5000);

			WebElement gettime = page.gettime();
			gettime.click();

			threadsleep(5000);

			WebElement gettimeprojectinfo = page.gettimeprojectinfo();
			gettimeprojectinfo.click();

			threadsleep(5000);

			WebElement gettimecustomers = page.gettimecustomers();
			gettimecustomers.click();

			threadsleep(5000);

			WebElement gettimeadd = page.gettimeadd();
			gettimeadd.click();

			threadsleep(5000);

			WebElement gettimeaddcustomername = page.gettimeaddcustomername();
			gettimeaddcustomername.sendKeys(name);

			threadsleep(5000);

			WebElement gettimeaddcustomerDescription = page.gettimeaddcustomerDescription();
			gettimeaddcustomerDescription.sendKeys(reson);

			threadsleep(5000);

			WebElement gettimesave = page.gettimesave();
			gettimesave.click();

			System.out.println("it print the time ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User should enter the Recruitment ,Recruitmentcanditates ,Recruitmentcanditesadd ,Recruitmentfristname, Recruitmentlastname ,Recruitmentemail ,Recruitmentphonenumber,Recruitmentsave")
	public void userShouldEnterTheRecruitmentRecruitmentcanditatesRecruitmentcanditesaddRecruitmentfristnameRecruitmentlastnameRecruitmentemailRecruitmentphonenumberRecruitmentsave(
			io.cucumber.datatable.DataTable dataTable) {
		try {

			threadsleep(5000);

			List<String> asList = dataTable.asList();
			String fristname = asList.get(0);
			String lastname = asList.get(1);
			String email = asList.get(2);
			String phonenumber = asList.get(3);

			threadsleep(5000);

			WebElement getrecruitment = page.getrecruitment();
			getrecruitment.click();

			threadsleep(5000);

			WebElement getrecruitmentcanditates = page.getrecruitmentcanditates();
			getrecruitmentcanditates.click();

			threadsleep(5000);

			WebElement getrecruitmentcanditatesadd = page.getrecruitmentcanditatesadd();
			getrecruitmentcanditatesadd.click();

			threadsleep(5000);

			WebElement getrecruitmentfirstname = page.getrecruitmentfirstname();
			getrecruitmentfirstname.sendKeys(fristname);

			threadsleep(5000);

			WebElement getrecruitmentlastname = page.getrecruitmentlastname();
			getrecruitmentlastname.sendKeys(lastname);

			threadsleep(5000);

			WebElement getrecruitmentemail = page.getrecruitmentemail();
			getrecruitmentemail.sendKeys(email);

			threadsleep(5000);

			WebElement getrecruitmentphonenumber = page.getrecruitmentphonenumber();
			getrecruitmentphonenumber.sendKeys(phonenumber);

			threadsleep(5000);

			WebElement getrecruitmentsave = page.getrecruitmentsave();
			getrecruitmentsave.click();

			System.out.println("it print the recruitment");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("user should enter the claim,claimconfiguration,claimevents,claimeventsadd,claimeventsname,claimeventsdescription,claimsave")
	public void userShouldEnterTheClaimClaimconfigurationClaimeventsClaimeventsaddClaimeventsnameClaimeventsdescriptionClaimsave(
			io.cucumber.datatable.DataTable dataTable) {
		try {

			threadsleep(5000);

			List<String> asList = dataTable.asList();
			String name = asList.get(0);
			String decription = asList.get(1);

			threadsleep(5000);

			WebElement getclaim = page.getclaim();
			getclaim.click();

			threadsleep(5000);

			WebElement getclaimconfiguration = page.getclaimconfiguration();
			getclaimconfiguration.click();

			threadsleep(5000);

			WebElement getclaimevent = page.getclaimevent();
			getclaimevent.click();

			threadsleep(5000);

			WebElement getclaimeventadd = page.getclaimeventadd();
			getclaimeventadd.click();

			threadsleep(5000);

			WebElement getclaimEventName = page.getclaimEventName();
			getclaimEventName.sendKeys(name);

			threadsleep(5000);

			WebElement getclaimEvnetDescription = page.getclaimEvnetDescription();
			getclaimEvnetDescription.sendKeys(decription);

			threadsleep(5000);

			WebElement getclaimsave = page.getclaimsave();
			getclaimsave.click();

			System.out.println("it print the claim");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("user should enter the buzz,buzztext,buzzpost")
	public void userShouldEnterTheBuzzBuzztextBuzzpost(io.cucumber.datatable.DataTable dataTable) {
		try {

			threadsleep(5000);

			List<String> asList = dataTable.asList();
			String text = asList.get(0);

			threadsleep(5000);

			WebElement getbuzz = page.getbuzz();
			getbuzz.click();

			threadsleep(5000);
			WebElement getbuzztext = page.getbuzztext();
			getbuzztext.sendKeys(text);

			threadsleep(5000);

			WebElement getbuzzpost = page.getbuzzpost();
			getbuzzpost.click();

			System.out.println("it print the buzz");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
