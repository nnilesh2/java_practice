package designpatterns.adaptor;

public class TextToJsonAdaptor implements JsonData {

    private TextData textData;

    public TextToJsonAdaptor(TextData textData) {
        this.textData = textData;
    }

    @Override
    public String gteJsonData() {
        String data = textData.getTexData();
        return converttoJson(data);
    }

    private String converttoJson(String textData) {
        return "{" + textData + "}";
    }

}