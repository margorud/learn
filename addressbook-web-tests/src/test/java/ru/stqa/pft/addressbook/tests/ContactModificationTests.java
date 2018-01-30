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
            app.contact().create(new ContactData()
                    .withFirstname("testforMod").withMiddlename("test1").withLastname("test1"), true);
        }
    }

    @Test (enabled = false)
    public void testContactModification() {
        ContactData contactModify = new ContactData()
                .withFirstname("qwe1").withMiddlename("qwe2").withLastname("qwe3").withNickname("qwe4").withGroup("test1");
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;

        app.contact().modify(contactModify, index);

        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size());

        //не реализовано сравнение списков из-за бага
    }
}
