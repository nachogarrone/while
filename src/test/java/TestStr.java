import examples.while_ut1.ast.Stmt;
import examples.while_ut1.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by nachogarrone on 31/8/16.
 */
public class TestStr {
    @Test
    public void testStrParse(){
        try {
            Stmt statement = (Stmt) (Parser.parse("{a = \"hola mundo\";}").value);
            HashMap<String, Object> evaluate = statement.evaluate(new HashMap<String, Object>());
            Assert.assertEquals("hola mundo", evaluate.get("a"));
            Assert.assertNotEquals("chau mundito", evaluate.get("a"));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
