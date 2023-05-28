package API.Automation.MainFile;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class Main_PrimaryHolding {
    public static void main(String[] args) {

      TestNG runner = new TestNG();
        List<String> xmlfile = new ArrayList<String>();

        xmlfile.add(System.getProperty("user.dir") + "\\src\\main\\testdata\\primaryID.xml");

      // xmlfile.add("C:\\Users\\Fi-User\\IdeaProjects\\APIAutomation\\src\\main\\testdata\\primaryID.xml");
       runner.setTestSuites(xmlfile);
        runner.run();
            }
}
