package com.appname.seleniumprograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Study this to identify how browser is opened on host machine in Grid and how
 * different browser initializtion occurs
 * 
 * @author RiteshMansukhani
 *
 */
public class CrossBrowserDrivers {
	WebDriver driver;
	URL hubURL;

	public WebDriver openBrowser() {

		Boolean remoteSwitch = true;
		String browserName = "ie";

		// Switch Block to Open Session as per Browser Name in Config.properties
		// --Ritesh Mansukhani
		switch (browserName) {

		case "internet explorer":

			if (!remoteSwitch) {

				// Modified the code to take WebDriver Exe from Project
				// Workspace location to Remove Dependencies --Ritesh Mansukhani

				try {
					DesiredCapabilities capabilities = org.openqa.selenium.remote.DesiredCapabilities
							.internetExplorer();
					capabilities.setCapability(
							org.openqa.selenium.ie.InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
							true);

					String service = System.getProperty("user.dir") + "IE.Driver.Server.Location";
					System.setProperty("webdriver.ie.driver", service);
					// driver = new InternetExplorerDriver();
					driver = new InternetExplorerDriver(capabilities);
					return driver;
				} catch (Exception e) {
					return null;
				}

			} else {

				try {

					hubURL = new URL("TestCases.Hub.URL");

					// Modified the code to take WebDriver Exe from Project
					// Workspace location to Remove Dependencies --Ritesh
					// Mansukhani
					String service = System.getProperty("user.dir") + "IE.Driver.Server.Location";

					System.setProperty("webdriver.ie.driver", service);
					DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
					// capability.setBrowserName("internet explorer");
					capability.setBrowserName(browserName);

					capability.setPlatform(Platform.WINDOWS);
					driver = new RemoteWebDriver(hubURL, capability);
					return driver;
				} catch (MalformedURLException e) {

					return null;
				} catch (Exception e) {
					return null;
				}

			}
			// break;

		case "firefox":

			if (!remoteSwitch) {
				try {
					// Modified the code to take WebDriver Exe from Project
					// Workspace location to Remove Dependencies --Ritesh
					// Mansukhani
					// String service =
					// System.getProperty("user.dir")+TestBase.getData("Firefox.Driver.Server.Location");
					// System.setProperty("webdriver.firefox.marionette",
					// service);
					driver = new FirefoxDriver();
					// ListenerWebDriver will hold current WebDriver's Reference
					// for Listener Class Till End of Test Execution
					// ListenerWebDriver = driver;
					return driver;
				} catch (Exception e) {
					return null;
				}
			} else {

				try {

					hubURL = new URL("TestCases.Hub.URL");
					// Modified the code to take WebDriver Exe from Project
					// Workspace location to Remove Dependencies --Ritesh
					// Mansukhani
					String service = System.getProperty("user.dir") + "Firefox.Driver.Server.Location";
					System.setProperty("webdriver.firefox.marionette", service);

					DesiredCapabilities capability = DesiredCapabilities.firefox();
					capability.setBrowserName(browserName);

					capability.setPlatform(Platform.WINDOWS);
					driver = new RemoteWebDriver(hubURL, capability);
					return driver;
				} catch (MalformedURLException e) {
					return null;
				} catch (Exception e) {
					return null;
				}

			} // Else Ends Here

		case "chrome":

			if (!remoteSwitch) {
				try {
					String service = System.getProperty("user.dir") + "Chrome.Driver.Server.Location";
					System.setProperty("webdriver.chrome.driver", service);

					driver = new ChromeDriver();
					return driver;
				} catch (Exception e) {
					return null;
				}
			} else {

				try {

					hubURL = new URL("TestCases.Hub.URL");

					// Modified the code to take WebDriver Exe from Project
					// Workspace location to Remove Dependencies --Ritesh
					// Mansukhani
					String service = System.getProperty("user.dir") + "Chrome.Driver.Server.Location";
					System.setProperty("webdriver.chrome.driver", service);

					DesiredCapabilities capability = DesiredCapabilities.chrome();
					capability.setBrowserName(browserName);

					capability.setPlatform(Platform.WINDOWS);
					driver = new RemoteWebDriver(hubURL, capability);
					// ListenerWebDriver = driver;

					return driver;
				} catch (MalformedURLException e) {

					return null;
				} catch (Exception e) {
					return null;
				}

			} // Else Ends Here
				// break;

		default:
			return null;

		} // Case Ends Here

	}// Open Browser() ends here

}
