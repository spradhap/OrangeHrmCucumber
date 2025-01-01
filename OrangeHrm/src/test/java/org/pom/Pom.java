package org.pom;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends BaseClass {

	public Pom() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	private WebElement name;

	public WebElement getusername() {

		return name;
	}

	@FindBy(name = "password")
	private WebElement pass;

	public WebElement getpassword() {

		return pass;
	}

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;

	public WebElement getlogin() {

		return login;
	}

	@FindBy(xpath = "//span[text()='My Info']")
	private WebElement personal;

	public WebElement getpersonaldetails() {

		return personal;
	}
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement fristname;

	public WebElement getfristname() {

		return fristname;
	}
	
	@FindBy(name = "lastName")
	private WebElement lastname;

	public WebElement getlastname() {

		return lastname;
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[ 2]")
	private WebElement nick;

	public WebElement getnickname() {

		return nick;
	}
	
	@FindBy(xpath = "//label[text()='Male']")
	private WebElement male;

	public WebElement getmale() {

		return male;
	}
	
	@FindBy(xpath = "(//button[text()=' Save '])[1]")
	private WebElement save1;

	public WebElement getsave1() {

		return save1;
	}
	
	@FindBy(xpath = "(//button[text()=' Save '])[2]")
	private WebElement save2;

	public WebElement getsave2() {

		return save2;
	}
	
	
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement admin;

	public WebElement getadmin() {

		return admin;
	}
	
	@FindBy(xpath = "//span[text()='Job ']")
	private WebElement job;

	public WebElement getjob() {

		return job;
	}
	
	@FindBy(xpath = "//a[text()='Job Titles']")
	private WebElement titles;

	public WebElement getjobtitles() {

		return titles;
	}
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement add;

	public WebElement getjobadd() {

		return add;
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[ 2]")
	private WebElement text;

	public WebElement getjobtitletext() {

		return text;
	}
	
	@FindBy(xpath = "//textarea[@placeholder='Type description here']")
	private WebElement des;

	public WebElement getjobdescription() {

		return des;
	}
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement save;

	public WebElement getjobtitlesave() {

		return save;
	}
	
	@FindBy(xpath = "//span[text()='Organization '] ")
	private WebElement org;

	public WebElement getorganization() {

		return org;
	}
	
	@FindBy(xpath = "//a[text()='General Information']")
	private WebElement gen;

	public WebElement getgeneralinformation() {

		return gen;
	}
	
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-left']")
	private WebElement gene;

	public WebElement getOrganizationedit() {

		return gene;
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[ 2]")
	private WebElement name1;

	public WebElement getorganzationname() {

		return name1;
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement number;

	public WebElement getRegistrationNumber() {

		return number;
	}
	
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement sa;

	public WebElement getorganizationsave() {

		return sa;
	}
	
	@FindBy(xpath = "//span[text()='Qualifications ']")
	private WebElement quali;

	public WebElement getqualifications() {

		return quali;
	}
	
	@FindBy(xpath = "//a[text()='Education']")
	private WebElement qualifi;

	public WebElement getqulificationEducation() {

		return qualifi;
	}
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement add1;

	public WebElement getqulificationEducationadd() {

		return add1;
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement add12;

	public WebElement getqulificationaddEducationtext() {

		return add12;
	}
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveq;

	public WebElement getqulificationaddEducationsave() {

		return saveq;
	}
	
	@FindBy(xpath = "//a[text()='Nationalities']")
	private WebElement nation;

	public WebElement getnationlities() {

		return nation;
	}
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addtext;

	public WebElement getnationlitiesadd() {

		return addtext;
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement addtext1;

	public WebElement getnationlitiestext() {

		return addtext1;
	}
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savenat;

	public WebElement getnationlitiesave() {

		return savenat;
	}
	
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim;

	public WebElement getpim() {

		return pim;
	}
	
	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement pimadd;

	public WebElement getpimaddemployee() {

		return pimadd;
	}
	
	@FindBy(name = "firstName")
	private WebElement pinname;

	public WebElement getpimfristname() {

		return pinname;
	}
	
	@FindBy(name = "lastName")
	private WebElement pinname1;

	public WebElement getpimlastname() {

		return pinname1;
	}
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement pimsave;

	public WebElement getpimsave() {

		return pimsave;
	}
	
	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement leave;

	public WebElement getleave() {

		return leave;
	}
	
	@FindBy(xpath = "//span[text()='Configure ']")
	private WebElement leave1;

	public WebElement getleaveconfigure() {

		return leave1;
	}
	
	@FindBy(xpath = "//a[text()='Leave Types']")
	private WebElement leave12;

	public WebElement getleavleavetypes() {

		return leave12;
	}
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement select;

	public WebElement getleaveadd() {

		return select;
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[ 2]")
	private WebElement select1;

	public WebElement getleaveAddLeaveType() {

		return select1;
	}
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement save4;

	public WebElement getleavesave() {

		return save4;
	}
	
	@FindBy(xpath = "//span[text()='Time']")
	private WebElement time;

	public WebElement gettime() {

		return time;
	}
	
	@FindBy(xpath = "//span[text()='Project Info ']")
	private WebElement time1;

	public WebElement gettimeprojectinfo() {

		return time1;
	}
	
	@FindBy(xpath = "//a[text()='Customers']")
	private WebElement time11;

	public WebElement gettimecustomers() {

		return time11;
	}
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement timeadd;

	public WebElement gettimeadd() {

		return timeadd;
	}
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[ 2]")
	private WebElement timeaddcustor;

	public WebElement gettimeaddcustomername() {

		return timeaddcustor;
	}
	
	@FindBy(xpath = "//textarea[@placeholder='Type description here']")
	private WebElement timeaddcustorDescription;

	public WebElement gettimeaddcustomerDescription() {

		return timeaddcustorDescription;
	}
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement timesave;

	public WebElement gettimesave() {

		return timesave;
	}
	
	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement rect;

	public WebElement getrecruitment() {

		return rect;
	}
	
	@FindBy(xpath = "//a[text()='Candidates']")
	private WebElement recti;

	public WebElement getrecruitmentcanditates() {

		return recti;
	}
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement rectadd;

	public WebElement getrecruitmentcanditatesadd() {

		return rectadd;
	}
	
	@FindBy(name = "firstName")
	private WebElement rectname;

	public WebElement getrecruitmentfirstname() {

		return rectname;
	}
	
	@FindBy(name = "lastName")
	private WebElement rectname2;

	public WebElement getrecruitmentlastname() {

		return rectname2;
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement rectemail;

	public WebElement getrecruitmentemail() {

		return rectemail;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Type here'])[2]")
	private WebElement rectphone;

	public WebElement getrecruitmentphonenumber() {

		return rectphone;
	}
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement rectsave;

	public WebElement getrecruitmentsave() {

		return rectsave;
	}
	

	@FindBy(xpath = "//span[text()='Claim']")
	private WebElement claim;

	public WebElement getclaim() {

		return claim;
	}
	
	@FindBy(xpath = "//span[text()='Configuration ']")
	private WebElement con;

	public WebElement getclaimconfiguration() {

		return con;
	}
	
	@FindBy(xpath = "//a[text()='Events']")
	private WebElement conf;

	public WebElement getclaimevent() {

		return conf;
	}
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement confadd;

	public WebElement getclaimeventadd() {

		return confadd;
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2 ]")
	private WebElement confadd1;

	public WebElement getclaimEventName() {

		return confadd1;
	}
	
	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	private WebElement confadd12;

	public WebElement getclaimEvnetDescription() {

		return confadd12;
	}
	
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement confsave;

	public WebElement getclaimsave() {

		return confsave;
	}
	
	@FindBy(xpath = "//span[text()='Buzz']")
	private WebElement buzz;

	public WebElement getbuzz() {

		return buzz;
	}
	
	@FindBy(xpath = "//textarea[@class='oxd-buzz-post-input']")
	private WebElement buzz1;

	public WebElement getbuzztext() {

		return buzz1;
	}
	
	@FindBy(xpath = "//button[text()=' Post ']")
	private WebElement buzz11;

	public WebElement getbuzzpost() {

		return buzz11;
	}
	
	
	
	
	
	
	
	
	
	
	

}
