package webdriver;

import commonpkg.BaseTest;

public class ListWeb_element extends BaseTest {

    public static void main(String[] args) {
    createDriver();
    driver.get("https://demo.activeitzone.com/ecommerce/login");
    closeDriver();
    }
}
