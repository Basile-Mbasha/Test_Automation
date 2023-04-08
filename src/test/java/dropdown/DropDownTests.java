package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        var option = "Option 1";
        var dropDownPage = homePage.clickDropDownLink();
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();

        assertEquals(selectedOptions.size(), 1, "Incorrect option selected");
        assertTrue(selectedOptions.contains(option), "Option 1 not selected");
    }
}
