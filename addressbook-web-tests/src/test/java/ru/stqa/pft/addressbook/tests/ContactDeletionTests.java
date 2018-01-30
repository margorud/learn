package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        if (app.contact().list().size() == 0) {
            app.goTo().contactPage();
            app.contact().create(new ContactData("test1", "test2", "test3", "test4", "test1"), true);
        }
    }

    @Test
    public void testContactDeletion() {
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;

        app.contact().delete(index);
        app.goTo().homePage();

        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), index); //сравниваем количество элементов в списках

        before.remove(index); //приводим списки в одинаковое состояние, удаляя из начального последний элемент
        Assert.assertEquals(before, after);
    }
}
