package teste.rediscache2;

import com.google.gson.Gson;
import okhttp3.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import teste.rediscache.DadosSaidaContextual;

import javax.net.ssl.*;
import java.net.URL;
import java.security.cert.CertificateException;
import java.util.Base64;

public class Main3 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main3.class);

    public static void main(String[] args) {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0]);
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });


            OkHttpClient client = builder.build();
            MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
            //POST

            DadosSaidaContextual dadosSaidaContextual = new DadosSaidaContextual();
            dadosSaidaContextual.setcpf("78690589120");
            dadosSaidaContextual.setCampanha("");
            dadosSaidaContextual.setLimiteCompra("0.00");
            dadosSaidaContextual.setLimiteEmprestimo("0.00");
            dadosSaidaContextual.setLimiteSaque("0.00");
            dadosSaidaContextual.setMala("");

            ObjectMapper objectMapper = new ObjectMapper();
            Gson gson = new Gson();
            String json = objectMapper.writeValueAsString(dadosSaidaContextual);
            String json2 = gson.toJson(dadosSaidaContextual);

            System.out.println(json);
            System.out.println(json2);

            URL url2 = new URL("https://enge-coreopen-redis-pfl2.pf.cloud.corpd.bradesco.com.br/api/keys/CartaoPreAprov.78690589120.914");


            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append("\"string\":" + "\"" + criptografiaBase64Encoder(json) + "\"" + ",");
            sb.append("\"ttl\": 120");
            sb.append("}");
            System.out.println(sb);

            RequestBody body = RequestBody.create(sb.toString(),mediaType);
            Request requestPost = new Request.Builder()
                    .url(url2)
                    .method("PUT", body)
                    .addHeader("Cookie", "ac45001f6a5664a1b71ebdaec358f272=9531dac52dde802013d34abffe24d5f4")
                    .build();
            Response responsePOST = client.newCall(requestPost).execute();
            System.out.println(responsePOST.body().string());
            System.out.println(responsePOST.code());


            //GET

            //MediaType mediaType = MediaType.parse("text/plain");
            //RequestBody bodyGET = RequestBody.create(mediaType, "");
            Request request = new Request.Builder()
                    .url(url2)
                    .method("GET", null)
                    .addHeader("Cookie", "ac45001f6a5664a1b71ebdaec358f272=9531dac52dde802013d34abffe24d5f4")
                    .build();
            Response responseGET = client.newCall(request).execute();
            String result2 = responseGET.body().string();
            System.out.println(result2);
            System.out.println(responseGET.code());



            //DadosSaidaContextual result = gson.fromJson(descriptografiaBase64Decode(result2),DadosSaidaContextual.class);
            DadosSaidaContextual result23 = new ObjectMapper().readValue(descriptografiaBase64Decode(result2),DadosSaidaContextual.class);
            System.out.println(result23.toString());

        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        }
    }

        /** Criptografando */
        public static String criptografiaBase64Encoder(String pValor) {
            return new String(Base64.getEncoder().encode(pValor.getBytes()));
        }

        /** Realizando o inverso */
        public static String descriptografiaBase64Decode(String pValor) {
            return new String(Base64.getMimeDecoder().decode(pValor.getBytes()));
            //return new String(Base64.getDecoder().decode(pValor.getBytes()));
        }

}

