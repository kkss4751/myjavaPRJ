package polytec1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

    public class ApiExplorer {
        public static void main(String[] args) throws IOException {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B553530/TRANSPORTATION/ELECTRIC_CHARGING"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=gvg5yz0DwZO2wjxmk6A2YGQgEpPzOIjrn+87jwtvcYoCnceQ3ZOTJu9gdGAh6TV2wbi+7FeVs/4pcmNq5Chy7g=="); /*Service Key*///서비스키에 decoding키를 넣어줘야한다.
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*검색건수*/
            urlBuilder.append("&" + URLEncoder.encode("apiType","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*결과형식(xml/json)*/
            urlBuilder.append("&" + URLEncoder.encode("q1","UTF-8") + "=" + URLEncoder.encode("울산광역시", "UTF-8")); /*광역지자체*/
            urlBuilder.append("&" + URLEncoder.encode("q2","UTF-8") + "=" + URLEncoder.encode("중구", "UTF-8")); /*시군구*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());

            return;
        }
    }
