package example;

/**
 * Created by Chen Yonggui on 2017/6/28.
 */
public class HelloWorld {
  public String testParams0() {
    String result = "Hello, params0 ";
    return result;
  }
  public String testParams1(String x1) {
    String result = "Hello, params1 "+"  "+x1;
    return result;
  }
  public String testParams2(String x1,String x2) {
    String result = "Hello, params2 "+"  "+x1+x2;
    return result;
  }
  public String testParams3(String x1,String x2,String x3) {
    String result = "Hello, params3 "+x2+x3;
    return result;
  }
}
