package org.example.pom;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class ScreenCast {
    public static void main(String[] args){
        SelenideElement selenideElement= $("div.item").shouldNotBe(visible);
        SelenideElement selenideElement1 = $x("//div[@class='item']");


        ElementsCollection selenideElements = $$x(".submit").shouldHave(CollectionCondition.sizeGreaterThan(0));
        SelenideElement first = selenideElements.first();
        ElementsCollection filter = selenideElements.filter(visible);

        SelenideElement element = selenideElement.$(".child");

    }




}
