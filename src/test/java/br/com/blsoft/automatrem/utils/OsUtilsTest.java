package br.com.blsoft.automatrem.utils;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.utils.OsUtils;

/**
 * Unit test for simple App.
 */
public class OsUtilsTest {

    @Test
    public void deveRetornarSOWindowsFalse() {
        OsUtils osUtils = new OsUtils();
        assertEquals(osUtils.isWindows(), false);
    }
}
