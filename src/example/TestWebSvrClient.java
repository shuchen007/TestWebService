package example;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.utils.StringUtils;

/**
 * 测试自己建立的服务器端代码.服务本地化
 */
public class TestWebSvrClient {


    public static void main(String[] args) {
        String url = "http://localhost:8080/test/services/HelloWorld";
        String method = "testParams1";
        String[] parms = new String[]{"中国"};
        TestWebSvrClient webClient = new TestWebSvrClient();

        String svrResult = webClient.CallMethod(url, method, parms);

        System.out.println(svrResult);
    }

    public String CallMethod(String url, String method, Object[] args) {
        String result = null;

        if(StringUtils.isEmpty(url))
        {
            return "url地址为空";
        }

        if(StringUtils.isEmpty(method))
        {
            return "method地址为空";
        }

        Call rpcCall = null;


        try {
            //实例websevice调用实例
            Service webService = new Service();
            rpcCall = (Call) webService.createCall();
            rpcCall.setTargetEndpointAddress(new java.net.URL(url));
            rpcCall.setOperationName(method);

            //执行webservice方法
            result = (String) rpcCall.invoke(args);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
}
