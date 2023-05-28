package API.Automation;

public class Payload {

    public static String product_Search()
    {
        return "{\n" +
                "  \"page\": 1,\n" +
                "  \"size\": 10,\n" +
                "  \"orderBy\": \"rating\",\n" +
                "  \"orderType\": \"DESC\",\n" +
                "  \"categories\": [],\n" +
                "  \"subCategories\": [],\n" +
                "  \"query\": \"\",\n" +
                "  \"risk\": [],\n" +
                "  \"ratings\": [],\n" +
                "  \"amcs\": [],\n" +
                "  \"searchCode\": [\n" +
                "    {\n" +
                "      \"value\": \"\",\n" +
                "      \"sort\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"sip\": true\n" +
                "}";
    }
    public static String Select_Funds()
    {
        return "{\n" +
                "  \"page\": 1,\n" +
                "  \"size\": 5,\n" +
                "  \"orderBy\": \"rating\",\n" +
                "  \"orderType\": \"DESC\",\n" +
                "  \"categories\": [],\n" +
                "  \"subCategories\": [],\n" +
                "  \"query\": \"\",\n" +
                "  \"risk\": [],\n" +
                "  \"ratings\": [],\n" +
                "  \"amcs\": [],\n" +
                "  \"searchCode\": [\n" +
                "    {\n" +
                "      \"value\": \"recommended\",\n" +
                "      \"sort\": true\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
    public static String NFO(){
        return "{\n" +
                "  \"page\": 1,\n" +
                "  \"size\": 10,\n" +
                "  \"orderBy\": \"rating\",\n" +
                "  \"orderType\": \"DESC\",\n" +
                "  \"categories\": [],\n" +
                "  \"subCategories\": [],\n" +
                "  \"query\": \"\",\n" +
                "  \"risk\": [],\n" +
                "  \"ratings\": [],\n" +
                "  \"amcs\": [],\n" +
                "  \"searchCode\": [\n" +
                "    {\n" +
                "      \"value\": \"nfo\",\n" +
                "      \"sort\": true\n" +
                "    }\n" +
                "  ],\n" +
                "  \"nfo\": true,\n" +
                "  \"schemeType\": []\n" +
                "}";
    }
    public static String Super_Savings(){
        return "{\n" +
                "  \"page\": 1,\n" +
                "  \"size\": 10,\n" +
                "  \"orderBy\": \"rating\",\n" +
                "  \"orderType\": \"DESC\",\n" +
                "  \"categories\": [],\n" +
                "  \"subCategories\": [],\n" +
                "  \"query\": \"\",\n" +
                "  \"risk\": [],\n" +
                "  \"ratings\": [],\n" +
                "  \"amcs\": [],\n" +
                "  \"searchCode\": [\n" +
                "    {\n" +
                "      \"value\": \"super_savings\",\n" +
                "      \"sort\": true\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
    public static String questionnaire() {
        {
            return "{\n" +
                    "  \"type\": \"pre-redemption\",\n" +
                    "  \"answers\": [\n" +
                    "    {\n" +
                    "      \"questionId\": \"4\",\n" +
                    "      \"answerId\": \"0\",\n" +
                    "      \"answer\": \"\"\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}";
        }
    }
}
