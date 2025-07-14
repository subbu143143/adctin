package report1;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ex_repo  implements ITestListener{

	

	public ExtentSparkReporter report;
	public ExtentReports extent;
	
	public ExtentTest test;
	
	public void onStart(ITestContext tr) {
		report = new ExtentSparkReporter("D:\\mastaniworkspace\\adactin\\extend_report\\adctin1.html");
		report.config().setDocumentTitle("adctin_Report");
		report.config().setReportName("adctin Login-search hotel-select hotel-book hotel logout validations test");
		report.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Username", "Ram");
		extent.setSystemInfo("HostName", "Local Host");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Environment", "QA");
	}
	
	public void onTestSuccess(ITestResult tr) {
		test = extent.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));	
	}
	
	public void onTestFailure(ITestResult tr) {
		test = extent.createTest(tr.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	}
	
	public void onTestSkipped(ITestResult tr) {
		test = extent.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext context) {
		extent.flush(); 	// it removes the Unnessary data to remove
	}
	
	

}

	
	
