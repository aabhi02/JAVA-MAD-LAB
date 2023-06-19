package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity2 extends AppCompatActivity {

    TextView xmlData, jsonData;
    int mode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        xmlData = (TextView) findViewById(R.id.xml);
        jsonData = (TextView) findViewById(R.id.json);
        mode = getIntent().getIntExtra("mode", 0);

        if (mode == 1)
            parseJson();
        else
            parseXmlDocument();
    }

    public String parseXmlDocument() {
        try {
            InputStream is = getAssets().open("input.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(is);

            Element el = doc.getDocumentElement();
            el.normalize();

            NodeList list = doc.getElementsByTagName("weather");
            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element el2 = (Element) node;
                    xmlData.setText("City: " + getValue("City", el2) + "\n");
                    xmlData.append("Longitude: " + getValue("Longitude", el2) + "\n");
                    xmlData.append("Latitude: " + getValue("Latitude", el2) + "\n");
                    xmlData.append("Temperature: " + getValue("Temperature", el2) + "\n");
                    xmlData.append("Humidity: " + getValue("Humidity", el2) + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getValue(String tag, Element e) {
        NodeList n=e.getElementsByTagName(tag).item(0).getChildNodes();
        Node node=n.item(0);
        return node.getNodeValue();
    }

    public void parseJson(){
        try{
            InputStream stream=getAssets().open("input.json");
            byte[] data= new byte[stream.available()];
            stream.read(data);

            String readData=new String(data);
            JSONObject jo = new JSONObject(readData);
            JSONObject jo1 =  jo.getJSONObject("weather");
            jsonData.setText("City: " + jo1.getString("City") + "\n");
            jsonData.append("Latitude: " + jo1.getString("Latitude") + "\n");
            jsonData.append("Longitude: " + jo1.getString("Longitude") + "\n");
            jsonData.append("Temperature: " + jo1.getString("Temperature") + "\n");
            jsonData.append("Humidity: " + jo1.getString("Humidity") + "\n");
        } catch (Exception e){e.printStackTrace();}
    }
}