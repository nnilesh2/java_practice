package designpatterns.adaptor;

public class App {

    public static void main(String[] args) {
        TextData textData = new TextData();

    JsonDataSystem jsonDataSystem = new JsonDataSystem();

    TextToJsonAdaptor jsonData = new TextToJsonAdaptor(textData);

    jsonDataSystem.processJsonData(jsonData.gteJsonData());
    }

    
    
}
