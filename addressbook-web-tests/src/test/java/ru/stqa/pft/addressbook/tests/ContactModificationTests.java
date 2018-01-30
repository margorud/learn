package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        if (app.contact().list().size() == 0) {
            app.goTo().contactPage();
            app.contact().create(new ContactData("test1", "test2", "test3", "test4", "test1"), true);
        }
    }

    @Test (enabled = false)
    public void testContactModification() {
        List<ContactData> before = app.contact().list();
        ContactData contact = new ContactData("new", "mn", "ln", "nm", null);
        int index = before.size() - 1;

        app.contact().modify(contact, index);

        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size());
    }
}
