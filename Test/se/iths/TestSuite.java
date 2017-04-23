package se.iths;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.experimental.categories.*;
import org.junit.experimental.categories.Categories.IncludeCategory;

@RunWith(Categories.class)
@IncludeCategory(Matte.class)

@SuiteClasses({
   Testlab1.class,
})



public class TestSuite {

}