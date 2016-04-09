import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

waiting {
	timeout = 20
	retryInterval = 0.5

	presets {
		slow {
			timeout = 20
			retryInterval = 1
		}
		quick {
			timeout = 1
		}
	}
}

environments {
	
	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver


	chrome {
		driver = { new ChromeDriver() }
	}

	firefox {
		driver = { new FirefoxDriver() }
	}

	
	// run via “./gradlew firefoxTest”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver


    phantomJs {
        driver = { new PhantomJSDriver() }
    }

}

// To run the tests with all browsers just run “./gradlew test”


quitCachedDriverOnShutdown = true
atCheckWaiting = true
