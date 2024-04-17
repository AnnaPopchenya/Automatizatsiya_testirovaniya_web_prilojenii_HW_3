package org.example.pom;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.visible;

public class GroupTableRow {

    private final SelenideElement root;

    public GroupTableRow(SelenideElement root) {
        this.root = root;
    }

    public String getTitle() {
        return root.$(By.xpath("./td[2]")).getText();
    }

    public String getStatus() {
        return root.$(By.xpath("./td[3]")).getText();
    }

    public void clickTrashIcon() {
        root.$(By.xpath("./td/button[text()='delete']")).click();
        root.$(By.xpath("./td/button[text()='restore_from_trash']")).shouldBe(visible);
    }

    public void clickRestoreFromTrashIcon() {
        root.$(By.xpath("./td/button[text()='restore_from_trash']")).click();
        root.$(By.xpath("./td/button[text()='delete']")).shouldBe(visible);
    }

    public void clickAddStudentsIcon() {
        root.$(By.cssSelector("td button i.material-icons")).click();
    }

    public void clickZoomInIcon() {
        root.$(By.xpath(".//td/button[contains(., 'zoom_in')]")).click();
    }
}