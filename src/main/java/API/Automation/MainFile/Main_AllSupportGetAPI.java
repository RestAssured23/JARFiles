package API.Automation.MainFile;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class Main_AllSupportGetAPI {
    public static void main(String[] args) {

      TestNG runner = new TestNG();
        List<String> xmlfile = new ArrayList<String>();

        xmlfile.add(System.getProperty("user.dir") + "\\src\\main\\testdata\\AllSupportGetAPI.xml");

       // xmlfile.add(System.getProperty("user.dir") + "/src/main/testdata/AllSupportGetAPI.xml");

       runner.setTestSuites(xmlfile);
        runner.run();
            }

}
