package PlayPen;

import BaseClass.OpenBrowser;
import org.junit.Test;

import java.io.IOException;

public class BaseClassVerify {

    @Test
    public void test01() throws IOException {
        OpenBrowser.NavToWebsite("urlCreate");
        OpenBrowser.NavToWebsite("url");
    }
}
